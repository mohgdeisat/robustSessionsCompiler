package purdue.shibboleth_con;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class IdP
{
    final private SJProtocol
      p =
      new SJProtocol(
      ("H4sIAAAAAAAAAO1YfWwURRSfu2uhH1gOCijyYURAMHgV+QhYwkePFlqupdKi" +
       "BFTY253ebbu3u+zO\ntVc0BjVGNAa/CBpjQmI0JIpGUAPGPwwSbYKJif5h0M" +
       "S/8A9J9A9jFBMx8b2dvZnd43oUpcZESfj1\nzbyZ997Me/Pe2zv2I6l2HTLf" +
       "pa6rW2Z/gg3b1E3gkFM9HT2U9QK5Wx35as0Jk80+HyWRFJmYo7k0\ndVxGZq" +
       "T6lUGlKc90oylpGQZVGUhqLjhkUUWpHotLJvxfxJNcrWZ1Q2NkUaq4vcnb1C" +
       "S2N4W2o6Zb\nSjQhWul+MAV1cSXPTew5em/m0GtRQmDHdNsyhjOGxfwdfM2G" +
       "BSe3p77/6Ca+ZlaZNVs9qbvVSytn\nz/lyw3e1MTS5xrZcHU/NyA2p4iZ+I9" +
       "0+p7lg2wUbrnoh3lYCeQl5W+787WbO0vQ+XUkbNKW77NLk\nBUvf/+Fg3LuS" +
       "KgNmGIkHbhrX4MmXXFmcnJ/ZQvZ/9sDFuZ7QiLqXPEwinlHTpJSUbg5QDcVP" +
       "Wtxz\nf8eeA/NicBn2UBU6CJbeWsmpLTSjl/PpBKY4GQpHmMqPYChmpqmHOb" +
       "qZwUMsrCAzIPIu48WR17t/\nOoDeQdujdsGtHGXt5hAEEx3dIhQTBwsWVBCS" +
       "siybSxjoeHXn6Y7fUtwpaUsbxv2xojG2i0Qj9/Pi\nimalHcVUs1e2q9Jtt5" +
       "SVEd1JpuruRmpTU6MmM4ZxgYbPSoHNjDQGgmiz4mY7FbtZHICA4VNkLPj8\n" +
       "6onfnD4zY88XMRJtI3WGpWhtisosp53UsqxD3axlaAV73XrPhElDNYBx+B8D" +
       "YdOF/Z5AuEwlTY2A\nte2kJgtakpZGUyRmKOlwjPDnBo9nirvsV8g1G/Isaz" +
       "n6PgXDubWgUhsJfvFzZm524QXWd1mljIun\nPj0Lz6e1YOsO1QT3CsGzjapU" +
       "H7wseDAzrKiwrRNoJQOvLpfLm7rqWcplHF3x2LnDjzb9EiWxXaSG\nGjQHDg" +
       "KXzN0VehWKOtDrKCpt5QuaU6Q+x2WiGEamyxTD06GXBUtCR76PSqHdA0Fy+f" +
       "lw70KIhrxT\nNC2BpiUuNy3adtuaNX/MW427bNjeCvpmVdig1H7y8sKV3z4e" +
       "JVXtEEm6SbvyWEZSpEGjqqFgQkga\niuu5LQ6JtQ9eb5eSo/64LkfB/5qYQa" +
       "XVI+BaqbMXIlKB8lHPiQRyGLkOLkZa44lPgL2z2F90JSM3\nV2L7Wies0U2d" +
       "rRXqJrMxeoORKcGhJw6FrBSi1iKxCmE1IzXuAEQTg4gususkG6FZMJYj4cEK" +
       "Foor\nsWJncEWtCQ8zaVim5H/Oxl7YGZlWMuPfTC1zaKlcJFoQkggbBeOcZD" +
       "BSpVr2sGAtYoHSr7i8UKPJ\nxbLfBbR/nXLo21DFgsdeHfRNqSieaovCGsMT" +
       "vrgZmu4qubSeySuMSnVCwSVG5pRmQwgdGyLc2Q5D\n17us0Izw+1YhZX6lE2" +
       "OlCpxYDssIuoTE3QjbSjQg0YuwfWw7IpHRRC1jgdJeaqzfVxbtnVYyczUm\n" +
       "7wiG5KAOHRfI73YsZqmWsRESC4ptyUNbSR1It6PyfE82pHHYplNDwwVCTTMS" +
       "uxH2QAQbVBmkScWQ\n/IPgG9EycjNaHcdyNiumBrkucw9OWWDBzHLT4sCquN" +
       "g4El6m62Ok2lMolB2HcCpRloQGlBaYUNMY\nnhAKskJBlJEbS4Tg7QsJ8cDI" +
       "v5xGb1mrlgE/bR2kjqMHYvxrJHIIUIhrxUrBfwv2C30YEEXv14ee\nUp23M4" +
       "nfAWLrBSS8ESuKxiZV8NdB7x0S7dWRFujRUH48MCqWBKnEoTJz/i6PgGCVOx" +
       "vCXnkoaRlC\nXjCOlDUJQ0qaxEfCNQ+Ohx0XwowhwRiGUAwZ2GPlHZW2QQLi" +
       "KSQwvCYmHg86sdpzgOCtCgZ0n4Oh\na2oJP/i64argygIj34sxJy98F+1lgW" +
       "82IaJHzVItb+DTbxC0v30ibEdp4kX8jMTzCC9w7iZLES88\ncirIrVcYozmb" +
       "hVa8IlcgvPQ/4x9hGKMxFgc9Nhn82WthiYVuSQ+0S28G86AInGIthlxRJIth" +
       "o/Kx\nEPAUEscQIMVN8rn4cERkkSH4shE6copuJjoBIJfhH19utQs9vHwSXU" +
       "icQHgX4T3BuB5MEgUP95dZ\n04DESY8BvQ4qhOZ8dslPGt0GtMObLSx+8H1y" +
       "/uxDrVuePMA/b03ZZIcabP7ZDs1t0tChpc/jmiVe\n7+9rrh5B4g6EpQh3yn" +
       "YbCd5aIshudnLlnjL0Jea1CqGZ0drjjxHOIMj+t240xvKwbbJp3xlmrBeM\n" +
       "25Eo9qX8V6uramYRNslWFol2hA6ELbIxRaITwQuH8ejgrmnPh8QuhPvGqHwH" +
       "ErytQlDK9VsIoi8i\nB5HgfVGIEWyYEESjwwtPP8JAiBGJIjHOZXYdEt5PRf" +
       "sQxqXGH0FiP8Ij46Zj9D4CiScQDvxd5cfD\nOp6W7QESnuOfQXhWFn0kZOo/" +
       "VK6UIxwuV8UR/iUl7L/LGEvxRnhD1mskeLlFeLtcHUZ4R1ZfJMqV\n0tFrLB" +
       "InyzAawowPED4U9bAgqAqE9xNbw5/2rM6ufRkAAA=="));
    
    public void
      run(
      )
          throws Exception {
        SJServerSocket ss =
          null;
        try {
            ss =
              SJServerSocketImpl.
                create(
                p,
                7100);
            ss.
              participantName(
              "IdP");
            ss.
              addParticipant(
              "Client",
              "sslab05.cs.purdue.edu",
              1000);
            ss.
              addParticipant(
              "SP",
              "localhost",
              7101);
            SJSocketGroup s =
              null;
            String req =
              "";
            try {
                s =
                  ss.
                    accept(
                    "Client");
                {
                    SJRuntime.
                      negotiateNormalInwhile(
                      "Client",
                      s);
                    while (SJRuntime.
                             insync(
                             "Client",
                             s)) {
                        {
                            SJRuntime.
                              negotiateNormalInwhile(
                              "Client",
                              s);
                            while (SJRuntime.
                                     insync(
                                     "Client",
                                     s)) {
                                {
                                    String _sjbranch_$0 =
                                      SJRuntime.
                                        inlabel(
                                        "Client",
                                        s);
                                    if (_sjbranch_$0.
                                          equals(
                                          "AuthorizationException")) {
                                        {
                                            
                                        }
                                    } else
                                              if (_sjbranch_$0.
                                                    equals(
                                                    "ExpiredException")) {
                                                  {
                                                      req =
                                                        "NewTicket";
                                                      req =
                                                        (String)
                                                          SJRuntime.
                                                            receive(
                                                            "Client",
                                                            s);
                                                      SJRuntime.
                                                        send(
                                                        req,
                                                        "Client",
                                                        s);
                                                  }
                                              } else
                                                        if (_sjbranch_$0.
                                                              equals(
                                                              "NoException")) {
                                                            {
                                                                
                                                            }
                                                        } else {
                                                            throw new SJIOException(
                                                              "Unexpected inbranch label: " +
                                                              _sjbranch_$0);
                                                        }
                                }
                            }
                        }
                    }
                }
            }
            finally {
                SJRuntime.
                  close(
                  s);
            }
        }
        finally {
            {
                if (ss !=
                      null)
                    ss.
                      close();
            }
        }
    }
    
    public static void
      main(
      String[] args)
          throws Exception {
        IdP a =
          new IdP(
          );
        a.
          run();
    }
    
    public IdP() {
        super();
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.3.0";
    final public static long
      jlc$SourceLastModified$jl =
      1355521497000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0aaWwc1fnt+j6Iz4TcIYmBpE3W5VTAKTkcmzhsHBM7ITil" +
       "zuzOsz3O7Mww89Ze\nU0oDtCSFNhIi4RIlakublkJFQmnpIQqCEM4iqBTSSv" +
       "AnLYeACooKEQ203/fezJtj15vQkqpSa2k/\nfzPfe9/3ve9918yb+94hZY5N" +
       "Eg51HM00RhJs3KIOh2ZqhKaZk+hd06PYDlXbdcVx+oAwkN7yibZx\nX8N1q+" +
       "Mk1k8aDXOFrilO37BtZoeG+4Y1J2eT0yxTHx/STeZyzONx4fxjY89tXzOjhN" +
       "T1kzrN6GUK\n09LtpsFojvWT2gzNpKjtrFBVqvaTBoNStZfamqJrV8FA0wDB" +
       "jjZkKCxrU2c9dUx9FAc2OlmL2lym\ndzNJatOm4TA7m2am7TBSnxxRRpXWLN" +
       "P01qTmsLYkKR/UqK46V5JrSDxJygZ1ZQgGTkl6q2jlHFs7\n8T4Mr9ZATXtQ" +
       "SVNvSulWzVAZmROdIVfccgkMgKkVGcqGTSmq1FDgBmkUKumKMdTay2zNGIKh" +
       "ZWYW\npDAyfUKmMKjSUtJblSE6wMjU6LgeQYJRVdwsOIWRydFhnBPs2fTIng" +
       "V2a1157cc39nx4Guw46KzS\ntI76l8Ok2ZFJ6+kgtamRpmLi0WxiV9fl2Zlx" +
       "QmDw5MhgMWbF6b/YkHzjt3PEmBkFxqzjvjiQPnb+\nzFkvrfhTVQmqUWmZjo" +
       "auEFo539Uel9KWs8C7p0iOSEx4xEfXP3n5tnvpW3FS2UXK06aezRhdpIoa\n" +
       "aruLVwCe1Awq7q4bHHQo6yKlOr9VbvJrMMegplM0RxnglsKGOZ6zCCEV8IvB" +
       "r4OIvyoEjJR3qT0J\nZ4SRJYw6zGl17HSrlbXVLG11hrVUytTBR1rBaUepgZ" +
       "oq+oAboE6rmJpDGZPGYjFY3sxoqOngl6tN\nXaX2QHrvkWeu7rjkmzvExqGz" +
       "udoxMk2ITPgiB0BkAgSQWIxzbkKnFEZbYdvKOAZL7tqXZt1xUPkO\nbAGYwt" +
       "GuonylsbFShDDp7KK5pN2PxC7AFHCUgXTztjem3/n7Hx+Ik5KC+SQpb3aadk" +
       "bR0SW8AGp0\nxUUp4EktUX8uJPsvN6598NCzryzwPZuRlryAy5+JATMvannb" +
       "TFMVEpLP/raPVr97S9kFD8VJKUQh\n2Jcp4D0Q1LOjMkKB0+YlIVxLSZLUDO" +
       "YtvJqBgcYCC0ZYi6BeeAfsRXNEQZ6/jl5f/oWXf1NzgK/Y\nS3V1gZzYS5kI" +
       "nAZ///tsSuH+K7f33LL7ne2bSyBULUvsOfizlU3pWjoHU04Nxxqqp6LbvL2/" +
       "rX7n\nYufnfIurtEwmy5SUTiE3K7pujlF1gPHk1BBIhDz/gCVqU5DHICUO6M" +
       "BIrNWKjYJ7FsgUianNu25d\neNfLmEssbpgpGHNcU5LjN1piCBfkEfF6Fnpw" +
       "s79siP6tYgG1C3uvWLNlxzy+8iC7Re5FTjL0Y+Hc\norHQiTUHfIaZkHx8l9" +
       "ly0+FL1266rFWkw7OKsuiGgFY5H3/+7i5j2SOTDxlx9JJyZ0QGfZLEHcbI\n" +
       "gqTH0vU8vBRY75peQfJKwqLjL8AXrF39wbX7X9hdC4L7SYXmdGqQuXC3nW4R" +
       "vQXKRYTFVY9suPvo\n8+xV7pt+uKD6M3P5qW6jEojkJYdGG8of2JOJk4p+Us" +
       "9LvmKwjYqeRc/th6LttLs3k+SUED1cgEW1\naZPpYGY0VANio4FaGrB2KY5G" +
       "vFLEJh9T9w/x9wn+0HHwQpSFxnYzY0EtsU+7mMKiFUZVKxeLWTht\nCZ88m8" +
       "O5wv/iDESjiRmpsGxtVMHOicSE1zcxMkPunZ2FMpKh2Mq53sYTRIwHwjLw05" +
       "bINkuPSKBH\nMFGmDx5aut9gM4/wvalw+zNskvzMAYVTB9PxymtDiBXjKv1s" +
       "IO1Wx5jISOlhTVdRs7OBx/yiDiim\n31zRu/eyoV33xN0grrF49jrDD2NfL6" +
       "dlg5ExVW1Q4+kHAvtY3elnPfT2znpRAPwUA85/fAb+/Wkr\nybZnv/zhbM4m" +
       "lkYe7W4GWiTzwZnFLLKSDmmFDFLOFHuIMlG3YVlFeARYXKjfdvAHPe/t8Iyy" +
       "ysL0\nXGxLuowxsDw9vganF2GSNE1LcNi65nv9j605mhR2TZnquNhTVxlhmm" +
       "6xVQuLqpWyIdKGj69XMeuu\nLMgD8lSj5qyiFrR30Grp46JegQ8qMJmRpoBv" +
       "r1ac4bWK1SYXQMIV0qWXVfzxscenbHmxhMQ7SbVu\nKmqnwvsGUgUFmzrD0J" +
       "jlrGXLuQq1Y5UA6+FXAswmS/05QzCmkqJ6QNsuUjkMUtpNFQpnia6kUJXz\n" +
       "c1aDc84HEIgrsvBkYbvPRx25NLUQEYbeNG21A41yTbcZJXz48JPPwDNRR87S" +
       "bKpK6nGcZT1NU200\nz1mwYp1XZNpawOGJBBJdJmtoaa6p4LH3vOsP33pd69" +
       "+gQdhMKqlOM7AhsAWzN4cejaAT6LOhv+0Q\nAyD91mQEzz4v2Ub8wnf+Yn7b" +
       "Cx6QvxicuwW2Omt7eiRQj0S+HvHOzy1d+vG8C3jfgR0/yJtRZIJS\ndeDOM8" +
       "5/5RvQF3aBm0CR685iQk2SSVh0FHwE5P2PW0sq8SGj268t1eIxsttv6AkpOw" +
       "j76MuEBpoq\n8ExaI5AEUhg5BQzja8PZD4G+M9i/uG+MzC1GdqWWL9UMjV0k" +
       "xdWxE9wN6AiDl5wdMjElq4sQuRIB\ndNWVzlZwHQbu65GrfTICJgnnIpJBgH" +
       "ERcCI5oj84osqAqGvXTcOn/46deIljpDlyx7VMFYPOOsIX\nka8guBrBVyXh" +
       "sE9gpDRtWuOStIAFSqXiiAYJVfbKZDfgrjn9S1cH3qhIVhcE9ybKSuRRj1lT" +
       "+IbL\nboqqOUompQ1loSXxxUkBxxiZFU11XuuzAS4dbqzQHbnvOySXlmIrxj" +
       "IUWLF/WYDRMURuRHBTRAIi\n30aw88RmiIaqEKtzWKBuR5V1OyxP3+bInU+j" +
       "8qagS45qjsYCTd8qSCzIdmVWw5cDkFsnpLk7OSmF\nl7xHxwFSTBsityO4Az" +
       "xYp8oobYfnOEnfCXsjW3WhRodtm/ZqxVAh1w1txFsmaDCt0G254LukYesR\n" +
       "uRvBHuh6uUApbB+4U0SY+xpRimkK35ACvisFQDM9PcIErS851AeuXOM08WEd" +
       "6hDs07pRattawMf/\ngMgPEewFC8mRkn4/Czy+okN4u18TCqVqPrMdO2I59U" +
       "1E7kNwv8ca+1hJX8bI1BBrXkdWQgOG/OsD\nV15J8IXY1M+cf/eXgOBHhdaG" +
       "4F5/Ub5mCH4qCXsKqoQu5askruTW/Oxk6PFmmPCAJIzj67Cggr1m\n1k7TTk" +
       "hAIoUELj8TFfcFN7GMb4CkLQk69KCNrmuoCdf5esBUYLLAlbuLJfCU57GI97" +
       "HAe1TJojc9\nTNWsjqE/SeLu9AqYjtxkRLyPyLMInhPUi01FRnjs4SC1RmGM" +
       "ZiwWGnGXPwLBi/8n/EcI+kSEhcEd\nq4P97DOxxEK3pAXapZ8E86B0HK8WQ6" +
       "7wUM9t0uJaMuBV6c8IXmN48MKpGDjSs8gYI41SRkbRjMRa\nAJDL8J/Lt8yB" +
       "Ht4PiW5E3kLwNoJ3JOFUUEkWPJxfYMwkRN7lBOh1UKD3iqQ+2KFjyw2daruu" +
       "QX+e\nxRGUN/Ium7KDiGgIRhBs9XtnRESfiMBvTeuKN4ihZyhe90N3Jup1P0" +
       "LAM45vn+qJCOeGdRsr1Nwi\n8DvJxYh4TaZ4GfOpOlME2/y+FJHrEFyP4Ot+" +
       "l4nIDQi2IzgZ7dhn2sAhsgvB7hMUvgkR0SMhuLNQ\n84RANjlCSdHkhAjB7g" +
       "eB7FpEFfk+gntChFgckZNcM5chsh/BgwhOSsHm6/0lgl+dNBkTNwWIPIrg\n" +
       "sX9X+L6wjAN+rUeEZ5anEDztV3BE/Dz+fKG6jOCFQiUZwX9JPfrfJZxIJUZw" +
       "xC++iIjaieD1QkUV\nwZt+KUWkUF2cuGAi8m4BwqQw4a8I3pf1MCexIgh/X7" +
       "ZGHISFjip4Wp3vHr8RhOL4zTs7c+xAxxv5\n+IB/OLF903u1NyhPXCHeMDaG" +
       "Dxk7jGzmvD2H6cLltekC59xVzLQW63SUit4UT+ji4gAFxC4uer6w\nlr9k84" +
       "+YSnqXLTxzUc3rcVI6wUF1g3tzPWVZ2wi8k4TRyqc+wZ4TMUpUn4bRGZeWDG" +
       "tPxfnRkzit\nyvsEJTypLXxGVW2HFeVbOIMrUAcmwtfTjfCb5b4V5f+R2ICg" +
       "URw0A4itEns7wdFqQaJ3TIrX0Is1\n+b2YfAmN/GM97rNN/uFhj61lNCYbpp" +
       "tn3/Pag0fWNwsfEB/kzM/7JiY4R3yU4x0agYS5xSTw0U98\nfu5916x/NeW+" +
       "Ho51QUs5amoqLi62OezV0YvYWmlY/J0Jv+WuYZcXMmx+IPG6Ph8CzuGfSxU3" +
       "bP4X\nPfwrDmGs/SUt78V/PaWFf5hQmlIc+fI89ClU/pdOoQ+YuJ7VclXT4D" +
       "fnOKt6v6ADYJ8aG8nFCJ52\nxvQJVv5FkUdg/TqFZn2YG/VySxj3S+AnoC2i" +
       "Wi4v1PO9jL90xUM8jybO/TUzIT80A2L+sT4K6Bbq\ncln/ovsHPjuIjWOnLd" +
       "8Bhx9MxGl0ruhWI4+NnJPiPuFwb8zzyVjAOKE7YNKSLrUHz+KmRkPA/b4s\n" +
       "Pe+lLQsetxqeFh7jfQNWgWcTWV0PnnsH8HLLpoMa3/gKcQpucT13MDK54PdH" +
       "DNw+dIPbe7uYdRP/\n1gRn4dW3uK98LRf7JwU7N2nGKAAA");
}
