// To test, run IdP and SP first
//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/shibboleth/conventional_sessions/Client.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.shibboleth_con.Client  
package purdue.shibboleth_con;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Client{
       participant Client;	
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
	
	public void run(int singleSession) throws Exception {
		
		final noalias SJService c = SJService.create(p, "localhost", 1000);
		c.participantName("Client");
		c.addParticipant("IdP", "mc05.cs.purdue.edu", 7100);		
		c.addParticipant("SP", "sslab05.cs.purdue.edu", 7101);
		long startTime = System.nanoTime();
		final noalias SJSocketGroup s;
		try (s) 
		{			
			s = c.request();
			boolean doAgain = true;
			Boolean doAgain2 = new Boolean(true);
			String req = "hi";
			String res = "", ticket = "";
			int count = 1000000;
			int i = count;
			s.outwhile(i-- > 0) {
			s.outwhile(doAgain) {
		  	    doAgain = false;
		    	    s.send(req, "SP");
		    	    res = (String)s.receive("SP");
		    	    if(isAuthorizationExceptionResponse(res)) {
				s.outbranch(AuthorizationException) {
				    doAgain = true;
			    	}
			    }
			    else if(isExpiredExceptionResponse(res)) {
			        s.outbranch(ExpiredException) {
				    s.send(req, "IdP");
				    ticket = (String)s.receive("IdP");
				    doAgain2 = (Boolean)s.receive("SP");
				    doAgain = doAgain2.booleanValue();
				}
			    }
			    else {
				s.outbranch(NoException) {   
				}
			    }
			}
			}
			long duration = System.nanoTime() - startTime;
			System.out.println("Each request has an average latency of: " + duration / (count * 1000.0) + " microseconds");
		}
		finally{}
	}
	
	boolean isAuthorizationExceptionResponse(String str) {
		return str.equals("AuthorizationException");
	}

	boolean isExpiredExceptionResponse(String str) {
		return str.equals("ExpiredException");
	}

	public static void main(String[] args) throws Exception{
		
		Client a = new Client();
		
		a.run(1);
	}
}