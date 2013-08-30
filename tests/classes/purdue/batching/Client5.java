package purdue.batching;

import sessionj.runtime.*;
import sessionj.runtime.net.*;
import java.util.Hashtable;

public class Client5 {
    final private SJProtocol invitation =
      new SJProtocol(
      ("H4sIAAAAAAAAAO1afWwcRxWfPduxnQTHtfNBm7gNJUmTKj2TQqKmdpvUX9ju" +
       "xTHYKVUqmu7dTc4b\n7+1uduccG5UKUZACSEEF2ooPqQKBqqqNIKBSVPGhCq" +
       "FKICHBH6gg8VeRaCX4AyEEEkHi/fZjZve8\nd3Vq0tpiI+X5zbyZ92bevHm/" +
       "t7v3wl9Zm+eyPR73PMO2zuXFksO9PJoBNzM5w8UssWdKr/5u8PuW\n2PV6jm" +
       "kF1l7l1SJ3PcG2F87pC3p/TRhm/7BtmrwkSNPAosv2N9XqiwLNLPin+ZrbSn" +
       "OGWRZsfyGa\n3u9P6pfT+xPTYen9dZZA7eI5WgpsBUaeaJ959mOVr3w7xxjN" +
       "2ObY5lLFtEU4Ixhz396XThXe+Nkt\nwZidKWNO+lrPlK4e2dX32/v+1NmCJX" +
       "c4tmdg14K9txBNCjwyHUoGFh1n0SFX74O38pDllbe8Paes\nql02zhp60eQF" +
       "wxNXt+w99OJfLnX7Lmk1qUew7pinMQY7P/jW6lT/jUPsU796+J83+0q10nn2" +
       "GNP8\nRW1VWgqGNc/LUL/5wMzHJx+5eGsLOcO50IoDoqG3NTnU4SFeMZadKV" +
       "y5r8ms2KS7zadf/c703y5i\nElaXcxbJ5N6mcWSV0wwebjLnBPF6hfxSrdYs" +
       "o6QLGYjPHn78tac+3f+PHGt5iHVwk1e5JSjGb34o\ncL2pW5X+GaGX5mddvc" +
       "RHgwEDBbapGuiEGsG2qSAIAtaP0wLbIHS3wukkexLqXMOqDMj94m+Pv+9m\n" +
       "9+ejvMSNBb5865jeG1Oj1B1oou5kTVyga5eir7n7C7btBHPmJ791+pXJfxWC" +
       "gC3a5SVYbom25cQW\ncnvzhRRd3SrNpa2kWewNpc7KnWY9hjfCHQoTOilzCQ" +
       "PKSDI6TRasN3alxnVv7oTuyJNwGK31BnUz\nQnlb+x9e+fn2R37TwnJjbKNp" +
       "6+UxvSRsd4J1ijmXe3O2WV50jh33l7D5QgfRbvqfI2Xb5Pp9heQ+\nvcjN2G" +
       "onWMccWRm2y7zAWky9mAyVIPlQKmG7n7tJsNbRB0anIr86NTcK0zwG55eHaW" +
       "7s9sHB/9x6\nFM50yOI4LWlnkwl65y++tu/IHz+bY60TtFPD4lM1JP0C6yrz" +
       "kqkjbodN3fOXsJ3S4FmKoCm9ysP2\nxioXc3ZZ9sDoht2Ux5TNWfKYTsl+U8" +
       "DkIRHsPXRJ1Gp89Xla707xNq+1YO9rJg6tbhg0LEPcK81t\nESvMPILdEG/6" +
       "6qDkiFR1L5i7QI4K1uHNU2YRlKYj8UYlBhmQgg+B8clhkcgxcsTp+IhOiwJn" +
       "2LQt\nJf+1WDkMC7a1rif0TKdweZ3e18AMgQxTIJZsZ0mK9osYHutegJ5YWY" +
       "TFU8SHXlPN0FSriO/uaPwI\n6lUFNz5S1pvsCNVtLxueXi0alZouuDInDVwV" +
       "rK/+UlKEOBTI7ilqer5PEj3yeKciLZoGZhrkIwkB\n29PMFcidMVeo5nIL7G" +
       "oDCw1Nv6sC9kERQ/z6fYcFZbT1rXU917B79mA8uhcMKrVI/7RrC7tkmyOU\n" +
       "o6B2qEb1JHcJxRvKwmjpKqI5ZnCzjAHSzACYIgitt9Pk+gIf1k0lv0THLGvF" +
       "YBmjrmu747pVprRZ\neQBdNq3gxrRuueGz0rHdYOZADMHafIPS2BUK2Tpjw1" +
       "R58kUhzfQmO6SBeWkgJ9hNdUrgfamhO9YK\nndPrDxstV+icTi5w1zVi9+j3" +
       "YByQ8+QhOVLKL9N8aQ8BEZ3+psR13ejPHMYDgJz6JpgFkAuRalSn\nUn6Miu" +
       "6Eah+ShqgAgf7uWCtCF2XE5SoJ/1ttAcRN2xuIsnxZrQxkUQqeSV0SQkotKW" +
       "jJo3nseqzj\nzaTgE1KwRKGYWOCMXXNLfIySXJCNYs3/yRKvxA+xzT8AKbsr" +
       "HtBnXYSuVc6HwTdNriKXxVrhKba4\nNXl2uVkRe1iTKmZKc7xcM3H1uyQfTm" +
       "+n6dAmb8TfwTwJ8lQg/bCtyxuu/Sgu3aQLwauOSIz4hhoB\n8vVM8I4IzEaC" +
       "A/ET20LnOWsDxqnwMmKV1/PxPCgDJ8J7yhURG4VNKWhLBZ8H812Q7wm2OZTi" +
       "4sjI\nQsT3SBtV3bDyJ4hQLsOfUG+bR4+G6kpMgXkR5IcgL0nBDlqSBDzMTx" +
       "nTBeZlX0D1FAxSnb+r7l3G\ntEmV9bgN8KPH3td/+ejo/Z+7GDy7WapeT9Tq" +
       "wYMqfGAa9HRwp2/wNqYdokK55eTIiHoSAXPQf8AI\n17RhN5gPgBwCuVPV9G" +
       "CC+hVElcxbwKiaOLWWBlHF8kqqaBBV4Z9OCo6rqhlMUN2CjKSVvSBjqugF\n" +
       "Mw4yATKpSlgwBZATIKso6dgeMLMgp1ap6l2uDsE8DHJmZftgD4IJCjAQVRwM" +
       "JAWygmKXwAQVVEIQ\nL61AZEkUQFQVxEoItByY6wzIx8A8CvJJkOtSDTwD5n" +
       "GQz1w3G40rDjB+svzCao1fSdr4oiokwDwB\n8iWQL6vyAIwCiafTQB/kq2l4" +
       "D7JGwO7/V7ASmAe5rJAdTADMIFfSEBvkBwqnwaSBbmM0BvNyiqAr\nKfgxyE" +
       "8Vci5KhBxdrwh5B5jo/U/wyWYV6NnX/FWbesss35Qk3k/5r5ulsh5xDa+6Bd" +
       "tW3xU98Gh9\nUmU7mreA7E4KgGIaTkjblfRPQx+sTUHDk3lSrOzjIFWKsZZ8" +
       "ZlQOwdXWDoLcsULTDUuqe8Co+kEJ\njovYJ4LU10Gubnmm7r/i6GskCoNqhw" +
       "h7eHKgtIbLqqGW0fwLktUeWe0BktUebyVY52DuC34iwk+D\n/qPxhCV4Be8L" +
       "IoSXAC+hdB0DPBFtx9rAqbcBYOcTuPMOA9L5OERohzPsyLCDZdiRYUfsteqI" +
       "XSua\nPAU67smgI0OIDCEyhMgQ4loE6xwhiGjfTEGDwdWgQfMfgSV+S+r/IC" +
       "fR0+D3bNqfQd5AVxJFUgXr\nDEUysMjAIgOLDCzYmgeL+HclCRYy72aPDssF" +
       "WW7PcnuW27PcztZ8btfOpOT2u7PcnqVwlqXwLIVn\nKZyt+RSe+NkX2l3/BR" +
       "WrDhZzPwAA"));
    
