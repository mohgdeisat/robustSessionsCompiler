// To test, run IdP and SP first
//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/shibboleth/conventional_sessions/temp.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.shibboleth_con.temp
package purdue.shibboleth_con;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class temp{
       participant Client;	
       private final noalias protocol pDisoveryService {
         participants: Client, IdP, SP, DS
	 .!begin
	 .!{A:, B:}
	 .!IdP: <String>
	 //.Client: begin
	 //.Client: {A:, B:}
	 //.Client->IdP:<String>
	 //.SP->IdP:<String>
      }


	public void run(int singleSession) throws Exception {
		
		final noalias SJService c = SJService.create(pDisoveryService, "localhost", 1000);
		c.participantName("Client");
		c.addParticipant("IdP", "mc05.cs.purdue.edu", 7100);		
		c.addParticipant("SP", "sslab05.cs.purdue.edu", 7101);
		long startTime = System.nanoTime();
		final noalias SJSocketGroup s;
		try (s) 
		{			
			s = c.request();
			boolean doAgain = true;
			boolean ex = false;
			Boolean doAgain2 = new Boolean(true);
			String req = "hi";
			String res = "", ticket = "";
			int count = 1000000;
			int i = count;
			if(ex) {
			       s.outbranch(A) {}
			}
			else {
			     s.outbranch(B) {}
			}
			s.send(req, "IdP");
			s.inbranch("DS") {
			  case C: {}
			  case D: {}
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
		
		temp a = new temp();
		
		a.run(1);
	}
	
	String repeat(String str, int n) {
	       String str2 =  new String();
	       for(int i = 0; i<n; ++i) {
	       	       str2+= str;
	       }
	       return str2;
	}
}