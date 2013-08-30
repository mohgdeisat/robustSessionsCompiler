package purdue.batching;

import sessionj.runtime.*;
import sessionj.runtime.net.*;
import java.util.Hashtable;

public class Client6 {
    final private SJProtocol invitation =
      new SJProtocol(
      ("H4sIAAAAAAAAAO1aa2wcVxW+s7ZjOwmOGydp08QhLUmaoLImQKK2dpvUL2yz" +
       "cQx2SpWKJrO7N7sT\nz85MZu46NioVoiAFkIJKX+IhVeKhCkEEAZWiiocqhC" +
       "qBhAQ/UEHiV/lBEfxACIFEkDjfPO6dWc9u\n3Jq0tjqVenJmzr3nnHvuuec7" +
       "c9ff+Rvr8Fy2z+OeZ9jW+bxYcriXx2PAzU7NcjFH7JnSy78b+r4l\ndr+aY1" +
       "qBddZ4rchdT7AdhfP6gj5QF4Y5MGKbJi8J0jS46LKDLbX6okAzC/7TfM0dpa" +
       "phlgU7WIim\nD/iTBuT0gcR0WHpXgyVQu3ieXIGtwMjjnbPPfbTy5DdyjNGM" +
       "7Y5tLlVMW4QzgjH373/hVOHPP3tn\nMGZXypiTvtYzpWtHd/f/9v4/dbfB5S" +
       "7H9gysWrBbCtGkICIzoWRw0XEWHQr1AUQrD1leRcvbd8qq\n2WXjnKEXTV4w" +
       "PHFty/7Dz//1cq8fknaT3gjWG4s0xmDld15fnXq/c5h98lcP/2uPr1QrXWCP" +
       "Ms13\napvSUjCseV6G+s2HZj82dfbS7W0UDOdiOzaIht7RalOHecVI29MNQn" +
       "crnJawNViCqVuVgVnhGlYF\nizjQQmdM5T3mMy9/c+bvl7A78D3nLHqts+wj" +
       "vMSNBd7oETb3SItpJ4jXKxS4Wq1uGSVdyEx97shj\nrzz9qYF/5ljbQ6yLm7" +
       "zGLUGHYM9DiYXppfk5Vy/xsWDAYIFtqgU6oUaw7SpLgoz2E1nGCYvrlUvE\n" +
       "v33+Uve3PFBWefk6MXdbTIfS1Spsk9ZFOoPLwqY1ONjaoYJtO4GG+amvnX5p" +
       "6t+FIJeLdnkJ89ui\nBToxrw619Kro6lapen23WuXocKqO3Gm21fBGuUNRpA" +
       "0zlzCgjGKk02TB+mJHb0L3qid0Z1D6z8jx\nm9QJCuUdnX946ec7zv6mjeXG" +
       "2UbT1svjeknY7iTrFlWXe1XbLC86x477Lmy+2EW0l/7PkbLt0n9f\nIcVSL3" +
       "Iz5u0k66qSlRG7zAuszdSLyZMVFCkqOWzvt24VrH3sgbHpKMhO3Y2yNY/B+e" +
       "XZmht/99DQ\nf2+/GwnkkMUJcmlXiwl69y++fODoHz+TY+2TtFLD4tN1gEOB" +
       "9ZR5ydRxzEdM3fNd6KVyeY6Sa1qv\n8fB5Y42Lql2Wb2B0w16qd8rmHEVMJ1" +
       "DYFDB5SAR7B+258sZXnyd/d4k3eLoFu62VOLS6YciwDHGf\nNLdFrLwGCbat" +
       "4Y2vFKqOSoX3gbkL5G7Burx5KjOCinok3qjEIINS8AEwPjkiEgVHjjgdH9Ft" +
       "UfqM\nmLal5L9uvZQEaPtLSbwJ49MtXN6g9xUwwyAjlI4l21mSooMiht66F2" +
       "AtPIuQe5p4WLsp/hiaahfx\n1VG09jdVFZz7SFlf8kWobkfZ8PRa0ajUdcGV" +
       "OWngmmD9jUeT8sShdHZP0aPnxyTxRm7vdKRF08DM\ngHw4IWD7WoUC5TQWCv" +
       "W43AK71sRCU9NvqYC9X8Q6gMZ1h+1ntPRtDW9ex+rZg/HsXjCoMSP9M64t\n" +
       "7JJtjlKlgtrhOnWf3CVIbyoLs6WniMdxg5tlDJBmBsEUQcjfbpPrC3xEN5X8" +
       "Mm2z7CwDN8Zc13Yn\ndKtMxbPyAF7Z5MHOtNdywedkYHvBVEEMwTp8g9LYVU" +
       "rZBmMj1KfyRSHN9CVfSAPz0kBOsFsblCD6\nUkNv7CkMTp8/bKxcoX06ucBd" +
       "14ido9+DcUAuUITkSCm/QvOlPSREtPubEsd1oz9zBJ8LcuprYBZA\nLkaq0c" +
       "tK+TFq0ROqfWAapp4E+ntjTxHGKCMuV0X4P2oJIG7a2kCU5SvKM5BFKXg21S" +
       "WklHIpeJJb\n8+iN8OO1pODjUrBEqZhwcNauuyU+TkUuqEaxx/+Li1fjm9jh" +
       "b4CU3RVP6HMuUtcq58Pkm6FQUchi\nT+Eutrl1uXe5ORH7tJMqZktVXq6bOP" +
       "o9kg+nd9J0aJMn4h9gngJ5OpB+0NblCdd+FJdu0oXgNUck\nRnxVjQD5SiZ4" +
       "UwRmM8Gh+I5tof2cswHj1HgZsc7r2/E6KBMnwnuqFREbpU0peJYKPgfmuyDf" +
       "E2xz\nKMXBkZmFjN8qbdR0w8qfIEK1DP+Eejs8+t5RR2IazPMgPwR5QQpuJp" +
       "ck4GF+ypgeMC/6AuqnYJC6\n/d0NNx8zJvXXEzbAj76BX/3lI2Mf+uyl4HPO" +
       "Ul17omMPvu4RA9Ogb4TDvsE7mHaY2uW2k6Oj6nsE\nzJ3+Z0bo04a9YN4Lch" +
       "jkfaqzBxP0ryCqZd4CRvXEqb00iGqWV9JFg6g+/3RScFx1zWCC7hZkNK3t\n" +
       "BRlXTS+YCZBJkCnVwoIpgJwAWUVLx/aBmQM5tUpVb3F3COZhkDMrWwd7EEzQ" +
       "gIGo5mAwKZAdFLsM\nJuigEoJ4awUiW6IAomogVkKg5cDcYEA+BuYRkE+A3J" +
       "Bu4Fkwj4F8+obZaN5xgPGL5edXa/xq0sYX\nVCMB5nGQL4I8odoDMAoknkkD" +
       "fZAvpeE9yBoBu7evYCUwD3JFITuYAJhBrqYhNsgPFE6DSQPd5mgM\n5sUUQU" +
       "9S8GOQnyrkXFSsxMqx9YqV7wET3QQFP/WsAkf7xQqvoOWdSeKmyr+Llsp2tr" +
       "78SlyK+xcR\niTfRh4+2RyrsxCP2R7stKQCaabtB+pPRaRqBtSloui9PiZX9" +
       "pEgdY+xJfjuqgOCIa8gZLb9C001b\nq3vBqD5CCY6L2A8GqddCrm55pu5fdf" +
       "Q3E4UpdbMI3/DkQGkNR1XDydD8k5H1IFkPApL1INcTrHNQ\n9wU/EeEPhf4n" +
       "8qQleAX3BhG8pwC9hNR1DPREtFvWBmK9ASi7kECgNxmaLsTBQlM7mKFIhiIZ" +
       "irx9\nUSR20Tpq14smT4GOezPoyBAiQ4gMITKEeD2CdY4QRLSvp6DB0GrQoP" +
       "U1m/rTU/+aTT02+ds2DWdB\n+wteJfEjVbDO8CODiQwmMpjIYIKteZiI/8Yk" +
       "YULW3eyjYbkgq+1Zbc9qe1bb2Zqv7drZlNp+T1bb\nsxLOshKelfCshLM1X8" +
       "Lj7Xnsj8Eg6fkf2OkOUrc/AAA="));
    
