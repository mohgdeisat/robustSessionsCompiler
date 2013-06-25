package purdue.shibboleth_con;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Client {
    final private SJProtocol pDisoveryService =
      new SJProtocol(
      ("H4sIAAAAAAAAANVXb4hUVRS/O7Pr/tN1/e/mn9DUVGomI83azT87u+vuOq5L" +
       "sxopqXfeu8489857\nr/fu7M5EhBSB9UE0KiGEIBQhjTCI+hYSIRQE9SEs6J" +
       "N9SCgiIgoy6Jz73rvvvXEct6gPLeyZc++5\n53fOPefcc++79CNpcR2yxmWu" +
       "a1jmsZSo2sxN4dDjcqM5JiaAPaxd/arvPVMsv54gTVnSWmKlPHNc\nQRZnj9" +
       "Epmi4Lg6czFudME4DUW3HI+oaoUuQhE++vSSK3aEWD64KszwbqaamUVurpmD" +
       "pauqfGElIr\nfwxcQVuekdOtuQtPFF49lyAENBbZFq8WuCV8DW/NzrUf7Mt+" +
       "/9Hd3pplddbslaiHtZtblq/4cud3\n7Ul0uc22XAN3LcjSbKDkRWTcl/RWbL" +
       "tiQ6jXYbRSKEuF0XLX7DNLlm4cNWies6zhiptz1256/4eT\n3TIkzRxmBOmO" +
       "RBrX4M7vuzNcON/TT45/dui3lRK0SXuaPEeapFMLQ5SsYU4yHeFnb8g9NXrk" +
       "xOok\nBMOebsYEwdJ7GyQ1088Kxi05xVCua6AVUXqUn7l6fvznE6iE3iXsCp" +
       "jc0EB5b1lMQ72wekbXNtDL\nWpbt6UyOvnXgyujvWS/SeUuvouVkYB/D0wgo" +
       "x0y9nvHNDXT2AE8LkJhSqWwaGhXqJFzY/MK1159P\n/5ogyYOkjXFWYqaAQ7" +
       "byoJd7Ts1COieoNjnhUI0Negt6s6Sz5GEijCCLwir0Tow8KFkyS1CnwKCU\n" +
       "5sfgHMMs9M4w4CNm3qGmVqxzcn10xOmpNK6U/roYiQNkvuEOMBtiCtviVVyg" +
       "Y0ugoCzIgsgBGKZu\ncQ+1lds2AcfnhXXsy1tav7ny8eIjXyRJYoh0cIvqQ1" +
       "QTljNC2kXRYW7R4nrF3r5DujB7ug1oN/wn\nAGyR8l8CQs3QPOMRb0dIWxGs" +
       "ZCydZUmS03w8rl6rwIO/9fwpQdoHDFezpphTtV30edX+fcd/EqTT\ntEJBRZ" +
       "BEbrzsBPlOIVDq1nwnhjb29f25+hEsNRu82QHuLmugQNs/eWPdlm9fTJDmEY" +
       "iCYbKxMrbv\nLOnSmcYpFkCGU1c61gMN7SgcqTFaYv64o8RE0dLVDBptuQod" +
       "KbQ5AdGk0LY7PSaFEkHmQD2E3kj4\njeDvMvEPz4cgqxqJfauz+gzTENuUub" +
       "lihkdYkHnRoYRDkAcV1DZkHkKyWZA2dxKOqICGG4g7QjGS\nh5VAzj2AZJOI" +
       "HVa14kB0RbsJRZXhlhnK7xczv1AFWVgz40fGu1wV5ufIyC1tB5vCYTU2r0Xl" +
       "zZpl\nV5VoReOYhv1VxjQc+o7IRqvA5ou/0eShvdVOqUQNK8hWZEaR7I4LDi" +
       "EzhGQXkr56wUDSf2fBtbhg\nQAleEzN7UsEJiozULkKfziLzOJLcDE2vF5HX" +
       "EHW9twtWU/ASGgPez0o4DLIiohX5mIjc27VQvtcB\n2sKaGbWXJxXcDhG5Eq" +
       "YMeBcBzLhjCUuz+AC0IegRpsspdGdBVtxO5Hu6RPgzLL5QWZMnSeb6MJQ2\n" +
       "Z3SKZSgP5SchTup953kz6DiWM0xNHRpkYT9OoSc99abV9vIBYFM3MjoSuIBb" +
       "pEFl7DJsqMZYBl6L\nrCKUmQXxCWWgoAwkBLmrBgRjrRC6IyM/SgvkskG9AF" +
       "nZCzeMY+ihU18jw5GUIEJqpZK/A/rKHqY/\nyHVnrGY6pGYm1lduIOMgcQNo" +
       "fFEqOXSTpTFoefn0Q0uQZyIyCu6R0IjDwnb7R7gFJGa9vSGxw02F\nniEJXX" +
       "qzrktYUqFL3kil5pn/wo8bccGUElShFGMO5qyyo7EhaILecY4M/xUXL0eT2C" +
       "IToGRbowV9\n1MHSNfWUX3zjECoIWWTkZzHplJXdxISIfGApiJxWZHqZM6jn" +
       "LsX76q2gjmjqRPyCzGkkr3jSXRZV\nJ7zpw6i0kwrBSraIrTgbrkBy5v8q4L" +
       "cTbIiGYC4EaMKCV5MNbxYj8mi5GG0sKhO40JCJmBOwQR40\nb6wAXkbmHJLz" +
       "gsz2pViJKlVkGt7GykaJGmZqDxBoDvgTPE5c+IAIa2wMmbeRXERySQmWgEvq" +
       "IkH9\nOmu6kHlXCuBaQ4PwRF5e80E/zuFROgxfAMyBT6/rnz47uPulE953oB" +
       "k+dWPPXO9jST7T5ZdH119N\nvhUaQhEAAA=="));
    
    public void run(int singleSession) throws Exception {
        final SJService c =
          SJService.create(pDisoveryService, "localhost", 1000);
        c.participantName("Client");
        c.addParticipant("IdP", "mc05.cs.purdue.edu", 7100);
        c.addParticipant("SP", "sslab05.cs.purdue.edu", 7101);
        long startTime = System.nanoTime();
        SJSocketGroup s = null;
        try {
            s = c.request();
            boolean doAgain = true;
            boolean ex = false;
            Boolean doAgain2 = new Boolean(true);
            String req = "hi";
            String res = "";
            String ticket = "";
            int count = 1000000;
            int i = count;
            String str = this.repeat("a", 1000);
            {
                SJRuntime.negotiateOutsync(false, s);
                while (SJRuntime.outsync(i-- > 0, s)) {
                    SJRuntime.send(str, "SP", s);
                    {
                        String _sjbranch_$0 = SJRuntime.inlabel("SP", s);
                        if (_sjbranch_$0.equals("Discovery")) {
                            {  }
                        } else
                                  if (_sjbranch_$0.equals("noDiscovery")) {
                                      {  }
                                  } else {
                                      throw new SJIOException(
                                        "Unexpected inbranch label: " +
                                        _sjbranch_$0);
                                  }
                    }
                }
            }
            long duration = System.nanoTime() - startTime;
            System.out.println("Each request has an average latency of: " +
                               duration / (count * 1000.0) + " microseconds");
        }
        finally {
            SJRuntime.close(s);
        }
    }
    
    boolean isAuthorizationExceptionResponse(String str) {
        return str.equals("AuthorizationException");
    }
    
    boolean isExpiredExceptionResponse(String str) {
        return str.equals("ExpiredException");
    }
    
    public static void main(String[] args) throws Exception {
        Client a = new Client();
        a.run(1);
    }
    
    String repeat(String str, int n) {
        String str2 = new String();
        for (int i = 0; i < n; ++i) { str2 += str; }
        return str2;
    }
    
    public Client() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.3.0";
    final public static long jlc$SourceLastModified$jl = 1364404746000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0aWXAcxbVndawurMOyMZYtXwLsxF4FyiYGGYwsS7bEWhZa" +
       "2YAckGd3W9qxZ2cm\nM73SihBiIAkEUlQIGAjhSAWIiwCVYIoclRQJBcQJ5C" +
       "RVxkkV/EASCBCCUwQX4ch73TM9M7urtaAg\nX3HVtnv6db/3ut/Zr/XAa6TK" +
       "sUnMoY6jmcaeGJu2qMNbM7mHppgTSwwMqbZD0z266jgjABhL7X5P\n2/lQ85" +
       "VbI0QZJS2G2a1rqjOSsc3cRGYkozl5myy1TH16QjeZi7EIx1kr3pn69dUDbR" +
       "WkcZQ0akaC\nqUxL9ZgGo3k2ShqyNJukttOdTtP0KGk2KE0nqK2punYpTDQN" +
       "IOxoE4bKcjZ1hqlj6pM4scXJWdTm\nNL3BOGlImYbD7FyKmbbDSFN8jzqpdu" +
       "aYpnfGNYd1xUn1uEb1tPNZcjmJxEnVuK5OwMT5cW8XnRxj\nZx+Ow/Q6Ddi0" +
       "x9UU9ZZU7tWMNCNLClfIHXecBxNgaTRLWcaUpCoNFQZIi2BJV42JzgSzNWMC" +
       "plaZ\nOaDCyMIZkcKkGktN7VUn6BgjCwrnDQkQzKrlx4JLGJlXOI1jApktLJ" +
       "BZQFrbqxvevXboraUgceA5\nTVM68l8Ni9oLFg3TcWpTI0XFwmO52E39F+UW" +
       "RQiByfMKJos53Sf/cEf8pZ8tEXPaSszZznVxLPXO\nGYsWP9P9Ym0FslFjmY" +
       "6GqhDaOZfqkAvpylug3fMlRgTGPODPh39x0b7v0lcipKafVKdMPZc1+kkt\n" +
       "NdI9bj8K/bhmUDG6fXzcoayfVOp8qNrk33Ac45pO8TiqoG+pLMP7eYsQEoWf" +
       "Ar8fE/GvFhtGant0\njRos5uxhpItRhzmdjp3qtHJ2Okc7nYyWTJo6qEkn6O" +
       "0kTARmVX3MtVEUv7s6j5TmTCkKbHJRocHp\noJ1bTT1N7bHUgReeuqz3vK9c" +
       "I8SHKufyyGAdpxrzqY4B1ZigQRSFI5+L2ilOr9u21Wm0mvwVzyz+\nxiH1Dp" +
       "AFnImjXUr5lpWpSmxh0ellnUqPb5L90FNBY8ZSrfteWnjbH+97MkIqSjqWuB" +
       "zsM+2sqqNu\neJbU4pIrhIBKdRQqdina/7h228OHn35upa/ijHQUWV7xSrSc" +
       "5YWHb5spmgbP5KO/5e2t/7yx6sxH\nIqQSzBGOmKmgRmDd7YU0QhbU5Xkj3E" +
       "tFnNSPF228jsEBTQU2jG0DNk1CQUAWrQUMckd27KrqTz37\n0/on+Y49n9cY" +
       "cI4JyoQFNfvyH7EphfHnbh26cf9rV++qAJu1LCFzRqqtXFLXUnlYcmLY6JC9" +
       "NKrN\nqwe7mq5f4/yAi7hWy2ZzTE3qFJy0quvmFE2PMe6lmgMekTsiOImGJD" +
       "g08I1jOiASe7WUSVDPEi4j\ntqD1pptX3f4sOhWLH8x8ND7OKcnzgQ4F25VF" +
       "QPxejBrc6m8b3MBesYGGVYmLB3Zfs5zvPIhutfuR\nlwh9W1hb1hb6MPiAzj" +
       "ATvJCvMruvO3L+tgsv6BR+8bSyKAbBptMcj79+f7+x8dF5h40Iakm1s0fa\n" +
       "fZxEHMbIyriH0tU8/BS9xEBCgLzYsPr4G/AJa5f9+4qDv9vfAIRHSVRz+jTw" +
       "XyhtZ1BYb4m4UYDi\n0kd33HnsN+x5rpu+uSD7i/LF3m6nGrDk9Ycnm6u/f1" +
       "c2QqKjpInHftVgO1U9h5o7CtHb6XEH4+SE\nEDwciUXY6ZLuYFGhqQbIFhpq" +
       "ZeC0K3E29muEbfI5je+Lf+/hDxUHP0R8aOkxsxYEFXvpFgqbVhlN\nW3lFsX" +
       "DZer64nbfLhP5FGJDGI2YkatnapIopFGmyNmuOOUntacibJjU3VZnLSJsUpZ" +
       "2D2JKlmOK5\nysf9hcLtYiOobUeB1KWCxFBBmAjfhw5vOGiwRS9wUUXdvA2T" +
       "J9+RQEDV4SR5RLbB4sphlWo3lnKj\npiIcVCqj6Wnk7HTAsaKsPorlN0QTBy" +
       "6YuOmeiGvT9RZ3Zqf4Vu3z5XTsMLJmWhvXuDcCO3+n8eTT\nHnn1+iYRD3yP" +
       "A7ZwfAT++EmbyL6nL3mrnaNRUoijx3VIq6V7OLXMifRsohNa0YGgRzilzKrA" +
       "orP0\nWw7dO/TGNd4xbLbQP68qs3h7jk3BYdNSRE8usy5umpZYs3fg26OPDR" +
       "yLi8NLmulpITiXPoqhHKIE\npFuliK8rs2Yb9CHZBdPJ5gwtxS8JAseBdVcd" +
       "ufnKzjch5OwiNVSnWUhtQEPbd4WybogtIzYkTb1i\nAhh0fVbgHPHMF9woU+" +
       "0JykT6NLvT7DeSNniITAmdDmErrwabSuIA/9qiOZupBQcGPOvTIs6Csaiw\n" +
       "mJG5ASPcqjqZbarVJYVAwpHdhVdF//zY4/N3/6GCRPpInW6q6T6V5zukFhIN" +
       "6mQgp8xbG8/lLDRM\n1UDbhE4IkM2T/HOEoBBqkuoBbvtJTQao9JhpCPgVup" +
       "pEVs6ABGL9vV+DtBgcVop7LGEfu3bu2Pc6\nI/WG6QPAsUUSQznbE14MhRcr" +
       "Fl6k7xMbNry7/Ewe/oH6FmCvrcwCtfbJ204547kvQXrWD7uGWDOY\nQ0cWJ3" +
       "PQ96t4JeNpiOvSazDpH/RdfJ241g36qTUhVYfAC/s0IY+lKtwR60UnhhBGTg" +
       "D5+9xw9Cjf\nNvYhlZ2RZeXALtXqDZqhsXMkuUY2S3uExCz4ydEhkr0S1TnY" +
       "yWID94caZy/YGwP36IHrfDA2lgSs\nxY6GDdyKgpYnZ4wGZ9QaoEQ9umn48D" +
       "Vs9qGFkdaCEfdkRJiROH+LnSlsQPNqGSS/YZpHgvDKlGlN\nS9Di8mfqO0t+" +
       "pv6nywj3mhJZC/sAHhvu+IVDUlBXSJRR7FyFzRfDgEuw8wVs9mGTK3UY2Hzu" +
       "+IAj\nYcDnJWA/m11yARYU+JK78Hm6HTvXYfPVWZJeyQLZg+qIFBK1ycscBq" +
       "HvSsX/9KTCghp5NgsE4UJU\nLtcettaCEbmXr0t0FwUVeFJzNBZIzTaDG8LV" +
       "m3IaXuohfM0Ic3mdk8RPnljjBEmmCzu3YHMr6LRO\n1UnaA5cvCb8eDkjm14" +
       "KNXts27a2qkQbPOLETh0zg4KRSw3Jf3/QQKk3YuQObO8HAOEFJ7CFGFhcQ\n" +
       "c4uAkszc8IAk8C1JADLghQVI8JAlhqbAl3s4c/m03vQEiGM7hBZbS/tM/Qk7" +
       "92LzHTghOVPCH2SB\nOyfK3RNyfUhZ6vjKnpBDeRk792PzgIcas00J38jIgh" +
       "BqHnU2gS/gxhD48gKIT8Smvp/9j78FbA6U\n2hs29/mb8jnD5kEJuKskS6hS" +
       "PkviS4rm4Y+Dj5fDgO9JwDSoYojBhJmzU7QPvJ+w48DnR8LiQ0Eh\nVnEBSN" +
       "j6oEKP26i6RjrmKt8QHBUcWeDLlWIF3MU8FJERFqiCShSJVIamczqa/hzZd5" +
       "dHYTlikxbx\nL+w8hc3TArrFVKWFKz8KQutVxmjWYqEZt/szsPn9/wH/E4A+" +
       "E2BVUGKNIM8RE4sEkFtpgeTq/qAf\nlIrjVRPAV3hdT21S4lsiuBY7L2LzF4" +
       "bPJhyKhiM1i0wx0iJpZFXNiG2DBnwZ/uclUQ5cbHyTGMTO\n37F5BZtXJeBE" +
       "YEkGPFxfYs4c7LzOARB+kaBXyGgK5vOYoPO7AY/2A/niMgmvaqxwS38E25Wh" +
       "uh3c\nEBbP9ALCX2+uvvCNhi+rT1ws7qIt4QJnr5HLrrvrCF11bkOqRJm9lp" +
       "nWGp1OUl1WB6s4XXx+W1O2\nmLGN3yz88lZFYuOqU1fX/w2uKjMUyZvdwWHK" +
       "crYRuL3CbPUDV8+XFBxKIT/Nk23nV2S0X0Z42UtU\nyorewcKLusL1sTo7zC" +
       "gXYZuoksER4RVzBfyG3Jsk/x+Bzdi0iCI3Nm+WLOv6VdjCmuOQrWU1pk26\n" +
       "OfIN7ff89eEXhluF+MSD3oqiN7XgGvGo5xWXgMKychT47Cc+ueyBy4efT3rV" +
       "mLfB94P5lK5Ie6y7\nCj/XV/jefIpaaPuIRFH8AKJUWRyXUgPWMmlqaUSpNA" +
       "ULTjgQzc8w8p48dny4Wge/u91jv7vUsReb\n2QzFdcW3waPHLb8r8xhZqjnd" +
       "OVAa233wlTsepo4FPo8W7jaaNE3ILQ2+m/aC7XlEi0fCG+6E3wF3\nwwdm0D" +
       "PlxI9ghyvAVWtOb97SbJou2hvfwofeCP5OxXDgbuT+2Ukuwh0kI9UOf4svr5" +
       "LFz8X8ZVBY\n0sGKjjciP5nfwR+7KpOqI8tnoXf24mf00Os457NO7uok+C05" +
       "zq6OljQdLC0o6/IKwQq68ukZdn62\niA+wf51CLMlwo8Bmrf+iExHTSxgkLw" +
       "tg6deDiccjzYzJP1sAYPHbEH6/L/jjtGb2Y7N9u1K6sYoh\nqxThQCmeNPLH" +
       "s1HlBI5ptRtxuQsp7UjWFjmStaXsahn8DrqCO/jB7Crii+howFGVO4FBEKJN" +
       "Lary\n0upRxVeN1aWRFQ+jHohHcCxWLyj06+4fXaSWP7N75eNW86+Epnt/GB" +
       "HFAmFO14NvQIF+tWXTcY3v\nOypehCzONtz/55V8joeMPzzAfd6FYtVn+Lsr" +
       "rsKvi7mOb8kr/wXFYQy72yMAAA==");
}
