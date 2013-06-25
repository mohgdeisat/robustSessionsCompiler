// To test, run all servers before running Client1
//$ bin/sessionjc -cp tests/classes/ tests/src/purdue/2PC/Client1.sj -d tests/classes/
//$ bin/sessionj -cp tests/classes/ purdue.TwoPC.Client1 &
package purdue.TwoPC;

import sessionj.runtime.*;
import sessionj.runtime.net.*;
import java.util.Random;

public class Client1
{
        participant Client1;
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
                        ss = SJServerSocketImpl.create(TwoPC, 7102);
                	ss.addParticipant("Coordinator", "localhost", 7103);
			ss.addParticipant("Client2", "localhost", 7104);
			final noalias SJSocketGroup ps;
                	try (ps)
                	{
				ps = ss.accept("Coordinator");
                        	System.out.println("Client1: connected to all participants");
				Random r = new Random();				
                        	Integer i11 = new Integer(r.nextInt(4));
                        	Integer i21 = new Integer(r.nextInt(4));
                        	ps.send(i21,"Client2");
				Integer i12 = (Integer)ps.receive("Client2");
                        	System.out.println("Client1 numbers: i11= " + i11 + ", i21= " + i21);
				int result = 0;
				Boolean commit = null;
				try
				{
					result = i11.intValue() / i12.intValue();
					commit = new Boolean(true);
                        		System.out.println("Client1 result: " + result);
					System.out.println("Client1 ready for committing.");
				}
				catch(Exception ex)
				{
					commit = new Boolean(false);
					System.out.println("Client1 local error, ready for aborting");
				}
				ps.send(commit, "Coordinator");
				commit = (Boolean)ps.receive("Coordinator");
				if(commit.booleanValue() == true)
					System.out.println("Client1 committed transaction");
				else
					System.out.println("Client1 aborted transaction");
			}
			finally{}
                }
                finally {}
        }

         public static void main(String[] args) throws Exception{

                Client1 a = new Client1();
                a.run();
        }
}
