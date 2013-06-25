package purdue.exceptions;

import sessionj.runtime.*;
import sessionj.runtime.net.*;
import java.util.Hashtable;

public class Client2 {
    final private SJProtocol invitation =
      new SJProtocol(
      ("H4sIAAAAAAAAAO1YXWwUVRS+3XaBttBWKSKWH/kpf5FdUSBIy+9SQFxKpQWN" +
       "KDCdvWwHZmfWmbul\n9T8aEyTa+AMSkYTEnxCjPmBi9M0n00QTH3ww+OATPk" +
       "iiD8YYH8TE883M3juz3V2Jtf6lPHw9d869\n55x7zrnnnOW9H1jcddgSl7uu" +
       "YVvHEmI4z90Elj7Vu7uXiz4iD+ujX3V+YIm5V2KsJs2m5niunzuu\nYDelj2" +
       "mDWrIgDDOZsk2T64IkdQw5bHlVqR7Ll8z8fzWe5Lg+YJgZwZani8eT3qGkPJ" +
       "6MHIemxSWa\ngHb/MTIFunwlL03tvXhf9vRbMcboxKy8bQ5nTVsEJ/w9W9s/" +
       "2p/+7pMF/p62Mnv2elIP69fWzZ33\n5dZv62th8rS87Rq4tWA3p4uHfI/0BJ" +
       "yOoXx+KE+uXgpvJcBLKG+5S/ZbOTtjHDW0fpOnDVdca25f\n/eH3Iy2eS+pM" +
       "+iJYS8jT2IOb3/bH4tT3OdvYU58f+mW+J7RGf5g9wWo8o1qVlLRhHecZiJ++" +
       "oveh\n3UdOLqolZ+RP1CFAtHVZtaBu41mjXEynCM3JcrrCjf4VTM3KJnuFY1" +
       "hZXGJpFZkhkRvMs6Nv9/x4\nEtGB7bH8kFs9y/ZxnRuDvNQiBHdtlWN7iNay" +
       "5LhcrmAZuiZkpl5c+8zlV59O/hxjtQfZNG7yHLcE\nPYL5ByMX0/TjfY6m8y" +
       "5/Q0eaNeZ8mRAj2CyVJX5Ge4ks/YTLtcgr4u9M76rtVR+UlRl7T5xtpcQr\n" +
       "OEUTEzAxMdbE2I6VnZ2/LboLp/J0vIP0tVU5oNV/em7pum+ejbG6u1mDaVi8" +
       "u4CKkGZNGa6bGmKb\nMjXXM7+F3shRw+TdWo4H64YcFwN2Rn6B0vgoJbnS2T" +
       "fgcI0qQaNPJMARbAY5SFnjiZ9H9raJPxlS\nwRZWYwdap3QaliE2SXXN4jqj" +
       "IdgN4aUnDkLapahNIJYBlgs2zT1OWSXoDRfZDYoNWCkZa0AsBiwR\nkfySOx" +
       "4I76i37AxPmbal+F+I66/RgrWWfAk8Uy8cXioXxGrAHYA7x8G4rBiC1el2fl" +
       "iyzojr61uU\nU6GVDEBSCjoPYgOgo6JywHrJoECplqO5foOAf4vtppvoIPZq" +
       "GTisToRjtFGEyl+pqMDqorTWki/y\nLluluC0iVKEHDWo+JKbHsYWt2+Z2ep" +
       "j0aizX1ITtCDavEiuwdLYIvvDoRqntdhA7ADspEUyuDfKU\nZir+CPlJNlHf" +
       "mi7HsZ1dmpWhkpE9gE+wZE65z/J6u4sCa1pApAF7BIt7CqWyS3ShEmUpasl8" +
       "SEg1\nM6MfpIK9UkFMsFtKhMDXUkJLaBV4aaa3rSuTpajsHeSOY2SUUV+D6A" +
       "PsJw/JnZL/Pp2X+hD+Yqwb\nIznT4J1MYTKSR6+C8J74waJotG3J30zTSES0" +
       "V4632Zlh702EVsXKqpQ4XBWgX9UVAAfK3Q1wv7qU\nsgzwoGRcKGsSUkqZ5K" +
       "9kaPonwo6rUcYhyRimVIwY2GsXHJ3voN7lP+fQ8i8x8VI4iHEvAJK3PpzQ\n" +
       "Rx2krpVJBMnXQ64il4VWQRRrnYKMXaxPhKZYKaJXH+CZgskpn5skHRyfSsch" +
       "Tb6In0AMAx7xuTtt\nTb7wmo/D3EZNCJ7Li8iO82oH4Mn/KsOsxFgRdkEzOa" +
       "jPpjkiT13cCLXxd8OFRUYCGw0vEDOKZDEO\nur+WAk6BeB7wgmDTAy4yUYaK" +
       "naABW+rIaYaV2ENAxQF/Arlxl2ZMlWPdIF4GvAI4LRmzySTZSHC+\nzJ4mEG" +
       "c9BrU1KKShcW7Jr6Yek8a0XbaZ4Q7Nz1c+e6zrnudO+j9rLDX8RQY//5cBfG" +
       "AaNGquLmBT\nmzeUBqrjoyAWAG4FLFRzIAh/5gGoMau5+rAT+angtdrIl0pz" +
       "2xuANwFqMGuoxFgTtW1VuUENoEaT\nVSCK44//y3iCpyyAGnTOgFCj0bhmJh" +
       "CbAVsAamTZCCIF2B5lePv86QKwq9zYAZDjARsB4Y8HEUZ4\nbgDIfu/X33sB" +
       "+yKMmhiICe42njeOACau1V0AkQUMTJiOyu0UhFc57PEqvxTVoYreehBehRgE" +
       "nFC9\nD4Qq2I+W62iAx8s1M8C/pPH8zT0McEq1LRB+1wGMlGtHgBdVEwJRrq" +
       "NUbjUgzpZhNEUZr3mMc5FW\nsd0u9FOnHdsqNoynVYBQBfwfK/mAdybL+mRZ" +
       "H6t8sqxPlvX/S1kHvK5KuKK8/75u+h03DrUvpBoA\nAA=="));
    
