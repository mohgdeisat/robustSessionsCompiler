// To test, run all servers before running Multi1
//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/2PC/Client2.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.TwoPC.Client2
package purdue.TwoPC;

import sessionj.runtime.*;
import sessionj.runtime.net.*;
import java.util.Random;

public class Client2
{
        participant Client2;
        private final noalias protocol TwoPC {
                 participants: Coordinator, Client1, Client2
                 .Coordinator: begin
                 .Client1->Client2: <Integer>
                 .Client2->Client1: <Integer>
                 .Client1->Coordinator: <Boolean>
                 .Client2->Coordinator: <Boolean>
                 .Coordinator->Client1: <Boolean>
                 .Coordinator->Client2: <Boolean>
        }
        public void run() throws Exception
        {
		final noalias SJServerSocket ss;
                try(ss)
                {
                        ss = SJServerSocketImpl.create(TwoPC, 7104);
                	ss.addParticipant("Coordinator", "localhost", 7103);
			ss.addParticipant("Client1", "localhost", 7102);
			final noalias SJSocketGroup ps;
                	try (ps)
                	{
				ps = ss.accept("Coordinator");
                        	System.out.println("Client1: connected to all participants");
				Random r = new Random();				
                        	Integer i22 = new Integer(r.nextInt(4));
                        	Integer i12 = new Integer(r.nextInt(4));
                        	Integer i21 = (Integer)ps.receive("Client1");
				ps.send(i12,"Client1");
                        	System.out.println("Client2 numbers: i12= " + i12 + ", i22= " + i22);
				int result = 0;
				Boolean commit = null;
				try
				{
					result = i21.intValue() / i22.intValue();
					commit = new Boolean(true);
                        		System.out.println("Client2 result: " + result);
					System.out.println("Client2 ready for committing.");
				}
				catch(Exception ex)
				{
					commit = new Boolean(false);
					System.out.println("Client2 local error, ready for aborting");
				}
				ps.send(commit, "Coordinator");
				commit = (Boolean)ps.receive("Coordinator");
				if(commit.booleanValue() == true)
					System.out.println("Client2 committed transaction");
				else
					System.out.println("Client2 aborted transaction");
			}
			finally{}
                }
                finally {}
        }

         public static void main(String[] args) throws Exception{

                Client2 a = new Client2();
                a.run();
        }
}
