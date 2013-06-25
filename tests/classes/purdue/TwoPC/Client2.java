package purdue.TwoPC;

import sessionj.runtime.*;
import sessionj.runtime.net.*;
import java.util.Random;

public class Client2 {
    final private SJProtocol TwoPC =
      new SJProtocol(
      ("H4sIAAAAAAAAAO1YTWxUVRS+M20pbaFUKQJSUJDW4s8UFIjSgtCxCDiU6hQw" +
       "ID+v8y7TB2/eG97c\nKW3E/5igMfgTwKAYNhAW6AIToztXpokmLlwYXLjChS" +
       "S6MMa4EBPP996be98bZgYEC2imi6/n3nPv\nOefec+45581Hv7C6nMMW5ngu" +
       "Z9jW3pgYy/JcDEOPSm5IcjFI5K7U+Hc9n1ii7UKURRKsPsMzQ9zJ\nCXZHYq" +
       "82onXlhWF2xW3T5ClBkrpHHdZZUarL8iQz7y/iSq5LDRumLlhnorC9y93UJb" +
       "d3hbZD0z1F\nmoD20F4yBbo8Je/UJ89sTR85FWWMdszI2uZY2rSFv8Nbs6b9" +
       "s82Jn764y1szp8SaTa7UXalLy9vm\nfrvmx4YamDw5a+cMnFqwWYnCJu9GBn" +
       "xO92g2O5qlq+7AbcXAi6nbyi3cbGVs3dhjaEMmTxg5cWla\n+5JPfz7c4l5J" +
       "rUkzgrUEbhprcPIHrixOzc/uZS99vfOPea7QSGo/e4FFXKNalZSEYe3jOsRP" +
       "WZTc\nsWH3oQU1dBnZA7VwEC29t5JTe3naKOXTSUJz0pyOcLt3BFOz0l1J4R" +
       "hWGofoqCAzIHKF+d746YFf\nD8E7sD2aHc1VjrKneYobI7zYIjh3WYVtG4nW" +
       "0nRxmUzeMlKakJF6Ztmr54+90vV7lNVsZ5O5yTPc\nEvQI5m0PHUxL7Rt0tB" +
       "Tv8xZ0J1hTxpMJMYLNUFHiRbQbyPKecLiWwBHbKz4kS7/8fNjbSnvxf5b/\n" +
       "fzoFYN4pmBqDqbHLTY2uva+n568Fj0JKlsT1kP45FTZoDV++37H8h9eirHY9" +
       "azQNi/fnkRkSrFnn\nKVODj+OmlnNNaKG3sscweb+W4f64McPFsK3LGSitG6" +
       "dgVzoHhx2uUUZo8ogYOIJNpYtS1rji55G9\nc8Q1ulaw+ZXYvtZJPYZliFVS" +
       "3TRx9QEoWGvRjCsUojqkwFUgOgGLBJuc20cxJuhFF9iNig24XzKW\nglgIaB" +
       "ehaJMrtgVXNFi2zuOmbSn+N5WPEsrY7lFCM/79NAiHF8sF8RDgYcDSiWCcVw" +
       "zBalN2dkyy\njoqrK28UcoGR9MxiKegEiB7AyrLKASsko1MEKpOW8+oILr5Q" +
       "lfqJhubbgkP/JmtF0HkrRSBLFovy\nrS5Iay2akWeJS3GrRSCRjxhUo0jMgG" +
       "MLO2Wbj9O7pUdl5UxN2I5gc8uxfEtnCn+GhxdKbYtBrAOs\npwgxuTbC45qp" +
       "+IfpnmSt9azpcxzbWadZOmWU9BZMwZLZpabl8RIFgZEWEP2ATYLVuQqlsnN0" +
       "oCJl\ncarcfFRINdPDE1LBU1JBVLA7i4TgrqWElsDIv6Xp7rI+PU1e2TTCHc" +
       "fQlVHfg9gC2Eo3JFdK/se0\nX+qD+wu+bgrFTKO7M44GSm69COJZwI6CaFR3" +
       "yX+MmpaQaDdb99r6mPsmAqNC4lVKHK4y05/qCIBn\nSp0NsE0dSlkG2CkZJ0" +
       "uahJBSJnkj6Rp9Iuy4GGbslowxCsWQgUk776T4Wipt3nMODP8VE88FnVjn\n" +
       "OkDyHgkG9B4HoWvpMT/4Buiq6MoCI9+LNU5e+i46KALNrhSRTA1zPW9yiudm" +
       "Sfvb62k7pMkX8RuI\n5wAHPe4TtiZfeOTzILdJE4JnsiK04oRaAXj5v8owyz" +
       "EWBa9gGl3QoE1tRpbKuxGo72eDiUV6AgsN\n1xFTC2TBDylvLAW8AeIw4C3B" +
       "pvhcRKJ0FTtAfbjUkdEMK7aRgJID/vly63LUiqoYc3PpEcBRwDHJ\nmEkmyU" +
       "KC/SXWNIM47jKorEEh9ZRtRR9XAyZ1cetsU+cOtdkXvjrY9+Trh7yvH0v1hv" +
       "S2VF/Ya9uU\n2snwprhtO7phoSblsbLNbVx9/XXjIO4GzAcsUL0iCK8jAqgm" +
       "jLq6q+u53dKthuX6uVOA0wDVsDWW\nYywNWxUr1cABVGfyIIhC9+N9P9+s7g" +
       "ugGiA3EFTLdF29FIg1gF6AamVcAX2AtWHGahBe1wHYUKod\nAci2wXs2XtsQ" +
       "YgT7CYDsA7y8nAQMhhiRKIgJrkKPgRgCuJ/yE1ICT4IwAHsnTEf5MgsiC9h/" +
       "vcrP\nhXXkVfUEcQDgfjTL74ao61CVyJ8vVekAL5YqcoBbpCDd4NoGeFOVMx" +
       "BeNQK8XapMAd5VxQlEqUpT\nvgSBOF6C0RxmfAD4sEy16L6eagFCZfKblvsB" +
       "Z6v5vZrf/4Hyan6v5vf/S353GSdCnwjr6fspje+m\n+rhpcEsskQlfZp5rTf" +
       "jqR9iSP94CihL+FX62BdzYhF/N69W8Xs3r1bzObu28ThCZq1J4uIN3vd/8\n" +
       "N817pVbIIAAA"));
    
