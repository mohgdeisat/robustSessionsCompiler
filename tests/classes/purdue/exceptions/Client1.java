package purdue.exceptions;

import sessionj.runtime.*;
import sessionj.runtime.net.*;
import java.util.Hashtable;

public class Client1 {
    final private SJProtocol invitation =
      new SJProtocol(
      ("H4sIAAAAAAAAAO1YW2wUVRg+3bZAWyiVq1gucim3yK4gEKTluhQQl1JpQSMK" +
       "TGcP24HZmXX2bGm9\nR2KCRBsvIBFJSLyEGPUBE6NvPpkmmvjgg8EHn/BBEn" +
       "0wxvggJv7fmdlzZrbblVjrLeXh63/mP//l\n/Oc///8v7/3AavMeW5Ln+bzl" +
       "OsfjYiDH83EsfaprTxcX3UQeMYe+avvAEXOvxVhVik3M8mwP9/KC\nzUodN/" +
       "qMREFYdiLp2jY3BWlq7ffY8opaJcvXzPx/VVJzrdlr2WnBlqeK4gkplFDiiY" +
       "g4LC0usQR0\ne46TK7DlG3lpYtfl+zNn34oxRhIzc649kLFdEUj4e7a1fHQg" +
       "9d0nC/w9zWX27JNaj5g31s+d9+W2\nb+uq4fKknJu3cGrBbk0VhfyIdAac1v" +
       "5crj9HoV6KaMXBi+to5ZcccLJu2jpmGT02T1l5cWNqy+oP\nvx9skiGpsemL" +
       "YE2hSGMPTn7HH6vT3+dsZ09/fviX+VJplfkIe5JVSadmaC0pyznB01A/eUXX" +
       "w3uO\nnl5UTcHInazBBdHWZRUuNbmdZ6xhd4pQLq0gFRLaaJ8fervzx9MQgn" +
       "exXD+ZbKmYR066nMF1FWT2\nEm1kKC7ZbMGxTEOoRLy87tTVV59J/Bxj1YfY" +
       "JG7zLHcE5fj8Q37obcPJJLqEYZ7o9gyTt/sbWlOs\nIevrhBrBZuok8BNW5m" +
       "mKTRCGl+F0k9Mi6jzLybSq8+LvNHnuSu9nPze51ceHHx3i0ynVCl7R6zjM\n" +
       "xId7Hdu5sq3tt0V3QypH4q1ksrmCgFH36YWl6795NsZq7mH1tuXwjgJqQIo1" +
       "prlpGzhG0jby8gSz\n6FUcs2zeYWR5sK7PctHrptUXGK0dorTWNrt7PW7Q22" +
       "/wiTg4gk2hmGlvpPp55G+z+JO3LNjCSuzA\n6oQ2y7HEZmVuqrj5CxFsRskX" +
       "qRSqWpTCzSCWAZYLNil/gtJN0Nstsus1G7BSMdaCWAxYIiKJp3Y8\nGN5R57" +
       "hpnrRdR/O/qHyUSG2WR4l8CeJTJzxeqhfEasAawF2jYFzVDMFqTDc3oFjnxM" +
       "31K8qs0Epd\nQEIpughiI6B1ROOADYpBF6VbjZH3GwPiW2wzHUTD8i3hZRCw" +
       "GhG+o00iVBRLVQVeF7XNKPmizrJN\nqdsqQpW5z6KmQ2o6PVe4pmvvoOdJb8" +
       "fJ24ZwPcHmjcQKPJ0tgi88ulFZuxPETsAuSgSbG308adia\nP0hxUs3T96bd" +
       "81xvt+GkqXBkDuITPJlT7rM63p6iwqomECnAXsFqpUFl7AodqMRYklox7xfK" +
       "zPTo\nB2VgnzIQE+y2EiWItdLQFFoFUZout7WnM3Qr+/q451lp7dTXILoBBy" +
       "hCaqfiv0/yyh6uv3jXDZGc\nqZeSSUxESvQ6CPnEDxVVo10r/haaQiKqZVHe" +
       "7qYH5JsIrYr1VRvxuC5Av+ojAA6WOxvgAX0o7Rng\nIcW4VNYlpJR2yV+pq+" +
       "kZCz+uRxmHFWOAUjHiYJdb8Ey+kzqY/5xDy7/ExSvhS6yVF6B4G8IJfcxD\n" +
       "6jrpeJB8nRQqClloFdxitVdQdxfrFqHpVanoMnt5umBzyudGRQfiE0kc2tSL" +
       "+AnEAOBRn7vLNdQL\nr/o4zG0whODZnIjsuKh3AJ76rzLskRgrwiGYSgHqdm" +
       "mayFEXt0Jt/N1wYVE3gY2WvIgpRbJ4D6a/\nVgrOgHge8IJgkwMuMlFdFTtJ" +
       "E6WykTUsJ76XgIoD/gR6a/M0fOoc6wDxMuAVwFnFmE0uqUYC+TJ7\nGkGclw" +
       "xqazBIo+Pckl9LnTYNa7tdO809GqyvffZ4+73PnfZ/zjh6BIyMf/4ojBjYFg" +
       "2cawrY1CxH\n08B07RCIBYDbAQv1NAjCn3kAesyiue3mfkDIrq2XI01sbwDe" +
       "BOiRrH4kxtqoV6vKjWgAPZSsAlEc\nfPzfwmM8XwH0iHMOhB6KRjUtgdgC2A" +
       "rQw8omEEnAjihD7vPnCsDucgMHQA0GbBCEPxhEGOGJAaA6\nvV957wPsjzCq" +
       "YiDGuM/IaBwFjF2TuwQiA+gdMxsjN1IQsma4ozV+JWpDl7sNIGRt6AOc1F0P" +
       "hC7V\nj5XrZYAnyrUxwL+k5fzN3QtwRjcsEH6/AQyWa0SAF3X7AVGul4zcZE" +
       "CcL8NojDJek4wLkSaxwy30\nUI8d3iQ2jqZJgNAF/B8r+YB3xsv6eFkfbny8" +
       "rI+X9f9LWQe8rku4/E/rxt8B5fgd84waAAA="));
    
