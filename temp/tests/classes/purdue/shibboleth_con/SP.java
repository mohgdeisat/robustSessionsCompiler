package purdue.shibboleth_con;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class SP
{
    final private SJProtocol
      p =
      new SJProtocol(
      ("H4sIAAAAAAAAAO1YfWwURRSfXlv6haVQPqx8GBEQjF5FPiIWBXq0tvUo1RY1" +
       "oMDe7nC3dG932Z1r\nr2oMaoxoDH4hGmNiYjQmikZQg/qPMX6QaOJnYtDERI" +
       "OJkOgfxigmYuJ7s7szu8fdUhWIf9ik797M\nm3nvzXtvZn47+34ita5D5rnU" +
       "dXXL3J5kYzZ1k9j0uMG+QcqGgN2iHvpy5QGTzTqSIFVpUpen+Qx1\nXEamp7" +
       "crI0p7gelGe8oyDKoy0NRRdMjCWK1c5Gkm3l8V11yr5nRDY2RhOpjezie1i+" +
       "ntkelo6cIS\nS0itzHZwBW15Rh6uG3z+xuyeZxOEwIxptmWMZQ2L+TO8MWvm" +
       "H9yQPvr2+d6YmWXGrOdat6gnls+a\n/fma7xuq0eV623J1XDUj56aDSV5EBn" +
       "xJR9G2izaEegFGK4mypIyWO2+Dmbc0fZuuZAya1l12YtL8\nxa//uLuFh6TG" +
       "gB5GWkKRxjG48ktOrU72t3WSnR9tPj6HK61Sd5A7SBV3aqrUktbNYaqh+omL" +
       "Bm/p\n27prbjUEwx6twQTB0IviktpJs3q5nE5gipOlsIQp3hIMxcy2DzJHN7" +
       "O4iAUxOkMqrzQeP/TcwM+7\nMDvoe8IuuvFV1muOQjHRyh6hmhbwYH6MkrRl" +
       "2Z6G4b5nNr7T93vaS0rG0sZwfnXgjO0i0+rlOc6t\n66lK9ZGT3MKaWxYzbR" +
       "3wShbymc8XTF1VmNhAzy+7+/Deu9p/TZDqTaSeGjRPTQZ7c86mSLwVdXjI\n" +
       "UVTa5Q3oSJOmvKcT1TAyTRavt9H4/ioJloz8otjIZxzFVHOnDn1cQXWW1ZHY" +
       "SKbo7lpqU1ODZRhj\nOEDDk0OByYy0hvZJj+Lm1il2h8gRAccny3L35bV1X7" +
       "/z7vStn1WTRDdpNCxF61ZUZjm9pIHlHOrm\nLEMr2qtWcxcmjtYDbYH/alA2" +
       "TfjPFUK9KBlqhLztJfU5sJKyNJom1YaSiW4D70SB82Gyu+Q3OE7X\nFFjOcv" +
       "RbeXq7iiq1kfFqa25bjwuHTFO/VSo4/sYHH8IJ0VW0dYdqQurGl/YgRPDkKk" +
       "SF50KoCk5Q\nQEn0NHlyASW6L1658s+5K3CWDdO7wN7MmAlKw/tPLlj+zT0J" +
       "UtMLYdZN2l/AayRNmjWqGgoeCClD\ncfmaWuBg3Qa7t1/JU7/dmKcQHE30oN" +
       "HaQ7BuaXMI0qXA9dHkMUmUMHIOFJz0hqtPgr8z2T/ccIxc\nECf2rU5YqZs6" +
       "u1qYm8TGmQ1GJoebXB0qWS5UXY3MFUhWMFLvDsOeZ5DuQNwoxUg6hGApMpws" +
       "Y5Hd\nL0ZsDI9oMKFqU4ZlSvnHbPwXOyNTS3r8yDQwh5boPYxMJ5IUIzWqZY" +
       "8J0UIWuuEV17uP0bPgdu8H\n3o+abPqmalh4dSvCKShV5R03gbLWaIevbrqm" +
       "u0o+o2cLCqPSnDBwgpHZpScCVIgNhexsgKbLYxLp\nEentD7RUVSEzgOS6iI" +
       "DMiwsF3lShUMjmyRbIiYoWkBlCsmF8Myo7u4SFrvZSZ31cGfg7taTn77h8\n" +
       "U7gkR3RAXKB/wLGYpVrGWjhYUG1nAWAldeBSrCjzU9ycwWa3Tg0NBwgzHchs" +
       "QbIVKtigyghNKYaU\n74bcCMjoudHlOJbTo5ganHXZG7DLAg/aynWLBasisC" +
       "3I8JNuGyO13KAwth/qrMRYCgAoLTJhpjXa\nIQzkhIEEI+eVKMHoCw0toZYf" +
       "nFY+rEvLQp7Wj1DH0UPF/xUyeSRwSzWIkUL+EswX9rAgguw3RfZY\nI5+Zwu" +
       "8AMfUYMrzFAtUIUoV8FWDviGp+j3QCRkP9LaFWcCVIIw6VJ+cfcglIrHJrQ7" +
       "JDLkp6hqQg\nBE+XdQlLSrrktURqbjsTfhyLCkaFYAxKMeLgoFVwVNoNJ5N3" +
       "hISap8XF/eEk1vIECNkV4YLe5mDp\nmlrSL74BCBWELNTys1jtFETuEkMs9M" +
       "0mVAyqOaoVDNz6zYL3p9fBdNQmdsQvyDyC5FFPeo2liB1e\n9UZY2qQwRvM2" +
       "i4x4So5A8sT/grMiMCoJFoUzNgnyOWTh3QtoSQ/BpRfD56AonOCShrMiYIOy" +
       "Ub22\nUHA/MvuQwBE30ZfixhGVRUYB9gsbeUU3k+uAwFmGP77eWhe+jeSW6E" +
       "fmAJJXkbwmBDPAJXHh4fwy\nY5qROcgFAILQIIDzWSVPGgMGwOEeCy8/+Io8" +
       "8uHtXdfet8v7vDUlyGb+FxMH2J2WBTcROD4hZeiA\n6YuCK+DwS8B0d+BE7S" +
       "FkLkOyGMnlEnkj46FMJBLYToqHl5FPZ44aIj2VkPK7SN5DIqFwYyXB0qhv\n" +
       "Er9vjApWC8GlyATY1XvAknhZypCsLQd4kYigkdnxnwnyPUKgvAi25g8TQllb" +
       "fDwjLyQ8npEeEc9P\nhcI6ZD5H8kVUsBkZvtpPotH5BxGIqpI22ioZP41e/X" +
       "13H2Pje0GFGyzUErGVPvHz7Vsk343T9EJk\nepD0IukTgquQ2YTk5qhgNQs9" +
       "uZQFy/DR4xoKB4CzK4n8WpvB/B4aHSis8b3/A5KjSAS2JbuR8bBt\nRBAGvU" +
       "gEWPXAw3YkwxFBVQKZMwyVViHDn/tuRXJGcNrTyOxEcucZs1EZCyJzL5Jd/9" +
       "b4/qiNByTE\nQ4Yn/kEkD0nghoy8vveUg2NI9pZDYkj+IzDkLCMaJC9IEIOM" +
       "h0GQvFwOnCB5RUISZMrhi8rAA5mD\nZQTNUcGbXPBW5GXOe+8XaCGG4S+QzX" +
       "8BX9VempwaAAA="));
    
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
                7101);
            ss.
              participantName(
              "SP");
            ss.
              addParticipant(
              "Client",
              "localhost",
              1000);
            ss.
              addParticipant(
              "IdP",
              "mc05.cs.purdue.edu",
              7100);
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
                                req =
                                  (String)
                                    SJRuntime.
                                      receive(
                                      "Client",
                                      s);
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
                                                      Boolean retry =
                                                        new Boolean(
                                                        true);
                                                      SJRuntime.
                                                        send(
                                                        retry,
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
        SP a =
          new SP(
          );
        a.
          run();
    }
    
    public SP() {
        super();
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.3.0";
    final public static long
      jlc$SourceLastModified$jl =
      1355526515000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0aWYwcxbV69j7wHj7wbWwvYCf2bDgDrMGsl128ZrxePGsD" +
       "S2DdM1M723ZPd9Nd\nszs2NygxOIoVhM0lg5WExAmBCJuQkEMEBMacQRDJOJ" +
       "HgxwmHgAgSBazEkLxX1V19zOzYEBxFSlaa\nt1X1qt579eq9V6+r6sH3SZVj" +
       "k7hDHUczjfVxttGiDodmaj1NMyeeXNGv2g7NdOmq4wwAYii97lNt\n7e6Wm5" +
       "bHiDJIWg2zU9dUZ2DENvPZkYERzSnY5ATL1DdmdZO5FItonDP/8NiLm1fMqC" +
       "BNg6RJM5JM\nZVq6yzQYLbBB0pijuRS1nc5MhmYGSYtBaSZJbU3VtU3Q0TSA" +
       "saNlDZXlbeqspo6pj2LHVidvUZvz\n9BoTpDFtGg6z82lm2g4jzYn16qjanm" +
       "ea3p7QHNaRINXDGtUzzlXkOhJLkKphXc1CxykJbxbtnGJ7\nD7ZD93oNxLSH" +
       "1TT1hlRu0IwMI3OiI+SM2y6CDjC0JkfZiClZVRoqNJBWIZKuGtn2JLM1Iwtd" +
       "q8w8\ncGFk+rhEoVOtpaY3qFk6xMjUaL9+gYJedVwtOISRydFunBKs2fTImg" +
       "VWa1V14ydb+j8+AVYcZM7Q\ntI7yV8Og2ZFBq+kwtamRpmLgoXx8W+9l+Zkx" +
       "QqDz5Ehn0afzxJ+vSbz9mzmiz4wSfVZxWxxKHz5z\n5qxXO/9YV4Fi1Fqmo6" +
       "EphGbOV7XfxXQULLDuKZIiIuMe8onVz1x2wwP03Rip7SXVaVPP54xeUkeN\n" +
       "TJdbroFyQjOoaF01POxQ1ksqdd5UbfI6qGNY0ymqowrKlspGeLlgEUJq4KfA" +
       "r4eIvzoEjFQl++PO\neka+yqjDnHbHTrdbeTuTp+3OiJZKmTqYSDvY7Cg1UF" +
       "BVH3L902nnIwvIYcKYosDkZkYdTQerXG7q\nGWoPpXcdfP6a7otuvUUsG5qa" +
       "KxuoTHCM+xyHgGM82U8UhROeiBYpNNZp2+pG9JTCja/Ounufei/o\nH/TgaJ" +
       "son6YyVokQBp1aNpB0+W7YCyUVrGQoPemGt6ff87sf7Y2RipLBJCEbe0w7p+" +
       "poD573tLrs\nohgwo7aoMZfi/ectKx/Z/8LrC3yzZqStyNuKR6K3zIsq3jbT" +
       "NAPRyCd/59+Xf3B71dmPxkgluCCo\nl6lgOuDRs6M8Ql7T4UUgnEtFgjQMF0" +
       "28noGCxgITRtiIoFkYB6zFpIiAPHgdurn6K6/9umEvn7EX\n55oCATFJmfCa" +
       "Fn/9B2xKof31u/pv3/7+5ssrwE8tS6w5I9VWPqVr6QIMOT7saCheBs3mvT0d" +
       "zVsX\nOz/jS1yn5XJ5pqZ0CoFZ1XVzjGaGGI9MLYEoyIMPaKIxBUEM4uGQDo" +
       "TEXC1lFMyzRJiIT5207Y6F\nO17DQGJxxUxBh+OSkgJvaFMQLihCYn0WWvAk" +
       "f9rg+hvEBBoXJq9Yse6WeXzmQXKL3EpBEvR94fSy\nvtCDGw7YDDMh8vgms+" +
       "6bBy5eeekl7SIWnlKWRB/4c4bT8cdv7zWWPj55vxFDK6l21kufT5CYwxhZ\n" +
       "kPBIupaHVVFKrkgKlLcfLDryBHzG2jUf3bjn5e2NwHiQ1GhOjwZxC1fb6RPe" +
       "W2KviJDY9Pia+w69\nxN7gtum7C4o/s1Ac6daqAU8+a/9oS/XDO3MxUjNImv" +
       "l+rxpsrarn0XIHYcd2utzGBDkuhA/vvmKr\n6ZDhYGbUVQNso45aGdB2JfbG" +
       "cq3wTd6n6Z/i71P8oeFgRewJrV1mzoKNxD7hQgqTVhnNWAVFsXDY\nWXzwbA" +
       "7nCvuLwS4yjCpmpMaytVEV0yaiCKufyMgMuXZ2HjaRHMU8zrU2HiAU7ghLwU" +
       "7bIsssLSKO\nFsHEHr1v/5I9Bpt5kK9NjZucYYbkRw7YNXVQHd92bXCxclSl" +
       "nQ2l3a1REREpPaLpGZTsVKAxv6wB\niuG31SR3XZLddn/MdeIGi0evk3w39u" +
       "Vy2tYYOTOjDWs8/IBjH2468ZRH39vaLDYAP8SA8R+ZgN8+\nbRm54YUrP57N" +
       "yShppNHlRqBFMh6cXE4jy2hWK6WQaqbaWcrEtg3TKkMjQOIc/c593+//8BZP" +
       "KRdY\nGJ7LLUmvMQaap0eW4MQyRBKmaQkKG1Z8d/DJFYcSQq8pM7NRrKkrjF" +
       "BNn1iqcmKtpmmqjRaJhbHx\njDLDVkIZEl9wqVze0NL8g0HQ2HXGzQfuuKn9" +
       "b7AVXU5qqU5zkGOBIc++PJSBw54zYEMi1S06gKM3\n5ATNAc+tI5rx1bywrJ" +
       "pTNkSOkSPruZy1LCtJA+Juq+ZcQC3IVUFmfaPYf8GnVBjMyMSAry5XnZGV\n" +
       "qtUhF4SEd3wXX1XzhyefmrLulQoS6yH1uqlmelSeB5E6SECoMwJ5ZsFaej4X" +
       "oXGsFmAz/CqA2GQp\nPycIxqGmqB6QtpfUjgCXLjMDiUCFrqZQlDMLVotz2k" +
       "cQWDrz8Jlkux973YU0tbAgDOdr05Y7kPU3\n9JlRxMePPfM8fOB1FyzNphmJ" +
       "dcrbbRI0VmxiSDAJqsnbnnXE0TrixdYR6/nSkiWfzDub5x0wvBv4\nzSgzQK" +
       "3be89JZ77+dcgLe0GtsMn15TGgJsgE3HRU/P7j+Y+7l9TiF0afv7fUi2/IPj" +
       "+fJ6RqH8zb\n5wkJNFXhg7RBFOKIYeQ4MDBfGk4+C/LOYJ/TmxiZWw7tcq1e" +
       "ohkaO0+ya2JHuRqQEQarnBwSMSWp\n87BwFQLIqmudDeDQDJbbQ9f7aARMIk" +
       "7HQg4B2lHAtWWPwWCPOgOstEs3DR//W3b0WxwjkyItrmbq\nGGTWYboHsHA1" +
       "gmsYqUyb1kaJWsACO6LqiDwIJfN2wz4ou1rzqy4rno9IUmcHlyBKSoQXj9jE" +
       "cINL\nbkpGc9RcSsvmIfPw2UkGhxmZFY0AXoazBqoO10moRS7vZo+KyFFuRb" +
       "AlhCBt5VSB21BAFX61mAM5\nPC4HLHwLwdajGzG+sKexwL4dFdbNsDx5J0Va" +
       "PovIlwZNclRzNBZI+i6AwIJkl+U1PBuAHW9cnLvE\nE1JY5Tk6dpBsOrBwF4" +
       "K7wYJ1qo7SLviOk/itsDYyVRdidNu2aS9XjQzEuuxabDJBgmmlmuWEd0jF\n" +
       "NmPhPgQ7IevlDCWz3WBnEWbuGaJkMzHcIBl8RzKAZHp6hAhqX1JoDtRc5Uzk" +
       "3bozWVinVaPUtrWA\n8f8eCz9AsAs0JHtK/EMs8PmKBuGtfkPIx+r5yC7MiO" +
       "XQd7DwIIKHPNKYx0r8UjzZCZLm+8gySMCQ\nfnOg5m0JPhOb+pHzH/4UEPyw" +
       "1NwQPOBPypcMwU8kYmdJkdCkfJFETS7NT4+FHO+EEQ9LxEYwxZCA\nSTNvp2" +
       "kPRCYRQgLVL0TE3cFFrOILIHFnBQ162EbTNTJx1/j6QVWgskDNXcUK+MrzSM" +
       "QGWOAQVZJI\npkdoJq+j60+QZXd4DQxHatIj/oqFFxC8KLAXmqr0cOWxILZB" +
       "ZYzmLBbqscPvgeCV/yP+Iwh9PMTC\n4Io1wXoOmLj3QrakBdKlHwfjoDQcb5" +
       "OGWOEVPbNJi7okwDekPyF4k+GtC8ei40jLImOMtEoeOVUz\n4isBQCzDfy7d" +
       "Kge+hXyX6MPCuwjeQ/C+RBwPIskND8eX6DMBCx9wBCRByNA7Imnxs+Vlpgnb" +
       "CkhR\n3aVrkKAXZCmPnSnQWelRrNqHBQ3BegQb/DQaCyJlROBnqU3lc8XQRy" +
       "5PAUIt46W9PO7wZMBXVf14\niNPDso2VynMR+NnmYix4iag4l/GTXx+H4NpS" +
       "2SuC6yViVvmc3z85kClbKFHmRwiS2LTy+gydZXB9\nhlo8fSq1kmANVlF3Sk" +
       "MYcSVWqxHUhLXzOTQQIhXgMW085l+gVJ9d3O3s6A4GYTsK1KSt+jJhsFKm\n" +
       "Iph2lKwXYOFGBDchuFkizsXCNgTbw4jLsCBSUgT3lMpVEcicUiT1IqcMIYLJ" +
       "JgKZJIpN+3sI7g8h\nlBgWjnGKshQLexA8guCY5Ed8vr9A8MtjxmP8HAwLTy" +
       "B48t9lvjvMY6+fWmGBR+9nETznJ0xY8LfN\nl0qlQQheLpUBIfgv2f7/dxFH" +
       "k/ggOOjnOlgQqQqCt0rlMAje8TMXLJRKQ8bPT7DwQQnEhDDiL15K\n0hw8NM" +
       "RTQJmHlCnwg8oV4gYydEfEDyTmu/eeBKG49/QuLR078KkRefLBn6tsvvTDxm" +
       "+oT18hDtxb\nw7e73UY+d8bOA3Th+Y3pEu8L6phpLdbpKBUfBXg1GhM3V8B2" +
       "cdmLnZX8dNO/26tILl148qKGt2Kk\ncpwXAi1u42rK8rYROKKH3upnfjowJ6" +
       "KUqDwtozMurhjRno3xOz9xTVj08Cc8qCN8OVhvhwXlSziD\nC9AEKsJz9FZM" +
       "GdzjaP4fkS0IWsUNPwBljVjbce60SyK9+2nX4ib6FidPy5G+4n1UFt/a9tta" +
       "TmMy\nPb1t9v1vPnJw9SRhA+IZ1Pyil0jBMeIplHdbBxzmluPAez/95bkPXr" +
       "f6jZR7Lq8MQko4amoZnJyi\nh606WlGulIrF38nw63QV21lKscWOxHf4+eBw" +
       "Dn+kVl6xxe+o+PMZoaw9FW0fxn41pY2/CKlMqY68\nSwo9QCt+XxZ6NsblrJ" +
       "ezmga/OeVnpawqaQD4VaBcXVAIXjMr144z83NFHIH56xRC0ghX6npLKDcH\n" +
       "dgLSYnFTocjVi62Mn3bj7amHEw8uNDMun/cBsvg9BTIYEuJyXp/T/APvPZQt" +
       "+F0jD9/D4Vc8AyiU\nXWqkkeWUbPfTkltjkU0qAeWEWkClsWQ/3oFOjXqA+6" +
       "gvPe/VdQueslqeEwbjPbyrwTuhvK4H3xsE\nytWWTYc1biU14vWBxcW8m5HJ" +
       "JZ99MbD6UANX911i1A7+xgdHYe1ebirfLij/AvLLsws7KgAA");
}
