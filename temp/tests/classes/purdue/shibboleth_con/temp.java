package purdue.shibboleth_con;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class temp {
    final private SJProtocol pDisoveryService =
      new SJProtocol(
      ("H4sIAAAAAAAAANVXXYwURRDu3bvl/uA4OH7k14h354FmFxUIcidwt9zBnXs/" +
       "yR5oQIHemWZ3oHdm\nnKk9do1RozFBgyQqSmJI9EHDg/qAidE3Y4wh0cREHw" +
       "ya+IQPkuiDMcYHMbFqZrZndlkWYvTBS662\nuqvrq+qq6u6a935hCddhfa5w" +
       "XcMyjyehYgs3SUOfy05mBcwhe0S79O3wByasvRJnsQxrK4piTjgu\nsBWZ43" +
       "yep0pgyFTaklJogEhDZYcNNkX1RD4y8/9iHnJCKxhSBzaYqaqnPKWUUk/VqJ" +
       "OlO+ssEbVy\nx9EVsuUbebkte+Hh/Nm344yhxnLbkpW8tCDQ8NeM9H+0P/PT" +
       "J7f7a9Y0WDPjoR7Rrm1bu+6bkR87\nWsjldttyDdo1sNsyVSU/IrOBZKhs22" +
       "UbQz1A0UqSLBlGy+3bbxYt3Thm8JwUGcOFa4v77/3w5zM9\nXkhaJc4A64lE" +
       "mtbQzu+5OVw4v2qUPfPl4T/We6Ax7XH2FIt5Ti0LUTKGeULoBL9wY/axyaOn" +
       "NrRg\nMOyTrZQgXHpXk6SmR0XeuC6nFMqBJloRpR3y3KV3Zn89RUrkXdwuo8" +
       "lNTZRnSpBzuKkVGllt5uto\nQ634QbbUcPcIW5i6MEFWaIFORclRGVhvJAX7" +
       "uFuY4vZQxNP+phVv6o2c3NpEZwp5nscMFosl09A4\nqCNzYetzl19/NvV7nL" +
       "UcYu1CiiK6iw6uP+R7KLmZT2WBayfmHK6JMX/BUIZ1FX1MggG2PCxX/2h5\n" +
       "JyrDFgB38gJrbmkNnGOYebVfu+RUzSVJnrzeXHx80/DwXxseoJ3auOUdGKM1" +
       "TRR4x+dvDGz74fk4\na51gndIwxXSJrpkM69aFJjnZT0vuuuTCajx4xwwppn" +
       "lRBOPOooCCpasZMpq4hCcntDlXcATH66XL\nZ5IkAbYINxt648GvR3/XwD9M" +
       "D7A7mokDqwuGDdOAncrcYrjFCgK2JDr04AhkQEHtJGaQyEZg7e4J\nrBDAi6" +
       "Eq7gzFRO5Wgi3E9BHph5paUSsORld0mJYu0tIyQ/lXcOsXP7BldTNBZDrAEf" +
       "W4xNxH5H4i\nW24uuBwKgLVqll1Rotfg1t48LJ3ISMV5swI6T8wOIkM3NE5k" +
       "uxIMQuS54q7/uFAYq0/VNPJBisNh\nEJdWiKbiQYhcrPVQgddVtGV1M2ovIw" +
       "puN0RuzHkDHy6EmXUssDRL7sHzh4fDdCUHywG27kaiwNOV\nEMyI2oXK2mZi" +
       "xonsxXxLwedFmstQfgbjpB5g35sxx7GcfdzU8WbIH6Ap8mRVo2m1vckqYKyH" +
       "mAyR\nKWAJz6AydhE3VGcsjc+5KIMy01s7oQzMKANxYKvrQCjWCqEnMgqi1O" +
       "stG9PzmJWZeeE4hh469R0x\nc0T2Y4TUSiV/H/WVPUp/NdddNTXT6WmmqatS" +
       "qleJ8U7yoSo0PflKvgs7mRpo79YdtfSKdyYio+oF\nGhpxRHjP/BlugciBRn" +
       "sj8ki4qdAzIo8qwZsNXaKSCl3yRyo1uf/Cj6u1gsNKUMFSrHEwa5UcTYzj\n" +
       "E+Uf58jwX3HxYjSJCS8BSrY9WtDHHCpdU08GxTeLocKQRUZBFluckspdfA4i" +
       "HbCCyGoFoZekwHru\nVnyg3obqhKZOxG/EVIg84Uv3Wlyd8NjHUWkXBxBFG2" +
       "pWnA9XEHn6/yqQNxJsjIZgMQZozsJ2wcbH\n2oi81u9GLxaVCVpoeIlYVGWr" +
       "edD8sQJ4kZjTRF4CtjCQUiWqVLGT2OspG0VumMkpJHg50E+Am3Cx\nLQxrbJ" +
       "qYV4i8SuSsEqxEl9RDQvoN1nQTc84T4LNGBrE3XFv3xTUrsRvbZ0ldONjyXv" +
       "niybGHXjjl\nfxKZYY9X09/5TSqW8oQ+yxBySfhpEzTsibbvP/1sxdGvW1h8" +
       "HJtMi+vjXMNzMIFdB/aEbgHtle1d\nu70mfeHJdqQ9+B9HsOVqVx5gdjLDc0" +
       "JGPh8mWHsBraTx/s2wFslztR20//U45PXCI8BiI7YXj7dw\nOIrDUbvsNdfd" +
       "fwNEj4dnlw8AAA=="));
    
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
            boolean doAgain = true;
            boolean ex = false;
            Boolean doAgain2 = new Boolean(true);
            String req = "hi";
            String res = "";
            String ticket = "";
            int count = 1000000;
            int i = count;
            if (ex) {
                { SJRuntime.outlabel("A", s); }
            } else {
                { SJRuntime.outlabel("B", s); }
            }
            SJRuntime.send(req, "IdP", s);
            long duration = System.nanoTime() - startTime;
            System.out.println("Each request has an average latency of: " +
                               duration / (count * 1000.0) + " microseconds");
        }
        finally {
            SJRuntime.close(s);
        }
    }
    
    boolean isAuthorizationExceptionResponse(String str) {
        return str.equals("AuthorizationException");
    }
    
    boolean isExpiredExceptionResponse(String str) {
        return str.equals("ExpiredException");
    }
    
    public static void main(String[] args) throws Exception {
        temp a = new temp();
        a.run(1);
    }
    
    String repeat(String str, int n) {
        String str2 = new String();
        for (int i = 0; i < n; ++i) { str2 += str; }
        return str2;
    }
    
    public temp() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.3.0";
    final public static long jlc$SourceLastModified$jl = 1364405761000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0Za3AdVfnszePmRfNoWkqTvlPaYrkRhmIhhTZJkzblJg1J" +
       "KBAG0r27J8m2e3fX\n3XNvbpBhiigFnKkiLSBT5Q8Oo+KMFPExOqgDWBXREb" +
       "BUOzDO4AMU0I6D7Sig33fO7tm9j9wWBv1l\nZu7J2fOd8z3O9zjf+c6jb5Iq" +
       "zyUJj3qeYVt7EmzWoR5v7dQeqjEvMbpjWHU9qveaqueNAWBC2/2e\nseux5k" +
       "9ujxFlnLRYdrdpqN7YtGtnpqbHpg0v55Lljm3OTpk28zEW4bh81TszP9+/o6" +
       "2CNI6TRsMa\nZSoztF7bYjTHxklDmqZT1PW6dZ3q46TZolQfpa6hmsbNMNG2" +
       "gLBnTFkqy7jUG6GebWZxYouXcajL\naQaDSdKg2ZbH3IzGbNdjpCm5R82qnR" +
       "lmmJ1Jw2NdSVI9aVBT9z5ObiWxJKmaNNUpmLgwGUjRyTF2\n9uM4TK8zgE13" +
       "UtVosKRyr2HpjCwrXCEl7rgKJsDSeJqyaVuSqrRUGCAtgiVTtaY6R5lrWFMw" +
       "tcrO\nABVGFs+JFCbVOKq2V52iE4wsKpw3LEAwq5ZvCy5hZEHhNI4JdLa4QG" +
       "cRbe2sbnj37uFTy0HjwLNO\nNRP5r4ZFSwsWjdBJ6lJLo2Lh6Uzi4MD1mfYY" +
       "ITB5QcFkMad79bevSb72g2ViTluJOTu5LU5o71za\nvuT57t/XViAbNY7tGW" +
       "gKeZJzrQ77kK6cA9a9UGJEYCIA/nDkx9fv+yr9S4zUDJBqzTYzaWuA1FJL\n" +
       "7/X7cegnDYuK0Z2Tkx5lA6TS5EPVNv+G7Zg0TIrbUQV9R2XTvJ9zCCFx+Cnw" +
       "GyLirxYbRuKMpp2E\nt4eRyxj1mNfpuVqnk3H1DO30po1UyjbBSDrBarPUQl" +
       "ZVc8L3UK/TX5tDKvNmFAUEbC90NhMsc7tt\n6tSd0B559We39F11151CdWhu" +
       "Pn9gWIJmIqQ5ATQTSIEoCkc9H+1S7Fu366qz6C+5255f8oWj6hdB\nC7Abnn" +
       "Ez5cIqM5XYwqKLy4aT3tAZB6Cngq1MaK37Xlv84AtfeSZGKkqGlKQc7LfdtG" +
       "qiVQQ+1OKT\nK4SAMXUUmnQp2m/dPfj4sWdfXhsaNyMdRT5XvBJ9ZmXh1ru2" +
       "RnWISSH6+/+5/W/3Vl32RIxUgiPC\nBjMVDAj8emkhjTzf6QriEMpSkST1k0" +
       "WC1zHYoJmIwNg2YNMkzAN00VrAIA9hp2+v/uhL369/hksc\nRLvGSFgcpUz4" +
       "TnOo/zGXUhh/+YHhew+9uf+GCvBWxxE6Z6TayaRMQ8vBknPz3Q3Z09Fs3jjS" +
       "1XTg\nQu9bXMW1RjqdYWrKpBCeVdO0Z6g+wXh8ao7EQh6CYCcaUhDKICpOmI" +
       "BIyOooWTDPEsEisaj14H3r\nDr+E4cThG7MQ3Y5zSnJ8oEPBdm0REL+XoAW3" +
       "hmJDANgrBGhYN3rjjt13ruSSR9Gt9z9yEmHoC5eU\n9YV+PHbAZpgN8Sc0md" +
       "2fOX714HXXdoqIeFFZFEPg0TrHE64/NGBtfnLBMSuGVlLt7ZFenyQxjzGy\n" +
       "Nhmg9C0PP0VvdMeoAAWnwvozCxASNm75x21HfnmoAQiPk7jh9RsQu1Db3pDw" +
       "3hInRgGKm5+85kun\nn2OvcNsM3QXZb88Vx7pdasSTNx7LNld/46F0jMTHSR" +
       "M/9VWL7VLNDFruOJzbXq8/mCTn5MHzz2Bx\n4HTJcNBe6KoRsoWOWhnZ7Uqc" +
       "jf0a4Zt8TuO/xd97+EPDwQ9xMrT02mkHjhN3+TYKQquM6k5OURxc\ntpEvXs" +
       "rbFcL+YgxI4xbDmeK4RlbF5Ik0OVsNz85SdxYypqzhJynzGWmTqnQzcK6kKS" +
       "Z3vvHxeKFw\nv9gMZttRoHVpIAk0ECYO7qPHNh2xWPurXFVxP2PDtCkMJHCU" +
       "mrCT/Cx2wePKYZVmN6H556UiApQ2\nbZg6cnYx4FhV1h7F8nvio49cO3Xw4Z" +
       "jv0/UOD2bnh14d8uV1XGOlbd2YNHg0Aj9/p3H1RU+8caBJ\nnAdhxAFfODOC" +
       "cPy8HrLv2ZtOLeVoFA1x9PoBab0MD2vK7EhvD50yijYEI8L5ZVZFFl1u3n/0" +
       "y8Mn\n7wy2YauD8fmCMot3ZljKBaOeLkW1HK89JVdBEGgxvK3UgfQJMhlzVh" +
       "wGoFEVFjMyP2Ip21VvelB1\nuiKcri5rLpZeiskNZdYMQh/yYfCxdMYyNH6P" +
       "EDge2XD78fs+2fk2nE03kBpq0jSwCwwuvSEvMYdD\naMyF3KpPTADPr08LnG" +
       "OBn0O8Zao7RZnIsnxhINEKcCUQV6IYV6z/gk2b3l15GT+2QJ5u2IC2MgvU\n" +
       "2mcePP/Slz8NacUAqcOcdCiDDpgk8zBmqXiJ4MenH4pqME0dCkNTnbiIDIUJ" +
       "ISFVRyF6hDQh/6Iq\n3GrqRSeBEEbOAeFCbjj664DfNvYB956RFeXAPtXqTY" +
       "ZlsCsluUZ2luYBCUX0k6NDJLslqiuxk8IG\nJtd4e0H9DNw6ANeFYGxCiS/B" +
       "zk3YwOUraghyxnh0Rq1l67TXtK0Q/gt29iGRkdaCEX9nahkkZgV4\nscNDeh" +
       "ob68yA4yGAkUrNdmYl6BA7u9MATCfyJfd5j0R0GDvcLzJzEsfGlYC1LBLuVU" +
       "+c+biNQagf\ngr6v4vDT3xd+9kpUV7BI1CxE5XMdYGstGJGyfEKiuz6quawB" +
       "N8rIWboV/A9X92QMvINBGJkT5vM6\nL4WfPBPCCZJMF3b2YXMbKNqkapb2Qr" +
       "Ys4Qdgg2RCJNjoc13b3a5aOoSEqV04ZAMH55UalnJ9KkCo\nNGHnDmz2Q27B" +
       "CUpijzGypICYX6+RZObnD0gCd0kCMRapMwgkuMkSQ1Pky9+c+Xxanz4F6tgJ" +
       "aY1r\n6CFTv8HOAWw+CzskZ0r411nkkoB6D5Rcn2csdXxlLyYacunr2DmIza" +
       "EANaYHEr6ZkUV5qHm47bH1\nWe4Mka8gcoZE4Jon8fwrFAGbz5WSDZvPh0KF" +
       "nGFznwQ8VJIlNKmQJfElVXP4v8HH6/mAByRgFkwx\nj8FRO+NqtB/OJuHHkc" +
       "8PhcXHokqs4gqQsI1Rg5500XQtPeEb3zBsFWxZ5MvXYgUkzwGK2BiLFKwk\n" +
       "ilFtmuoZE11/nuz7y+OwHLFJj/g7dh7H5psCus1WpYcr34lC61WGxRmWN+Nw" +
       "OAOb7/4f8D8BmHMB\n1kU11gj6HLPxVgdJhRHJKr4WjYPScILrH8SKoBuYjS" +
       "a+JYK7sfMcNpBFNPhQdBxpWWQGLpSSRhqu\n0YlBaCCW4T8fbxVcYt3QJYaw" +
       "8wI2L2Lzawk4F1iSBx6uLzFnHnb4Yf4iHL9IMLh5NkUTWcxMwY0G\n9GGSX2" +
       "HyrwBV8d/+6KmFu39VQWL9kNnaqt6v8robpDqQiHrTtqnnnM1beNrfMFMDbR" +
       "NehgHZAski\nRzi6I6mmqBm5kAyQmmmg0guxP0kqTJXndZeKhJsRpVvcz34H" +
       "nz3w2ePkeAa/I1d89+ZX5VV+PYlg\nuzavGATcLJmroM4fA/Zfd7LhDvXpG8" +
       "W9pSW/atZnZdIbHjpO121p0EpUbmuZ7Vxo0iw1ZcmpitPF\n15wLy96QB3na" +
       "H9ZMKkY3r1uzvv5PcI+Yo/La7A+OUJZxrchNB2ar77sku6xgUwr5ac62XV0x" +
       "bfwk\nxmspovxS9KySv6grv+hS5+YzylXYJkovsEVoL6vgt8A3C/4fgc3YtI" +
       "jKKTZ/KFkrDEt7hYWsYddI\nG8zI+k8f9yx9+I+PvzrSKtQn3odWFT3RRNeI" +
       "N6KgYgEUVpSjwGc//ZEVj9468koquOL/GRwLXLx0\nmTNg3XfK+aFT9uU06m" +
       "B84khORg65tx2B6zR4dNY2dESpkGgVA7uncnOMvCW3Hd9BNuCh62/7xlLb\n" +
       "Xuxmc1RslZDSiTPWdJUqRpYbXncGjMb13w+lxCPUcyAu00Jp4ynbhvzX4gLP" +
       "KxTvRJHAJ0oJ3Am/\nTb7Am+awMyX+IUgI6lxseH05x3CpXiQbF+EDC4K/Nf" +
       "Db4guy5ew0F+MBEm7uHn/aLW+Sxa+P/LlJ\neNKRio6Tse8t7OAvKJUp1ZOl" +
       "lrxn2+JX2bzHVs5nnZTqPPgtO4NUJ0q6Dt77ldU5hWBZVlkzh+RX\niPMB5D" +
       "cpnHf8VfAULugInwliYnoJh+T3eawnBjDxImHYCfkKDsDiBwf8/qvgj9OaO4" +
       "6d7YOIchEk\nCZosL+Qf5qJOnjujj77LMbX7WQEPISUDSbA5xSP5frUCftt8" +
       "xW17f34VC1V0IhKoyu3AlaBElzpU\n5cWLE0poGutLIysezmE9AlJ3LEMvKo" +
       "zq/gu+tvL53Wufcpp/Kuw8eGWPY+0uY5rRZ4VIv9px6aTB\npY6LRwaHMz3A" +
       "yIKS77twJ8kfQJaV7WJVkj/l4Sr8GuQW/rGc8h8tSoH1KCIAAA==");
}
