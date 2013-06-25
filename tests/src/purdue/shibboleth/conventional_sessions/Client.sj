// To test, run IdP and SP first
//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/shibboleth/conventional_sessions/Client.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.shibboleth_con.Client  
package purdue.shibboleth_con;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Client{
       participant Client;	
       private final noalias protocol pDisoveryService {
         participants: Client, IdP, SP, DS
	 .Client: begin
	 .Client: [
      	 Client->SP: <String> //1. The Client tries to access a resource at the SP
      	 .SP: { //The SP may redirect the Client to the DS or to the IdP.
      	   Discovery:
      	     // SP -> Client: <String> //2a. Redirect Client to DS.
      	     // .Client -> DS: <String> //2b. The Client requests the DS.
      	     // .DS: { //The DS has two possible modes: Passive and Non-Passive.
             // notPassive:
      	       // DS: {DisplayPageException:,
      	       //   NoException: DS -> Client: <String> //3
      	       // }
               //4. The Client sends selected IdP ID.
      	       // Client:{IdPSelected: Client -> DS: <String>
      	       //   ,NoIdPSelectedException:
      	       // }

             // ,passive: //Passive: DS will choose a default IdP.
           // }
           //.DS -> Client: <String>  //5a. Redirect Client to the SP.      
           ,noDiscovery: //The discovery process is skipped.
        }
        .Client -> SP: <String> //5b
      	// .SP -> Client: <String> //6a. The SP redirects Client to the IdP.
      // 	.Client: [//retry loop
      //     Client -> IdP: <String> //6b. The Client requests the IdP.
      //     .IdP -> Client: <String> //7. The IdP requests Client's credentials.
      //     .Client -> IdP: <String> //8. Send authentication credentials to IdP.
      //     .IdP: {AuthenticationException:, //the client sets loop guard for possible retry
      //       NoException: IdP -> Client: <String> //9. IdP redirects.
      //       .Client -> SP: <String> //10. Client requests the resource.
      //       //11. The SP sends the resource if the Client is authorized.
      //       .SP: [ //retry loop
      //         SP: {AuthorizationException: Client->SP: <Boolean>, //send loop guard to SP
      // 	        ExpiredException: Client -> IdP: <String> //12
      //             .IdP -> Client: <String> //13 new ticket
      // 	          //SP sets loop guard for possible retry
      // 	        ,NoException: SP -> Client: <String> //11
      //         }
      //       ]* //retry loop
      //     }
      //   ]* //retry loop
       ]* //trials loop
      }

// 	private final noalias protocol p {
// 		participants: Client, IdP, SP
// 		.Client: begin
// 		.Client: [
// 		Client: [  //loop for retrying, if failed
// 		Client -> SP: <String>
// 		//.SP -> Client: <String>
// 		.Client: {
// 			AuthorizationException:,
// 			ExpiredException:
// 				Client -> IdP: <String>
// 				.IdP -> Client: <String>
// 				.SP->Client: <Boolean>,  //retry it or not? Because client is the loop guard
// 				NoException:
// 			}
// 		]*
// 		]*
// }
	


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
			String str = repeat("a", 1000);
			s.outwhile(i-- > 0) {
			s.send(str, "SP");
			s.inbranch("SP") {
			  case Discovery: {
			    // res = (String) s.receive("SP");
			    // s.send(str, "DS");
			    // s.inbranch("DS") { //1
			    //   case notPassive: {
			    //     // s.inbranch("DS") { //2
			    // 	//   case DisplayPageException: { }
			    // 	//   case NoException: {
			    // 	//     res = (String) s.receive("DS");
			    // 	//   }
			    // 	// }
			    // 	// if(!ex) {
			    // 	//   s.outbranch(IdPSelected) {
			    // 	//     s.send(str, "DS");
			    // 	//   }
			    // 	// }
			    // 	// else {
			    // 	//   s.outbranch(NoIdPSelectedException) {
			    // 	//   }
			    // 	// }				
			    //   }
			    //   case passive: {
			    //   }
			    // }
			    //res = (String) s.receive("DS");
			  }
			  case noDiscovery: {
			  }
			}		
			s.send(str, "SP");
			// res = (String) s.receive("SP");

			// s.outwhile(doAgain) {
		  	//     doAgain = false;
		    	//     s.send(req, "SP");
		    	//     //res = (String)s.receive("SP");
		    	//     if(isAuthorizationExceptionResponse(res)) {
			// 	s.outbranch(AuthorizationException) {
			// 	    doAgain = true;
			//     	}
			//     }
			//     else if(isExpiredExceptionResponse(res)) {
			//         s.outbranch(ExpiredException) {
			// 	    s.send(req, "IdP");
			// 	    ticket = (String)s.receive("IdP");
			// 	    doAgain2 = (Boolean)s.receive("SP");
			// 	    doAgain = doAgain2.booleanValue();
			// 	}
			//     }
			//     else {
			// 	s.outbranch(NoException) {   
			// 	}
			//     }
			// }
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
	
	String repeat(String str, int n) {
	       String str2 =  new String();
	       for(int i = 0; i<n; ++i) {
	       	       str2+= str;
	       }
	       return str2;
	}
}