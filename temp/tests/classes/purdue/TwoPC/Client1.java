package purdue.TwoPC;

import sessionj.runtime.*;
import sessionj.runtime.net.*;
import java.util.Random;

public class Client1 {
    final private SJProtocol TwoPC =
      new SJProtocol(
      ("H4sIAAAAAAAAAO1XTWxUVRS+M20pbaFUKQJSUJDW4s8UEYjSgtCxCDiU6hQw" +
       "ID+v8y7TV968N7y5\nU9qI/zFBY/AngEExbCAs0AUmRneuTBNNXLgwuHCFC0" +
       "l0YYxxISae77039743zAw/tYKms/jm3Hfu\nPefce84959yPfmE1OYctzvFc" +
       "zrCtoZgYzfJcDEOPSm5KctFP5J7U2Hddn1ii5WKURRKsNsMzA9zJ\nCXZHYk" +
       "gb1jrywjA74rZp8pQgSZ0jDmuvKNVleZKZ94u4kmtSg4apC9aeKCzvcBd1yO" +
       "UdoeXQdE+R\nJqA9MESmQJen5J3a5Nnt6aOno4zRillZ2xxNm7bwV3hz1rV+" +
       "tjXx0xd3eXPmlZizxZW6J3V5Zcv8\nb9f9WFcFk6dm7ZyBXQs2J1FY5J1In8" +
       "/pHMlmR7J01G04rRh4MXVaucVbrYytG/sMbcDkCSMnLs9o\nfejTn480uUdS" +
       "bdIXwZoCJ4052PkDVxenvs/tZi99vfuPBa7QSOoAe4FFXKOalZSEYe3nOsRP" +
       "W5Lc\ntWnv4UVVdBjZg9VwEE29t5JTu3naKOXTKUJz0py2cLu3BVOz0h1J4R" +
       "hWGptoqyAzIHKV+d7Ymb5f\nD8M7sD2aHSGDWitGmaUXmwPPrqiwZjPRWppO" +
       "LZPJW0ZKEzJMz6549cLxVzp+j7KqnWwqN3mGW4Ju\nwIKdoV1pqf39jpbiPd" +
       "6EzgRryHgyIUawWSpEvHB2o1geEnbWFNhfpVv0NE9xY5hfuUUsb6bl+J/p\n" +
       "/8+hAMw7BWtjsDZ2pbXR9fd1df216FFIyZK4LjJhXoUFWt2X77et/OG1KKve" +
       "yOpNw+K9eWSGBGvU\necrU4OO4qeVcE5roruwzTN6rZbg/rs9wMWjr8guU1o" +
       "xRsCud/YMO1ygjNHhEDBzBptNZKWtc8QvI\n3nniBr0r2MJKbF/rlC7DMsQa" +
       "qW6GuHYHCdZc9MUVClFtUuAaEO2AJYJNze2nMBN0owvsesUG3C8Z\ny0EsBr" +
       "SKUMDJGTuCM+osW+dx07YU/5vKWwllbHcroS/++dQJhxfLBbEM8DBg+UQwLi" +
       "iGYNUpOzsq\nWcfEtZU3CrnASHpmqRR0EkQXYHVZ5YBVktEuApVJy3l1BAdf" +
       "qEq9REPzbcGhf5LVIui81SKQJYtF\n+VYXpDUXfZF7iUtxa0UgkQ8bVKNITJ" +
       "9jCztlm4/TvaVLZeVMTdiOYPPLsXxLZwv/Cw9PlNqWgtgA\n2EgRYnJtmMc1" +
       "U/GP0DnJWutZ0+M4trNBs3TKKOlt+ARL5pb6LLeXKAiMNIHoBWwRrMZVKJWd" +
       "pw0V\nKYtT5eYjQqqZGf4gFTwlFUQFu7NICM5aSmgKjPxTmulO69HT5JUtw9" +
       "xxDF0Z9T2IbYDtdEJypuR/\nTOulPri/4OuGUMzUuyvjaKDk0ksgngXsKohG" +
       "dZf8x6hpCYl2s3W3rY+6dyIwKiRepcThKjP9qbYA\neKbU3gA71KaUZYDdkn" +
       "GqpEkIKWWSN5Ku0SfCjkthxl7JGKVQDBmYtPNOiq+n0uZd58DwHzHxfNCJ\n" +
       "Na4DJO+RYEDvcxC6lh7zg6+PjoqOLDDyvVjl5KXvov0i0OxKEcnUINfzJqd4" +
       "bpS0v7yWlkOavBG/\ngXgOcMjjPmFr8oZHPg9yGzQheCYrQjNOqhmAl/+rDL" +
       "McY0nwCGbQAfXb1GZkqbwbgfp+LphYpCcw\n0XAdMb1AFvyQ8sZSwBsgjgDe" +
       "Emyaz0UkSlexg9SHSx0ZzbBimwkoOeDPl1uTo25UxZibS48CjgGO\nS8ZsMk" +
       "kWEqwvMacRxAmXQWUNCqmnbCl6XPWZ1MVtsE2dO9RpX/zqUM+Trx/2Xj+W6g" +
       "3pbqm+sNu2\nKbWT4Q1x23Z0w0JNymNmi9u4+vprxkDcDVgIWKR6RRBeRwRQ" +
       "TRh1ddf2rHBLtxqW6+dOA84AVMNW\nX46xPGxVrFQDB1CdyYMgCt2P936+Wd" +
       "0XQDVAbiColmlcvRSIdYBugGplXAE9gPVhxloQXtcB2FSq\nHQHItsG7Nl7b" +
       "EGIE+wmA7AO8vJwE9IcYkSiICa5Cj4EYALhP+QkpgadAGIChCdNRvsyCyAIO" +
       "jFf5\n+bCOvKqeIA4C3EezfDdEXYeqRP58qUoHeLFUkQPcIgXpX65tgDdVOQ" +
       "PhVSPA26XKFOBdVZxAlKo0\n5UsQiBMlGI1hxgeAD8tUi87xVAsQ6k1e8i0P" +
       "KMr9V3nFA64v9wPOTeb3yfx+Hcon8/tkfv+/5HeX\ncTL0RNhI76c03k21cd" +
       "PgllgmE77MPDea8FXrftOafcB4Ev5kXp/M65N5fTKvs1s7rxNE5qsUHu7g\n" +
       "Xe83/g3GwVw3yCAAAA=="));
    
