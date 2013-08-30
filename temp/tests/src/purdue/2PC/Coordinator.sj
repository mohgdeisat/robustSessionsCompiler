// To test, run all servers before running this program
//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/2PC/Coordinator.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.TwoPC.Coordinator
package purdue.TwoPC;

import sessionj.runtime.*;
import sessionj.runtime.net.*;
import java.util.Hashtable;

public class Coordinator
{
	participant Coordinator;
	private final noalias protocol TwoPC {
	 	 participants: Coordinator, Client1, Client2
		 .Coordinator: begin
	 	 .Client1->Client2: <int>
		 .Client1->Client2: <int>
		 .Client2->Client1: <int>
		 .Client2->Client1: <int>
		 .Client1->Coordinator: <Boolean>
		 .Client2->Coordinator: <Boolean>
		 .Coordinator->Client1: <Boolean>
		 .Coordinator->Client2: <Boolean>
	}

	public void run() throws Exception 
	{
		final noalias SJService c = SJService.create(TwoPC, "localhost", 1000);
                c.addParticipant("Client1", "localhost", 7102);
		c.addParticipant("Client2", "localhost", 7104);
                final noalias SJSocketGroup ps;
		try (ps)
                {
                        ps = c.request();
			System.out.println("Coordinator: connected to all participants");
			Boolean status1 = (Boolean)ps.receive("Client1");
			Boolean status2 = (Boolean)ps.receive("Client2");
			boolean status = status1.booleanValue() && status2.booleanValue();
			System.out.println("Coordinator: Transaction decision is: " + (status ? "commit" : "abort"));
			ps.send(new Boolean(status),"Client1");
			ps.send(new Boolean(status),"Client2");
		}
		finally {}
	}
	
	 public static void main(String[] args) throws Exception{

                Coordinator a = new Coordinator();
                a.run();
        }
}