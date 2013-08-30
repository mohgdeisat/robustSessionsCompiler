// To test, run IdP and SP first
//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/general/Test1.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.generaltest.Test1  
package purdue.general;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Test1{
       participant Client;	
       private final noalias protocol pDisoveryService {
         participants: Client, SP, IdP
 	 .Client: begin
	 .SP->IdP: <Double>
	 .SP->IdP: <Double>
         .Client -> SP: <String>
         .Client -> SP: <String>
	 .SP->IdP: <Integer>
	 .Client -> SP: <String>
	 .SP->IdP: <Boolean>
	 /*.Client: {LAB1: SP->IdP: <Double>
           .Client -> SP: <String>
           .SP->IdP: <Integer>
           .Client -> SP: <String>
           .SP->IdP: <Boolean>,
	 LAB2: SP->IdP: <Double>
           .Client -> SP: <String>
           .SP->IdP: <Integer>
           .Client -> SP: <String>
           .SP->IdP: <Boolean>
	 }*/
	 .SP->IdP: <Boolean>
         .Client -> SP: <String>
	 .SP: [
	   SP->IdP: <Double>
           .Client -> SP: <String>
           .SP->IdP: <Integer>
           .Client -> SP: <String>
           .SP->IdP: <Boolean>
	 ]*
	 .Client: {LAB1: SP->IdP: <Double>
           .Client -> SP: <String>
           .SP->IdP: <Integer>
           .Client -> SP: <String>
           .SP->IdP: <Boolean>,
	 LAB2: SP->IdP: <Double>
           .Client -> SP: <String>
           .SP->IdP: <Integer>
           .Client -> SP: <String>
           .SP->IdP: <Boolean>
	 }
	 .Client -> SP: <String>
	 .SP->IdP: <Boolean>
	 .SP->IdP: <Boolean>
      }


	public void run(int singleSession) throws Exception {
		
		final noalias SJService c = SJService.create(pDisoveryService, "localhost", 1000);
		c.participantName("Client");
		c.addParticipant("IdP", "mc05.cs.purdue.edu", 7100);		
		c.addParticipant("SP", "sslab05.cs.purdue.edu", 7101);
		long startTime = System.nanoTime();
		final noalias SJSocketGroup s;
		System.out.println("This test tests all possible protocol combinations that should be accepted by the compiler");
		System.out.println("The tests should not cause any compilation errors or exceptions");
		try (s) 
		{			
			s = c.request();
			String str = "hi";
			s.send(str, "SP");			
			s.send(str, "SP");			
			s.send(str, "SP");			
			/*if(str.equals("hi")) {
			  s.outbranch(LAB1) {
			    s.send(str, "SP");			
			    s.send(str, "SP");
			  }
			}
			else {
			  s.outbranch(LAB2) {
			    s.send(str, "SP");			
			    s.send(str, "SP");
			  }
			}*/
			s.send(str, "SP");
			s.inwhile("SP") {
			  s.send(str, "SP");
                          s.send(str, "SP");
			}
			if(str.equals("hi")) {
			  s.outbranch(LAB1) {
			    s.send(str, "SP");			
			    s.send(str, "SP");
			  }
			}
			else {
			  s.outbranch(LAB2) {
			    s.send(str, "SP");			
			    s.send(str, "SP");
			  }
			}

			s.send(str, "SP");
		}
		finally{}
	}
	

	public static void main(String[] args) throws Exception{
		
		Test1 a = new Test1();
		
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