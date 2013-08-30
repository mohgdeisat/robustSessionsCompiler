package purdue.temptest;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Test1 {
    final private SJProtocol pDisoveryService =
      new SJProtocol(
      ("H4sIAAAAAAAAAO1cXWwcVxW+u7ZjJ04dNz8uIT+UpkmT0q7bQgqJnaaxYzdJ" +
       "N4nFOqUkapvZncnu\nJLMzk5m7iQ2In1aFFKRISLRAFVFEqfJA+xAk1L6VqK" +
       "BKrcTfAypIPJUHKlFQQQgkgsT55ufemfV4\nY4gtZZ0bKcfnzrn3nDv33Hu+" +
       "78ajvPw+6/I9drtv+L7p2CcLfNo1/AKaoVY6UDL4JKlPVN787fCP\nbb7+3T" +
       "zLFVl33aiXDc/nbKB4UjujDTa4aQ2OOpZlVDh5Gpry2NaWXgNT6JmFf3KB56" +
       "5KzbR0zrYW\n4+GDwaBBMXwwNRyRNjVFgnTKJ2kqiBUG+WZ36eJnqt/6YZ4x" +
       "GrHGdazpquXwaETYZ8/mV48U//T6\nR8I+6zL6HA68PlG5cv/6Db/Z88elHZ" +
       "hyj+v4Jt6asw8V40HhikxElqEp151yaam3YLUKsBXkavm3\nH7Hrjm6eMLWy" +
       "ZRRNn19Zsfnen/z5fH+wJJ0WPeGsP7HS6IM3v+vq7uTztSPsy28//s+NgdNc" +
       "5TT7\nIssFk1otvRRN+5Shw/3ybaXHDhw/d1sHLYZ7thMJoq53tEjq6IhRNW" +
       "fkFEu5pcWoxKCd1rfffGni\ng3MYhNnl3SkKubnlPrL1rIDbW4w5SLpWpXWp" +
       "1xu2WdG42IgXtz/1znNPDv4jzzqOsR7DMuqGzWmP\nbzwWLr2l2dXBEtcqpy" +
       "Y9rWKMhR2Giqy3HvqEG87WyE0QbthgnxbZEq55VYMyuTLlzjPt6pB4X/xc\n" +
       "mfGz9Xnab5+lY2NknKcoKNwMTLVezKLjuKGHUwd+cPTygX8Vw+1XdvRpjO9I" +
       "JOXOFn4ON3jZ0+xK\nLSszrTbQSOao/FG20vT3Gi7lmpbbmkYHHZVCo8GcrU" +
       "qci32aXzuouTOW0214cRYLWPbCzCzmx+8c\nHv7PbTswTZci76a3XNdigLb0" +
       "589vuf8PT+dZ5362zDJt41ADNbHI+nSjYmlI66il+cEUBqhKnKAE\nHdLqRt" +
       "ReVjd4zdHFEwRdcisdcxlzsuYZGtXC3lApwMLZTZROOZvA/Waa7zr+f+56zj" +
       "7ayhxFXTJs\n2iZ/QIRbwed4MDm7OdkM3MHJ3cLVA1AGIe7hrMc/RQePUxWL" +
       "zcukGeI+YfgElI9B3MVTR1D0OJrs\nsdR2dGPUcmxp/wWfO0pxtrrpSbQyS7" +
       "lnNPuFsgNiJ8TQdW54Rxo466w47rQwPcvnxg5o3yZaIsmf\nFI4uQBmHeGjW" +
       "4BB7hWErTwC75ocwjBzGoH6I9Gh/yWaUlE6e3Ae7eAKCml1Fs469rW56It7l" +
       "oHD3\nIE+UsTMmQTy5mfAc7lQcay8dfjqZtm9p3PE42zCbKZrpLTx6YqQ7im" +
       "jBrv80RIk2m2VoZ4xRzZL2\n87ROgqqEsxnzPMfbp9k6laXqI3iEmazNeixe" +
       "75HYYa4fyqMQn+WsKwgogl2iF2oKNkrEx5jiIsyq\n9AMR4JgIkOfsw01OsN" +
       "bCQ3+iFa3SqqDbmF6lrBw+Y3ieqctJ/Q7KcQgcR9FT2F+h8SIe0h/nuje1\n" +
       "Z5YFI0fBP8XQ96CcgKjGrkGOhH03cb6U66DkjxBiBmci0YqrtwziGbLI/Vu+" +
       "AkQ5690g5MxekTOD\nqAnDC5lTwpaSUwpbIjULMo/30oaTwjBNWzE1wZLT8C" +
       "rGOOFjeJwTzXmZ4qVkEruCBAjbp5Ib+oSH\nrWvrhWjzTdBS0ZIlWlEWO7yG" +
       "mFB+kifuCsJFqVIz9IZl0H7uE3o0vJuGw5s4EX+H8jTEV0PrQ44m\nTnjuta" +
       "S1V+PcqLs81eOC7AHxjXY1WLMZtiWXYAUt0KRDXMUlpmAmqMKPkoVFZAIdzS" +
       "ARN8VqnIdK\n2BYOvg7lOxDf5Wx5ZMVOFKliZ4m/ixh1zbQLB0lQccCPyG+X" +
       "T6xb7rFDUL4H8QLE94XhFpqSABKM\nz+jTB+XFwECwhoBETNc33U0nLKKC+x" +
       "xLNzy6xrz71hfGHn7mXMjebUkwU+QyvHhwli9NMPJ4s7wD\nRiS6q/v3l98Y" +
       "OP7rDpYfJ4LraPq4VqFjsJ8YD/FRv0bhptzdDwY8ffnZHpL99DdPztaIlwoc" +
       "0tVC\nKxtWgtLvZz01ijJK5bfIOiytnL4UhddsujSzTefoQtVZ3DNyX/ONyG" +
       "1A2UQOx+O1WnIrlDsgtkJs\nk+QYSkgEIST3XAFFkstMUgohWedc6CjE9iwW" +
       "CiE50TUxNYgEWYLyMEQRQnKVHUme3kx9wgtXjIar\n0g+ivTygm75WL5vVRk" +
       "BRYmIkAlyhAtqc7viYHaGmH1Cq1BNR1C+L852D8gbEz64fA/s4lMMQE2nD\n" +
       "ldlGPJq8UWRSQ1q/kYaJk8rZxllt0eL3ldEcNw1LT3HCISjBLvklhOBu7DyU" +
       "kLulDElSByHIWAiO\nj0E8njLk8lAWmArshhIU/TrEwvAhKEGLL1iM2bkOlM" +
       "9BfP5ag19Kx/iSpDBQvgLxJMRTkphAkWj6\ntSy6AfFMFtOAuE5YwY1rmAsf" +
       "gnhOUiAoIYOBeD6L2kBckIQGShY7mZ22QHkxw9CXNrwEcTGgGO0P\n1ndDif" +
       "+RJPwtxYLgNZTXIX4KcXXIWTzQCUVi2q8U2CmwYwrsbhzDogG7oMvLdHfVw7" +
       "vrvcEDdXdl\nCgvn9h4KC+cjuMJChYXtalg0WNj+SJe4+JHI9SqkU0jHFNIp" +
       "pFOG+TAsGqSb8c2mvOWNtSv2zeMt\nb0PrDwblx6fBB12yGX/Qha9QhbO1rT" +
       "/cS30OG/z+MfUk/v1j7q/CYTeaH0D8LW0AYuTeh/hLemn+\nd1pwvXzjl87L" +
       "s1Dkh3nX9MUelCx6swuKpAWJL+mghN+2QUwKwz1pg0J/hf4QCv2vZlg0cNr+" +
       "4DmP\nF8cNp5MolICntadnwS0FaArQFKApQGt7w6IBtDSq7bpxUE2hgUIDhQ" +
       "YKDebDsGjQQADBsAICVe+Z\nqveq3qt6P9Ow+Oq9KDyq3s80qLKuyroq66qs" +
       "s7Yr6ztVWVfVm6nqraq3qt6sXap38N/E9f0XemNr\nMwZTAAA="));
    
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
            String str = "hi";
            SJRuntime.send(str, "SP", s);
            SJRuntime.send(str, "SP", s);
            SJRuntime.send(str, "SP", s);
            SJRuntime.send(str, "SP", s);
            {
                SJRuntime.negotiateNormalInwhile("SP", s);
                while (SJRuntime.insync("SP", s)) {
                    SJRuntime.send(str, "SP", s);
                    SJRuntime.send(str, "SP", s);
                }
            }
            if (str.equals("hi")) {
                {
                    SJRuntime.outlabel("LAB1", s);
                    SJRuntime.send(str, "SP", s);
                    SJRuntime.send(str, "SP", s);
                }
            } else {
                {
                    SJRuntime.outlabel("LAB2", s);
                    SJRuntime.send(str, "SP", s);
                    SJRuntime.send(str, "SP", s);
                }
            }
            SJRuntime.send(str, "SP", s);
        }
        finally {
            SJRuntime.close(s);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Test1 a = new Test1();
        a.run(1);
    }
    
    String repeat(String str, int n) {
        String str2 = new String();
        for (int i = 0; i < n; ++i) { str2 += str; }
        return str2;
    }
    
    public Test1() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.3.0";
    final public static long jlc$SourceLastModified$jl = 1377667676000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0dC3BU1fXubrJJSCQfPvL/JSoobIpVRwVFCESCS4gkoMbR" +
       "8LJ7kzx4+97jvbth\nsY4DdRSkLVOrqLVUWseWfmynYO1ntH5GqW3tZ7QzSH" +
       "WwdWBEp9gp02lFi9pz7n3/3axRoUPCy8ye\nPfeee8/9nd/dvDnv0XdIqWmQ" +
       "hElNU9bUtQm2Uacmh1r3WppiZqJ9WZtkmDTdpEim2QGErtSaD+XV\ne2q/uD" +
       "RKIp2kTtUWKrJkdvQZWra3r6NPNnMGmaZrysZeRWMWxzwel9ef2PD7Lcsmxk" +
       "h1J6mW1XYm\nMTnVpKmM5lgnqcrQTDc1zIXpNE13klqV0nQ7NWRJkW+BhpoK" +
       "A5tyryqxrEHNldTUlH5sWGdmdWrw\nMe3KJKlKaarJjGyKaYbJSE1yrdQvNW" +
       "aZrDQmZZPNS5J4j0yVtLme3EaiSVLao0i90HBs0l5FI+fY\n2Iz10HyEDNM0" +
       "eqQUtbuUrJPVNCNTgz2cFTdcAw2ga1mGsj7NGapElaCC1IkpKZLa29jODFnt" +
       "haal\nWhZGYWTCgEyhUbkupdZJvbSLkXHBdm2CBK0q+LZgF0bGBJtxTnBmEw" +
       "Jn5jmtFfGqD7a1vTsNThzm\nnKYpBecfh05TAp1W0h5qUDVFRcfj2cS9LTdk" +
       "J0UJgcZjAo1Fm4Xn/HxV8q2np4o2Ewu0WcFlsSt1\n4pJJk19eeLgihtMo1z" +
       "VTRlHwrZyfaptFmZfTQbrHOhyRmLCJz6z89Q2bfkD/HiXlLSSe0pRsRm0h\n" +
       "FVRNN1l4GeBJWaWidkVPj0lZCylReFVc42XYjh5ZobgdpYDrEuvjeE4nhJTB" +
       "JwKfLxDxV4GAkfIO\narK5CXMtI1MYoGajaaQa9ayRztJGRjN6o90gh7xGbo" +
       "hEYBmTgiqlgPwt1ZQ0NbpSuw/97tYl19y1\nVRwQCpU1CzhvwTiBjHG0BGdO" +
       "IhHOdRQKntiYhYYhbUSFyG1+efLXX5C+CdsMyzXlWyhfTWRDCULo\ndGFRe9" +
       "HkalsLYBIIQ1dq9Ka3Jjz45+/vi5JYQZuRdCqbNSMjKXjstpLUWcMFKSAtDU" +
       "GZLTT2P7Yt\nf2z/iwdnutLLSEOeUuX3RKWYEdx1Q0vRNBgdl/397y/95z2l" +
       "lz0eJSWgaWBrmAQSAoo7JTiGTznm\n2YYG1xJLksqevIWPYLBBGzwLRliFoE" +
       "ZIBpzF6MAEuY06fnv8c688WbmPr9g2Z9Ueu9dOmVCOWvf8\nOwxKof7gA233" +
       "7Hhny40xUEddF2fOSFzPdityKgddzvbrE04vjWJzdO+8mu1zzJ/xI66QM5ks" +
       "k7oV\nCvZXUhRtA013MW6Aaj3GjtsY2ImqbrBVYPa6FGAk1qpH+kE8C1iDxL" +
       "jR9943a+craC90vjFjUa/4\nTEmOVzREEM7MI2J5MkrwaHfZoOHrxAKqZrXf" +
       "tGzN1hl85V52s61CzmHo6sJFRXWhGf0KyAzTwMC4\nIrPmSweuXX79dY3C5M" +
       "0tyqIVlDnN+bj9d7SoC54as1+NopTEzbWOwidJ1GSMzEzaLC3Jw6LA2pe1\n" +
       "C5Jt9md//ALcgeVb/7N57592VMHAnaRMNptlVVLwtM1Wob0FXEKAxS1PrXro" +
       "+B/Y61w2XXXB6U/K\n5Zu51ZJHky/d318b/8muTJSUdZIa7tYlla2WlCxKbi" +
       "c4ZrPJqkySs3x0v5MVHmWeYw4mBVXVM2xQ\nUUs8u12CrREvF7rJ21R/JP4+" +
       "xA8KDhaE6a9r0jI6+Atj2tUUFi0xmtZzkYiO3S7lnadwOF3IX5TB\n0LjFjJ" +
       "TphtwvYXREavTFsqn1U2MjhET9shWFjGJkonOURlZlcoZi9GYJH7cXEa4XC0" +
       "BsGwKn7ghI\nAgWECc/8wv75e1U26RA/qjIrJMO4yDUk4CsV2EnubA3QuGJc" +
       "HbHrSlkOMSIMVKpPVtI4swuBR31R\neRTd7y5r331d772PRC2drtS5MTvX1W" +
       "p3XmbDKjWjpeUemVsj0PMT1efMffzo9hrhD1yLA7rw8Qzc\n+vGLyKYXb353" +
       "CmcTSSGPJssgzXbMw3lFdqRpEe2V8zYELcK5RXp5Ol2u3P/Cd9qObbW3YbGO" +
       "9vmc\nooegpgsNeHGRPssBhzASJDeTVeUUD78Fj90X337gvi82/hss/o2knC" +
       "o0Q1UGAjLlRl88C6a9w4Bg\nZYloAPpUmRE8O2ztASvGJKOXMhG22IvB79YC" +
       "38UlrUXdAAJFC0iab5DiO5XUNF1wWLfs4c5nlx1P\nCnHp1tIbhai6O35+ET" +
       "4rsqzbADPSV2jbi0nHooK9wOzWyeZiqsNBwl4qG4X7BR2SoDMjozy6uVQy\n" +
       "+5ZL+rzgdkJAaB9RAo8okX9E0ebz58//YMZl3MfCyM2wyolFOkgV+x4895KD" +
       "d0AM1EJGYITcmkVr\nkSQj0cBKeKXhvt6ym+UYNLe6dnSEuBa1uoErIfFpYO" +
       "rcMSFYpBLcsSoFkkAKI2fBcbqz4ey7YL4T\n2acUaUamFyNbo8bny6rMrnSG" +
       "q2aD1DqIfrxFzg6Z9DqsrkRERgDXg3JzHWgVAxtkk0e4ZASKQ7gI\nEb55Pc" +
       "ynX06LTm+LClVL0yZFU136H9ng7TcjowM11s5UMIgiA3wR4SWueNnTnHDAJT" +
       "BSktL0jQ5p\nBxuc3wS59ZScQ17vMNqJyCYEmwccHMFtDmEm8zhGyRTREZ6h" +
       "7RRbAbfkyy1ah8KjFIfVFczjX4Ks\nrFnb3EYHapy1bHHY3eAVm34ZLteeqG" +
       "MxKD/2XpSV8aIKrmFAmjXXkd1Y5DEjNnCGmYfIlxF8BaRM\noVI/bYJ7hUPf" +
       "DhvkhI5iGksMQzOWSmoa7FHvaqzSYAbjC1U76/qqzTBSg8jXENwDURgf0Bls" +
       "DyOT\nA4NZP105w4zyVzgD7HAGgOBuQoAJbrLDocZTsjZnFG+2JN0Lx7ECAk" +
       "BDTruT+gsiDyL4BuyQ09Kh\n/4h5rlN47vYhV/qEZQTv2YQhmdP1bUS+heDb" +
       "NmsMpBz6AkbG+VhzW78IXCVXBk/JNtvuIHAhdvj8\n110Cgp2F1obgIXdR7s" +
       "wQPOwQdhWcEoqUOyVRco7me6diHm/7CY84hI0gir4JtmtZI0WbwTEKPfYU\n" +
       "T8oU93gPsZQfgEO71CvQPQaKrppOWMLXBlsFW+YpWacYg2uGzSLawTy/3Tks" +
       "2lN9NJ1VUPVHOrjV\nvQy6IzdHI/6FyNMInhHUqzXJ0fDIL7zUSonxH7R8LX" +
       "a6LRDsCwn/F4IyEGGW98Sq4Tw7NLz/QkQj\ne0KaH3rtoCM49kUZbIWN2mKT" +
       "EmWHwTZEuNi/yvDHfk5FxXEki2yAq7czRkaS1cRyAGDL8MviWwrX\nfcNViV" +
       "ZE/orgbwjecAhnw5Qch4f9C7QZichhTgD3iwPad/QabxSNYTEj0fY24v8pzo" +
       "rcS8teffa5\nsWteipFoM0TVmpRulvgPlBBmQRBs9mlKOqcvuIpfDqo2lAOs" +
       "wV8NgNkYZ4acIdxnpG6qeO4RLaS8\nD0ZpAtOfJDFF6sb5XQJxd/1WClNOLl" +
       "x0YfDapWcRuYlfB6yFxqchwk0TZ5ByI3BERLSJwA1wqxFx\nI9iCkS8C17UP" +
       "JuZFoBUKdRG4gddnCgcReCIyRO5AcCcCNyC6zHsZCMZX4lZne95R/gpLEMem" +
       "ZVPK\ndMu9WYlRN5xzBjgBxjp4vLaOrIKiyeM2X43tQCLEUU78KSgSRRA7fQ" +
       "jk84jchWCbn3BioB7XIyIC\nQwTbC0WMCJzIjmxHRER2PoI35EPghGrCdd6P" +
       "4AEfgU/oVAcKCxD5LoLdCE5JlLILEU798SkbY+BI\nCJGfInj8sw6+xz/GL9" +
       "0AB5EnEDyJ4Fdu2IKI67yeLRSMIHiuUByC4DRxwmcuYTDhB4JX3IgDEREw\n" +
       "IHitUCSB4KAbPyBSKBgYOEpA5HABwkg/4U0ER3gQMPTd6xxEhLNk1s/6p8TD" +
       "IvIhgo/WD8pJhM6O\nhM4udHahsxvyhGHj7HiTo3DbTIvb5lxeEd42SegLB7" +
       "eO0BeejMFDXxj6wqFKGDa+cOh7Os/FD0Dk\n6tDThZ6OhJ4u9HQh4WQQho2n" +
       "y3uU073lJYeq7zuJt7zJxZ8jdJ9J5c95uUX7OS98ONVhNr7483y+\np2T5fw" +
       "x9NfZ/DKMXOAzLsIiePprwE27GIopi9Hz/1nzysOB0efTPfy47ENmEYLN/gZ" +
       "/iQT5ECoU3\nVyDihAXeB+wQCb1/6P1D739mEoaN9x/6vv4k3nMnr/c6TY83" +
       "Hb9+ADcb+t/Q/4b+N/S/ISH0v5/K\n//qd8OIzxwmHzit0XqHzCp3XGUgYNs" +
       "7L8VtNod8K3RMJ3VPonkL3NOQJw889LQrdU+iFSOiFQi8U\neqGhQhh+Xmhh" +
       "6IVCZ0NCZxM6m9DZnGaEYeNseF7JZeJRTl/aWp5ltt5KxUwQilTMdh5l0/Bk" +
       "mwok\nm+eJ8rdcf6zqTun5m0SWzDp/wuklajZz8a4DdNZVVakC+c4rmKbPUW" +
       "g/FV4IszXH+LgxGHZO0eSy\ny3kSSjfdcKx9wazzZlceiZKSAZKW11qVKynL" +
       "GqonnSm0lj5xNvOpgU0Jzqe2f+K1sT75N1Gehlhk\nLs575YC/0zx/vuIRhn" +
       "+i/Agn8glUwxZhBqF6+FxOxB//RmItgjqRdBxA7CVxtoE0225W7GAO6DZD\n" +
       "zshM7rceLr17yiNvPnZo5WhxfOLdCfV5ry/w9hHvT7CT/cII04uNwFs/f8H0" +
       "R29b+Xq3lR03tp+R\nmKyywhnC7aljeRSz0uLzLE1LcimqY8IqzuSgm/Us9o" +
       "Z4jDl2mJGSfk1OI8vYUY+k84pDucI1sVed\nbcfPefDJWNueKbTt+WrGnXk9" +
       "I3GTvzyj+MLy3+/A8/2L89gbazgWfWJsA09hX9ItmU5WXt+LMfLf\ne+F7nQ" +
       "Wf5whnVePhM/VjVnWk4AFg1Bh7PxchmBc7dmKAlV8hrAysX6FqL3/vQuwQgv" +
       "fcPO1R0bzA\nsfIcpZjQ2aaJlPCylnDeMwLE/IzvOMBrYn58rIG1YbAZ6Uvi" +
       "mCvDSZnqzxEmEpXnip4tTuFtPptj\nVrIxLoiFxfG9PHF8LyiO+MqK6QTTlY" +
       "s/NjhxHGClUffEjnj0odiGwBbEDapTiQfbRyKupMwuzCy/\nGsSilL/oAvOC" +
       "jwvaCuudKakZL6+Z+Zxe+1sh9/Z7TcowP3FWUbx53j14XDdoj8x3oUxkfdf5" +
       "rKcx\nUh141wYj5TaK8yyZKlrW8/cpYEssNaCUl1TlIv8DbEDoh45nAAA=");
}
