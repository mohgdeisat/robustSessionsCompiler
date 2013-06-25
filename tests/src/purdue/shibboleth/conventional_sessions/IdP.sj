//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/shibboleth/conventional_sessions/SP.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.exceptions.SP & 
package purdue.shibboleth_con;

import sessionj.runtime.*;
import sessionj.runtime.net.*;


public class IdP{
participant IdP;
private final noalias protocol p {
                participants: Client, IdP, SP
                .Client: begin
		.Client: [
                Client: [  //loop for retrying, if failed
                Client -> SP: <String>
                .SP -> Client: <String>
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
                        ss = SJServerSocketImpl.create(p, 7100);
			ss.participantName("IdP");
			ss.addParticipant("Client", "sslab05.cs.purdue.edu", 1000);	
			ss.addParticipant("SP", "localhost", 7101);	
                        final noalias SJSocketGroup s;
			String req = "";
                        try(s)
                        {
                                s = ss.accept("Client");
				s.inwhile("Client") {
                        	s.inwhile("Client") {
					s.inbranch("Client") {
						case AuthorizationException: {
						}
						case ExpiredException: {
                            			     req = (String)s.receive("Client");
						     req = "NewTicket";
						     s.send(req, "Client");	
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
		IdP a = new IdP();
		a.run();
	}
}