    public void run(int singleSession) throws Exception {
        final SJService c = SJService.create(invitation, "localhost", 1000);
        c.participantName("client1");
        c.addParticipant("client2", "localhost", 20102);
        SJSocketGroup ps = null;
        try {
            ps = c.request();
            System.out.println("Client1 is connected to all participants");
            SJRuntime.pass("Hello, Client2 from Client1.", "client2", ps);
            try {
                SJRuntime.pass(new Double(50), "client2", false,
                               new Exception(), ps);
            }
            catch (Exception ex) {
                String str = (String) SJRuntime.receive("client2", ps);
                System.out.println("Received message: " + str);
            }
        }
        finally {
            SJRuntime.close(ps);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Client1 a = new Client1();
        a.run(1);
    }
    
    public Client1() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.3.0";
    final public static long jlc$SourceLastModified$jl = 1369230879000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0abZAcRbVn7/uD3EeOkOTyQZIDEk32hOL7EmJyJOTC5nLc" +
       "XQK5FFzmZvv2Jpmd\nGWd6N5sYqBCEQLCihAQQoyktKERBSRDR0kKrBKMiUg" +
       "KGKAU/jKVQgiVlKZQC+l73TM/H7i3REJUy\nV7Xv3vTrfu919/ua6X7oDVLl" +
       "OiTpUtfVLXNjkm2xqcuhNbKRasxNDqzsUx2XprsN1XUHgTCsbXhP\nX3uwZc" +
       "eKBFGGSKtpLTF01R0cc6xcZmxwTHcLDjnTtowtGcNiHsciHpfOeWfzz3aubK" +
       "8gTUOkSTcH\nmMp0rdsyGS2wIdKYpdkR6rhL0mmaHiItJqXpAeroqqFvhY6W" +
       "CYJdPWOqLOdQt5+6lpHHjq1uzqYO\nl+k3pkijZpkuc3IasxyXkebURjWvdu" +
       "aYbnSmdJd1pUj1qE6NtPsJcgNJpEjVqKFmoOOklD+LTs6x\nczm2Q/d6HdR0" +
       "RlWN+kMqN+lmmpGZ8RFyxh1XQgcYWpOlbMySoipNFRpIq1DJUM1M5wBzdDMD" +
       "Xaus\nHEhhZOq4TKFTra1qm9QMHWZkcrxfnyBBrzq+LDiEkdPj3Tgn2LOpsT" +
       "0L7dbq6sZ3d/W9dSbsOOic\nppqB+lfDoBmxQf10lDrU1KgY+HYuubdnXW5a" +
       "ghDofHqss+iz5KzH16Re/f5M0ae9RJ/V3BaHtXcu\nnDb9uSW/ratANWpty9" +
       "XRFCIz57va51G6CjZY9yTJEYlJn/iD/h+t2/5V+ocEqe0h1Zpl5LJmD6mj\n" +
       "Zrrbw2sAT+kmFa2rR0ddynpIpcGbqi3+DMsxqhsUl6MKcFtlYxwv2ISQGvgp" +
       "8FtExF89Akbquw2d\nmuzcpLuRkfmMusztdB2t08456RztpAWN2qih2zmiur" +
       "rWGXQvIO8JmxUFpjUt7mIG2OMKy0hTZ1h7\n4NhPty278rZbxYahkXlaMTJF" +
       "iEkGYpKeAKIonPNENEaxWEscR92CTlK48bnpnzusfgGWHpbA1bdS\nPkNlcy" +
       "VCGHRe2RjSHXhgD2AqGMiw1rb91an3Pv/gUwlSUTKOpGTjcsvJqgaagu84rZ" +
       "64OAUsqCNu\nx6Vk/3HXqkePPP3y3MCiGekocrTikegos+Mr71gaTUMgCtjf" +
       "/bcVf7qz6pLHEqQSvA/iD1PBasCZ\nZ8RlRBymyw8+OJeKFGkYLZp4PYMF2h" +
       "yaMMJGBM3COmAv2mIK8rj19k3VH3vxew1P8Rn7Ia4pFAsH\nKBMO0xLs/6BD" +
       "KbS/fE/fnfve2Lm+AlzUtsWeM1Jt50YMXSvAkDOiPobqpdFsXj/U1bx7gfst" +
       "vsV1\nejabY+qIQSEmq4ZhbabpYcaDUksoAPK4AyvROALxC0LhsAGMxFxtJQ" +
       "/mWSJCJCe37b1r3v4XMYbY\nfGEmoa9xTUmBN3QoCOcWEfF5OlpwWzBt8PpN" +
       "YgKN8wauXbnh1tl85mF2872HgmQY+ML5ZX1hOeYa\nsBlmQdAJTGbD7UevWn" +
       "XN1Z0iDJ5blkUvOHSa8wnG7+sxFz9x+hEzgVZS7W6UTp8iCZcxMjfls/Qs\n" +
       "Dx8FNrByQJD8VDD//ScQCNa3/fXGQ8/uawTBQ6RGd5frpmrgbru9wntLpIkY" +
       "i61PrPni28+wV7ht\nBu6C6k8rFIe6tWrIky8+km+pfuRANkFqhkgzT/Wqyd" +
       "aqRg4tdwiStdvtNabIaRF6NPGKLNMlw8G0\nuKuGxMYdtTK02pXYG/Fa4Zu8" +
       "T9M/xN97+EPDwQeRDlq7rawNOcQ58woKk1YZTdsFRbFx2MV88AwO\nZwn7Sz" +
       "AQjUvMSI3t6HkVKyYsSfI646UR7zyRkXa5iU7OZHqWYi3nmR2PFAr3iMVgsB" +
       "2x/ZamkUTT\nYCJPHz6y8JDJph3jm1TjFWhYJQUhBDKnAWvIU68DvlaOqzS4" +
       "Yc1Lj4oITdqYbqRRs/OAx5yyliiG\n31Ez8MDVmb33JTxvbrB5GDs78OdAL7" +
       "djjZm10vqozuMQePg7TWed+9jru5tFJghiDXjB+zMI2qcs\nJdufvu6tGZyN" +
       "oiGPbi8UzZeB4ZwyK9K9lGb0ogXBWHB2mVGhQZcadx++v+/NW/1luNzGyHxW" +
       "2U0w\n06UEXlBmzCrAoagEm83mTF3jFid4PHDBTUfv2tH5F4j160ktNWgWig" +
       "owkBnrI9UtBPVBB0qVZaID\neFJDVvAc9P0G4hdTnQxlomjxJ4P/e/mkyllW" +
       "P9WonqfF88Lhq8E0co6vUhJVSharlFj+kYUL3519\nCc8mMHwpiGwvM0Cte+" +
       "resy98+WbI9j2kHuvD3hx6R4pMwFCiYkHPs5oXIWqxZOwNIka9eCnoDco0\n" +
       "QqoOw5tKIBPKIqrCG0aDQJJIYeQ0WKNAG87+atC3nf2bW8jIrHJkT2r1Qt3U" +
       "2WVSXBM7/g1hpC3W\nwpkiq2HJ8DJEeNsII7XuJrAl5sU1JNcHZARpSTgfkW" +
       "sRXMciViV7DIV71JlWmnYblhnQf15+KpGo\nxacSafHWp45B1RTji8gmBDz0" +
       "Zk+AcDQgMFKpWfYWSdrHji+Sg2WFnuQG6JLRfkS49+XGFY7AkYS5\nLBSqVV" +
       "dkalxfP0z3Ao6SW8KP3oLxjClZLWKhiBdn5Wntc2uLtci5fFKyWxfe0rwOL3" +
       "+hPHg5uCeO\nXprT8cUJgtW4NE/XCSP4yOsX7CDFdCGyHcGNYAEGVfO0G2pc" +
       "Sd8NCyTLGKHGMsexnBWqmYaIkVmL\nTRZoMKVUs5zXp3yGSjMityDYCRUBFy" +
       "iFHWRkekyY92lFipkYbZACbpMCoNCYGmOCiyw5NIeevMWZ\nyLstS2dgO1bn" +
       "qePo6UCpXyGyG8FnYIVkT0l/mIVKe9x3f5MbIsZSz0d2Y5Egh76GyF4E+3zW" +
       "mNol\nfTEjkyOseTReaqW3cGcIPfmBNRACL2eSz9+DKSD4bKm5IdgTTCrQDM" +
       "FdknCgpEpoUoFK4kluzf6T\nocdrUcI9krAFPxWEFRywco5Gl0PqEn4cevxA" +
       "VDwY3sQqvgGSdnHYoEcdNF0znfSMrw+WCpYs9OTt\nYgUUvj6LxCALfVuSLA" +
       "a0MXh1N9D1J0jcG14Dw5Gb9Ig/I/Iogm8K6hWWKj1c+XaY2qAyRrM2i/TY\n" +
       "H/RA8J1ThP8IwRiPMC+8Y02wn4MWvotBtaGHyo2vheOgNBz/pQ1ihY/6ZqOJ" +
       "Z8lgFyLPIIDyotGj\nouNIyyKb4TVQysjCy29yFQCIZfjP41sFr55O4BK9iD" +
       "yP4AUEv5SEM0AlmfBwfIk+ExDhyfwFSL8o\n0H9rbA7XuVi44oT498HzeC2w" +
       "htfDHp+qw4isQ8Arq/VBCYqIKLQQBLUdFIvH90rCS4Xgcbwy8TcI\njiEI0k" +
       "H9eITzo1plStWFCIJKaAEifrUlXk1PclGHIKireFAOKrETKtEQ2YJgK4KgQl" +
       "qEyPUIbogS\n+MaKmgbBjlLFDgJZlIi4LoqSCCFcrSCQVYaI+rcj+HSEoCQQ" +
       "Ock5bjEi9yL4PIKTkmAPIPIlBF8+\naTLGT+KIfAXBgycq/GBUxsNBbkbkGw" +
       "geQXAwyLiIBHH3sVJ5FMHjpVIogv+R/PH/SziezIng6SBZ\nIiJyHYJnSyVB" +
       "BL8IUh8ipfLY+AkOkaMlCBOihF+XyGmXW7kRyO/FOW3JieQ0RIJ881/LUAhe" +
       "O5WF\nTmWhYuGnstCpLPRhJXzIsxCCl4KMw88hVorTjMjBHj+Nm+MdVhOE4r" +
       "DaP2l2ndA3kNgVHX69aOc1\nbzbeoj55rTjEaY0eyS8zc9kLDhyl8z7eqJW4" +
       "FVLHLHuBQfNUfK3A8+yEOG4EsQvKHsKt4ocXwYFs\nxcDieefMb/h9glSOc6" +
       "2jxWvspyznmKFjH+it/sv3PWbGFiWuT0u+/aqKMf3HCX5QK852iy5qRQd1\n" +
       "RU90652oonwL27kCTbBEtfCbA7/JRPzx/0hsQdAqrmUAUDaKvY1dRAjuDcRP" +
       "yfscPaszeVJyx4z7\nfvfosf42sX3ixtmcoktf4THi1pl/KAoSZpWTwHs/+d" +
       "FZD93Q/8qId2KmWIxU6CYrfYfCVx2foc6a\nGNRZy/zbRZxJPvgWp2wVJ3nK" +
       "9YxU5i09jSyVm0OWzhu2FUq3KK5cdvydA7+LvGW/qNSyF7sZz+hz\nGKl2+Z" +
       "XD8hMrvhXHb0SJ/ThU0fFm4ruTOvgln8oR1ZWnl5HrhMW3BSOXALme9XJWU+" +
       "A3831m9VLJ\nDcDSUbmzoBC8OaDsG2fmi0SUgfkb1Mzw22rKNgR7CkWeX7yt" +
       "/FQLD759mrg0o1tJeTsTiMV3YlAA\nE/pxWeN7w/He2VEO4PcYecgWrfLFVY" +
       "5C2b1FHjs4p13eJzBuiKXNcU+ROe4pwBrWeDfn8LrB5Lhr\neRcztdnPbZj7" +
       "Q7vlJ8JM/MuTNXgMnDOM8MWREF5tO3RU57tdI66R2FzXrzPSUnSBj5H64IGv" +
       "9cOi\n90F+SQt749Mhbhj3F5R/AoCfhPz3KwAA");
}