    public void run() throws Exception {
        SJServerSocket ss = null;
        try {
            ss = SJServerSocketImpl.create(invitation, 20102);
            ss.participantName("client2");
            ss.addParticipant("client1", "localhost", 20102);
            SJSocketGroup client1Socket = null;
            try {
                client1Socket = ss.accept("client1");
                SJRuntime.pass("Hi, from client2", "client1", client1Socket);
                String str =
                  (String) SJRuntime.receive("client1", client1Socket);
                Integer ii =
                  (Integer) SJRuntime.receive("client1", client1Socket);
                Double d = (Double) SJRuntime.receive("client1", client1Socket);
                Double d2 =
                  (Double) SJRuntime.receive("client1", client1Socket);
                System.out.println("Client2 received:\nString: " + str +
                                   "\nInteger: " + ii + "\nDouble1: " + d +
                                   "\nDouble2: " + d2);
                {
                    SJRuntime.negotiateNormalInwhile("client3", client1Socket);
                    while (SJRuntime.insync("client3", client1Socket)) {
                        Integer i =
                          (Integer) SJRuntime.receive("client1", client1Socket);
                        System.out.println("Received: " + i);
                        {
                            String _sjbranch_$0 =
                              SJRuntime.inlabel("client1", client1Socket);
                            if (_sjbranch_$0.equals("ODD")) {
                                {
                                    String str3 =
                                      (String)
                                        SJRuntime.receive("client1",
                                                          client1Socket);
                                    System.out.println(str3);
                                }
                            } else
                                      if (_sjbranch_$0.equals("EVEN")) {
                                          {
                                              String str4 =
                                                (String)
                                                  SJRuntime.receive(
                                                    "client1", client1Socket);
                                              System.out.println(
                                                "Client2 received: " + str4);
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
            finally {
                SJRuntime.close(client1Socket);
            }
        }
        finally {
            { if (ss != null) ss.close(); }
        }
    }
    
    public static void main(String[] args) throws Exception {
        Client6 a = new Client6();
        a.run();
    }
    
    public Client6() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.3.0";
    final public static long jlc$SourceLastModified$jl = 1376322788000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0cbWwcxXXuzt828VcSkjjfMZC0ybnhIyI4EGLHJg4Xx8RO" +
       "CEbgrO/G5032dpfd\nOftCKSUgCFA1EoIApaFREW3El0qCgEqltAgoFCi0aR" +
       "XSSvCHikLLpxAQtYH2vZnd2d278yWQpsT0\nLN3z230z7828eV+79r0H3yWl" +
       "tkWiNrVt1dA3R9lWk9ocGoObaZzZ0d7VPYpl00S7pth2HxAG4ps+\nVzfsrb" +
       "92VZiE+kmDbqzQVMXuG7aMdHK4b1i1MxaZbRra1qRmMIdjDo9z5h0efWn76q" +
       "YIqe0ntare\nyxSmxtsNndEM6yc1KZoapJa9IpGgiX5Sr1Oa6KWWqmjqlTDQ" +
       "0EGwrSZ1haUtaq+jtqGN4MAGO21S\ni8t0b8ZITdzQbWal48ywbEbqYpuVEa" +
       "UlzVStJabarDVGyoZUqiXsK8jVJBwjpUOakoSBk2PuLlo4\nx5ZOvA/Dq1RY" +
       "pjWkxKk7pWSLqicYmZU9Q+64+UIYAFPLU5QNG1JUia7ADdIglqQperKll1mq" +
       "noSh\npUYapDAybUymMKjCVOJblCQdYGRK9rgeQYJRlVwtOIWRSdnDOCc4s2" +
       "lZZ+Y7rbVlNZ/d3PPpbDhx\nWHOCxjVcfxlMmpk1aR0dohbV41RMPJSO3tZ1" +
       "SXp6mBAYPClrsBiz4pTH18fe+tUsMaYpz5i13BYH\n4oeXTJ+xf8VfKyO4jA" +
       "rTsFU0hcDO+an2OJTWjAnWPVlyRGLUJf563W8uueZ++o8wqegiZXFDS6f0\n" +
       "LlJJ9US7g5cDHlN1Ku6uHRqyKesiJRq/VWbwa1DHkKpRVEcp4KbChjmeMQkh" +
       "FfAJwedCIn4qETAy\nsU1h8eFe4Gm3ayrV2elRezMjSxm1md1iW/EWM20l0r" +
       "RlEMeBMfCDSljqCNVb8s3NoMgJo6EQ7HZ6\ntudpYKarDC1BrYH4njdeuKrj" +
       "wptuFOeItucslpGThcyoKzMq2C8hoRDn24gWKjS4wrKUreg5mW37\nZ/zgOe" +
       "VuOA/Qi61eSfm2Q6MlCGHS6QUDS7vnll2AKWA1A/GJ17w17a4/3vdsmETyBp" +
       "eYvNlpWClF\nQ/twvanBEZdNAbNqzjbufLLfu3nNIwdefG2+Z+aMNOd4X+5M" +
       "9J652Xq3jDhNQHTy2N/xz1Uf3Fq6\n9NEwKQGXhKDEFDAl8PCZ2TICXtTqRi" +
       "TcSyRGqodyNl7FQEGjvg0jrEFQJ2wDzmJi1gJ5MDt0Xdm3\nXn2i+lm+Yzfu" +
       "1foCZC9lwovqvfPvsyiF+6/d2XPrzne3XxoBvzVNceaMlJnpQU2NZ2DKyUHH" +
       "w+Ul\n0Gze2ddat2OR/Rg/4ko1lUozZVCjEKgVTTNGaWKA8UhV74uKPBiBJm" +
       "oGIaiBeQ5owEjs1QyNgHnm\nCRvRKRNvu33BrlcxsJhcMZPRAflKSYbfaA4h" +
       "nJ9DxOsZaMETvW1DKNgiNlCzoPey1ZtunMt37me3\n0LnISIaeL5xZ0Bc6MQ" +
       "GBzTADIpFnMpu+d/CiNRsvbhGxcXFBFt3gzgnOx5u/s0tf/uSkA3oYraTM\n" +
       "3ixdPkbCNmNkfsxl6VgeXgqsd3WvILn5YeGRN+AJVq/6ZNu+V3bWgOB+Uq7a" +
       "naquaHjadrfw3jy5\nI4vFlU+u/9Gh37HXuW167oLLn57JDXQbFJ8nn31gpL" +
       "7s4d2pMCnvJ3U8/ys626BoabTcfsjgdrtz\nM0ZOCtCD2ViknlYZDqZnu6pP" +
       "bLajlvi0XYKjEa8QvsnH1P5b/HyOHzQcvBA5oqHdSJmQWKzZF1DY\ntMJows" +
       "yEQiZOO5tPnsnhHGF/YQaiUcWMlJuQKBQso7BOGVEZr5f44EZGmuQhWmmdqS" +
       "mKBZ5jdjxS\nhLhHLAeDbc46b2kaUTQNJpL3cweW7dPZ9Df4IZU7VRuWTl4I" +
       "gXSqgQ55PrbA1wpxlQY3EHdyZkiE\nJshJWgJXdjrwmFfQEsX0W8p791ycvO" +
       "3esOPN1SYPY6d6/uyty25er6eMhDqk8jgEHn649pTFj76z\no05kAi/WgBcc" +
       "mYF3f2obuebFyz+dydmE4sij3QlFC2VgOK2QRtpoUs2nkDKmWEnKRPqGbRXg" +
       "4WNx\njnbHcz/p+fBGVykrTYzThY5kHY1TqDuyV4DR6KwC09YADqUnGHEqra" +
       "txboKCx56zrjt4+7UtH0Pw\nv5RUUI2moMoAi5l5aaAGhijfZ0Hl0iEGgGtV" +
       "pwTPPteRspTg7gd/d/N9nVLQ1PRE7qZw7lofD49X\nIR116aNgnTk6yj2lQg" +
       "uKGYYpOGxZfU//U6sPxYTtDRqJrcLunQ2avlUtKLiqQQui0vCRl1XIANvy\n" +
       "8oCY3qDaK6kJWoTT0baK3A5uqsBkRhp97r9KsYfXKGarXD8JVhMOvbT8L089" +
       "PXnTHyIk3EmqNENJ\ndCq8xiKVUNxQexhK2Iy5/Hy+hJpRLK3rMPABs0ly/Z" +
       "wh6FIZpJpvtV2kYhiktBsJKDIimjKIS1kC\nK5l93zRGSjo2dHS7SoUq2DXF" +
       "KJpiNNcUw53fWLbss7lLeVkBElbBEpoKTFAqn73r1CWvXQ9lXxfs\nDHJYdx" +
       "rDZIxMwJyi4OMeL2+cVFGBDxTdXuqoEo+M3V61TkjZbHiO9WRCfUwVeP6sFk" +
       "gUKYycBGfs\nrYazT8J6m9iXdF1G5hQiO1LLlqm6ys6T4mrZ0QcYeDbKusOZ" +
       "IitDMjwPkSsQQOlcYW+BGMKcBIfk\nKo+MgEnCmYikEMAjoz+ayBH9/hGVOp" +
       "hLu2boHv3lwlsJpC++lcAdRz+VDMrnIN+DiHwbwVVgjnHD\n3CpJ85kv2ym2" +
       "KHZwZW6m6wYcpdX7Lx1RvOiQrJYyXwDKZiX83GXWGLzhsJucUG0lNagm01Be" +
       "eOKk\ngMOMzMh2RbeMWQ+XNtdJ4I483u0uF1F/3ITg5gCBNBdSBYZPnyq8y1" +
       "wJ5PAYEsYU/ZUSyBnMl96z\n9+0UYu7WJ2bd+QK7Jxv91j2i2irz1YYrIVIh" +
       "27a0iq8SIF+PSXOsZcIgXvKaHgdIMa2I/BDBLnAG\njSojtB2e+yR9BxyzLO" +
       "3FMjosy7BWKXoCgmdyA94yYAVT892WG94tFVuHyI8R3ANVMhcohe0Fk80S\n" +
       "5ryDlGIagzekgHulACi+p2UxQe1LDnW+K0c5jXxYRyIJ57R2hFqW6vOjPyNy" +
       "H4L7QUNypKQ/xHyP\nu2gQ7ulXB9y1is9sx8JZTn0bkZ8heNhljeWupC9nZE" +
       "qANU9MbVCDIP8635WbYzwhFvWC8L+8LSB4\nIN/eEDzkbcpbGYK9krA775LQ" +
       "pLwliSt5NI8fj3W8HSQ8IglbwRQDC+w10lacdkKQE9HId/lfWeJe\n/yGW8g" +
       "OQtLP9Bj1koenqiahjfD2gKlCZ78o5xQg8DLoswn3M9xJWsuiND9NEWkPXny" +
       "BxZ3o5TEdu\n0iM+QuRlBK8I6gWGIj089HM/tVphjKZMFhixyxuB4E9Fwv+E" +
       "oI1FWOA/sVo4zz4D0zgUXqqv8nrA\nHwel4bj5HmKFi7pmExfXkgFPSG8heJ" +
       "vhX204FR1HWhYZZaRBykgpqh5dAwBiGf5y+Jba8HzjuUQ3\nIu8heB/BB5Jw" +
       "MixJJjycn2fMBES4Ob8P9RQKdN+k1PlLfqzhcUP8nfliPkQhocVQ+0bWrlzp" +
       "PVwg\nQvkzgyOgbDYiKoLNCLZ4ZToiohhF4NW/tYh4BW7ewhiBp4GjKYkRjO" +
       "arhBF49Sg3AlGqIvhOvhoW\nwXe9ChaRbQiuRXCdV48icj2CGxAcQ31GmhH5" +
       "PoIdx8jqKy71ELkDwZ1Htw+yERFRTSG4O1+ZhUCW\nQ0JDohwKEPx1EgJZ34" +
       "h881MEewKEUBiR45xdlyPyKILHEByX1L4bkScQ/PK4yRi7fEDkaQTPHKvw\n" +
       "vUEZz3tVASIvIHgRwUterkfEi/i/z5fBEezPl7wRnCCZ6/+XcDQ5G8GbXppG" +
       "RGRZBH/Pl34RvOMl\nXUTyZdCxUysiH+UhTAgSPkbwiZc5Mx4qc2VsvObKRY" +
       "i4r3XEXzCOIY/OYEf5/li+AAm8duIvkiWz\nqYXfZAXeaPO3CoE77lNMaINk" +
       "WI6XmIxClwQJl+MlhpnQ+qB2xtTAiUkY81x2sqP7SxlUjL4r+SDo\nKQRdPI" +
       "SveENDRyl6zNLqXES8OsIj4OEUy4VjFF4sF4rlwngljPNygRPg4bvee/ju0h" +
       "lN4usFt3DI\nU0J0fA1KCAChnhMjF36JJHlFILcVk14x6X2RDRaTXpFQTHq+" +
       "N84rjfSgRvNkupXFTFdMaKSY0IoJ\nrZjQvr6EcZ7QAITezJO82o8leRV+Pe" +
       "r9vy9/PepdjvEPhuEzEPA0Fkx3eQnjLN0Vs1oxqxWzWjGr\nnWCE8Z/V/H/K" +
       "lFmt7ViyGiJf50eyYioqpqJiKiqmohOMMP5TUWhXnlS0opiKihmHFDNOMeMU" +
       "M84J\nRhj/Gcf/8OP7j06krBZfpQ+0rOD/BD/PacNCEIo2LG4PFdvyfZMpqy" +
       "MV76a1feOHNTcoz1wmuhE0\nBJvNdOjp1Fm7D9IF59fE83Q7qmSGuUijI1R8" +
       "5wg7tYRFIw0Qu6hge4k1/NvYXquRSO/yBactrP5b\nmJSM0bCo3rm5jrK0pf" +
       "v6F8Bo5Qt3MpqVpZTs9dSPNF0UGVafD/MWJKJrSU5fsuCk1mCvkioruFB+\n" +
       "hE18AbVEdLVqgM8UIn74byTWI2gQDYcAhD8XZztGi528RLddDl43MqfpFP+L" +
       "Z0cmTk38uhHyj1Q5\n31nLbSLTY6kplcnvj98y8943H3lj3URhA6JL27ycRm" +
       "n+OaJTm9szBCTMKSSBj37mm3MevHrd64NO\nC4lIhJGSEUNN4OYik4JWnX0R" +
       "KZeKxc9p8Ol0FNuZT7G5jsSz9zxGymzeQ6+wYnPbvPFuXkJZ+yLN\nH4Z/Mb" +
       "mZN6gqGVRs2Wgj0B8vt/1doKsdX2eV3NVU+Mw6wq4+yWsAWCZGmjMhgl1vIq" +
       "eOsfNzRRyB\n/WtUT7JhrtRG0bwjMhnsBFaL6LxMjqvnWhn/Xj72cHFpov+T" +
       "akRl90Eg5rZ3QgEVYrlc1pc0f1/7\nqcgZ+D/jsk1A8M//oitRpuBRIw/e/S" +
       "vS5HxzjVtjjk2GfMoJ3MH/xXeawGHnnCnZbuA0HozP3b9p\n/tNm/W+F1bjN" +
       "AcuxkUVa0/w9kHx4mWnRIZUffrnoiGTytbYxUpvViY6RChflel4hRnbwXmM4" +
       "Eq86\nuY0szYT+A6gB8p7TUgAA");
}
