// To test, run Client2 first
//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/exceptions/basic/Client1.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.exceptions.Client1  
package purdue.exceptions;

import sessionj.runtime.*;
import sessionj.runtime.net.*;
import java.util.Hashtable;

public class Client1{
       participant client1;	
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
	
	public void run(int singleSession) throws Exception {
		
		final noalias SJService c = SJService.create(invitation, "localhost", 1000);
		c.participantName("client1");
		c.addParticipant("client2", "localhost", 20102);		
		final noalias SJSocketGroup ps;
		try (ps) 
		{
			ps = c.request();
			/*ptry {
			     int a = 1;
			     ps.send("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "client2");
			}
			catch (Exception ex) {
			     int b = 1;
			     String str = (String)ps.receive("client2");  
			}*/
			System.out.println("Client1 is connected to all participants");		
			ps.send("Hello, Client2 from Client1.", "client2");
			ptry {
			     ps.send(new Double(50), "client2", false, new Exception());
			}
			catch(Exception ex) {
			     String str = (String)ps.receive("client2");
			     System.out.println("Received message: " + str);
			}
			
		}
		finally{}
	}
	
	public static void main(String[] args) throws Exception{
		
		Client1 a = new Client1();
		
		a.run(1);
	}
}