    public void run() throws Exception {
        SJServerSocket ss = null;
        try {
            ss = SJServerSocketImpl.create(TwoPC, 7102);
            ss.addParticipant("Coordinator", "localhost", 7103);
            ss.addParticipant("Client2", "localhost", 7104);
            SJSocketGroup ps = null;
            try {
                ps = ss.accept("Coordinator");
                System.out.println("Client1: connected to all participants");
                Random r = new Random();
                Integer i11 = new Integer(r.nextInt(4));
                Integer i21 = new Integer(r.nextInt(4));
                SJRuntime.send(i21, "Client2", ps);
                System.out.println("Client1 numbers: i11= " + i11 + ", i21= " +
                                   i21);
                int result = 0;
                Boolean commit = null;
                Integer i12 = (Integer) SJRuntime.receive("Client2", ps);
                try {
                    result = i11.intValue() / i12.intValue();
                    commit = new Boolean(true);
                    System.out.println("Client1 result: " + result);
                    System.out.println("Client1 ready for committing.");
                }
                catch (Exception ex) {
                    commit = new Boolean(false);
                    System.out.println(
                      "Client1 local error, ready for aborting");
                }
                SJRuntime.send(commit, "Coordinator", ps);
                commit = (Boolean) SJRuntime.receive("Coordinator", ps);
                if (commit.booleanValue() == true)
                    System.out.println("Client1 committed transaction");
                else System.out.println("Client1 aborted transaction");
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
        Client1 a = new Client1();
        a.run();
    }
    
    public Client1() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.3.0";
    final public static long jlc$SourceLastModified$jl = 1342028376000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0bbZAUxbVn7/tD7oMTkQMUOBUS2AuUWioogQXkcDnOuxPl" +
       "iB5zs317A7Mzk5ne\nu8UYg5ooaoWKEdRYKj9iyoqaSsBSk9IyqYqGqDEmWg" +
       "FiiX80iZaaxEolUhFN3uue6fnYvRUlRC3v\nqvbdm3ndr1+/fl+99+7Bt0mV" +
       "65CkS11Xt8zNSbbVpi6H1tBmqjE32bemR3VcmkkZquv2A2FQ2/SB\nvn5Py7" +
       "WrE0QZIK2mtczQVbd/xLHy2ZH+Ed0tOORU2zK2Zg2LeRyLeJw358jYb25Y01" +
       "5BmgZIk272\nMZXpWsoyGS2wAdKYo7kh6rjLMhmaGSAtJqWZPuroqqFfCQMt" +
       "ExZ29aypsrxD3V7qWsYoDmx18zZ1\n+Jr+yzRp1CzTZU5eY5bjMtKc3qyOqp" +
       "15phudad1li9OkelinRsb9KrmaJNKkathQszBwStrfRSfn\n2LkK38Pweh3E" +
       "dIZVjfpTKrfoZoaRU+Iz5I47LoIBMLUmR9mIJZeqNFV4QVqFSIZqZjv7mKOb" +
       "WRha\nZeVhFUamjcsUBtXaqrZFzdJBRqbGx/UIEoyq42rBKYycGB/GOcGZTY" +
       "udWei01lU3vn9Tz7unwomD\nzBmqGSh/NUyaGZvUS4epQ02NiomH88mdXRvy" +
       "0xOEwOATY4PFmGWnPXpJ+vWfnyLGtJcYs47b4qB2\n5OzpM15Y9lpdBYpRa1" +
       "uujqYQ2Tk/1R6Psrhgg3VPkRyRmPSJv+j91YZt99M3E6S2i1RrlpHPmV2k\n" +
       "jpqZlIfXAJ7WTSrerhsedinrIpUGf1Vt8WdQx7BuUFRHFeC2ykY4XrAJITXw" +
       "UeDTRcRPPQJG6lOG\nTk22MOluBpNh1GVup+tonXbeyeRp56KeVGcwooDsJo" +
       "0pCuxketyrDDDB1ZaRoc6gdt+rz1y18qIb\nt4szQrvyBGGkTXBO9o9ZPamk" +
       "x5soCmc6GU1PqGaZ46hb0SUK17ww43v71LtB0bBhV7+S8v0oY5UI\nYdKish" +
       "EjFfhbF2AqmMOg1rbt9Wl3vvjDpxKkomTUSMuXqywnpxp48L6btHrLxSlgLx" +
       "1xqy219l9v\nWvvQ/mcPzQ3sl5GOIrcqnoluMTuudMfSaAbCTsD+9n+v/vut" +
       "Vec+nCCV4GsQbZgKNgKuOzO+RsQ9\nFvuhBvdSkSYNw0Ubr2egoLHQhhE2Im" +
       "gWhgFn0RYTkEepw9dVf+nA4w1P8R37Aa0pFPn6KBPu0RKc\nf79DKbw/dEfP" +
       "rbvevmFjBTikbYszZ6Tazg8ZulaAKSdFPQrFy6DZvLV3cfOOBe4j/Ijr9Fwu" +
       "z9Qh\ng0IEVg3DGqOZQcZDUEso3PEoA5poHIJoBYFv0ABGYq+2MgrmWSIeJK" +
       "e27bxt3l0HMGLYXDFT0LO4\npKTAX3QoCOcWEfF5BlpwW7Bt8PEtYgON8/ou" +
       "X7Np+2y+8zC7+d5DQTIMfOHMsr6wCjML2AyzIMQE\nJrPp5oMXr73s0k4R9B" +
       "aWZdENvpzhfIL5u7rMpU+cuN9MoJVUu5ulv6dJwmWMzE37LD3Lw0eB9a3p\n" +
       "EyQ/8M//8A0EC+tX/euavc/vaoSFB0iN7q7STdXA03a7hfeWSAoxFlc+cck9" +
       "h59jr3DbDNwFxZ9e\nKI5y69WQJ5+zf7Sl+ie7cwlSM0CaeWJXTbZeNfJouQ" +
       "OQmt2U9zJNTojQo2lW5JTFMhxMj7tqaNm4\no1aGtF2JoxGvFb7JxzT9R/x8" +
       "gB80HHwQwb81ZeVsyBjOqRdS2LTKaMYuKIqN087hk2dyOEvYX4LB\n0qhiRm" +
       "psRx9VsT4iVTyS83GTGWmX5+fkTabnKBZtnsXxIKFwZ1gKttoRO2ppFUm0Ci" +
       "YS8r79S/aa\nbPqr/HxqvEoMy6EgekCKNEB9PMc64GbluEpbG9S8PKiIqKSN" +
       "6EYGJVsEPOaUNUIx/Zaavvsuze68\nN+E5coPNI9jpgSsHcrkdl5g5K6MP6z" +
       "wEgXMfaTpt4cNv7WgWSSAIM+AAH84geH/ycrLt2SvencnZ\nKBrySHlRaL6M" +
       "CWeU08hymtVLKaSaqU6WMpG2YVtleIRYnGfcvu8HPe9s95WywsYQfVrZIzEz" +
       "8eUx\nCp1VZs5awKGWBOPN5U1d4zW44HHfWdcdvO3azn9C0N9IaqlBc1BdgL" +
       "nM3BgpaiG69ztQrqwUA8Cl\nGnKCZ7/vQDENBJspZ1+9VKP6KC3eD05fZ4uA" +
       "3e397gWDyTu+aEkULVksWmLVF5YseX/2uTy9ALsU\niNBeZoJa99Sdp5996F" +
       "uQ/rtIPZaH3Xn0mTSZhLFFxXqepzkvZNRixdgdhJB6cSfoDko2Qqr2wUUl\n" +
       "WBPqJKrCBaNBIEmkMHIC6CqQhrO/DORtZx/zKBmZVY7srVq9RDd1doFcrokd" +
       "/QFBLRp7w5kiq02S\n4QWIDCGA8bXuFrApBv7ok+sDMoJg32cicgUCuA2FrU" +
       "uOGAiPqDOtDE0ZlhnQf1t+K5FYxrcSeePp\np45BGRXjiwiPxTkE5vEgHAwI" +
       "jFRqlr1Vknaxowv8YHKhJ3kymyWjuxAZRTA27uIImCTMZaHIrroi\np6Pi/a" +
       "jeDTiu3BJ+9DTJc6tkdT4LhcQ4K09qn1tb7I3cy9cluw3hsx7V4VIYSpsrwG" +
       "9x9vK8jrcr\niGbj0jxZJw3hI690cIBcZjEi1yK4DkzDoOooTUE1LOk7QEGy" +
       "4BFirHQcy1mtmhkIJdn1+MoCCU4u\n9Vru63qfodKMyHYEN0KhwBeUi+1hZE" +
       "ZsMe8rF7nM5OgLucDNcgEoSabFmKCSJYfm0JOnnMl82MpM\nFo5j3Sh1HD0T" +
       "CPVHRL6D4BbQkBwp6T9ioUsAnrt/yA0RY6nnM1NYU8ipbyByG4LbfdZYCUj6" +
       "Ukam\nRljzML3cymzlzhB68iNusAhc4ySf94ItIPhuqb0h2BlsKpAMwR2SsL" +
       "ukSGhSgUjiSR7NPcdDjjei\nhDslYSuYYkTAPivvaHQV5DThx6HH/4mIe8KH" +
       "WMUPQNLOCRv0sIOma2aSnvH1gKpAZaEn7xQroE72\nWST6Weg7J8miTxuBS7" +
       "6Brj9J4t70GpiO3KRH/AORhxE8IqgXWqr0cOWnYWqDyhjN2Swy4q5gBILH\n" +
       "Jgj/F4IxHmFe+MSa4Dz7Lby1QRmih+qQB8JxUBqOf72DWOGjvtlo4lkyuAmR" +
       "5xH8juGX1JyKjiMt\ni4zBhVGukYNrcnItAIhl+MvjWwWXVCdwiW5E/oBgP4" +
       "IDknASiCQTHs4vMWYSIi9xAqRfXNC/ZLYE\nxehyy4K0AlI0pCzLycDtFNwr" +
       "j+PW82rZY1a1DxFecm1E8JWgQEVElGEIgsoPSsmju7jweiF4HK+I\nfA3Bnx" +
       "AEWq8fj3BmVKqRUlUjgqAcWoCIX3KJ6+wnVfIhCGxgFyJBnXZMBRwiX0NwFY" +
       "KgfjofkW8g\n2BYlbEBEVDwIvlmqFEIgSxayAxFRskQI4VoGgaxBRE74NoId" +
       "EYKSQOQ4Z8CliHBN3o3guKTf3Yh8\nH8G9x22N8VM8IvcjeOBYF98TXePHQe" +
       "ZGhFP3IngoyMeIBFH50VJZFsHPSiVYBJ+S7PL5JRxNXkXw\nXJBKERGZEMHv" +
       "S6VIBC8GiRGRUllu/PSHyEslCJOihJcRHBonuS0/luSGSPC9RcnvOxDEUtWH" +
       "fNOB\n4KOlKgRvTqSjiXT0ERafSEcT6eizSviMpyNOiF7AuuCqmcUrZo3o5V" +
       "gk89OyY81PwcXoE7tKITiW\n/DSRhibS0EQamkhDnzLCZzwNAVC2BBknej/i" +
       "f2xfI/7GHmlf4Y0nc7yWLIJQtGT5/VSuE/r+PtZ2\nyltmb7jsncbr1ScvFx" +
       "0KrdHGs5VmPnfW7oN03pcbtRJtj3XMshcYdJSKb9qxayshmmpg2QVl+03W\n" +
       "8r/IB21HFX1L550xv+EvCVI5TvNii/eyl7K8Y4Z6GmC0+pG7Gk+JKSUuT8to" +
       "+8UVI/qvE7wdSXQw\nFTUfRyctjvYt1TtRQfkRtnMBmrAYgM/JaB9E/PDfSG" +
       "xB0CqaD9Em9oqzHafdriTRb53DZyhsJgeF\nzcqCRm38kh35K094f6kpbijr" +
       "cfSczmQPwS0z7/3zQ6/2tgkbEK3Yc4q6ocNzRDu230QEK8wqtwIf\n/eQXZz" +
       "14de8rQ15vifIoI5Wjlp7BzSlPR606/qA8JhWLiuyEzwpPsStKKbbYkXgGn8" +
       "NItcsb5csr\ntriXm3f2CmXtreh4J/HYlA7erFo5pLqy+SbSBF/c4x5pXedy" +
       "1stdzYLPGWV25Z91c7iNBvtiShoF\nlo/KwYJCsCtOeXkcbZwvYgvoxKBmlv" +
       "EiU9knOn2UZ8B2YAeIHigUuX+x5fF+DWz08mmiP1S3kvLf\nDoBY3P6JCzwu" +
       "xOVrfUyXCLWnKm/g3xJk+0hUaaJrsVD2+JHHk5zT897fcLiFFtmpElJO5E1B" +
       "hvmF\n2F43Ne4a3n8caLNf2DT3l3bL08KS/P8KqMEGp7xhhHskQ3i17dBhnZ" +
       "tPjeiYtLmshxlgoTb1cJOj\n8q4Y8x7vQsYx+HSEW8ffCsp/Ad3h2nzGMgAA");
}