    public void run(int singleSession) throws Exception {
        final SJService c = SJService.create(invitation, "localhost", 1000);
        c.participantName("client1");
        c.addParticipant("client2", "localhost", 20102);
        SJSocketGroup ps = null;
        try {
            ps = c.request();
            System.out.println("Client1 is connected to all participants");
            SJRuntime.pass(
              ("Hello, Client2 from Client1. I will send you an Integer and " +
               "a Double:"),
              "client2",
              ps);
            SJRuntime.pass(new Integer(2011), "client2", ps);
            String str = (String) SJRuntime.receive("client2", ps);
            System.out.println("Client1 received: " + str);
            SJRuntime.pass(new Double(3.14), "client2", ps);
            SJRuntime.pass(new Double(1.11), "client2", ps);
            int i = 0;
            {
                SJRuntime.negotiateOutsync(false, ps);
                while (SJRuntime.outsync(i < 10, ps)) {
                    System.out.println("sending: " + i);
                    SJRuntime.pass(new Integer(i), "client2", ps);
                    if (i % 2 != 0) {
                        {
                            SJRuntime.outlabel("ODD", ps);
                            SJRuntime.pass("Odd Number", "client2", ps);
                        }
                    } else {
                        {
                            SJRuntime.outlabel("EVEN", ps);
                            SJRuntime.pass("Even Number", "client2", ps);
                        }
                    }
                    i = i + 1;
                }
            }
        }
        finally {
            SJRuntime.close(ps);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Client5 a = new Client5();
        a.run(1);
    }
    
    public Client5() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.3.0";
    final public static long jlc$SourceLastModified$jl = 1367386494000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0cW2wc1fXurt924lcSQpy3TUhoYpOURIQEQuzYxGFjm9gJ" +
       "wQic8e71epLZmWXm\nrr2hlPIQBKgaCUGA8mhURBvxUkkQUKmUFgGFAoU2rU" +
       "JaCX5AFFqeQkBUAu05987cmdkdLw4pbQJr\naY/P3HPvOfdxXjO7cx54lxRb" +
       "Jmm2qGWphr61mW1PUYtDY3ArjTGruXddj2JaNN6mKZbVB4SB2JYv\n1E17a6" +
       "9aGyahflKnG6s1VbH6hk0jnRjuG1atjElmpwxte0IzmM0xh8cZjYdHX9yxri" +
       "FCqvtJtar3\nMoWpsTZDZzTD+klVkiYHqWmtjsdpvJ/U6pTGe6mpKpp6KXQ0" +
       "dBBsqQldYWmTWhuoZWgj2LHOSqeo\nyWU6jVFSFTN0i5npGDNMi5Ga6FZlRG" +
       "lJM1VriaoWWxElJUMq1eLWJeRyEo6S4iFNSUDHKVFnFS2c\nY0sHtkP3ChWm" +
       "aQ4pMeoMKdqm6nFGZmWPkCtuOhc6wNDSJGXDhhRVpCvQQOrElDRFT7T0MlPV" +
       "E9C1\n2EiDFEamjckUOpWllNg2JUEHGJma3a9HkKBXOd8WHMLI5OxunBOc2b" +
       "SsM/OcVndJ1ec39Hw6G04c\n5hynMQ3nXwKDZmYN2kCHqEn1GBUDD6Wbb+68" +
       "ID09TAh0npzVWfRZfdJjG6Nv/WaW6NMQ0Keb6+JA\n7PCy6TP2r36jPILTKE" +
       "sZloqq4Fs5P9Uem7IikwLtniI5IrHZIf52w+8uuOI++s8wKeskJTFDSyf1\n" +
       "TlJO9XibjZcCHlV1Klq7h4YsyjpJkcabSgx+DdsxpGoUt6MY8JTChjmeSRFC" +
       "SuETgs+5RPxVIGBk\nUqvCYsO9wNNq01Sqs8XN1lZGljNqMavFMmMtqbQZT9" +
       "OWQewHysAPKm6qI1RvCRqbQZETR0MhWO30\nbMvTQE3XGlqcmgOxPa8/f1n7" +
       "uddfJ84Rdc+eLCMnCJnNjsxmwX4pCYU433rUULGDq01T2Y6Wk7ly\n/4wfP6" +
       "vcBecB+2Kpl1K+7NBoEUIYtCSvY2lzzbITMAW0ZiA26Yq3pt3+53ufCZNIoH" +
       "OJysYOw0wq\nGuqHY011trhsCqhVU7ZyB8l+74b1Dx944dX5rpoz0pRjfbkj" +
       "0XrmZu+7acRoHLyTy/7Wf6394Kbi\n5Y+ESRGYJDglpoAqgYXPzJbhs6IVjk" +
       "fCtUSipHIoZ+EVDDZo1LNghFUIaoRuwFlMypogd2aHri45\n9ZXHK5/hK3b8" +
       "XrXHQfZSJqyo1j3/PpNSaH/1tp6bdr2748II2G0qJc6ckZJUelBTYxkYcoLf" +
       "8HB6\ncVSbd/atqNm5yHqUH3G5mkymmTKoUXDUiqYZozQ+wLinqvV4Re6MYC" +
       "eqBsGpgXoOaMBIrDUVGgH1\nDHAbzVMn3XzLgjtfQceS4hszBQ2Qz5RkeENT" +
       "COH8HCJez0ANnuQuG1zBNrGAqgW9F63bct1cvnIv\nu4X2RUYydG3htLy20I" +
       "EBCHSGGeCJXJXZ8sOD563ffH6L8I2L87LoAnOOcz7u+F2d+qonJh/Qw6gl\n" +
       "JdZWafJRErYYI/OjDktb8/BSYL3regXJiQ8Lv3wBrmD1sk+u3PfyrioQ3E9K" +
       "VatD1RUNT9vqEtYb\nEDuyWFz6xMafHPoDe43rpmsuOP3pmVxHt0nxWPLpB0" +
       "ZqSx7anQyT0n5Sw+O/orNNipZGze2HCG61\n2Y1RMsFH90djEXpWSHcwPdtU" +
       "PWKzDbXIs9tF2BvxMmGbvE/1v8XfF/hBxcELESPq2oxkCgKLOfsc\nCotWGI" +
       "2nMqFQCoedzgfP5HCO0L8wA9G4xYyUpiBQKJhGYZ4yojKeL/HO9Yw0yEM00z" +
       "pTkxQTPFvt\nuKcIcYtYBQrblHXeUjWaUTWYCN7PHli5T2fTX+eHVGpnbZg6" +
       "uS4EwqkGe8jjsQm2lo+rVLiBmB0z\nQ8I1QUzS4jizJcCjMa8miuE3lvbuOT" +
       "9x8z1h25orU9yNzXPt2Z2X1bRRTxpxdUjlfggs/HD1SYsf\neWdnjYgErq8B" +
       "K/hyBm77ia3kihcu/nQmZxOKIY822xUtlI7h5Dw70tZKE2rOhqAvmJdnlGfQ" +
       "Gdqt\nz/6s58PrnG1Yk0LPfFLeQ9DjQQKX5hmzHnDINEFnk2ldjXGNEzz2LL" +
       "364C1XtXwMvv5CUkY1moSk\nAhRk5oW+lBecep8JiUq76ACWVJkUPPscuwH/" +
       "xRQzQZlIWZzF4P8uvqh8mrWBxiikT7nrwuHdHjYu\nuwV52HWn2SgoZAC//H" +
       "sbNYyUGLNt3d39T647FBUKNmjEtwvltpeV8kzklPwTGTTB9wwHzSSfYrUG\n" +
       "jgJfXadaa2gKdACOQdsuYjaYnwKDGan3mPVaxRper6RWyCkTf5Zg04tL//bk" +
       "U1O2/ClCwh2kQjOU\neIfCcydSDkkLtYYhNc2kVp3Np1A1WgawBh0aMJss58" +
       "8ZwvYpg1TzzLaTlA2DlDYjDslDRFMGcSrL\nYCaz753GSFH7pvYuZx8hu3V0" +
       "rhl1rjlX58Idp6xc+fnc5TxdAAlrYQoNeQYo5c/cPm/Zq9dAOtcJ\nK4PY1J" +
       "VG9xclEzFWKHgbx9MWOwSU4Y1ClxsSKsStYJebhRNSMhvuT12ZkPdSBe4rKw" +
       "XSjBRGJoAR\nuLPh7BMw3wb2FW2UkTn5yLbUkpWqrrKzpLhqNk43Aomc95Kz" +
       "QyaGZHUWIpcggGS4zNoGboLZIQvJ\nFS4ZAZOE0xBJIoCbQK/DkD36vT3KdV" +
       "CUNs3QXfpLbPwBCW7cslrsnSlnkBD7+R5E5HsILgNFjBmp\n7ZI0n3nil2KJ" +
       "9AVn5sSuLsDtXXMvbVE8jZCslnuPIJuVsHCHWb2/wWY3Ja5aSnJQTaQhYXDF" +
       "SQGH\nGZmRbYROYrIRLi2+J74Webw7HC4io7gewQ0+AmnKtxXoKz1b4V7mSi" +
       "CHx5Awpuj/K4F8l3nCd/a6\n7dTKWfqkrJYjWD3Z7NXuEdVSmSfbWwM+Ctm2" +
       "plV8OAAheUyarS0TB/GSZ+nYQYpZgcgdCO4EY9Co\nMkLb4E5O0nfCMctkXU" +
       "yj3TQNc62ix8FtJjZhkwEzODGoWS54t9zYGkR+iuBuyHu5QClsL6hsljD7\n" +
       "qaIUU+9vkALukQIgnZ6WxQR3X3Ko8VzZm1PPu7XHE3BO3SPUNFWPHf0VkXsR" +
       "3Ac7JHtK+oPMcwOL\nCuGcfqXPXCv4yDZMheXQtxH5BYKHHNaYwEr6Kkam+l" +
       "jzkNQKCQfyr/FcOdHFFWJS1wl/5i4Bwf1B\na0PwoLsod2YI9krC7sApoUq5" +
       "UxJX8mge+zrm8baf8LAkbAdV9E2w10ibMdoBTk54I8/lf2WKe72H\nWMwPQN" +
       "JO9yr0kImqq8ebbeXrga2CLfNc2acYgds7h0W4j3keq0oWvbFhGk9raPoTJW" +
       "4PL4XhyE1a\nxEeIvITgZUE9x1CkhYd+6aVWKozRZIr5etzp9kDwlwLhf0LQ" +
       "xiIs8J5YNZxnn4FhHBIv1ZN53e/1\ng1JxnHgPvsJBHbWJiWvJgAektxC8zf" +
       "B7GE5Fw5GaRUYZqZMykoqqN68HAL4M/9l8iy249XNNoguR\n9xC8j+ADSTgB" +
       "piQDHo4P6DMREa7O70M+hQKdZyM13mQfs3dcEH8KvoR3UUhoMWS9ke41a9zb" +
       "CkQo\nv1uwBZTMRkRFsBXBNjdBR0Qkowjc/LcaETfBDUyMEbg7MJ6UGMFoUC" +
       "aMwM1HuRKIVBXB94NyWAQ/\ncDNYRK5EcBWCq918FJFrEFyL4CjyM9KEyI8Q" +
       "7DxKVv/nVA+RWxHcNr51kM2IiGwKwV1BaRYCmQ6J\nHRLpkI/gzZMQyPxGxJ" +
       "ufI9jjI4TCiHzN0XUVIo8geBTB1xLadyPyOIJff20yxk4fEHkKwdNHK3yv\n" +
       "X8ZzblaAyPMIXkDwohvrEXE9/h+DIjiC/UHBG8ExErm+vYTxxGwEb7phGhER" +
       "ZRH8Iyj8InjHDbqI\nBEXQsUMrIh8FECb6CR8j+MSNnBkZIaPHa4RchIjzME" +
       "d8E3EU0XNG/udm7iNi+djD97CJPyuWzOrY\nETynZmRydpNz9xLaKFmW4uX5" +
       "CDb7CRfjZS+CPv/+jLkHxyZhzJPZxcb3nRdkip4reQPobgiadgi/\nrQrRcY" +
       "oeM6U6ExE3f3AJFyBSSBMKaUIhTfh2Eo7zNIET4Ka71r3p7tQZTeBjBSd3kK" +
       "lD+zcgdQAQ\n6j42IuBXCI2X+CJaIdQVQt2RLLAQ6gqEQqjzPF9eY6QHNRoQ" +
       "6dYUIl0hoJFCQCsEtEJA++YSjvOA\nBiD0RkDwajua4JX/l3i+H/DyX0X5Ws" +
       "b4UWF4MYIl2OQPeoGE4yzoFWJbIbYVYlshth1jhOM/tnm/\nvpSxrfVoYhsi" +
       "3+Qbs0IoKoSiQigqhKJjjHD8h6LQHQGhaHUhFBUiDilEnELEKUScY4xw/Ecc" +
       "3283\n8XqdeCneV26C/9y90S6hQhCKEipO/RPL9LyzlFVNilfC2rH5w6prla" +
       "cvEi+q1/kLxbTr6eTS3Qfp\ngrOrYgGVisqZkVqk0REq3i7CKithUQQDxC7K" +
       "WxpiPX/j2i0TEuldteDkhZV/D5OiMYoN1dqNGyhL\nm7qnGAH0Vo64CtGsrE" +
       "3Jnk/tSMN5kWH1uTAvHyIqjuTUFPMPWuGvM1Jh+ifKj7CBT6Aatghfr2+E\n" +
       "zzQi/vh/JNYiqBPFggCEPxNnm1Uex61mk127pcdUkyqTz2NvnHnPmw+/vmGS" +
       "OD5RHK0xpz6Zd4wo\nkOaU6gAJc/JJ4L2f/s6cBy7f8NqgXcchQhiJqDoLru" +
       "zjTB2v65ldzop/F9ueidEUvvbEmZS6785F\nKkVBiMhERopGDDWOLCNTPJrO" +
       "GyZkglsiRXLb8XMyfNrtbW8P2vZcM+MRvZGREotXx8u/sNwCbrxO\nlziPfZ" +
       "GmD8O/mtLES08VDSqWrKnhq3yXW9jOV6+Oz7NCrupE+Mz6klV9EngAmDpGmj" +
       "IhgvVsIvPG\nWPmZwsvA+jWqJ3hhtcgEBI2ZHMvPPVb+Qj6WY3FoopSTajTL" +
       "QoJAzK3UhAKKxfy4rLGtYbyVpCKn\n4s/GZX0A/y8BRIGhTN6zRR71nFOD/c" +
       "oaV8RgdWzMUcfGDOxhqV3PDYvgTM02LbuGYGzu/i3zn0rV\n/l6oiVPnrxRr" +
       "V6Q1zVvOyIOXpEw6pPLTLhXFjVJ8rqsYqc4qKsdImYPyfT5L9GzlZcOwJ161" +
       "caVY\nlgn9B/Wn6MCeUgAA");
}
