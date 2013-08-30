package purdue.general;

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
        System.out.println(
          ("This test tests all possible protocol combinations that shou" +
           "ld be accepted by the compiler"));
        System.out.println(
          ("The tests should not cause any compilation errors or excepti" +
           "ons"));
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
    final public static long jlc$SourceLastModified$jl = 1377835756000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0dC3BU1fXubrL5EEnCT/6/RAWFTbHqqEERApHgApEE1Dga" +
       "XnZvkgdv33u8dzfZ\nONaBOgrSlqlV1FoqrWNLP7ZTsPYzWj+j1Lb2M9oZpD" +
       "rYOjCiU+yU6bSiRe05977/btao0IHwMrNn\nz73n3nN/53c3b8579B1Sahok" +
       "YVLTlDV1XYIN6NTkUOtaR1PMTLQta5UMk6abFMk024HQmVr7obxm\nd+0Xl0" +
       "ZJpIOMUrWFiiyZ7b2Glu3pbe+VzZxBpuuaMtCjaMzimMfj8rrj/b/fvGxSjF" +
       "R3kGpZbWMS\nk1NNmspojnWQqgzNdFHDXJhO03QHqVUpTbdRQ5YU+RZoqKkw" +
       "sCn3qBLLGtRcRU1N6cOGo8ysTg0+\npl2ZJFUpTTWZkU0xzTAZqUmuk/qkhi" +
       "yTlYakbLLGJIl3y1RJmxvIbSSaJKXditQDDccl7VU0cI4N\nzVgPzStlmKbR" +
       "LaWo3aVkvaymGZkW7OGsuP4aaABdyzKU9WrOUCWqBBVklJiSIqk9DW3MkNUe" +
       "aFqq\nZWEURiYOyhQaletSar3UQzsZGR9s1ypI0KqCbwt2YWRssBnnBGc2MX" +
       "BmntNaGa/6YGvru9PhxGHO\naZpScP5x6DQ10GkV7aYGVVNUdDyWTdzbckN2" +
       "cpQQaDw20Fi0WXjOz1cn33p6mmgzqUCblVwWO1PH\nL5k85eWFhypiOI1yXT" +
       "NlFAXfyvmptlqUxpwO0j3O4YjEhE18ZtWvb9j4A/r3KClvIfGUpmQzagup\n" +
       "oGq6ycLLAE/KKhW1K7u7TcpaSInCq+IaL8N2dMsKxe0oBVyXWC/HczohpAw+" +
       "Efh8gYi/CgSMlLdT\nk81LmOsYmcEANRtMI9WgZ410ljb0UJUaktJgt8khu5" +
       "H9kQisZHJQqxQQwaWakqZGZ2rXwd/duuSa\nu7aIM0K5sibCyBjBO2HxTnDe" +
       "JBLhTEej6ImtWWgY0gCqRG7Ty1O+/oL0TdhoWLAp30L5eiL9JQih\n04VFLU" +
       "aTq28tgEkgDp2pMRvfmvjgn7+/N0piBa1G0qls1oyMpODB22oyyhouSAF5qQ" +
       "9KbaGx/7F1\n+WP7Xjwwy5VfRurz1Cq/J6rFzOCmG1qKpsHsuOzvf3/pP+8p" +
       "vezxKCkBXQNrwySQEVDdqcExfOrR\naJsaXEssSUZ05y28ksEG9XsWjLAKQY" +
       "0QDDiLMYEJcit17Pb45155csRevmLboFV7LF8bZUI9at3z\nbzcohfoDD7Te" +
       "s/2dzTfGQCF1XZw5I3E926XIqRx0OduvUTi9NIrNkT2NNdvmmj/jR1whZzJZ" +
       "JnUp\nFCywpChaP013Mm6Caj3mjlsZ2ImqLrBWYPg6FWAk1qpH+kA8C9iDxP" +
       "gx9943e8craDF0vjHjULP4\nTEmOV9RHEM7KI2J5CkrwGHfZoOPrxQKqZrfd" +
       "tGztlpl85V52c6xCzmHo6sJFRXWhGT0LyAzTwMS4\nIrP2S/uvXX79dQ3C6M" +
       "0rymIF6HKa83H7b29RFzw1dp8aRSmJm+scfU+SqMkYmZW0WVqSh0WBtS1r\n" +
       "EyTb8M/5+AW4A8u3/mfTnj9tr4KBO0iZbDbLqqTgaZsrhPYWcAoBFrc8tfqh" +
       "Y39gr3PZdNUFpz85\nl2/l1kgeTb50X19t/Cc7M1FS1kFquGOXVLZGUrIouR" +
       "3gms0mqzJJzvLR/W5W+JRGxxxMDqqqZ9ig\nopZ4drsEWyNeLnSTt6n+SPx9" +
       "iB8UHCwI4z+qScvo4DGM6Vdza8xoWs9FIjp2u5R3nsrhDCF/UQZD\n4xYzUq" +
       "Ybcp+E8RGp0RfLptZHjQEIivpkKw4Zzcgk5yiNrMrkDMX4zRI+bi8iXC8WgN" +
       "jWB07dEZAE\nCggTvvmFffP3qGzyQX5UZVZQhpGRa0jAWyqwk9zdGqBxxbg6" +
       "YteZslxiRBioVK+spHFmFwKPuqLy\nKLrfXda267qeex+JWjo9QufG7FxXq9" +
       "15mfWr1YyWlrtlbo1Az49XnzPv8SPbaoQ/cC0O6MLHM3Dr\nJywiG1+8+d2p" +
       "nE0khTyaLIM0xzEP5xXZkaZFtEfO2xC0COcW6eXpdLly/wvfaT26xd6GxTra" +
       "53OK\nHoKaLjTgxUX6LAccAkmQ3ExWlVM8ABc8dl18+/77vtjwb7D4N5Jyqt" +
       "AMVRkIyNQbfREtmPZ2A2KV\nJaIB6NOIjODZbmsPWDEmGT2UiajFXgx+ryjw" +
       "XVzSWtR+EChaQNJ8gxTfqaSm6YLD+mUPdzy77FhS\niEuXlh4Qouru+PlF+K" +
       "zMsi4DzEhvoW0vJh2LCvYCsztKNhdTHQ4S9lIZEO4XdEiCzoyM9ujmUsns\n" +
       "XS7pjcHthHjQPqIEHlEi/4iizefPn//BzMu4j4WRm2GVk4p0kCr2PnjuJQfu" +
       "gBiohVRijLwii9Yi\nSUaigZXwUsN9vWU3yzFsXuHa0UpxMVrhxq2ExKeDqX" +
       "PHhGCRSnDLGiGQBFIYOQuO050NZ98J853E\nPqVIQ1BejGyNGp8vqzK70hmu" +
       "mg1R6yD68RY5O2TS47C6EhEZAVwQys31oFUMbJBNrnTJCBSHcBEi\nfPO6mU" +
       "+/nBYd3hYVqpamTYqmuvQ/sqHbb7hVBGqsnalgEEUG+CLCS1zxsqc4Yb9LYK" +
       "QkpekDDmk7\nG5rfBLn1lJxD3uAw2oHIRgSbBh0cwW0OYRbzOEbJFNERnqHt" +
       "FFcAbsmXW7QOhUcpDqsrmMe/BFlZ\ns7a5jQnUOGvZ7LC7wSs2fTJcrz1Rx2" +
       "JQfuy9KCvjPRVcw6A0a64ju7DIY0Zs4AzTiMiXEXwFpEyh\nUh9tgnuFQ98G" +
       "G+SEjmIaSwxDM5ZKahrsUc8arNJgBhMKVTvr+qrNMFKDyNcQ3ANRGB/QGWw3" +
       "I1MC\ng1k/XjnDjPZXOANsdwaA4G5igAlussOhxlOyNmc0b7Yk3QPHsRICQE" +
       "NOu5P6CyIPIvgG7JDT0qH/\niHmuU3ju9iGP8AlLJe/ZhCGZ0/VtRL6F4Ns2" +
       "awykHPoCRsb7WHNbvwhcJVcGT8k22+4gcCF2+PzX\nXQKCHYXWhuAhd1HuzB" +
       "A87BB2FpwSipQ7JVFyjuZ7J2Meb/sJjziEARBF3wTbtKyRos3gGIUee4on\n" +
       "ZIq7vYdYyg/AoV3qFehuA0VXTScs4WuFrYIt85SsU4zBNcNmEW1nnl/vHBZt" +
       "qV6aziqo+iMd3Ope\nBt2Rm6MR/0LkaQTPCOrVmuRoeOQXXuoIiTGa0ZmvxQ" +
       "63BYK9IeH/QlAGI8z2nlg1nGe7hvdfiGhk\nT0jzQ68ddATHviiDrbBRW2xS" +
       "ouww2IoIF/tXGf7cz6moOI5kkX64ejtjZCRZTSwHALYMvyy+pXDd\nN1yVWI" +
       "HIXxH8DcEbDuFsmJLj8LB/gTYjETnECeB+cUD7jl7jjaIxLGYk2tZK/D/FWZ" +
       "F7admrzz43\nbu1LMRJthqhak9LNEv+BEsIsCILNXk1J5/QFV/HLQVV/OcAa" +
       "/NUAmI11ZsgZwn1G6qKK5x7RQsp7\nYZQmMP1JElOkLpzfJRB3122hMOXkwk" +
       "UXBq9dehaRm/h1wFpofDoi3DRxBik3AkdERJsI3AC3GhE3\ngi0Y+SJwXftQ" +
       "Yl4EWqFQF4EbeH2mcBCBJyJD5A4EdyJwA6LLvJeBYHwlbnW25x3tr7AEcVxa" +
       "NqVM\nl9yTlRh1wzlngONgrIPHa+vIaiiaPG7z1dgOJEIc5cSfgiJRBLFTh0" +
       "A+j8hdCLb6CccH63E9IiIw\nRLCtUMSIwInsyDZERGTnI3hDPgROqCZc5/0I" +
       "HvAR+IROdqCwAJHvItiF4KREKTsR4dQfn7QxBo+E\nEPkpgsc/6+C7/WP80g" +
       "1wEHkCwZMIfuWGLYi4zuvZQsEIgucKxSEIThEnfOYShhJ+IHjFjTgQEQED\n" +
       "gtcKRRIIDrjxAyKFgoHBowREDhUgjPQT3kRwmAcBp797nYuIcJbM+ln/pHhY" +
       "RD5E8NGGITmJ0NmR\n0NmFzi50dqc9Ydg4O97kCNw20+K2OY9XhLdNEvrCoa" +
       "0j9IUnYvDQF4a+8HQlDBtfePp7Os/FD0Dk\n6tDThZ6OhJ4u9HQh4UQQho2n" +
       "y3uU073lJU9X33cCb3lTij9H6D6Typ/zcov2c174cKrDbELx5/l8\nT8ny/x" +
       "j6auz/GEYvcBiWYRE9fTThJ9yMRRTF6Pn+rfnkYcGp8uif/1y2I7IRwSb/Aj" +
       "/Fg3yIFApv\nrkDECQu8D9ghEnr/0PuH3v/MJAwb73/6+/oTeM+dssHrND3e" +
       "dMKGQdxs6H9D/xv639D/hoTQ/34q\n/+t3wovPHCccOq/QeYXOK3ReZyBh2D" +
       "gvx281hX4rdE8kdE+hewrd02lPGH7uaVHonkIvREIvFHqh\n0AudLoTh54UW" +
       "hl4odDYkdDahswmdzSlGGDbOhueVXCYe5fSlreVZZuusVMwEoUjFbOdRNg1P" +
       "tqlA\nunmeKn/z9Uer7pSev0lkyRzlTzi9RM1mLt65n86+qipVIN15BdP0uQ" +
       "rto8ILYbbmGB83BsPOLZpc\ndjlPQummG461LZh93pwRh6OkZJCk5bVW5SrK" +
       "sobqSWcKraVPnM18WmBTgvOp7Zt0baxX/k2UpyEW\nmYvzXjrg79Toz1dcaf" +
       "gnyo9wEp9ANWwRZhCqg8/lRPzxbyTWIhglko4DiL0kzjaQZtvNih3MAd1q\n" +
       "yBmZyX3Ww6V3T33kzccOrhojjk+8PaEu7wUG3j7iDQp2sl8YYUaxEXjr5y+Y" +
       "8ehtq17vsrLjxvYx\nEpNVVjhDuD11LI9mVlp8nqVpSS5FdUxYxZkccLOexd" +
       "4QjzHHDjFS0qfJaWQZO+KRdF5xMFe4Jvaq\ns+34OQ8+mrXtWqFtz1cz7szr" +
       "GImb/PUZxReW/4YHnu9fnMeeWP3R6BPj6nkK+5IuyXSy8vpejZH/\n5gvfCy" +
       "34PCudVU2Az7SPWdXhggeAUWPs/VyEYF7s2PFBVn6FsDKwfoWqPfzNC7GDCN" +
       "5z87RHRfMC\nx8pzlGJCZ5smUsLLWsJ50wgQ8zO+4wCvifnxsQbXhqFmpC+J" +
       "Y64MJ2WqP0eYSFSeK3q2OIW3+WyO\nWsnGuCAWFsf38sTxvaA44ksrZsCnzz" +
       "q4vqGJ4yArjbondtijD8U2BLYgblCdSjzYPhxxJWVOYWb5\n1SAWpfxFF5gX" +
       "fHzQVlhvTUnNfHntrOf02t8KubffbFKG+YmziuLN8+7B47pBu2W+C2Ui67vO" +
       "Zz2d\nkZH+V20wUmZhOMuSaaJdHX+bArbDUj3KeElVLvI/XnD8qI5nAAA=");
}