    public void run() throws Exception {
        SJServerSocket ss = null;
        try {
            ss = SJServerSocketImpl.create(invitation, 20102);
            ss.participantName("client2");
            ss.addParticipant("client1", "localhost", 20102);
            SJSocketGroup client1Socket = null;
            try {
                client1Socket = ss.accept("client1");
                String str =
                  (String) SJRuntime.receive("client1", client1Socket);
                System.out.println("Received String: " + str);
                try {
                    Double d =
                      (Double) SJRuntime.receive("client1", client1Socket);
                    System.out.println("Received double: " + d);
                }
                catch (Exception ex) {
                    System.out.println(
                      "Client2: Exception occured in client1.");
                    SJRuntime.pass(
                      "This message is sent from client2\'s exception handler",
                      "client1", client1Socket);
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
        Client2 a = new Client2();
        a.run();
    }
    
    public Client2() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.3.0";
    final public static long jlc$SourceLastModified$jl = 1369231027000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0abZAcRbVn7/uD3EeOkOTyQZIDEk32hIIUcIGYXBJyYXM5" +
       "7i6BXAouc7N9e5PM\nzowzvXd7EagQlASwIkgCiNGohSIKQhIRLS20SjAqIi" +
       "VgiFLww1gKJVhSlkIpoO91z/R87N4SCVEp\nc1X77vW87vded7+vme4HXiMV" +
       "rkOSLnVd3TK3JNm4TV0OraEtVGNusm9Nj+q4NN1pqK7bD4RBbfM7\n+oYDTT" +
       "tWJ4gyQJpNa5mhq27/iGPlMiP9I7qbd8iZtmWMZwyLeRwLeFw8762xn+9c01" +
       "pGGgZIg272\nMZXpWqdlMppnA6Q+S7ND1HGXpdM0PUCaTErTfdTRVUPfBh0t" +
       "EwS7esZUWc6hbi91LWMUOza7OZs6\nXKb/MEXqNct0mZPTmOW4jDSmtqijan" +
       "uO6UZ7SndZR4pUDuvUSLsfI9eTRIpUDBtqBjpOSfmzaOcc\n21fhc+heq4Oa" +
       "zrCqUX9I+VbdTDMyOz5CzrjtcugAQ6uylI1YUlS5qcID0ixUMlQz097HHN3M" +
       "QNcK\nKwdSGJk+IVPoVG2r2lY1QwcZmRrv1yNI0KuGLwsOYeT0eDfOCfZsem" +
       "zPQru1rrL+7Vt63jgTdhx0\nTlPNQP0rYdCs2KBeOkwdampUDHwzl9zTtTE3" +
       "I0EIdD491ln0WXbWo+tTL/9gtujTWqTPOm6Lg9pb\ni2fMfGbZ72rKUI1q23" +
       "J1NIXIzPmu9niUjrwN1j1FckRi0if+sPfHG7d/nf4xQaq7SKVmGbms2UVq\n" +
       "qJnu9PAqwFO6ScXTdcPDLmVdpNzgjyot3oblGNYNistRAbitshGO521CSDX8" +
       "FPh1EPFXg4CR2k5D\npyY7L+luYWQhoy5z211Ha7dzTjpH22leozZq6LYPqa" +
       "6utQfd88h70piiwLRmxF3MAHtcbRlp6gxq\n9x372bUrL795l9gwNDJPK0am" +
       "CTHJQEzSE0AUhXOejMYoFmuZ46jj6CT5G56Z+dnD6udh6WEJXH0b\n5TNUxs" +
       "oRwqDzSsaQzsADuwBTwUAGtZbtL0+/59n7n0iQsqJxJCUfrrKcrGqgKfiO0+" +
       "yJi1PAgtri\ndlxM9p9uWXvoyJMvzg8smpG2AkcrHImOMje+8o6l0TQEooD9" +
       "XX9f/ec7Ki56JEHKwfsg/jAVrAac\neVZcRsRhOvzgg3MpS5G64YKJ1zJYoL" +
       "HQhBHWI2gU1gF70RJTkMetN2+s/Mjz3697gs/YD3ENoVjY\nR5lwmKZg//sd" +
       "SuH5i3f33LH3tZ2bysBFbVvsOSOVdm7I0LU8DDkj6mOoXhrN5tWDHY27F7nf" +
       "5ltc\no2ezOaYOGRRismoY1hhNDzIelJpCAZDHHViJ+iGIXxAKBw1gJOZqK6" +
       "NgnkUiRHJqy547F+x7HmOI\nzRdmCvoa15Tk+YM2BeH8AiK2Z6IFtwTTBq/f" +
       "KiZQv6Dv6jWbd83lMw+zW+g18pJh4Avnl/SFVZhr\nwGaYBUEnMJnNtx69Yu" +
       "1VV7aLMHhuSRbd4NBpzicYv7fLXPrY6UfMBFpJpbtFOn2KJFzGyPyUz9Kz\n" +
       "PGwKrG9NnyD5qWDhu08gEKxf+7cbDj69tx4ED5Aq3V2lm6qBu+12C+8tkiZi" +
       "LLY9tv4Lbz7FXuK2\nGbgLqj8jXxjqNqghT77wyGhT5cP7swlSNUAaeapXTb" +
       "ZBNXJouQOQrN1O72GKnBahRxOvyDIdMhzM\niLtqSGzcUctDq12OvRGvFr7J" +
       "+zT8U/y9gz80HGyIdNDcaWVtyCHOmZdRmLTKaNrOK4qNwy7kg2dx\nOEfYX4" +
       "KBaFxiRqpsRx9VsWLCkmRUZ7w04p0nM9IqN9HJmUzPUqzlPLPjkULhHrEUDL" +
       "Yttt/SNJJo\nGkzk6cNHlhw02YxjfJOqvAINq6QghEDmNGANeep1wNdKcZUG" +
       "N6h56VERoUkb0Y00anYe8JhX0hLF\n8Nur+u67MrPn3oTnzXU2D2NnB/4c6O" +
       "W2rTezVlof1nkcAg9/q+Gscx95dXejyARBrAEveHcGwfNp\ny8n2J695YxZn" +
       "o2jIo9MLRQtlYDin1Iospxm92IJUMtXJUCYSOEyrBI8Qi4uNuw5/pef1Xf6i" +
       "rLAx\nTpfakl6qUX2UxjXAaHRBiWFrAYcqE4w4mzN1jZug4HHfBTcevXNH+1" +
       "8h+G8i1dSgWagywGJmbYqU\nuxDl+x2oXVaKDuBadVnBs993pNgi+PPB/918" +
       "XmeVNDUzXTgpHLsODCXn+PokUZ9koT6JVR9asuTt\nuRfx3ALDl4O81hID1J" +
       "on7jl78YufhNzfRWqxWuzOoa+kyCQMLCqW9zzHefGiGgvI7iB+1IpXhO6g\n" +
       "aCOk4jC8twQyoUiiKrxv1AkkiRRGToMFCrTh7K8EfVvZe9w/RuaUIntSK5fo" +
       "ps4uleIa2HHuBmT9\ncJOzQyaDktWliPBnQ4xUu1vBhJgX35BcG5ARpCXhfE" +
       "SuRnANixiT7DEQ7lFjWmnaaVhmQP8FO/7o\nxUhL7Im3MjUMqqcYX0S2IuAh" +
       "OHsChKMBgZFyzbLHJWkvO76IDjYVaskN0CWjfYhwp8tNKByBIwnz\nWShkq6" +
       "7I2Li+frjuBtzb+6DpLRjPnJLVJSwU6+KsPK19bi2xJ3IuH5fsNoa3dFSHl8" +
       "BQPlwBjomj\nl+d0fIGCGDUhzdN10hA2eR2DHaSYDkS2I7gBLMCg6ijthFpX" +
       "0nfDAslyRqix0nEsZ7VqpiFWZDbg\nIws0mFbssZzXJ3yGSiMiNyHYCZUBFy" +
       "iFHWBkZkyY94lFipkcfSAF3CwFQMExPcYEF1lyaAy1vMWZ\nzLutTGdgO9aN" +
       "UsfR04FSv0ZkN4JPwwrJnpL+IAuV+Ljv/ibXRYyllo/sxGJBDn0FkT0I9vqs" +
       "McVL\n+lJGpkZY8zi83EqPc2cItfyQGgiBlzTJ5x/BFBDcVmxuCD4TTCrQDM" +
       "GdkrC/qEpoUoFKoiW3Zt/J\n0OOVKOFuSRjHTwZhBfusnKPRVZC0hB+Hmu+L" +
       "igfCm1jBN0DSLgwb9LCDpmumk57x9cBSwZKFWt4u\nlkEB7LNI9LPQNybJok" +
       "8bgVd4A11/ksS94VUwHLlJj/gLIocQfEtQL7NU6eHKd8LUOpUxmrVZpMe+\n" +
       "oAeC754i/EcIxkSEBeEda4D97LfwnQyqDT1UbnwjHAel4fgvbxArfNQ3G020" +
       "JYNbEHkKAZQX9R4V\nHUdaFhmD10EpIwsvwcm1ACCW4T+PbwW8gjqBS3Qj8i" +
       "yC5xD8ShLOAJVkwsPxRfpMQoQn8+cg/aJA\n/+2xMVzhYsmKE+LfCc/ltcB6" +
       "Xgl7fCoOI7IRAa+sNgXFJyKi0EIQ1HYNpSusyMsIz++RJxMVi79F\ncAxBkB" +
       "RqJyKcH9UtU6w6RBDUQ4sQ8Wsu8aJ6kks7BEF1xUNzUI+dUKGGyDiCbQiCOu" +
       "kSRK5DcH2U\nwLdXVDYIdhQreRDI0kREd1GaRAjhmgWBrDVE7L8VwaciBCWB" +
       "yEnOdEsRuQfB5xCclDS7H5EvIfjy\nSZMxcSpH5GsI7j9R4QeiMh4MMjQiDy" +
       "F4GMGBIO8iEkTfR4plUwSPFkukCP5Hssj/L+F48ieCJ4OU\niYjIeAieLpYK" +
       "EfwySICIFMtmE6c5RI4WIUyKEn5TJLOtsHJDkOULM9uyE8lsiAT55r+WoRC8" +
       "cioL\nncpChcJPZaFTWeiDSviAZyEELwQZJ8D4icQacagROfDjp3TzvENsgl" +
       "AcYvsn0K4T+iYSu7rDrx3t\nvOr1+pvUx68WZznN0aP6lWYue8H+o3TBR+u1" +
       "IrdFaphlLzLoKBVfL/CcOyGOIUHsopKHc2v5MUZw\nUFvWt3TBOQvr/pAg5R" +
       "Nc92jyHvZSlnPM0OkP9Fb/7Xsgs2OLEtenabT1irIR/ScJfoArznwLLnBF\n" +
       "B3VET3prnaiifAtbuQINRFz/aUbbIOKP/0diE4JmcV0DgLJV7O0EFxSKEv3L" +
       "BtiGmmZyUNOs9O/1\nIH9lzPv6VXgE3+PoWZ3JN+rbZ937+0PHeluEDYjrbP" +
       "MKbpSFx4grbf6JK0iYU0oC7/34h+c8cH3v\nS0PeAZwCBlY+aulpnJyyI2rV" +
       "8YbC5MLi7xz4LfYWdnGxhS10JJ695zFS6fLLhqUXtvA+HL8LJRbr\nYFnb64" +
       "nvTWnj13vKh1RXHlNGLhIW3hOMXP/jetbKWU2D3+x3mdULRQ0Ay0Tl9rxC8M" +
       "6AcscEM79E\nxBGYv0HNDBvhi7pdHKMqN4KdgLaI3pYvcPVCK+PHWngC7tPE" +
       "7RndSsprmkAsvByDAnJCXS7rPZp/\n6PKO8kX8FCNP2aIFvrjTkS+51cjjOs" +
       "5pl/cNjFtjgU0qocWJPIElrfKu0OG9g6lxN/BuaGpzn9k8\n/0d200+F1fi3" +
       "KKvwBDhnGOEbJCG80nbosM43v0rcJ7G5rg8x0lRwk4+R2qDB1/qbovdBflsL" +
       "e2Pr\nELeTr+aVfwEj4KDsACwAAA==");
}
