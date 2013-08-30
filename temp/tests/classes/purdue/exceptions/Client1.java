package purdue.exceptions;

import sessionj.runtime.*;
import sessionj.runtime.net.*;
import java.util.Hashtable;

public class Client1 {
    final private SJProtocol invitation =
      new SJProtocol(
      ("H4sIAAAAAAAAAO1YW2wUVRg+3V6gLZTKVSx3KLfIriAQpOW6FBCXUmlBIwpM" +
       "Zw/bgdmZdfZsab1H\nY4JEGy8gEUlIvIQY9QETo28+GRJNfPDB4INP+CCJPh" +
       "hjfBAT/+/M7Dkz2+1KrPWW8vD1P/Of/3L+\n85///5f3fmC1eY8tyfN83nKd" +
       "43ExmOP5OJY+1b2nm4seIo+YV75q/8ARc67FWFWKTcjybC/38oLN\nTB03+o" +
       "1EQVh2IunaNjcFaWob8Njyiloly9fM/H9VUnOt2WfZacGWp4riCSmUUOKJiD" +
       "gsLS6xBHR7\nj5MrsOUbeWlC96X7MmfeijFGEjNyrj2YsV0RSPh7trV+dCD1" +
       "3Sfz/T0tZfbsk1qPmDfWz5n75bZv\n66vh8sScm7dwasFuTRWF/Ih0BZy2gV" +
       "xuIEehXopoxcGL62jllxxwsm7aOmYZvTZPWXlxY0rr6g+/\nH2qWIamx6Ytg" +
       "zaFIYw9Ofvsfq9PfZ29nT31++Jd5UmmV+TB7glVJp6ZrLSnLOcHTUD9pRfdD" +
       "e46e\nWlRNwcidrMEF0dZlFS41uZ1nrGF3ilAurSAVEtpon7vydtePpyAE72" +
       "K5ATLZWjGPnHQ5g+sqyOwl\n2shQXLLZgmOZhlCJeGndM1dffTrxc4xVH2IT" +
       "uc2z3BGU4/MO+aG3DSeT6BaGeaLHM0ze4W9oS7HG\nrK8TagSboZPAT1iZpy" +
       "lWJwwvw+kmp0bUeZaTaVPnxd+p8tyV3s9+bnKrnw8/OsSnUaoVvKLXcZiJ\n" +
       "D/c6tnNle/tvi+6CVI7E28hkSwUBo/7T80vXf/NsjNXczRpsy+GdBdSAFGtK" +
       "c9M2cIykbeTlCWbS\nqzhm2bzTyPJg3ZDlos9Nqy8wWreA0lrb7OnzuEFvv9" +
       "En4uAINplipr2R6ueSvy3iT96yYAsrsQOr\nde2WY4nNytwUcfMXItj0ki9S" +
       "KVS1KoWbQSwDLBdsYv4EpZugt1tkN2g2YKVirAWxGLBERBJP7Xgg\nvKPecd" +
       "M8abuO5n9R+SiR2iyPEvkSxKdeeLxUL4jVgDWAO0fBuKoZgtWYbm5Qsc6Km+" +
       "tXlFmhlbqA\nhFJ0AcRGQNuIxgEbFIMuSrcaI+83BsS32GY6iYblW8LLIGA1" +
       "InxHm0SoKJaqCrwuapte8kWdZZtS\nt1WEKnO/RU2H1HR5rnBN195Bz5Pejp" +
       "O3DeF6gs0diRV4OksEX3h0o7J2B4idgF2UCDY3+nnSsDV/\niOKkmqfvTYfn" +
       "ud5uw0lT4cgcxCd4MrvcZ3W8PUWFVc0gUoC9gtVKg8rYZTpQibEktWI+IJSZ" +
       "adEP\nysA+ZSAm2G0lShBrpaE5tAqiNE1u60hn6Fb29XPPs9Laqa9B9AAOUI" +
       "TUTsV/n+SVPVx/8a4bIznT\nICWTmIiU6HUQ8okfKqpGu1b8LTSFRFTLorzd" +
       "TQ/KNxFaFeurNuJxXYB+1UcAHCx3NsD9+lDaM8CD\ninGxrEtIKe2Sv1JX0z" +
       "sWflyPMg4rxiClYsTBbrfgmXwndTD/OYeWf4mLl8OXWCsvQPE2hBP6mIfU\n" +
       "ddLxIPm6KFQUstAquMVqr6DuLtYjQtOrUtFt9vF0weaUz02KDsQnkDi0qRfx" +
       "E4hBwCM+d5drqBde\n9XGY22gIwbM5EdlxQe8APPlfZdgjMVaEQzCFAtTj0j" +
       "SRoy5uhdr4u+HCom4CGy15EZOLZPEeTH+t\nFJwG8TzgBcEmBVxkoroqdpIm" +
       "SmUja1hOfC8BFQf8CfTW5mn41DnWCeJlwCuAM4oxi1xSjQTyZfY0\ngTgnGd" +
       "TWYJBGxzklv5a6bBrWdrt2mns0WF/77LGOe5475f+ccfQIGBn//FEYMbAtGj" +
       "jXFLCpRY6m\ngem6BSDmAyS1UE+DIPyZB6DHLJrbbu4HhOzaejnSxPYG4E2A" +
       "HskaRmKsjXq1qtyIBtBDySoQxcHH\n/y08xvMVQI84Z0HooWhU0xKILYCtAD" +
       "2sbAKRBOyIMuQ+f64A7C43cADUYMCGQPiDQYQRnhgAqtP7\nlfdewP4IoyoG" +
       "Yoz7jIzGUcDYNbmLIDKAvjGzMXIjBSFrhjta45ejNnS52wBC1oZ+wEnd9UDo" +
       "Uv1o\nuV4GeLxcGwP8S1rO39y9AKd1wwLh9xvAULlGBHhRtx8Q5XrJyE0GxL" +
       "kyjKYo4zXJOB9pEjvcQi/1\n2OFNYuNomgQIXcD/sZIPeGe8rI+X9eHGx8v6" +
       "eFn/v5R1wOu6hMv/tG76HZyxKWeMGgAA"));
    
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
    final public static long jlc$SourceLastModified$jl = 1376065377000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0abZAcRbVn727vk9xHjpDk8p0LJJrsCcX3JcTkSMiFzeW4" +
       "uwRyKbjMzfbtTTI7\ns870bvZioEIQAsGKEhLAGE1pQSEKSoKIlhZaJYiKSA" +
       "kYohT8MJZCCZaUpVAK6HvdMz0fu7dEQ1TK\nXNW+e9Ov+73X3e9rpvvBN0iV" +
       "Y5OEQx1Ht8zNCTaWpQ6H1vBmqjEn0b+6V7UdmuoyVMcZAMKQtuk9\nff3h5p" +
       "2rYkQZJC2mtczQVWdg1LZy6dGBUd0p2GRW1jLG0obFXI5FPC6d+87Wn+1a3V" +
       "ZBGgdJo272\nM5XpWpdlMlpgg6QhQzPD1HaWpVI0NUiaTUpT/dTWVUPfBh0t" +
       "EwQ7etpUWc6mTh91LCOPHVucXJba\nXKbXmCQNmmU6zM5pzLIdRpqSm9W82p" +
       "FjutGR1B3WmSTxEZ0aKecT5AYSS5KqEUNNQ8dJSW8WHZxj\nx0psh+51Oqhp" +
       "j6ga9YZUbtHNFCMzoyPkjNuvhA4wtDpD2aglRVWaKjSQFqGSoZrpjn5m62Ya" +
       "ulZZ\nOZDCyNRxmUKnmqyqbVHTdIiRydF+vYIEvWr5suAQRs6MduOcYM+mRv" +
       "YssFtr4w3v7u59axbsOOic\nopqB+sdh0IzIoD46Qm1qalQMfDuX2Ne9ITct" +
       "Rgh0PjPSWfRZNu+xdclXvz9T9Gkr0Wctt8Uh7Z0L\np01/btlvaytQjZqs5e" +
       "hoCqGZ813tdSmdhSxY9yTJEYkJj/iDvh9t2PFV+ocYqekmcc0ychmzm9RS\n" +
       "M9Xl4tWAJ3WTita1IyMOZd2k0uBNcYs/w3KM6AbF5agCPKuyUY4XsoSQavgp" +
       "8FtCxF8dAkbqugyd\nmuzchLOZkYWMOszpcGytI5uzUznaQQsazaKGTsew6u" +
       "hah9+9gLwnbFUUmNa0qIsZYI+rLCNF7SHt\n/uM/3b7iyttuFRuGRuZqxcgU" +
       "ISbhi0m4AoiicM4T0RjFYi2zbXUMnaRw43PTP/eU+gVYelgCR99G\n+QyVrZ" +
       "UIYdB5ZWNIl++B3YCpYCBDWuuOV6ceeP6BJ2OkomQcScrGlZadUQ00Bc9xWl" +
       "xxUQpYUHvU\njkvJ/uPuNY8cffrl+b5FM9Je5GjFI9FR5kRX3rY0moJA5LO/" +
       "+2+r/nRn1SWPxkgleB/EH6aC1YAz\nz4jKCDlMpxd8cC4VSVI/UjTxOgYLtD" +
       "UwYYQNCJqEdcBetEYU5HHr7ZviH3vxe/VP8hl7Ia4xEAv7\nKRMO0+zv/4BN" +
       "KbS/fE/vnfvf2LWxAlw0mxV7zkg8mxs2dK0AQ84K+xiql0Kzef1IZ9OeRc63" +
       "+BbX\n6plMjqnDBoWYrBqGtZWmhhgPSs2BAMjjDqxEwzDELwiFQwYwEnPNKn" +
       "kwzxIRIjG5dd9dCw6+iDEk\nyxdmEvoa15QUeEO7gnB+ERGfp6MFt/rTBq/f" +
       "IibQsKD/2tWbbp3DZx5kt9B9KEiGvi+cX9YXVmKu\nAZthFgQd32Q23X7sqj" +
       "XXXN0hwuC5ZVn0gEOnOB9//P5uc+njZx41Y2glcWezdPokiTmMkflJj6Vr\n" +
       "efgosP7V/YLkpYKF7z8BX7C+/a83Hnl2fwMIHiTVurNSN1UDd9vpEd5bIk1E" +
       "WGx7fN0X336GvcJt\n03cXVH9aoTjUrVcDnnzx0Xxz/OFDmRipHiRNPNWrJl" +
       "uvGjm03EFI1k6X25gkZ4To4cQrskynDAfT\noq4aEBt11MrAaldib8RrhG/y" +
       "Po3/EH/v4Q8NBx9EOmjpsjJZyCH2rCsoTFplNJUtKEoWh13MB8/g\ncLawvx" +
       "gD0bjEjFRnbT2vYsWEJUleZ7w04p0nMtImN9HOmUzPUKzlXLPjkULhHrEUDL" +
       "Y9st/SNBJo\nGkzk6aeOLj5ismnH+SZVuwUaVkl+CIHMacAa8tRrg6+V4yoN" +
       "bkhz06MiQpM2qhsp1Ow84DG3rCWK\n4XdU999/dXrfvTHXm+uzPIyd7fuzr5" +
       "fTvs7MWCl9ROdxCDz8ncZ55z76+p4mkQn8WANe8P4M/PYp\ny8mOp697awZn" +
       "o2jIo8sNRQtlYDinzIp0LadpvWhBMBacXWZUYNClxt1P3df75q3eMlyexcg8" +
       "r+wm\nmKlSAi8oM2YN4FBUgs1mcqaucYsTPO6/4KZjd+3s+AvE+o2khho0A0" +
       "UFGMiMjaHqFoL6gA2lygrR\nATypPiN4Dnh+A/GLqXaaMlG0eJPB/z18UuUs" +
       "q49qVM/T4nnh8LVgGjnbUymBKiWKVYqt/Mjixe/O\nuYRnExi+HES2lRmg1j" +
       "554OwLX74Zsn03qcP6sCeH3pEkEzCUqFjQ86zmRogaLBl7/IhRJ14Kevwy\n" +
       "jZD4LHhT8WVCWURVeMOoF0gCKYycAWvka8PZXw36trF/cwsZmV2O7EqNL9ZN" +
       "nV0mxTWyE98QRloj\nLZwpshqSDC9DhLcNM1LjbAFbYm5cQ3KdT0aQkoTzEb" +
       "kWwXUsZFWyx2CwR61ppWiXYZk+/eflpxKK\nWnwqoRZ3fWoZVE0RvohsQcBD" +
       "b+YkCMd8AiOVmpUdk6T97MQiOVhW4ElugC4ZHUSEe19uXOEIbEmY\nzwKhWn" +
       "VEpsb19cJ0D+AouTn46C4Yz5iS1RIWiHhRVq7WHrfWSIucyycluw3BLc3r8P" +
       "IXyIOXg3vi\n6OU5HV+cIFiNS3N1nTCMj7x+wQ5STCciOxDcCBZgUDVPu6DG" +
       "lfQ9sECyjBFqrLBty16lmimIGOn1\n2GSBBlNKNct5fcpjqDQhcguCXVARcI" +
       "FS2GFGpkeEuZ9WpJiJ4QYp4DYpAAqNqREmuMiSQ1PgyV2c\nibzbilQatmNt" +
       "ntq2nvKV+hUiexB8BlZI9pT0h1igtMd99za5PmQsdXxkFxYJcuhriOxDsN9j" +
       "jald\n0pcyMjnEmkfj5VZqjDtD4MkLrL4QeDmTfP7uTwHBZ0vNDcFef1K+Zg" +
       "jukoRDJVVCk/JVEk9yaw6e\nCj1eCxPukYQx/FQQVLDfytkaXQmpS/hx4PED" +
       "UfFwcBOr+AZI2sVBgx6x0XTNVMI1vl5YKliywJO7\nixVQ+HosYgMs8G1Jsu" +
       "jXRuHV3UDXnyBxd3g1DEdu0iP+jMgjCL4pqFdYqvRw5dtBar3KGM1kWajH\n" +
       "Qb8Hgu+cJvxHCMZ4hAXBHWuE/Ryw8F0Mqg09UG58LRgHpeF4L20QKzzUMxtN" +
       "PEsGuxF5BgGUFw0u\nFR1HWhbZCq+BUkYGXn4TawBALMN/Lt8qePW0fZfoQe" +
       "R5BC8g+KUknAUqyYSH40v0mYAIT+YvQPpF\ngd5bY1OwzsXCFSfEvw+ex2uB" +
       "dbwedvnEZyGyAQGvrDb6JSgiotBC4Nd2UCye2CsJLxX8x/HKxN8g\nOI7ATw" +
       "d14xHOD2uVLlUXIvAroUWIeNWWeDU9xUUdAr+u4kHZr8ROqkRDZAzBNgR+hb" +
       "QEkesR3BAm\n8I0VNQ2CnaWKHQSyKBFxXRQlIUKwWkEgqwwR9W9H8OkQQYkh" +
       "copz3FJEDiD4PIJTkmAPIfIlBF8+\nZTLGT+KIfAXBAycr/HBYxkN+bkbkGw" +
       "geRnDYz7iI+HH30VJ5FMFjpVIogv+R/PH/SziRzIngaT9Z\nIiJyHYJnSyVB" +
       "BL/wUx8ipfLY+AkOkWMlCBPChF+XyGmXW7lhyO/FOW3ZyeQ0RPx881/LUAhe" +
       "O52F\nTmehYuGns9DpLPRhJXzIsxCCl/yMw88hVovTjNDBHj+Nm+seVhOE4r" +
       "DaO2l27MA3kMgVHX69aNc1\nbzbcoj5xrTjEaQkfya8wc5kLDh2jCz7eoJW4" +
       "FVLLrOwig+ap+FqB59kxcdwIYheVPYRbww8v/APZ\niv6lC85ZWP/7GKkc51" +
       "pHs9vYR1nONgPHPtBb/Zfve8yMLEpUn+Z821UVo/qPY/ygVpztFl3UCg/q\n" +
       "DJ/o1tlhRfkWtnEFGmGJauA3F36Tifjj/5HYjKBFXMsAoGwWexu5iODfG4ie" +
       "kvfaekZn8qTkjhn3\n/u6R432tYvvEjbO5RZe+gmPErTPvUBQkzC4ngfd+4q" +
       "OzH7yh75Vh98RMsRip0E1W+g6Fpzo+Q501\n0a+zVni3iziTvP8tTtkmTvKU" +
       "6xmpzFt6ClkqNwcsnTdsL5RuURy57Pg7B34Xuct+UallL3YzntHn\nMhJ3+J" +
       "XD8hMrvhXHb0SJ/ThS0f5m7LuT2vkln8ph1ZGnl6HrhMW3BUOXALmedXJWU+" +
       "A3831m9VLJ\nDcDSUbmzoBC8OaDsH2fmS0SUgfkb1Ezz22rKdgR7C0WeX7yt" +
       "/FQLD749mrg0o1sJeTsTiMV3YlAA\nE/pxWeN7w4ne2VEO4fcYecgWrvLFVY" +
       "5C2b1FHjs5p93uJzBuiKXNcW+ROe4twBpWuzfn8LrB5Khr\nuRcztTnPbZr/" +
       "w2zzT4SZeJcnq/EYOGcYwYsjATyetemIzne7WlwjyXJdv85Ic9EFPkbq/Ae+" +
       "1g+J\n3of5JS3sjU9HuGHcV1D+CUmG8Dz3KwAA");
}
