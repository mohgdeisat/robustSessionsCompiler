package purdue.TwoPC;

import sessionj.runtime.*;
import sessionj.runtime.net.*;
import java.util.Hashtable;

public class Coordinator {
    final private SJProtocol TwoPC =
      new SJProtocol(
      ("H4sIAAAAAAAAAO1YXWwUVRS+u+1S2kJb+RUpKEhr8WcXEIjSgtC1CLiU6hYw" +
       "ID/Tmct2yuzMMHO3\ntBH/Y4LG4E8Ag2J40RCjPmBi9M0n00QTH3ww+OATPE" +
       "iiD8YYH8TEc+7M3DuzTNdKrYrZPnx77px7\nzzn3nnPPObcf/EhSrkOWudR1" +
       "dcscSrNRm7ppHHpUfluesn4gD6hj33R9ZLLWS0mSyJG6Ii0OUMdl\nZF5uSB" +
       "lWMiWmG5msZRhUZSCpc8QhHRWlcpYnmXh/CS45pQ7qhsZIRy5YnuGLMmJ5Jr" +
       "IcNd1epgnR\nGhgCU1CXp+S1uvz53YWT7yQJgRVzbcsYLRgW81d4cza1fbIz" +
       "9/1nt3pzFsbM2cGlHlCvrm1d9PWm\ny/U1aPJ023J13DUjN+eCRd6J9Pmczh" +
       "HbHrHhqNvxtNLIS8vTcpftNIuWph/SlQGD5nSXXW1uW/nx\nDyda+JHUGvCF" +
       "kZbQSeMc3Pndfy5Ofl/QTZ75cv+vi7nQhHqEPEUS3Kg5UkpONw9TDcXPWJ7f" +
       "t+3g\n8aU1cBj20Vp0EEy9o4JTs920oF/jUzzK9gqrQovWGW+Mvdv303FchN" +
       "Yl7RG3chw9SlWqD9M4nWsq\nLNsOtFKAoykWS6auKkzE4vk1z188/VzmlySp" +
       "2UumU4MWqckgzBfv9U7fUMxCJs8U9XC/o6i0x5vQ\nmSONRU8mimFkrowDL2" +
       "Z5qObINKY4BQrOnBUR5+hmoVNsGX9n8a23VbxCpnbtvnHtbF/GAgi5khOY\n" +
       "nkZd6WtNT26+s6vr96X342obxHSB3oUVFij1n7/Zvva7F5KkditpMHST9pYw" +
       "F+RIk0ZVQ8G9ZA3F\n5SbMg9txSDdor1Kk/rihSNmgpYkvqDQ1BuEtdfYPOl" +
       "SBHNDoEWnkMDITDk5aw8UvBnsXsut0NSNL\nKrF9rdO6dFNnG4S6ZjZBrzBy" +
       "U3jIxaGQdiFqAxIdCMsZme4ehmhjcHsDdoNkI9wlGKuRWIbQxiJx\nJ2bsCc" +
       "+oNy2NZg3LlPyv2MSzMyNzyr74J1PPHFouF4lVCPcirJ4KxkXJYKRWtexRwT" +
       "rFJlbKINhC\nI+GZFULQWSS6ENaPqxxhnWB0sFAVUlyvZuDBBxWoF2g/KOTQ" +
       "P8laFnbeehbKl+WifKsDaXPKvoi9\nZIW4jSyUtId1qEcgps+xmKVaxoNwY+" +
       "E6ma6hMMthZNF4LN/S+cz/QqMThbYVSGxB2AoRYlBlmGYV\nQ/JPwDmJuupZ" +
       "0+M4lrNFMTXIJYVd+AktWRD3WWwvFwhMtCDRi7CDkRRXKJRdgA2VKctClaYj" +
       "TKiZ\nHf0gFDwiFCQZuaVMCJ61kNASGvmnNJtP69EK4JUdw9RxdE0a9S0Sux" +
       "B2wwmJmYL/IawX+tD9ga8b\nIzHTwFdmsVkSS68g8TjCvkA0VnLBfwAalIho" +
       "nqe7LW2U34nQKEi5UolDZWb6TW4B4bG4vSHskZuS\nliHsF4xzsSZhSEmTvJ" +
       "FwjTYVdlyJMg4KxiiEYsTAvFVyVLoZipp3nUPDv8XEC2EnprgDBO++cEAf\n" +
       "cjB0TS3tB18fHBUcWWjke7HGKQnfJftZqLEVIvLqINVKBoV4bhK0v7wOlqM0" +
       "cSN+RuIJhGMe9yFL\nETc88WmY26gwRos2i8w4K2cgPHujMozxGMvDR9AMB9" +
       "RvQYNhQ3nXQ/X9/XBiEZ7AiTp3xMyADPyg\nemMh4CUkTiC8wsgMn4uRKFxF" +
       "jkKnKXQUFd1MbweA5IA/vtyUC02pjDGeS08inEI4LRjzwSRRSHB9\nzJwmJM" +
       "5wBpQ1VAjdZGvZQ6rPgP5ti2Vo1IGG+9IXx3oefvG499IxZVcId0t2hN2WBa" +
       "kdDK/LGjo0\noatKOKuVt6u+7tQYErchLEFYKjtEJLxuCEE2YM1IyA4rtjND" +
       "kK3XRHoyhHRcK4Yge4x7kAj6GO/V\n+2/1UQiyleEulc3PpLoiJDYhdCPIpo" +
       "QL6EHYHGVsRMLrHxC2xTUWCKIB8C6A1wBEGOHOAEFUdC/D\n5hH6I4xEEokp" +
       "ricPIDGAwB/gU1LMziGhIwxNmY7xCyYSNsKRySq/ENVRknUQiaMI/MErXgBJ" +
       "7lCZ\nkp+Mq1kIT8eVK4T/SGn5h6sUwsuyMCHh1RWEV+MKDsLrsswgEVczxi" +
       "8mSJyJYTRFGW8hvC3y/kqR\n9zsnk/crP38j/1Tib6zIl/Fe8pcQLiOU1Ys4" +
       "xqTqBcJ71ZpQrQl/QXm1JlRrwv+zJsi3gEgy1/sW\nkJn6hs3t1RReTeHVFF" +
       "5N4eRGSuErub+b/gA2/yFVjyAAAA=="));
    
