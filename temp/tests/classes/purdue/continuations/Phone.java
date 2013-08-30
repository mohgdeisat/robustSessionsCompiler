package purdue.continuations;

import sessionj.runtime.*;
import sessionj.runtime.net.*;
import java.util.Hashtable;
import java.io.Serializable;

public class Phone
  implements Runnable,
             Serializable
{
    
    public void
      run(
      ) {
        
    }
    
    static class myRunnable
      implements Runnable,
                 Serializable
    {
        final private SJProtocol
          onlineShopping =
          new SJProtocol(
          ("H4sIAAAAAAAAAO1ab2wcRxWfO9vxnwTHjZP0T5IiipMmUXqm0IQGhybxJW7s" +
           "Xmy3tktJaZu93fF5\n473dze6cY0OFoAgp9EOkVlDaqlBUgfIB+BAEbVXxR1" +
           "GpIvFPAiRUkPhUPlAJPiCEQCJIvN/u3szu\nee/ixGlIzEXK85t9M++9efNm" +
           "3m/29jt/ZW2+x/p87vumY5/IiQWX+zk0Q25iZIKLSWKf0C/8bt/3\nbLH5nS" +
           "zLFFh7mZeL3PMF21g4oc1p/RVhWv15x7K4LkjTwLzHtjfUGohCzSz8lwk0t+" +
           "kzpmUItr1Q\nHd4fDOqXw/sTw2HpgzWWQJ3iCXIFtkIjz7RPnP1E6cvfzDJG" +
           "Iza4jrVQshwRjQj7HNz62lThzz95\nf9hnU0qfsUDrE/rFPZu3/Obgnzpb4H" +
           "KH6/gmZi3YLYXqoDAi45FkYN51510K9TZEKwdZTkXL75uy\ny45hTpta0eIF" +
           "0xcX1269+wd/OdMThKTVoieC9cQijT6Y+a5Lq1PPbx1kn/v54/+8PVCa0U+y" +
           "z7JM\n4NR6paVg2rPcgPo1OyYeGzl++o4WCoZ7qhULRF3vbLCo+UFeMhetKU" +
           "K5rcGo2KCPWV+98K3xv53G\nIHiXdefJ5NaGeWQbaQZ3NxhzlHitRHEplyu2" +
           "qWtCJuLZ3V94+7mn+v+RZS2Psg5u8TK3BeX47Y+G\nobc0u9Q/ITR9dtLTdH" +
           "447DBQYKvLoU6oEWyDSoIwYYM8LbBVQvNKnFZyXUKdZ9qlgdh8G+2bh7jO\n" +
           "zTm+eMoY3hsM39Fg+FhFnKLtlTK+cZgLjuOGY2ZHXjl2fuRfhTAxi46xAMst" +
           "VfddH8wtgSM7GztS\n9DRbn0nzpFGODaaOyh5j60z/EHcpHWhFrAV0MHCYaD" +
           "RYsN7Y1jmi+TNHNVdG3GXk601qB0TytvY/\nnH9z4/Fft7DsEOuyHM0Y0nTh" +
           "eMOsU8x43J9xLGPe3X8gcGHNqQ6iPfQ/S8o2SP8DhRQ+rcitmLfD\nrGOGrO" +
           "QdgxdYi6UVkykRHjJ0ZLC+syRqHR0bGw8D20fDpwVrGZz6pAw0/q6jaVS8ap" +
           "7moCW3OE+z\nQzv37fvPHXsRZZdcGSNfNzUYoHW+9eK2PX/8Ypa1DlMITJuP" +
           "VnDqF1i3wXVLQ+LmLc0PXNhI5+A0\npdaoVuZRu6vMxYxjyCcw2naBDjJlc5" +
           "JCqdFpvzpkcpAI9j7aJcqbQH2O/N0krnBfC/aBRuLI6qp9\npm2K+6S5tWKJ" +
           "R49gN8WbgToo2SNV3QfmXpC9gnX4s3S0CDqnq+IuJQYZkIJ7wARkt0gcMrLH" +
           "sXiP\nTpsyKm85tpL/Siy9Dgu2vuZJFJlO4fFavWAGQfIgh6TgbSWg1NUdd0" +
           "GKtotYpdb8sK7C5WqVHiU+\nCqdqRj60ivi098bXplZVeEZUlfUmH0TqNhqm" +
           "r5WLZqmiCa7MSQMXBdtSu40pdVzKcG+Kmn4QrMQT\nue5jVS2ZDJgHQR5KCF" +
           "hfo1DgtI2FQjUXW2AX61ioa/ryBewjIlbAa52N8GHV3/U1Ty7DZfZIPFfn\n" +
           "TEJOpH/cc4SjO9YhOnGgdrBC8JB7VJTryqIl7i6iOWRyy0AHaWYAzHEQpLbF" +
           "tTme1ywlP0NrI6Ff\n6MZhz3O8I5pt0CFYehiPHPLg1rTHcsKGDGwPmGmQkm" +
           "BtgUFp7BzlWY2xPAFJPi+kmd7kA2nAlAay\ngt1WowTRlxp6Yq0oOL1Bt8NG" +
           "idZpbI57nhlL/t+DsUEcipDsKeXfpfHSHhKiuvqrE3usKxiZB56X\nQ98FI0" +
           "AqVdUAm1K+nzB0QnVQYAYJZ0B/T6xVrRXKiMfVkfpvNQUQN21uIJ6alPIMZE" +
           "4KXk51CSml\nXApbcmmefC/8eDcpmFcxA/NpkM+8Z8ZfBvN5kKeu/QQXaK8l" +
           "VmDCqXg6H6KjNzwjY82rsgbn4lna\nFmSYlN0b37HTHvambeSi3TVOuUA5EW" +
           "tFadriVWRyZidF7HIpVUzoM9yoWDjbuiUfDW+n4dAmt/zf\nwbwE8rVQer+j" +
           "ySMs83pculoTgpddkejxkuoB8kpTcE0EVj3BjviKraX1nHQALggnmjGg+O34" +
           "QS8T\np4pC6DCsstW00cO2VPA0mFdBXhNsTSTFxpGZxU7RZUTaKGumnTtKhA" +
           "5r/In0tvl0lVVbYhTMD0F+\nBPJjKbiZXJIVHeNT+nSDOR8ICOXBIF1LNte8" +
           "exm36CJwxEF1p2v6Oz978vADXzod3kFtdb3AMVHx\njArP6RQa064EIJ9Qim" +
           "NT5c2O54NzZVdw9YnMt10A8yGQu0E+rG4bYEJkDaLA/NrGkDpxRQ8AUeJJ\n" +
           "vdvBL0B+CaLgf1c9wT1J39Sd5VhScEAK7gJTheXhO7bLwvIg9yskD2YYZATk" +
           "AYXLwRwFCXJiGTiV\n9YGZAnl4maquBPKC+RTIY0szzh4BE6JKkGIa3ARRYT" +
           "8DJoSFCUEcL4JInBeWpVkQKyHIZME0UUZz\ngo1hFJhnQJ5drvFzSRvPKXQE" +
           "5nmQF0BeVJgHjKp8X09DMiDfSAMxINdJBf//FSwFu4B8X8EVMCHa\nAHk9DY" +
           "aAvKHAB5g0JFEfYoA5nyLoTgreBHlLsFVzBJkcb15CAVm8rgQKgFEF+n9W0k" +
           "F+u4x6vqXx\nq071+l++kEq8Hwx+B5DK1onL+A1CsA21j6oIKbNTqmxHcxfI" +
           "XUnB42gCjYRJeODSMbiKgrrh/IpY\n2k+qdFOMtSQyVLPApsrsAfnoEk3XRW" +
           "YfB6MQjRIcELEfXFLfunma7Vta8CZpSz1RlAk3i+gJT3aU\n1rC9MvAlE2yR" +
           "Jhq6XsHCip9gEw1dX4IbHF4Egp/i3WC9NxDD9rQj8YeEH/JMX/nw42pW2JOJ" +
           "wniN\nK+bJeA3L7G8Wtxvt7F/xE2wWt+tLsEKK222pxe2gVayUF1e2/HIrm/" +
           "oiJvVLGpCaynaJb2hArm1l\naxawZgFrTrBZwG54wQopYD3xz13x/ap6IYwe" +
           "3f8FfqAGnRExAAA="));
        
        public void
          run(
          ) {
            try {
                final SJService c =
                  SJService.
                    create(
                    onlineShopping,
                    "localhost",
                    1000,
                    SJParticipantInfo.
                      TYPE_MOBILE);
                c.
                  participantName(
                  "phone");
                c.
                  addParticipant(
                  "vendor",
                  "localhost",
                  20102,
                  SJParticipantInfo.
                    TYPE_SERVER);
                c.
                  addParticipant(
                  "PC",
                  "localhost",
                  20103,
                  SJParticipantInfo.
                    TYPE_PC);
                SJSocketGroup ps =
                  null;
                try {
                    ps =
                      c.
                        request();
                    ps.
                      continuationEnabled =
                      true;
                    System.
                      out.
                      println(
                      "Phone: connected to all participants");
                    SJRuntime.
                      pass(
                      ("Please send me the songs in Beatles Album 2012, and I will d" +
                       "ecide which songs to buy!"),
                      "vendor",
                      ps);
                    Album a =
                      (Album)
                        SJRuntime.
                          receive(
                          "vendor",
                          ps);
                    System.
                      out.
                      println(
                      "Received Album info. Album Name: " +
                      a.
                        Name() +
                      ", Number of songs: " +
                      a.
                        Count());
                    int i =
                      0;
                    {
                        SJRuntime.
                          negotiateOutsync(
                          false,
                          ps);
                        while (SJRuntime.
                                 outsync(
                                 i++ <
                                   a.
                                     Count() -
                                   1,
                                 ps)) {
                            System.
                              out.
                              println(
                              "Retrieving song information...");
                            SongInfo si =
                              (SongInfo)
                                SJRuntime.
                                  receive(
                                  "vendor",
                                  ps);
                            System.
                              out.
                              println(
                              "Received song information. Song Name: + " +
                              si.
                                Name() +
                              ", rating: " +
                              si.
                                Rating());
                            if (si.
                                  Rating() >
                                  8) {
                                {
                                    SJRuntime.
                                      outlabel(
                                      "BUY",
                                      ps);
                                    System.
                                      out.
                                      println(
                                      "Buying song...");
                                    Song mySong =
                                      (Song)
                                        SJRuntime.
                                          receive(
                                          "vendor",
                                          ps);
                                    SJRuntime.
                                      send(
                                      mySong,
                                      "PC",
                                      ps);
                                }
                            } else {
                                {
                                    SJRuntime.
                                      outlabel(
                                      "NOOP",
                                      ps);
                                    System.
                                      out.
                                      println(
                                      "Song not good enough to buy... ignored!");
                                }
                            }
                        }
                    }
                }
                catch (Exception ex) {
                    System.
                      out.
                      println(
                      "phone Exception: " +
                      ex);
                    ex.
                      printStackTrace();
                }
                finally {
                    SJRuntime.
                      close(
                      ps);
                }
            }
            catch (Exception ex) {
                System.
                  out.
                  println(
                  "phone Exception: " +
                  ex);
                ex.
                  printStackTrace();
            }
        }
        
        public myRunnable() {
            super();
        }
        
        final public static String
          jlc$CompilerVersion$jl =
          "2.3.0";
        final public static long
          jlc$SourceLastModified$jl =
          1329255889000L;
        final public static String
          jlc$ClassType$jl =
          ("H4sIAAAAAAAAAO0bbZAUxbV37/vD+wREDlDgUPBjLyZi1CMgnJwcLnfn3YFw" +
           "Fh5zO317A7Mzw0zv\n3R6xjGgpaipUWYJfZaSSmJAYTQnGfFXKxFJD1MREki" +
           "CxSv+YSrSiRpOomKDJe90zPTN7uyuImg/3\nqu7d637d773ufl8zN33fq6TM" +
           "sUnMoY6jmcamGJuwqMOhObyJJpgT61/Vq9gOVTt0xXEGgDCU2Pie\ntnZv4z" +
           "UroyQySJoMc5muKc7AqG2mk6MDo5qTsckplqlPJHWTuRwn8bhg3pHxX2xf1V" +
           "JC6gdJvWb0\nM4VpiQ7TYDTDBkltiqaGqe0sU1WqDpJGg1K1n9qaomtbYaBp" +
           "gGBHSxoKS9vU6aOOqY/hwCYnbVGb\ny/Q646Q2YRoOs9MJZtoOIw3xTcqY0p" +
           "Zmmt4W1xzWHiflIxrVVWcLuYpE46RsRFeSMHBa3FtFG+fY\n1on9MLxaAzXt" +
           "ESVBvSmlmzVDZeTk7Blyxa2XwACYWpGibNSUokoNBTpIk1BJV4xkWz+zNSMJ" +
           "Q8vM\nNEhhZEZepjCo0lISm5UkHWJkeva4XkGCUVV8W3AKI1Ozh3FOcGYzss" +
           "4scFo95bXv3tT79ilw4qCz\nShM66l8Ok2ZnTeqjI9SmRoKKiYfTsZ1d69Mz" +
           "o4TA4KlZg8WYZfO/vyb+0k9OFmNacozp4bY4lDhy\n7sxZB5b9oaoE1ai0TE" +
           "dDUwitnJ9qr0tpz1hg3dMkRyTGPOJP+362/up76Z+jpLKLlCdMPZ0yukgV\n" +
           "NdQOF68APK4ZVPT2jIw4lHWRUp13lZu8DdsxoukUt6MMcEthoxzPWISQSvgt" +
           "hd8NRPw0ImCksnfU\nNGjM2cTIEkYd5rQ5dqLNSttqmraBrTLNSHMjH6IZy7" +
           "ShmWyzcAq0lZSl0zaPQQZl1Y1HIrDMmdku\np4N9rjR1ldpDiT0vPnnliktu" +
           "vEEcIBqdqyUj84XgWFAwzEYJramJvrRhKMM6JZEIl9KMhio2cplt\nKxPoQJ" +
           "ltB2bdsV/5MhwLbI+jbaV89ZFxXDtO+nTB+NLhe2cXYAoYz1BiytUvzbjzN9" +
           "96PEpKcsaY\nuOzsNO2UoqOZeE7V5IrLpoB1tWbbeC7Zr920+sGDTz2/wLd2" +
           "RlonOeHkmehEc7NPwTYTVIUg5bO/\n7R8rX7+l7PyHoqQUPBO3XQGLAkefnS" +
           "0j5EztXmDCtZTESc3IpIVXM9ig8cCCEdYiaBCWAmcxJUtB\nHtMOX1v+qWd/" +
           "XPM4X7EX/uoDcbKfMuFMjf75D9iUQv/zt/fesuvV7ZeXgPtaFj9zkoGRJ4bd" +
           "DrVS\n0Vpe2dfesOMs53v8ZKu0VCrN0MAgTCu6bo5TdYjxONUYiIk8FMEG1A" +
           "5DSAN3GNKBkViiFRkDq8wR\nNGLTp+y8deFdz2JYsfh+TEPVPAWxY14E4WmT" +
           "iNiehYY7xV8tBILNYgG1C/s3rNp4w1y+4CC7M9xG\nRjL0XeCcgi7QiekHTI" +
           "WZEId8S9n4xUOXrl53WZuIjGcXZNENPq1yPv78XV3G0oenHjSiaBzlzibp\n" +
           "93ESdRgjC+IeS9fgsCmw/lX9guRlhzPffwG+YO3Kt7bt+9WuWhA8SCo0p1Mz" +
           "FB1P2+kWTpsjc2Sx\n2PrwmrsP/5K9wE3S9xJUf2ZmcrRbqwQc+LyDY43lD+" +
           "xORUnFIGng2V8x2FpFT6PBDkL+djrczjg5\nIUQP52KReNplFJiZ7aEBsdn+" +
           "WRrY7VIcjXilcEk+pv5f4uc9/EXDwYbIEE0dZsqCtGKfcjGFRSuM\nqlYmEr" +
           "Fw2mf55NkczhH2F2UgGreYkQrL1sYULKJInWlgquofNS0LfIZPaGakRR6knY" +
           "aIn6JY4rmm\nx4NEhHvFEjDa1qwzl+YRQ/NgIn3vP7h4n8FmvsgPqsKt27B4" +
           "8qMHJFQd9pFnZJssKMhVGt1Qws2a\nERGVEqOarqJmZwOPeQWtUUy/uaJ/z2" +
           "XJnfdEXY+usXgEO9X3aV8vp3WNkTJVbUTjsQi8/Ej9/LMf\nemVHg0gCfrwB" +
           "T3h/Bn7/ScvJ1U9d8fZsziaSQB7L3XB0hgwOpxXYkY7lNKlN2hCMB6cWmBWY" +
           "dIF+\n2/6v975xg7cNHRZG5/kFD8FQcwlcVGDOasCh1gS7TaUNLcGrCMFjz6" +
           "JrD916TdubEO8vJ5VUpylq\nMDCQ2ZeHil4I7AM2VCwrxADwppqU4Dng+Q7E" +
           "MKbYScpE7eIvppBF9dEE1cbo5PXg9G4+fWGB6T1p\nNg6Gl2N+4T2Mm6Yl5m" +
           "xe9dXBR1YdjgtDGjbVCWHErvrCFi7lipxeWJFhG+LMaC5NChnQ8pyzIC43\n" +
           "ac5F1IKzhu3WJ0R+BjdTYDIjzQH3Xak4o6sVq12qTMKFgEsvq3jukUenbXym" +
           "hEQ7SbVuKmqnwssj\nUgV1CXVGoRbNWEsv5CrUjmNx3IDBC5hNlfpzhrB9yj" +
           "DVA9p2kcpRkNJhqlAolOjKMKqyCDRp3TPM\nSGl3T0+v2MgNMHyEkZLla9bL" +
           "jcW/q0HttO0ZXQyNLjbZ6KKdpy9e/O7c83nNAKJ7QLeWAhOUqsfv\nPPXc56" +
           "+DUq4LlgzRtjuN8S9O6jBhKPgkx2sXNw9U4rNCt58XqsXTYLdfjxNSth8eUX" +
           "2ZUPNSBR4t\nawQSQwojJ4AX+Npw9iOgbwv7gE7KyJxCZFdq+WLN0NgSKa6e" +
           "HWUcgWou2OTskIkhWS1BhOe3LfCA\n5GyGOMFMn1ztkxE4knAOIjxvpVgoYs" +
           "gRg8ERVQZYUIcOzzaS/jQ7+ozEyJSsHndnqhgUw1l8EdmK\n4PMIrpSEQz4B" +
           "TDdhWhOStIAFMpviiOIGVfayWjfg7nb6TVcHXmRIVucHzyablYgJHrPmcIfL" +
           "bpqq\nOUpqWEvCIyH1xUkBRxiZle22XtmyBpoO36xQjzz37R4XUWvciOCmEI" +
           "G0FtoKjK6BrfCbkyWQI3kk\n5BV97ATyGRbIxtnKupWSp++UrJ5jUJmsC9rq" +
           "mOZoLFC8XQQRB9kuT2v40A8ZNi/NPeK6YWzywhsH\nSDHtiNyO4A4wbZ0qY7" +
           "QDHs4kfQecjay/hRorbNu0VyqGCkEwuRa7TNDgpFzdcsF3yY1tQORuBLuh\n" +
           "lOUCpbC9YGdZwtzXhFJMc7hDCviKFAAV8owsJrj7kkNDoOVuTjMftkJNwjn1" +
           "jFHb1gLG/3tEvoFg\nD+yQHCnp97PAMykahHf6NSEfq+YzO7CylVNfRuQ+BP" +
           "d7rLEelfSljEwPseYJZjnUFci/IdDycoUv\nxKZ+SP2nvwQE38y1NgT3+ovy" +
           "NUPwHUnYnVMlNClfJdGSR/Pdj0KPl8OEB/w9Q2Qfggc/MuG7Efkh\ngh99/A" +
           "ucAF8LnUC/mbYTtBNCr4iRgeaHcgZ7g1Zaxi1M0s4LeuyIjb5pqDHXu3rBFs" +
           "AmAi3XTEvg\ncdRjER1ggRfBkkV/YpSqaR1jW53E3ekVMB25SZf/GyK/RfA7" +
           "Qb3YVGQIi/wgSK1RGKMpi4VG3OWP\nQPBckfCxEPR8hIXBE6uH8xwwsbiAOl" +
           "ELFIrfDgZ6aTheFQLB0EM9s0mItmTAM+5rCP7C8D9HnIqO\n49ec44w0SRkp" +
           "RTNiqwFAsMY/Lt8yBx5VfZfoRuTvCN5E8JYknAgqyYyO83OMqUPkHU6AKg8F" +
           "eu9y\nTsr57r7fNJKMRHs70jhM5c8xLq+y/Yjwf1FoCDb5jw6IiDIZgb+j9Y" +
           "Xr49DzNa9uQj15Sv1ICYJS\n7PL3tTof4ZywbmO5ansEGUk4CxGvxhavjo6p" +
           "MEfwBb8sR2QbgmsQXOsX2Yhch+B6BMdRdJJWRL6E\nYMdxsvog9SsiOxHsOj" +
           "rhZB0iokREcGeu2hGBrPHEskSNFyIEiz8EsmgTOeZrCO4JESJRRIolQ3GB\n" +
           "hWsiRJ5A8OTxCt8blvG0X+og8msEzyA44BcwiPhp7GCusgTBoVwVCYL/knT8" +
           "ySUcTSGC4BW/9kBE\nlA4IXs9VUyD4q19JIJKrLMhfLyDyTg5CXZjAbfwII+" +
           "VjUP+YdkaWAn3HUwpsCSXo/1hKR37Vx5HP\nZxV+b+m/u5dvl0Iv+/hLfMms" +
           "iR3DPxAYmZrd5VVIEUWyrMAm/q8oooYJV2BzCMHG8Obk3YMPkZB3\nO3exo/" +
           "tPITz2BVqyMvRXgb4YwWOPGEcpOm9l9jlE/IrGJ6xHpFi4/A/n9f/7BRYLly" +
           "Lhk1u4cEIz\nvkLM926jyxgxZWUjC5tLPjmFzYeZu7eEUm4xFxdTVXGBxVxc" +
           "JBRzcSAXz8iZi5fpw+nU5ES86jgT\nceA7n5zfByEIJ+L3+zIIwcebiIv5tp" +
           "hviwss5tsioZhvP0C+bQh+c4wfEfsv8nFEl0gboTsgERji\n8Eu07t0mglDc" +
           "bRI3DaIe9yafu3e9zyOJC0+aGZOXbYGIn6bPync5lF9s3b7ujdrrlcc2iK/R" +
           "m8I3\nv1YY6dSi3YfowgtrEznuH5a7V0awI3xn6qyClzxW80+n/Us/Jf1LF5" +
           "52Zs2foqQ0z43BRrezj7K0\nbQSuFcBo5ZivEp6ctSPZ+jSOtVxaMqr9PMov" +
           "A4n7Q5PuB4cntYdvDVXbYUX52bdwBephi6rgtxl+\n5xLxw/8isRFBk3vjL6" +
           "ehWOlhXRpKnktwBYnQjl7hfrM1+SpXr62lNCa/Abl59j1/fPDFvini8MVN\n" +
           "6XmTLisH54jb0t6tHZAwp5AEPvqxM+bcd1XfC8Pu1Y7oZYyUjpmaiguIbgq4" +
           "QfZlPUaq/WuuhQte\nfikWtJmerY17Bzsx98DGBY9ajU/wq53ynnQFfvif1v" +
           "XghbAAXm7ZdETji60Q18MsvgIG7phLDcav\nrPlt1DnqiDnj/HBxDrbcyyXh" +
           "gCLutGUi/wbdxBX+/D8AAA==");
    }
    
    
    public static void
      main(
      String[] args)
          throws Exception {
        myRunnable myPhone =
          new myRunnable(
          );
        SJSocketGroup.
          executeExportable(
          myPhone);
    }
    
    public Phone() {
        super();
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.3.0";
    final public static long
      jlc$SourceLastModified$jl =
      1329255889000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAK0XW2wUVfTuo9vXSrulVKQvHjXQCLtGoxFrlKaB0LKEui1E" +
       "SsgyO3t3d8rdmXHu\nne2ABlGMIB8mBnxG4cfEaPhQiPqhURPAtz+YgD/wg1" +
       "ESxciHkRg0nnvv7GtmqTGxydzex3m/98RV\n1EQtFKeYUs3QZ+Nsj4mpWI3M" +
       "LFYZjU9NTCoWxdkxolA6DQ9pddff2rZ3Y09tDKLADOrSjVGiKXS6\nYBl2vj" +
       "Bd0KhjoaWmQfbkicFcij4a96+4MffNwYneEOqYQR2aPsUUpqljhs6ww2ZQtI" +
       "iLGWzR0WwW\nZ2dQTMc4O4UtTSHaXgA0dGBMtbyuMNvCNIWpQUocsIvaJrYE" +
       "z/JlEkVVQ6fMslVmWJShzuSsUlIS\nNtNIIqlRNpJEkZyGSZY+ivahYBI15Y" +
       "iSB8CeZFmLhKCY2MDvAbxNAzGtnKLiMkp4t6ZnGRr0YlQ0\nHtoEAIDaXMSs" +
       "YFRYhXUFLlCXFIkoej4xxSxNzwNok2EDF4aW3JQoALWYirpbyeM0Q4u9cJPy" +
       "CaBa\nhVk4CkOLvGCCEvhsicdnNd7aEon+dXjyj6XgcZA5i1XC5Y8A0oAHKY" +
       "Vz2MK6iiXidTt+dHy73RdE\nCIAXeYAlzOjtH2xNXvlkUML0NoDZImIxrd64" +
       "t6//3OgPrSEuRotpUI2HQp3mwquT7suIY0J091Qo\n8sd4+fHT1Gfb97+Nfw" +
       "6ilnEUUQ1iF/Vx1Ir17Ji7b4Z9UtOxvN2Sy1HMxlGYiKuIIc5gjpxGMDdH\n" +
       "E+xNhRXE3jERQs3wBeBTkfxr5wtDLZMFQ8dxOsvQgwxTRhPUUhOmbWVtnIBY" +
       "ZZpuiyBPY8c0LDjm\nEyZHgbNSNAlOlAk4nNeCuUAA1OzzphyB+NxokCy20u" +
       "qbl796fP2mZw9JB/Kgc6WE8JKM47WMAZtz\nQIGAIL2QR6e03qhlKXt41jhP" +
       "nut/5XPldfAF2IRqe7FQOTAX5isg3TVvURmrpuQ47BSImLTavf/K\nkle/e+" +
       "tsEIUaFpZk5XKDYRUVwmOjnEldLjvvC4TUkDewG/H+9fDmU+e/vriqGuIMDf" +
       "kyz4/JM2e5\n1/SWoeIsVKYq+Zf+3Pjbkaa17wVRGNKR21qBMILsHvDyqMug" +
       "kXI14rqEkqg951O8jYGB5moU5muU\nL50yPMAX3R4BRSG7fiBy54WP2s8Kjc" +
       "s1r6OmOE5hJjMoVvX/tIUx3F98efLIC1cP7ghBzpqm9DlD\nEdPOEE11AOXW" +
       "+qTj4mV52PxycqTzuTX0feHiVq1YtJmSIRiKtEKIMYezaSaqVKymIopCBJaI" +
       "ZqCg\nQTKkCRCSupqBEoRng5IRX9x99MXh1y7womIKw/Tw5BOSIkdcDAX4us" +
       "r3yM/9PIK7q2pDGdgtFYgO\nT+2c2HVoudC8ltxq9+ASRyV/Sm7gXaYcE8XM" +
       "Y7+fPta2tCrh6lpyA2Jd5tqW71eUKVfFlhhBsV8I\nbUQIzG0WT9m6zg1bfp" +
       "K6aEa80kXhkTuq/2ZVX3Ssg49ciz6jnNkpa3NXvVPX63bxnuPf4+F1UbVB\n" +
       "YWllhrmG4BImFRMHXXkttGbe6rBZNMlq9oSmHhpeubr9J8iemxSGmHuZwjAR" +
       "6Fx+zrNFVAzlP1eM\nQY9RvPLESr0PhwraF0Gek26x8PX+eqSRWvNA1lr1go" +
       "qo6xUCdICJWuDrgm+B2znEf/4Y40uXTGy+\n3D1vKP9rnI8xFLJsnfob+aSl" +
       "FaFPltxG/vzAGz+eupzqln6W084K38BRiyMnHsGl3eSRtmw+DgL6\nzB3LTu" +
       "xLXcoEXekeYChcMrSsUCDpz5G6w7qK8fi3Er60a7x0I+P5kywokgyqGBWzaG" +
       "PjVfubd1wS\nnVEa62Ro6Frww54hUezDGYWWg7F+zvSPkXXToZCzraLVbfAN" +
       "zqNVOdM7q0VAjpINZPc6u64wpdW9\nH289dv1bdkk4u9qsOJ0+x1/Wtik1ff" +
       "S+86VY5J3jxSBqnkGdYvJWdLZNITbvGzOgNB1zL5Polrr3\n+jlYDn0jlfzq" +
       "80ZbDVtvm6zNtDCryzHRGXc4AWTyjdogDBjQ0nSFyJoL8UCwnmcFATNhSjtv" +
       "hrwB\n7/HtjOMrb64nFlY9MUZgnOIllz+tdXwu4edRKZmg+T+ktgF6qJxtg8" +
       "CQtnXmD3G/FusdFZt8PhQM\nUpCdRQgMkZy+FA3U2KbuBizaJKZLPlks9v1O" +
       "lL9m1OXndq06bca+lClU/sXRDGN/ziak1r01+4hp\n4ZwmhGuWzjbFv/3Q/x" +
       "pNuUwEYPUshH1C4hwQ4wzH4aenRbTYTuAfeNyOsDIPAAA=");
}
