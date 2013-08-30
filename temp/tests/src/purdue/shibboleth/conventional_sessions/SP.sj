//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/shibboleth/conventional_sessions/SP.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.shibboleth_con.SP & 
package purdue.shibboleth_con;

import sessionj.runtime.*;
import sessionj.runtime.net.*;


public class SP{
participant SP;
private final noalias protocol p {
                participants: Client, IdP, SP
                .Client: begin
		.Client: [
                Client: [  //loop for retrying, if failed
                Client -> SP: <String>
                //.SP -> Client: <String>
                .Client: {
                        AuthorizationException:,
                        ExpiredException:
                                Client -> IdP: <String>
                                .IdP -> Client: <String>
                                .SP->Client: <Boolean>,  //retry it or not? Because client is the loop guard
                                NoException:
                        }
                ]*
		]*
}
	public void run() throws Exception 
	{		
                final noalias SJServerSocket ss;
                try(ss)
                {
                        ss = SJServerSocketImpl.create(p, 7101);
			ss.participantName("SP");
			ss.addParticipant("Client", "localhost", 1000);	
			ss.addParticipant("IdP", "mc05.cs.purdue.edu", 7100);	
                        final noalias SJSocketGroup s;
			String req = "";
                        try(s)
                        {
                                s = ss.accept("Client");                        	
				s.inwhile("Client") {
                        	s.inwhile("Client") {
                            		req = (String)s.receive("Client");
					//s.send(req, "Client");	
					s.inbranch("Client") {
						case AuthorizationException: {
						}
						case ExpiredException: {
						     Boolean retry = new Boolean(true);
						     s.send(retry, "Client");
						}
						case NoException: {}
					}
                            	}
				}
                        }
			finally {}
                }
                finally{}

	}
	
	public static void main(String[] args) throws Exception
	{
		SP a = new SP();
		a.run();
	}
}