    public void run() throws Exception {
        final SJService c = SJService.create(TwoPC, "localhost", 1000);
        c.addParticipant("Client1", "localhost", 7102);
        c.addParticipant("Client2", "localhost", 7104);
        SJSocketGroup ps = null;
        try {
            ps = c.request();
            System.out.println("Coordinator: connected to all participants");
            Boolean status1 = (Boolean) SJRuntime.receive("Client1", ps);
            Boolean status2 = (Boolean) SJRuntime.receive("Client2", ps);
            boolean status = status1.booleanValue() && status2.booleanValue();
            System.out.println("Coordinator: Transaction decision is: " +
                               (status ? "commit" : "abort"));
            SJRuntime.pass(new Boolean(status), "Client1", ps);
            SJRuntime.pass(new Boolean(status), "Client2", ps);
        }
        finally {
            SJRuntime.close(ps);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Coordinator a = new Coordinator();
        a.run();
    }
    
    public Coordinator() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.3.0";
    final public static long jlc$SourceLastModified$jl = 1342030558000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0bbZAcRbVn7/uD3EeOALl854AEkj0TgQIuEJMlIRc2l+Pu" +
       "COQiXOZm+u4mmZ0Z\nZnrvNogYQCFAmRJJACkgP8SiBCxNkK/CQi2BqIAoSA" +
       "iU4Q8WQgmWlCJRAX2ve6ZnZndvCcQo4F3V\nvn3Tr/t19+v31bPv7nuLVHgu" +
       "SXrU8wzb2pRkWxzqcWgPbqIa85K9q7tV16N6ylQ9rw8IA9rGD4x1\nu5uuWp" +
       "UgSj9ptuxlpqF6fSOunR0e6RsxvJxLZjm2uWXYtJnPsYDHmXPfG3v62tWtZa" +
       "ShnzQYVi9T\nmaGlbIvRHOsn9RmaGaSut0zXqd5PmixK9V7qGqppXAYdbQsm" +
       "9oxhS2VZl3o91LPNUezY7GUd6vI5\ng8Y0qddsy2NuVmO26zHSmN6kjqrtWW" +
       "aY7WnDYx1pUjlkUFP3LiVXkESaVAyZ6jB0nJIOdtHOObav\nxHboXmvAMt0h" +
       "VaPBkPLNhqUzMjN/hNxx23nQAYZWZSgbseVU5ZYKDaRZLMlUreH2XuYa1jB0" +
       "rbCz\nMAsjU8dlCp2qHVXbrA7TAUaOze/XLUjQq4aLBYcwcnR+N84Jzmxq3p" +
       "lFTmttZf3713e/OwtOHNas\nU83E9VfCoBl5g3roEHWppVEx8GA2uaNzfXZa" +
       "ghDofHReZ9Fn2fEPXZB+/cczRZ/WIn3Wcl0c0N47\nbdr055b9vqYMl1Ht2J" +
       "6BqhDbOT/Vbp/SkXNAu6dIjkhMBsSf9Dy5fus99I8JUt1JKjXbzGasTlJD\n" +
       "LT3l41WApw2Lita1Q0MeZZ2k3ORNlTZ/BnEMGSZFcVQA7qhshOM5hxBSBR8F" +
       "Pp8n4q8WASOTUrbt\n6gYor+0mvU2MzGXUY16752rtTtbVs7R9cXeqPd4rh2" +
       "wnjSkK7GhavnWZoIqrbFOn7oB296u/vHzF\neddtE2eF+uUvCOQkuCf7xuzu" +
       "VDLCnygKZzwZ1VCIaZnrqlvQPHJXPjf9W3vVO0DosHnPuIzyvSlj\n5Qhh0O" +
       "KS3iMV2l4nYCqoxoDWsvX1qbc9/90nEqSsqAdJy8aVtptRTVSCwGSa/enyKa" +
       "A7bfkaXGzu\nP12/5v59Tx2YF+oyI20FJlY4Ek1kTr7gXVujOrigkP0t/1j1" +
       "55sqznggQcrB7sDzMBX0Bcx4Rv4c\nMVPpCNwO7qUsTeqGCjZey0BAY5ENI6" +
       "xH0CiUA86iJW+B3GMdvLrycy/+qO4JvuPAuTVEvGAvZcJU\nmsLz73MphfYD" +
       "t3bftPOtazeUgXE6jjhzRiqd7KBpaDkYckzcunB5OqrNm3s6Grcv9B7kR1xj" +
       "ZDJZ\npg6aFLyxapr2GNUHGHdHTRHXxz0OSKJ+EDwXOMEBExiJvTrKKKhnEd" +
       "+QPLZlx83zb38RvYfDBTMF\nrYyvlOR4Q5uCcF4BEZ+nowa3hNsGe98sNlA/" +
       "v/fi1Ru3zeE7j7Jb4D/kJMPQFk4paQsrMcqAzjAb\n3E2oMhtv2H/+mosubB" +
       "cOcFFJFl1gzzrnE47f2WktfezofVYCtaTS2yRtPk0SHmNkXjpg6WsePgqs\n" +
       "d3WvIAVBYMGHbyCc2Lj8b1fueXZnPUzcT6oMbyV4ExNP2+sS1lskQOSxuOyx" +
       "C+48+Ax7hetmaC64\n/Gm5Qk+3To1Y8un7Rpsqf7ArkyBV/aSRB3nVYutUM4" +
       "ua2w9h2kv5jWlyVIweD7kivnRIdzAt31Qj\n0+YbanlE2uXYG/FqYZu8T8O/" +
       "xN8H+EHFwQcRCJpTdsaB6OHOOpfCplVGdSenKA4OO50PnsHhbKF/\nCQZTo4" +
       "gZqXJcY1TFXIlUcG/O+01mpFWen5u1mJGhmMD5GsedhMKNYSnoalveUUutSK" +
       "JWMBGc9+5b\nssdi017l51PlZ2WYGoXeA8KlCeLj8dYFMyvFVeragObHREV4" +
       "JW3EMHVc2WLgMbekEorhN1b13n3h\n8I67Er4h1zncg50QmnK4Lq/tAitj68" +
       "aQwV0QGPd7DccveuDN7Y0iCIRuBgzgwxmE7cctJ1ufuuTd\nGZyNoiGPlO+F" +
       "FkifcGIJiaSW02GjQCDoBk4oMSoy6Ezzlr3f6X57WyCGcxx0yqUOoYdq1Bil" +
       "xeY8\ntcSwNYBDMgkam8lahsaTcMHj7lOv3n/zVe3vgKffQKqpSTPUYqAjMz" +
       "bEslpw6X0u5CkrRAewo7qM\n4NkXWA14L6a6w5SJjCXYD3538X0dX1K5LL1w" +
       "Uzh2rc+jF1Qk6wbrSuK6koXrSqw8acmS9+ecwQMK\nsEnBvK0lBqg1T9x2wm" +
       "kHvgYBv5PUYnLYlUUrSZNJ6E1UzOZ5YPOdRDXmi12h06gVN4KuMFEjpGIv\n" +
       "XFPCOSEzoipcL+oEkkQKI0eBoMLVcPYXwXpb2cc8R0ZmlyL7s1YuMSyDnS2n" +
       "a2CHeCoQ6qOPnB0y\n2ShZnY3IIALoXO1tBlViYHsBuTYkIwh3fAoilyCAW1" +
       "BUqWSP/miPGsvWacq0rZD+K3bofouRlrwW\nXzI1DFKmPL6IcL+bQWAdCcL+" +
       "kMBIuWY7WyRpJzs0Jw/KFnmSJ7NJMrodkVEEY+NOjoBJwjwW8eKq\nJ+I3Cj" +
       "7w4F2A+0oRPvqS5HFUsjqLRZxhPit/1QG3lrwWuZcvS3bro2c9asBlMBIizw" +
       "GLxdHLswbe\npsCJjUvz1zppEB95VoMd5DQdiFyF4GpQDZOqozQFma+kbwcB" +
       "yeRGLGOF69ruKtXSwYkMr8MmG1Zw\nXLFmua9rAoZKIyLbEFwHSQGfUE62m5" +
       "HpeZP5r1rkNJPjDXKCG+QEkH5MzWOCQpYcGiNPvnAm824r\n9GE4jrWj1HUN" +
       "PVzUS4h8A8GNICHZU9K/xyIJP557cMh1MWWp5SNTmD/IoW8gcjOCWwLWGPUl" +
       "fSne\nhaOsuYNebutbuDFEngJfG04CVzbJ55/hFhB8s9jeEOwINxWuDMGtkr" +
       "Cr6JJQpcIliSd5NHceiXW8\nESfcJglbQBVjC+y1s65GV0I0E3YcefyPLHF3" +
       "9BAr+AFI2ulRhR5yUXUtPekrXzeICkQWefJPsQxy\n4oBFoo9F3jVJFr3aCF" +
       "zoTTT9SRL3h1fBcOQmLeIviDyA4EFBPddWpYUrD0epdSpjNOOwWI/bwx4I\n" +
       "Hp0g/FcI5niE+dETa4Dz7LPxhgZpiBHJQ+6N+kGpOMFVDnxFgAZqo4lnyeB6" +
       "RJ5F8GuGL6c5FQ1H\nahYZg8uhnCMDV+LkGgDgy/DL51sBF1I3NIkuRF5AsA" +
       "/Bi5JwDCxJBjwcX6TPJERe5gQIvzhhcKFs\nCtPQ5bYNYQVWUZUyDch8F2ex" +
       "zzqeI/uMKvYiwtOtDQi+GKaliIgUDEGY9TUgEqZ1RdNBBKH8DiUR\nRDBSLP" +
       "9DECY2CxEJkidxCf1fJW8IwtPciUiYcR1WKobIlxBcjiDMhM5C5CsItsYJ6x" +
       "ERuQuCrxZL\nahDI5INsR0QkHzFCNCtBILMJ4d2/jmB7jKAkEDnCsWwpIlyS" +
       "dyA4IoF0FyLfRnDXEZtj/GCNyD0I\n7j3cyXfH5/h+GIMR4dQ9CO4PIysioX" +
       "99qFi8RPBIsVCJ4BMSJ/5/CYcSIRE8EwZFRERMQ/CbYsEO\nwfNhiEOkWLwa" +
       "P5Ah8nIRwqQ44XcIDsgwtUiGqeWHE6ZKvyKIvVXj99BYyzhvO5STEJyMTfHw" +
       "VpRw\nWOENwRsTIWwihH2EySdC2EQI+7QSPlMhLLxpLTucEHZpLLB8akPRRM" +
       "SZiDgTEWci4nzCCJ+piLOI\n/3K+WvxwHqtC4fUjc/3KKoJQVFYFZVGeG3k1" +
       "n1dJyqtgr73o7fpr1McvFjUHzfH6sRVWNnPqrv10\n/hfqtSIVjDXMdhaadJ" +
       "SKl+hYfJUQtTEw7cKSZSNr+M/sYfVQWe/S+ScuqPtDgpSPU4PY5Df2UJZ1\n" +
       "rUiVAvRWP3Jx4sw8oeSvp2m09fyyEePnCV5VJAqRCuqJ44M64uVHtW58ofwI" +
       "W/kCGkBE1fBphs9U\nIv74NxKbEDSLGkIAivBW41XNFSUGFXD4PJn5daT8pf" +
       "GKnEYdfH+O/JVH/R9hCuvCul0jYzB5Yb5x\nxl2v3f9qT4vQAVFdPbegwDk6" +
       "RlRYB7VAMMPsUjPw3o+fPPu+K3peGfQLRZQfMlI+ahs6bk55Mq7V\n+Q/Kw1" +
       "KwjZgvwCfpCzZZTLCFhsRj9lxGKj1e+15asIXl2bxAVwhrT1nb24lHp7Txmt" +
       "PyQdWT5TSx\nuvbCsvVYNTpfZ63cFarHrBK7Cs66MVobg8UuRZUCE0blhZxC" +
       "sLhNeWkcaZwlfAvIxKTWMONppfK4\nKN9R9oLuwA4Q/W2uwPwLNY+XYmC9Vk" +
       "ATZZ6GnZT/SQDEwipOnOARsVw+18c0iUiVqfIa/rggK0Pi\nQhPFh7mSx488" +
       "fso5Pe3/PMM1tEBPlYhwYi0g0rpIvTdWyh2bbx7+PxJoc57bOO9nTtMvhDYF" +
       "xf5V\nWLmUNc1ouWMEr3RcOmRwFaoSxY8OX+87DLBI1Xm0XlH5q+hzkBcUYx" +
       "98+jvXkDdzyr8B3ACO8Z0y\nAAA=");
}
