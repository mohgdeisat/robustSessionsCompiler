//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/exceptions/basic/Client2.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.exceptions.Client2 & 
package purdue.exceptions;

import sessionj.runtime.*;
import sessionj.runtime.net.*;
import java.util.Hashtable;

 public class Client2{
participant client2;
private final noalias protocol invitation {
                participants: client1, client2
                .client1: begin
                .client1->client2: <String>
                .ptry {
                      client1->client2:<Double> | <Exception>
                }
                pcatch(Exception) {
                        client2->client1: <String>
                }
}

	public void run() throws Exception 
	{		
                final noalias SJServerSocket ss;
                try(ss)
                {
                        ss = SJServerSocketImpl.create(invitation, 20102);
			ss.participantName("client2");
			ss.addParticipant("client1", "localhost", 20102);			
                        final noalias SJSocketGroup client1Socket;

                        try(client1Socket)
                        {
                                client1Socket = ss.accept("client1");
                                //System.out.println("Client2 accepted connection request from Client1");
                                String str = (String)client1Socket.receive("client1");
				System.out.println("Received String: " + str);
				ptry {
				    Double d = (Double)client1Socket.receive("client1");
				    System.out.println("Received double: " + d);
				}
				catch(Exception ex) {
				    System.out.println("Client2: Exception occured in client1.");
				    client1Socket.send("This message is sent from client2's exception handler", "client1");
				}
                        }
			finally {}
                }
                finally{}

	}
	
	public static void main(String[] args) throws Exception
	{
		Client2 a = new Client2();
		a.run();
	}
}