    public void run() throws Exception {
        SJServerSocket ss = null;
        try {
            ss = SJServerSocketImpl.create(TwoPC, 7104);
            ss.addParticipant("Coordinator", "localhost", 7103);
            ss.addParticipant("Client1", "localhost", 7102);
            SJSocketGroup ps = null;
            try {
                ps = ss.accept("Coordinator");
                System.out.println("Client1: connected to all participants");
                Random r = new Random();
                Integer i22 = new Integer(r.nextInt(4));
                Integer i12 = new Integer(r.nextInt(4));
                SJRuntime.send(i12, "Client1", ps);
                System.out.println("Client2 numbers: i12= " + i12 + ", i22= " +
                                   i22);
                int result = 0;
                Boolean commit = null;
                Integer i21 = (Integer) SJRuntime.receive("Client1", ps);
                try {
                    result = i21.intValue() / i22.intValue();
                    commit = new Boolean(true);
                    System.out.println("Client2 result: " + result);
                    System.out.println("Client2 ready for committing.");
                }
                catch (Exception ex) {
                    commit = new Boolean(false);
                    System.out.println(
                      "Client2 local error, ready for aborting");
                }
                SJRuntime.send(commit, "Coordinator", ps);
                commit = (Boolean) SJRuntime.receive("Coordinator", ps);
                if (commit.booleanValue() == true)
                    System.out.println("Client2 committed transaction");
                else System.out.println("Client2 aborted transaction");
            }
            finally {
                SJRuntime.close(ps);
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
    final public static long jlc$SourceLastModified$jl = 1342028691000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0bbZAUxbVn7/tD7oMTkQMUOBUS2IuUWioogQXkcDnOuxPl" +
       "iB5zs317A7Mzk5ne\nu8UYg5goaoWKEdRYKj9iyoqaSsBSk9IyqYqGqDEmWg" +
       "FiiX80iZaaxEolUhFN3uue6fnYvRUl+FG5\nq9p3b+Z1v379+n313rsH3yZV" +
       "rkOSLnVd3TI3JdkWm7ocWkObqMbcZN/qHtVxaSZlqK7bD4RBbeMH\n+ro9Ld" +
       "tWJYgyQFpNa6mhq27/iGPlsyP9I7pbcMiptmVsyRoW8zgW8Th/zpGx39ywur" +
       "2CNA2QJt3s\nYyrTtZRlMlpgA6QxR3ND1HGXZjI0M0BaTEozfdTRVUO/CgZa" +
       "Jizs6llTZXmHur3UtYxRHNjq5m3q\n8DX9l2nSqFmmy5y8xizHZaQ5vUkdVT" +
       "vzTDc607rLFqVJ9bBOjYz7VXINSaRJ1bChZmHglLS/i07O\nsXMlvofh9TqI" +
       "6QyrGvWnVG7WzQwjp8RnyB13XAwDYGpNjrIRSy5VaarwgrQKkQzVzHb2MUc3" +
       "szC0\nysrDKoxMG5cpDKq1VW2zmqWDjEyNj+sRJBhVx9WCUxg5MT6Mc4Izmx" +
       "Y7s9Bpra1ufP+mnndPhRMH\nmTNUM1D+apg0Mzaplw5Th5oaFRMP55M7u9bn" +
       "pycIgcEnxgaLMUtPe/TS9Os/P0WMaS8xZi23xUHt\nyDnTZ7yw9LW6ChSj1r" +
       "ZcHU0hsnN+qj0eZVHBBuueIjkiMekTf9H7q/Vb76dvJkhtF6nWLCOfM7tI\n" +
       "HTUzKQ+vATytm1S8XTs87FLWRSoN/qra4s+gjmHdoKiOKsBtlY1wvGATQmrg" +
       "o8Cni4ifegSM1KcM\nnZpsYdLdBCbDqMvcTtfROu28k8nTzoU9qc5gRAHZTR" +
       "pTFNjJ9LhXGWCCqywjQ51B7b5Xn7l6xcU3\nbhdnhHblCcJIm+Cc7B+zelJJ" +
       "jzdRFM50MpqeUM1Sx1G3oEsUrn1hxvf2qXeDomHDrn4V5ftRxioR\nwqSFZS" +
       "NGKvC3LsBUMIdBrW3r69PufPGHTyVIRcmokZYvV1pOTjXw4H03afWWi1PAXj" +
       "riVltq7b/e\ntOah/c8emhvYLyMdRW5VPBPdYnZc6Y6l0QyEnYD97f9e9fdb" +
       "q857OEEqwdcg2jAVbARcd2Z8jYh7\nLPJDDe6lIk0ahos2Xs9AQWOhDSNsRN" +
       "AsDAPOoi0mII9Sh6+r/tKBxxue4jv2A1pTKPL1USbcoyU4\n/36HUnh/6I6e" +
       "W3e9fcOGCnBI2xZnzki1nR8ydK0AU06KehSKl0GzeWvvouYdC9xH+BHX6blc" +
       "nqlD\nBoUIrBqGNUYzg4yHoJZQuONRBjTROATRCgLfoAGMxF5tZRTMs0Q8SE" +
       "5t23nbvLsOYMSwuWKmoGdx\nSUmBv+hQEM4tIuLzDLTgtmDb4OObxQYa5/Vd" +
       "sXrj9tl852F2872HgmQY+MJZZX1hJWYWsBlmQYgJ\nTGbjzQcvWXP5ZZ0i6J" +
       "1ZlkU3+HKG8wnm7+oylzxx4n4zgVZS7W6S/p4mCZcxMjfts/QsDx8F1re6\n" +
       "T5D8wD//wzcQLKxf/a9r9z6/qxEWHiA1urtSN1UDT9vtFt5bIinEWFz1xKX3" +
       "HH6OvcJtM3AXFH96\noTjKrVNDnnzu/tGW6p/sziVIzQBp5oldNdk61cij5Q" +
       "5AanZT3ss0OSFCj6ZZkVMWyXAwPe6qoWXj\njloZ0nYljka8VvgmH9P0H/Hz" +
       "AX7QcPBBBP/WlJWzIWM4p15EYdMqoxm7oCg2TjuXT57J4SxhfwkG\nS6OKGa" +
       "mxHX1UxfqIVPFIzsdNZqRdnp+TN5meo1i0eRbHg4TCnWEJ2GpH7KilVSTRKp" +
       "hIyPv2L95r\nsumv8vOp8SoxLIeC6AEp0gD18RzrgJuV4yptbVDz8qAiopI2" +
       "ohsZlGwh8JhT1gjF9Ftq+u67LLvz\n3oTnyA02j2CnB64cyOV2XGrmrIw+rP" +
       "MQBM59pOm0Mx9+a0ezSAJBmAEH+HAGwfuTl5Gtz1757kzO\nRtGQR8qLQvNl" +
       "TDijnEaW0axeSiHVTHWylIm0DdsqwyPE4nzj9n0/6Hlnu6+U5TaG6HJH0ks1" +
       "qo/S\nuAQYiM4uM20N4FBOgv3m8qau8TJc8Ljv7OsO3rat858Q9zeQWmrQHB" +
       "QYYDEzN0TqWgjw/Q5ULCvE\nAPCqhpzg2e/7UEwJwX5OK2tiZqZ4Mzh3rS0C" +
       "dq/3uxsMJu/4ciVRrmSxXImVX1i8+P3Z5/H0AuxS\nsH57mQlq3VN3nn7OoW" +
       "9B+u8i9VgedufRZ9JkEsYWFet5nua8kFGLFWN3EELqxZ2gOyjZCKnaBxeV\n" +
       "YE2ok6gKF4wGgSSRwsgJoKhAGs7+cpC3nX3Mc2RkVjmyt2r1Yt3U2YVyuSZ2" +
       "9NYGtWjsDWeKrDZK\nhhciMoQAxte6m8GgGPijT64PyAiCfZ+FyJUI4DYUNi" +
       "05YiA8os60MjRlWGZA/235rURiGd9K5I2n\nnzoGZVSMLyI8FucQmMeDcDAg" +
       "MFKpWfYWSdrFji7wg8mFnuTJbJKM7kJkFMHYuIsjYJIwl4Uiu+qK\nnI6K96" +
       "N6N+C4ckv40dMkz62S1QUsFBLjrDypfW5tsTdyL1+X7NaHz3pUh0thKG0uB7" +
       "/F2cvyOt6u\nIJSNS/NknTSEj7zSwQFymUWIbENwHZiGQdVRmoJqWNJ3gIJk" +
       "wSPEWOE4lrNKNTMQSrLr8JUFEpxc\n6rXc1/U+Q6UZke0IboRCgS8oF9vDyI" +
       "zYYt5XLnKZydEXcoGb5QJQkkyLMUElSw7NoSdPOZP5sBWZ\nLBzH2lHqOHom" +
       "EOqPiHwHwS2gITlS0n/EQpcAPHf/kBsixlLPZ6awppBT30DkNgS3+6yxEpD0" +
       "JYxM\njbDmYXqZldnCnSH05EfcYBG4xkk+7wVbQPDdUntDsDPYVCAZgjskYX" +
       "dJkdCkApHEkzyae46HHG9E\nCXdKwhYwxYiAfVbe0ehKyGnCj0OP/xMR94QP" +
       "sYofgKSdGzboYQdN18wkPePrAVWBykJP3ilWQJ3s\ns0j0s9B3TpJFnzYCl3" +
       "wDXX+SxL3pNTAduUmP+AciDyN4RFAvslTp4cpPw9QGlTGas1lkxF3BCASP\n" +
       "TRA+EYIxHmFe+MSa4Dz7Lby1QRmih+qQB8JxUBqOf72DWOGjvtlo4lkyuAmR" +
       "5xH8juGX1JyKjiMt\ni4zBhVGukYNrcnINAIhl+MvjWwWXVCdwiW5E/oBgP4" +
       "IDknASiCQTHs4vMWYSIi9xAqRfXNC/ZLYE\nxegyy4K0AlI0pCzLycDtFNwr" +
       "j+PW8WrZY1a1DxFecm1A8JWgQEVElGEIgsoPSsmjK/R5vRA8jldE\nvobgTw" +
       "gCrdePRzgrKtVIqaoRQVAOLUDEL7nEdfbTKvkQBDawC5GgTjumAg6RryG4Gk" +
       "FQP12AyDcQ\nbI0S1iMiKh4E3yxVCiGQJQvZgYgoWSKEcC2DQNYgIid8G8GO" +
       "CEFJIHKcM+ASRLgm70ZwXNLvbkS+\nj+De47bG+CkekfsRPHCsi++JrvHjIH" +
       "Mjwql7ETwU5GNEgqj8aKksi+BnpRIsgs9Idvn/JRxNXkXw\nXJBKERGZEMHv" +
       "S6VIBC8GiRGRUllu/PSHyEslCJOihJcRHBonuS07luSGSJB4PrVUheDNiXQ0" +
       "kY4+\nwuIT6WgiHX1eCZ/zdMQJ0QtYF1w1s3jFrBG9HGfK/LT0WPNT8L16ye" +
       "/jEcTy04d8E4/gk81PE2lo\nIg1NpKGJNPQZI3zO0xAAZXOQcaL3I/7H9tXi" +
       "b+yR9hXeeDLHa8kiCEVLlt9P5Tqh7+9jbae8ZfaG\ny99pvF598grRntAabT" +
       "xbYeZzZ+8+SOd9uVEr0fZYxyx7gUFHqfimHbu2EqKpBpZdULbfZA3/i3zQ\n" +
       "dlTRt2TeGfMb/pIgleM0L7Z4L3spyztmqKEBRqsfuavxlJhS4vK0jLZfUjGi" +
       "/zrB25FEB1NR83F0\n0qJo31K9ExWUH2E7F6AJiwH4nIz2QcQP/43EFgStov" +
       "kQbWKvONtx2u1KEv3WOXyGwmZyUNisKGjU\nxi/Zkb/yhPeXmuKGsh5Hz+lM" +
       "9hDcMvPePz/0am+bsAHRij2nqBs6PEe0Y/tNRLDCrHIr8NFPfnHW\ng9f0vj" +
       "Lk9ZYojzJSOWrpGdyc8nTUquMPymNSsajITvgs9xS7vJRiix2JZ/A5jFS7vF" +
       "G+vGKLe7l5\nZ69Q1t6KjncSj03p4M2qlUOqKztvIk3wxT3ukdZ1Lme93NUs" +
       "+JxRZlf+WTeH22iwL6akUWD5qBws\nKAS74pSXx9HGBSK2gE4MamYZLzKVfa" +
       "LTR3kGbAd2gOiBQpH7F1se79fARi+fJvpDdSsp/+0AiMXt\nn7jA40JcvtbH" +
       "dIlQe6ryBv4tQbaPRJUmuhYLZY8feTzJOT3v/Q2HW2iRnSoh5UTeFGSYX4jt" +
       "dVPj\nruH9x4E2+4WNc39ptzwtLMn/r4AabHDKG0a4RzKEV9sOHda5+dSIjk" +
       "mby3qYARZqUw83OSrvijHv\n8S5kHINPR7h1/K2g/Be/qM/bxjIAAA==");
}
