package purdue.batching;

import sessionj.runtime.*;
import sessionj.runtime.net.*;
import java.util.Hashtable;

public class Client6 {
    final private SJProtocol invitation =
      new SJProtocol(
      ("H4sIAAAAAAAAAO1aa2wcVxW+s7ZrOwmOGydp08ShLUmaoLImQKK2dpvUL2x3" +
       "4xjslCoVTWZ3b3Yn\nnp2ZzNx1bFQqREEKIAUVaCseUiUeqqo2goBKUcVDFU" +
       "KRQEKCH6gg8av8oAh+IIRAIkicbx73zqxn\nN25NWludSj05M+fec84999zz" +
       "nbnrF/7GOjyX7fG45xm2dTYvlhzu5fEYcLNTs1zMEXuqdOV3Q9+3\nxK7Xck" +
       "wrsM4arxW56wm2vXBWX9AH6sIwB0Zs0+QlQZoGF122v6VWXxRoZsF/mq+5o1" +
       "Q1zLJg+wvR\n9AF/0oCcPpCYDkvvabAEahfPkiuwFRh5onP22Y9VvvLtHGM0" +
       "Y5tjm0sV0xbhjGDM/XtfOlH488/e\nHYzZmTLmuK/1VOnq4V39v73/T91tcL" +
       "nLsT0Dqxbs5kI0KYjITCgZXHScRYdCvQ/RykOWV9Hy9pyw\nanbZOGPoRZMX" +
       "DE9c3bz34It/vdjrh6TdpDeC9cYijTFY+Z3XVqfe7xhmn/rVI//a7SvVSufY" +
       "Y0zz\nndqqtBQMa56XoX7TgdmPT52+cHsbBcM5344NoqF3tNrUYV4x0vb0Bq" +
       "G7FU5L2BIswdStysCscA2r\ngkXsa6EzpvIe8+kr35n5+wXsDnzPOYte6yz7" +
       "KC9xY4E3eoTNPdRi2jHi9QoFrlarW0ZJFzJTnz30\n+KtPfXrgnznW9jDr4i" +
       "avcUvQIdj9cGJheml+ztVLfCwYMFhgG2uBTqgRbJvKkiCj/USWccLieuUS\n" +
       "8W+fv9S9LQ+UVV6+TszdGtOhdLUK26R1ns7gsrBpDQ62dqhg206gYX7qmydf" +
       "mfp3Icjlol1ewvy2\naIFOzKsDLb0qurpVql7brVY5OpyqI3eSbTG8Ue5QFG" +
       "nDzCUMKKMY6TRZsL7Y0ZvQveox3RmU/jNy\n/EZ1gkJ5R+cfXvn59tO/aWO5" +
       "cbbBtPXyuF4StjvJukXV5V7VNsuLzpGjvgubzncR7aX/c6Rsm/Tf\nV0ix1I" +
       "vcjHk7ybqqZGXELvMCazP1YvJkBUWKSg679blbBGsfe3BsOgqyU3ejbM1jcH" +
       "55tubG3zs0\n9N/b70YCOWRxglza2WKC3v2Lr+07/MfP5lj7JK3UsPh0HeBQ" +
       "YD1lXjJ1HPMRU/d8F3qpXJ6h5JrW\nazx83lDjomqX5RsY7bhC9U7ZnKOI6Q" +
       "QKGwMmD4lg76I9V9746vPk707xJk+3YLe1EodWbxgyLEPc\nJ81tFiuvQYJt" +
       "bXjjK4Wqw1LhfWDuArlbsC5vnsqMoKIeiTcoMcigFHwIjE8OiUTBkSNOxkd0" +
       "W5Q+\nI6ZtKfmvWy8lAdr+UhJvwvh0C5c36H0VzDDICKVjyXaWpGi/iKG37g" +
       "VYC88i5J4mHtZujD+GptpF\nfHUUrb1NVQXnPlLWl3wRqtteNjy9VjQqdV1w" +
       "ZU4auCpYf+PRpDxxKJ3dE/To+TFJvJHbOx1p0TQw\nMyAfSQjYnlahQDmNhU" +
       "I9LrfArjax0NT02ypgHxSxDqBx3WH7GS19a8ObN7B69lA8uxcMasxI/4xr\n" +
       "C7tkm6NUqaB2uE7dJ3cJ0pvKwmzpKeJx3OBmGQOkmUEwRRDyt9vk+gIf0U0l" +
       "v0jbLDvLwI0x17Xd\nCd0qU/GsPIhXNnmwI+21XPAZGdheMFUQQ7AO36A0dp" +
       "lStsHYCPWpfFFIM33JF9LAvDSQE+yWBiWI\nvtTQG3sKg9PnDxsrV2ifji9w" +
       "1zVi5+j3YByQcxQhOVLKL9F8aQ8JEe3+xsRx3eDPHMHngpz6OpgF\nkPORav" +
       "SyUn6EWvSEah+Yhqkngf7e2FOEMcqIy1UR/o9aAoibtjYQZfmS8gxkUQqeSX" +
       "UJKaVcCp7k\n1jx2Pfx4PSn4hBQsUSomHJy1626Jj1ORC6pR7PH/4uLl+CZ2" +
       "+BsgZXfFE/qMi9S1yvkw+WYoVBSy\n2FO4i21uXe5dbk7EPu2kitlSlZfrJo" +
       "5+j+TD6Z00HdrkifgHmCdBngqkH7Z1ecK1H8WlG3UheM0R\niRHfUCNAvp4J" +
       "3hKB2UxwIL5jm2k/52zAODVeRqzzej5eB2XiRHhPtSJio7QpBc9SwefBfBfk" +
       "e4Jt\nCqU4ODKzkPFbpI2ablj5Y0SoluGfUG+HR9876khMg3kR5IcgL0nBTe" +
       "SSBDzMTxnTA+ZlX0D9FAxS\nt7+r4eZjxqT+esIG+NE38Gu/fHTsgc9dCD7n" +
       "LNW1Jzr24OseMTAN+kY46Bu8g2kHqV1uOz46qr5H\nwNzpf2aEPnVcAfN+kI" +
       "MgH1CdPZigfwVRLfNmMKonTu2lQVSzvJIuGkT1+SeTgqOqawYTdLcgo2lt\n" +
       "L8i4anrBTIBMgkypFhZMAeQYyCpaOrYHzBzIiVWqepu7QzCPgJxa2TrYQ2CC" +
       "BgxENQeDSYHsoNhF\nMEEHlRDEWysQ2RIFEFUDsRICLQfmOgPyETCPgnwS5L" +
       "p0A8+AeRzkM9fNRvOOA4xfLL+wWuOXkza+\nqBoJME+AfAnky6o9AKNA4uk0" +
       "0Af5ahreg6wRsHvnClYC8yCXFLKDCYAZ5HIaYoP8QOE0mDTQbY7G\nYF5OEf" +
       "QkBT8G+alCzkXFSqwcW69Y+T4w0U1Q8FPPKnC0X6zwClremSRuqvy7aKlsR+" +
       "vLr8SluH8R\nkXgTffhou6XCTjzeCnJbUgA003aB9Cej0zQCa1PQdF+eFCv7" +
       "SZE6xtiT/HZUAcER15AzWn6Fppu2\nVveCUX2EEhwVsR8MUq+FXN3yTN2/6u" +
       "hvJgpT6iYRvuHJgdIajqqGk6H5JyPrQbIeBCTrQa4lWOeg\n7gt+IsIfCv1P" +
       "5ElL8AruDSJ4TwF6CanrGOiJaDevDcR6E1B2LoFAbzE0nYuDhaZ2MEORDEUy" +
       "FHnn\nokjsonXUrhdNngId92bQkSFEhhAZQmQI8UYE6xwhiGjfSkGDodWgQe" +
       "trNvWnp/41m3ps8rdtGs6C\n9he8SuJHqmCd4UcGExlMZDCRwQRb8zAR/41J" +
       "woSsu9lHw3JBVtuz2p7V9qy2szVf27XTKbX9nqy2\nZyWcZSU8K+FZCWdrvo" +
       "TH2/PYH4NB0vM/saZFJrc/AAA="));
    
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
                    SJRuntime.negotiateNormalInwhile("client1", client1Socket);
                    while (SJRuntime.insync("client1", client1Socket)) {
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
    final public static long jlc$SourceLastModified$jl = 1327975369000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0cbWwcxXXuzt828VcSkjjfMZC0ybnhIyI4EGLHJg4Xx8RO" +
       "CEbgrO/G5032dpfd\nOftCKeVDEKBqJAQBSkOjItqIL5UEAZVKaRHQUKDQpl" +
       "VIK8EfKgotn0JA1Aba92Z2Z3fvzpdAmhLT\ns3TPb/fNvDfz5n3t2vceepeU" +
       "2haJ2tS2VUPfHGVbTWpzaAxupnFmR3tX9yiWTRPtmmLbfUAYiG/6\nXN2wp/" +
       "66VWES6icNurFCUxW7b9gy0snhvmHVzlhktmloW5OawRyOOTzOmXd49KVtq5" +
       "sipLaf1Kp6\nL1OYGm83dEYzrJ/UpGhqkFr2ikSCJvpJvU5popdaqqKpV8JA" +
       "QwfBtprUFZa2qL2O2oY2ggMb7LRJ\nLS7TvRkjNXFDt5mVjjPDshmpi21WRp" +
       "SWNFO1lphqs9YYKRtSqZawryBXk3CMlA5pShIGTo65u2jh\nHFs68T4Mr1Jh" +
       "mdaQEqfulJItqp5gZFb2DLnj5gthAEwtT1E2bEhRJboCN0iDWJKm6MmWXmap" +
       "ehKG\nlhppkMLItDGZwqAKU4lvUZJ0gJEp2eN6BAlGVXK14BRGJmUP45zgzK" +
       "ZlnZnvtNaW1Xx2S8+ns+HE\nYc0JGtdw/WUwaWbWpHV0iFpUj1Mx8VA6envX" +
       "JenpYUJg8KSswWLMilOeWB9761ezxJimPGPWclsc\niB9eMn3G/hV/rYzgMi" +
       "pMw1bRFAI756fa41BaMyZY92TJEYlRl/jrdb+55JoH6D/CpKKLlMUNLZ3S\n" +
       "u0gl1RPtDl4OeEzVqbi7dmjIpqyLlGj8VpnBr0EdQ6pGUR2lgJsKG+Z4xiSE" +
       "VMAnBJ8LifipRMDI\nxDaFxYd7gafdrqlUZ6dH7c2MLGXUZnaLbcVbzLSVSN" +
       "OWQRwHxsAPKmGpI1RvyTc3gyInjIZCsNvp\n2Z6ngZmuMrQEtQbiu9944aqO" +
       "C2++SZwj2p6zWEZOFjKjrsyoYL+EhEKcbyNaqNDgCstStqLnZK7d\nP+MH+5" +
       "R74DxAL7Z6JeXbDo2WIIRJpxcMLO2eW3YBpoDVDMQnXvPWtLv/eP9zYRLJG1" +
       "xi8manYaUU\nDe3D9aYGR1w2BcyqOdu488l+75Y1jx548bX5npkz0pzjfbkz" +
       "0XvmZuvdMuI0AdHJY3/nP1d9cFvp\n0sfCpARcEoISU8CUwMNnZssIeFGrG5" +
       "FwL5EYqR7K2XgVAwWN+jaMsAZBnbANOIuJWQvkwezQ9WXf\nevXJ6uf4jt24" +
       "V+sLkL2UCS+q986/z6IU7r92V89tO97ddmkE/NY0xZkzUmamBzU1noEpJwcd" +
       "D5eX\nQLN5Z29r3fZF9uP8iCvVVCrNlEGNQqBWNM0YpYkBxiNVvS8q8mAEmq" +
       "gZhKAG5jmgASOxVzM0AuaZ\nJ2xEp0y8/Y4FO1/FwGJyxUxGB+QrJRl+ozmE" +
       "cH4OEa9noAVP9LYNoWCL2EDNgt7LVm+6aS7fuZ/d\nQuciIxl6vnBmQV/oxA" +
       "QENsMMiESeyWz63sGL1my8uEXExsUFWXSDOyc4H2/+ji59+VOTDuhhtJIy\n" +
       "e7N0+RgJ24yR+TGXpWN5eCmw3tW9guTmh4VH3oAnWL3qk2v3vrKjBgT3k3LV" +
       "7lR1RcPTtruF9+bJ\nHVksrnxq/Y8O/Y69zm3Tcxdc/vRMbqDboPg8+ewDI/" +
       "Vlj+xKhUl5P6nj+V/R2QZFS6Pl9kMGt9ud\nmzFyUoAezMYi9bTKcDA921V9" +
       "YrMdtcSn7RIcjXiF8E0+pvbf4udz/KDh4IXIEQ3tRsqExGLNvoDC\nphVGE2" +
       "YmFDJx2tl88kwO5wj7CzMQjSpmpNyERKFgGYV1yojKeL3EBzcy0iQP0UrrTE" +
       "1RLPAcs+OR\nIsQ9YjkYbHPWeUvTiKJpMJG89x1Ytldn09/gh1TuVG1YOnkh" +
       "BNKpBjrk+dgCXyvEVRrcQNzJmSER\nmiAnaQlc2enAY15BSxTTby3v3X1x8v" +
       "b7wo43V5s8jJ3q+bO3Lrt5vZ4yEuqQyuMQePjh2lMWP/bO\n9jqRCbxYA15w" +
       "ZAbe/alt5JoXL/90JmcTiiOPdicULZSB4bRCGmmjSTWfQsqYYiUpE+kbtlWA" +
       "h4/F\nOdqd+37S8+FNrlJWmhinCx3JOhqnUHdkrwCj0VkFpq0BHEpPMOJUWl" +
       "fj3AQFj91nXX/wjutaPobg\nfympoBpNQZUBFjPz0kANDFG+z4LKpUMMANeq" +
       "Tgmefa4jZSnB3Q/+7ub7OqWgqemJ3E3h3LU+Hh6v\nQjrq0kfBOnN0lHtKhR" +
       "YUMwxTcNiy+t7+p1cfignbGzQSW4XdOxs0fataUHBVgxZEpeEjL6uQAbbl\n" +
       "5QExvUG1V1ITtAino20VuR3cVIHJjDT63H+VYg+vUcxWuX4SrCYcemn5X55+" +
       "ZvKmP0RIuJNUaYaS\n6FR4jUUqobih9jCUsBlz+fl8CTWjWFrXYeADZpPk+j" +
       "lD0KUySDXfartIxTBIaTcSUGRENGUQl7IE\nVjL7/mmMlHRs6Oh2lQpVsGuK" +
       "UTTFaK4phju/sWzZZ3OX8rICJKyCJTQVmKBUPnf3qUteuwHKvi7Y\nGeSw7j" +
       "SGyRiZgDlFwcc9Xt44qaICHyi6vdRRJR4Zu71qnZDSffAc68mE+pgq8PxZLZ" +
       "AoUhg5Cc7Y\nWw1nn4T1NrEv6bqMzClEdqSWLVN1lZ0nxdWyow8w8GyUdYcz" +
       "RVaGZHgeIlcggNK5wt4CMYQ5CQ7J\nVR4ZAZOEMxFJIYBHRn80kSP6/SMqdT" +
       "CXds3QPfrLhbcSSF98K4E7jn4qGZTPQb4HEfk2gqvAHOOG\nuVWS5jNftlNs" +
       "UezgytxM1w04Sqv3XzqieNEhWS1lvgCUzUr4ucusMXjDYTc5odpKalBNpqG8" +
       "8MRJ\nAYcZmZHtim4Zsx4uba6TwB15vNtcLqL+uBnBLQECaS6kCgyfPlV4l7" +
       "kSyOExJIwp+islkDOYL71n\n79spxNytT8y68wV2Tzb6rXtEtVXmqw1XQqRC" +
       "tm1pFV8lQL4ek+ZYy4RBvOQ1PQ6QYloR+SGCneAM\nGlVGaDs890n6djhmWd" +
       "qLZXRYlmGtUvQEBM/kBrxlwAqm5rstN7xLKrYOkR8juBeqZC5QCtsDJpsl\n" +
       "zHkHKcU0Bm9IAfdJAVB8T8tigtqXHOp8V45yGvmwjkQSzmntCLUs1edHf0bk" +
       "fgQPgIbkSEl/mPke\nd9Eg3NOvDrhrFZ/ZjoWznPo2Ij9D8IjLGstdSV/OyJ" +
       "QAa56Y2qAGQf51vis3x3hCLOoF4X95W0Dw\nYL69IXjY25S3MgR7JGFX3iWh" +
       "SXlLElfyaJ44Hut4O0h4VBK2gikGFthrpK047YQgJ6KR7/K/ssQ9\n/kMs5Q" +
       "cgaWf7DXrIQtPVE1HH+HpAVaAy35VzihF4GHRZhPuY7yWsZNEbH6aJtIauP0" +
       "HizvRymI7c\npEd8hMjLCF4R1AsMRXp46Od+arXCGE2ZLDBipzcCwZ+KhP8J" +
       "QRuLsMB/YrVwnn0GpnEovFRf5fWg\nPw5Kw3HzPcQKF3XNJi6uJQOekN5C8D" +
       "bDv9pwKjqOtCwyykiDlJFSVD26BgDEMvzl8C214fnGc4lu\nRN5D8D6CDyTh" +
       "ZFiSTHg4P8+YCYhwc34f6ikU6L5JqfOX/FjD44b4O/PFfIhCQouh9o2sXbnS" +
       "e7hA\nhPJnBkdA6T5EVASbEWzxynRERDGKwKt/axHxCty8hTECTwNHUxIjGM" +
       "1XCSPw6lFuBKJURfCdfDUs\ngu96FSwi1yK4DsH1Xj2KyA0IbkRwDPUZaUbk" +
       "+wi2HyOrr7jUQ+ROBHcd3T7IRkRENYXgnnxlFgJZ\nDgkNiXIoQPDXSQhkfS" +
       "PyzU8R7A4QQmFEjnN2XY7IYwgeR3BcUvsuRJ5E8MvjJmPs8gGRZxA8e6zC\n" +
       "9wRlPO9VBYi8gOBFBC95uR4RL+L/Pl8GR7A/X/JGcIJkrv9fwtHkbARvemka" +
       "EZFlEfw9X/pF8I6X\ndBHJl0HHTq2IfJSHMCFI+BjBJ17mzHiozJWx8ZorFy" +
       "HivtYRf8E4hjw6gx3l+2P5AiTw2om/SJbM\nphZ+kxV4o83fKgTuuE8xoQ2S" +
       "YTleYjIKXRIkXI6XGGZC64PaGVMDJyZhzHPZwY7uL2VQMfqu5IOg\npxB08R" +
       "C+4g0NHaXoMUurcxHx6giPgIdTLBeOUXixXCiWC+OVMM7LBU6Ah+967+G7S2" +
       "c0ia8X3MIh\nTwnR8TUoIQCEek6MXPglkuQVgdxWTHrFpPdFNlhMekVCMen5" +
       "3jivNNKDGs2T6VYWM10xoZFiQism\ntGJC+/oSxnlCAxB6M0/yaj+W5FX49a" +
       "j3/7789ah3OcY/GIbPQMDTWDDd5SWMs3RXzGrFrFbMasWs\ndoIRxn9W8/8p" +
       "U2a1tmPJaoh8nR/JiqmomIqKqaiYik4wwvhPRaGdeVLRimIqKmYcUsw4xYxT" +
       "zDgn\nGGH8Zxz/w4/vPzqRslp8lT7QsoL/E/w8pw0LQSjasLg9VGzL902mrI" +
       "5UvJvWto0f1tyoPHuZ6EbQ\nEGw206GnU2ftOkgXnF8Tz9PtqJIZ5iKNjlDx" +
       "nSPs1BIWjTRA7KKC7SXW8G9je61GIr3LF5y2sPpv\nYVIyRsOieufmOsrSlu" +
       "7rXwCjlS/cyWhWllKy11M/0nRRZFh9PsxbkIiuJTl9yYKTWoO9Sqqs4EL5\n" +
       "ETbxBdQS0dWqAT5TiPjhv5FYj6BBNBwCEP5cnO0YLXbyEt12OXjdyJymU/wv" +
       "nh2ZODXx60bIP1Ll\nfGctt4lMj6WmVCa/P37rzPvefPSNdROFDYgubfNyGq" +
       "X554hObW7PEJAwp5AEPvrZb8556Op1rw86\nLSQiEUZKRgw1gZuLTApadfZF" +
       "pFwqFj+nwafTUWxnPsXmOhLP3vMYKbN5D73Cis1t88a7eQll7Y00\nfxj+xe" +
       "Rm3qCqZFCxZaONQH+83PZ3ga52fJ1VcldT4TPrCLv6JK8BYJkYac6ECHa9iZ" +
       "w6xs7PFXEE\n9q9RPcmGuVIbRfOOyGSwE1gtovMyOa6ea2X8e/nYw8Wlif5P" +
       "qhGV3QeBmNveCQVUiOVyWV/S/H3t\npyJn4P+MyzYBwT//i65EmYJHjTx496" +
       "9Ik/PNNW6NOTYZ8ikncAf/F99pAoedc6Zku4HTeDA+d/+m\n+c+Y9b8VVuM2" +
       "ByzHRhZpTfP3QPLhZaZFh1R++OWiI5LJ19rGSG1WJzpGKlyU63mFGNnBe43h" +
       "SLzq\n5DayNBP6D5xqs4bTUgAA");
}
