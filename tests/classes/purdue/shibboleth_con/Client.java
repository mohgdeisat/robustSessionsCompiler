package purdue.shibboleth_con;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Client
{
    final private SJProtocol
      pDisoveryService =
      new SJProtocol(
      ("H4sIAAAAAAAAAO1da2wcVxW+XsdxYgfHcV4NTkoIeavYidJUaR2axK/G6cax" +
       "uk4oKW0y3r1ZTzI7\nM5m566yhQAmPplQNVNBErUCVoFUQDY+EIvoPVYgWAi" +
       "qFQlWQ+AHtDyqBEEJQJFLEOfO4d2Y9u/ay\nsbOe3Eg5PjNn7rnnPr/vzM7O" +
       "XvwrabAtstamtq0a+vEONm5SuwMPXS21L0XZMKhH0i+/vvOyzla+\nmSB1Sd" +
       "KYo7kRatmMLEseV8aUzjxTtc4eQ9NomoGnroJFNpb16phcz8T9V+d4bkiPql" +
       "qGkY1Jv3in\nU6iTF+8MFceaPlBUE0pj5DiEgnW5lTzemLrw4exXnkkQAiWW" +
       "moY2ntUM5pVwr9mz7ocHk3/+0fvc\na9ojrjngeD2SvnrbylW/3vPW/HoMeZ" +
       "5p2Cq2mpGbkn4ht0eGPEtXwTQLJnT1euytDrR1iN6y1x7U\nc0ZGPaYqIxpN" +
       "qja7unDd1h/85Wyr0yVzNDjDSGugp/EabPktk7sT51d0k4d+/sA7NztO69In" +
       "ySdJ\nnRPUEuElqeonaAbdL9iUun/f0TNr6qEzzFNzcIDg0g1lBrWnm2bVCW" +
       "OKXbm+TKlAoTu08y8/O/T3\nM1gIo0uYBahyU5nCB/LsFMwXGlXpujLlkoZh" +
       "umVO7Pv64Rf3/Tvp9vSIkRnHmuv9+rF7yjlKUT0T\nVfn2MmX2g65kYWByub" +
       "yuphXGV8KF7Z9549zpzn8mSP19ZB7VaI7qDBbZzfe5Y68perYzxZT0iWFL\n" +
       "SdM+94KuJGnOuT7RDSNLxSx0V4yzUJJkLlOsLIWp1BZyZ6l6tmuKHT6gj1iK" +
       "nh6NWLmed/SzolB+\npnRH+kgcJm2q3UtN6FNoljaOF2RwS1CgMCOLAwtgr2" +
       "KP7ldMETb+XeqEX27fuYemqToWMV2w+DLP\nTRsOu+8P/64O+Me/7XABgZoW" +
       "iXXjxdPQ+PsXf7zs6K/qSaKfNGmGkulX0sywBsh8NmpRe9TQMgVz\n126n4g" +
       "Wn5oFshf8JcLaUh+04hDmqjFAt0DsDZN4o1NJjZGiS1GvKSHgc3a0JNprn22" +
       "45z8jyPXk2\nCr3oza++QpqaqLgt27Rirw3bVfOgwQ0TWlq+Jwf0yIVXPA9Q" +
       "Lvb70+031DZM6IJ6N65F9rZ/Aahg\n8Ialfiwcux+ambf8JdGBbe+YuCQS/Z" +
       "t37nx3ze04tia4T0Fz2ssUUOb/5Kn1t/3hcwkyZwAGTtXp\nYB4RLklaMjSt" +
       "KbhGejTFdkJYAXv+MWj8oJKj3nFTjkLEGX4GK527GjZtUecwTAAFkK3ZVTrQ" +
       "wsh7\noKtENI77OyDedvZ/biGMvL+c2at17k5VV9mdvLqFbIq7HCOLgoeOO3" +
       "TSzV3diUovij5G5tknYBdj\n3tChuUmYUdzFDbeishvFHhbaz/gVh4NXzNdh" +
       "HfRohi7sr7Cpcw5GlhSd8XpmPrNokd83UBlEcYCR\nOWnDHOemjSxAPhTbpQ" +
       "oYmU88BkH3ek0celXNYcHW3R4cgmJX7obpO1scPuG5W5ZRbSU3ombzCqOi\n" +
       "Ol7BVUZWFe8xMENMmMjWQTi0nT4JneHDe5h7WVuuxQirgRaLwwhHV1H5KIr7" +
       "Q4a6ukoNZCsLYFZ0\n1/UAhPiRLZ94soL4yHZU7kXxkelqUemmrkXlCIqjM1" +
       "75TERFtrEAWyweSy8Z8QdySdGZSkbx3uBm\nMaYCTQf/Q5bBjLSh9cKWj267" +
       "85CLUAsIWEmbt/haRvCwX6VaBi/g1XSh8nEUD8LeolFljPYomrCf\nheXE8w" +
       "w3jD7LMqy9ip4BFMoewlMGRLAi6jRv8Kd4x7ai8mkUpxlpcCrklV2CHaCosh" +
       "7IWmiB8WoW\nh0/wCj7LK0gw8t4iJ9j73ENr4MjrnMXOZX2ZLIzTgTFqWWpg" +
       "W/odKo+g+AL0EL+S278N5Xl9OCH8\n0W8O7X5NTskeTB550bdR+SKKL/muMb" +
       "Ph9l2QsIVcOwjfDTkA+m8NHPlgLSqxqMC0/4gmoHg0qm0o\nHhONEpGheJwb" +
       "no4MCaeUCMk94kNzfjrieDts+DI3jMNUDAWYMvJWmvYDZri7fuDwmoR4KTiI" +
       "Dc4A\ncNuO4IQ+ZuHU1TMd3uQbgq6CLgsceaNYb+X52CWGWSDR5y5S6VGayW" +
       "u49Fu47hVvhOLoja+If6Dy\nHRTfda13GQpf4XUvBK3NCmM0Z7LQFV8VV6B4" +
       "XhpmxKCVMmwKjthCGM9hA1kR8Fg1QGSfC+6DfOL4\n9An2Cl/1p03aPeYOnH" +
       "n+UxQ/Y2SBZ8WFw2cWOQUpHq8jp6h6x34QsJfhH89vgw35llgSDk99BcUv\n" +
       "UbzKDcshJA54WD7imhZUXnMMQE+xQkibVhbdBxvSIFHZayD4HUlfePPKg313" +
       "P3LGvX2ii/SHedmx\nk/p0GwYgEQSeSA1Nln+aeVR2ODmbF9fc1ajsRPEhFC" +
       "JvaUfFTQlQiCxkYflcIHQfwCESoTOl0po/\novgTCpG3NJUy3BqObV9UHoMi" +
       "KRIYVNxEA8VQVAaC4h6Rf6AyjOIgikMim0ClEpI6E8ySbEXFmSHH\nphiVJN" +
       "vTSrZROYWiMMXxcIbC5bMoPhFFdFFwQkrOouIS0pAhyFRRcIbpIv7nUTwcMt" +
       "QlUJlmfrML\nlSdQnEMxLeTqaVQcXPratNVRmsCh8g0Uz1Rb+aVwHd8UvAyV" +
       "b6F4DsVFwbZQEZj7vSgOheJyFH1C\nUSPc4cY1TIU1oXhJECVUXJ6D4koUAU" +
       "LxC0F7UIniMKXJDSqvRRhawobfOobXQ/dl3Q9AAtzknRde\nugJX9BVM1aKZ" +
       "CXefJxKV4WqICiqCPtQI4ZBMRDIRyUQkE5nWBkomIg03LhMBUbeNkfqBzNC1" +
       "IxLi\ng9XID2RRFBGJST6KRTEFIvFBVPyPSN1HuCSXkFziukQluQSRXEJyCW" +
       "mowBAfLlFwbmQ4gtOK/TGg\nFdjEJyfnFNeTbNQmHNZmVBKkiQRpCdLSUIEh" +
       "HiAdBGaOdLPtg4PKgVnib01FJfGXSPyV+CsNFRji\ngb9ekhy67141DscgQa" +
       "4cuVeV/9KY+I4t/zJQ6JtWzpdtubM2VsEXfRlZWnzKf2QzIXa1Rjx8EsVT\n" +
       "YcMDeIgbfeJcuDuvYa9dy34OhRtoR1upBs5Ey0uG+wSb2gsFGGkNHPFHbkVM" +
       "uBElcAtJXJxi1SW5\npLOYBdsRht0s8EXlyK8BWYpua4rz1ZZVpUzejF7OvD" +
       "M0fCGvbQs25jKK7+MpyZQkU0IhmdJkhvhQ\nD8457q6Wc8ye3D8ukCfBfiLY" +
       "nwxh9AyD98kgnCb4riBxtoLKJc5KnI0zznJEi39uP8tARcKphFMJ\npxJOSW" +
       "1hoITTcnDaUy2cxiBtlfgk8Unik8SnWW+IBz4Fn6jimBL/bE+ikEQhiUIShW" +
       "a9ITYoVOrd\n1gnn/CZzx7P4Hspe1U4bY9Ryn32JeLe4f168YKS/WlSbPS8Y" +
       "uYYwMQNPFssncomEIglFNQossTfE\nBDl7U5Mg58P9N/2GkSbdYPjiXdV7pX" +
       "W78yMVm8s/NRr9cyXuFruyzO9ReDWveavvKCPLBo2BzFCK\n4g/pBN4I5v2W" +
       "xunNW7Yw0hy4wkd0geCD1SL49cpLaxN2a/KVG9c1KslEiGQikonUKFDH3hAb" +
       "JlKY\nhBC827Xkv4wsgSTe1JTxISVLp/7TWoIOVP1GjppL6GfiZV4S9SXqS9" +
       "SXqE9qC/tuXEN8UN+RLn6/\nesXYwEij6d5pMF0TR+6+apE7Bh8wyzvuEvEk" +
       "4knEuwENsUE8Dmi91QLa7HmgV+KWxC2JWxK3bkBD\nTHDL/4mmQwcf+hsjzb" +
       "rBH6YyC+EHgXdXC2uzJ0+Tj/XKx3olQkqErDFDbCDH2Sla/gdnVO3KLI0A\n" +
       "AA=="));
    
    public void
      run(
      int singleSession)
          throws Exception {
        final SJService c =
          SJService.
            create(
            pDisoveryService,
            "localhost",
            1000);
        c.
          participantName(
          "Client");
        c.
          addParticipant(
          "IdP",
          "mc05.cs.purdue.edu",
          7100);
        c.
          addParticipant(
          "SP",
          "sslab05.cs.purdue.edu",
          7101);
        long startTime =
          System.
            nanoTime();
        SJSocketGroup s =
          null;
        try {
            s =
              c.
                request();
            boolean doAgain =
              true;
            boolean ex =
              false;
            Boolean doAgain2 =
              new Boolean(
              true);
            String req =
              "hi";
            String res =
              "";
            String ticket =
              "";
            int count =
              1000000;
            int i =
              count;
            String str =
              this.
                repeat(
                "a",
                1000);
            {
                SJRuntime.
                  negotiateOutsync(
                  false,
                  s);
                while (SJRuntime.
                         outsync(
                         i-- >
                           0,
                         s)) {
                    SJRuntime.
                      send(
                      str,
                      "SP",
                      s);
                    {
                        String _sjbranch_$2 =
                          SJRuntime.
                            inlabel(
                            "SP",
                            s);
                        if (_sjbranch_$2.
                              equals(
                              "Discovery")) {
                            {
                                SJRuntime.
                                  send(
                                  str,
                                  "DS",
                                  s);
                                res =
                                  (String)
                                    SJRuntime.
                                      receive(
                                      "SP",
                                      s);
                                {
                                    String _sjbranch_$1 =
                                      SJRuntime.
                                        inlabel(
                                        "DS",
                                        s);
                                    if (_sjbranch_$1.
                                          equals(
                                          "notPassive")) {
                                        {
                                            {
                                                String _sjbranch_$0 =
                                                  SJRuntime.
                                                    inlabel(
                                                    "DS",
                                                    s);
                                                if (_sjbranch_$0.
                                                      equals(
                                                      "DisplayPageException")) {
                                                    {
                                                        
                                                    }
                                                } else
                                                          if (_sjbranch_$0.
                                                                equals(
                                                                "NoException")) {
                                                              {
                                                                  res =
                                                                    (String)
                                                                      SJRuntime.
                                                                        receive(
                                                                        "DS",
                                                                        s);
                                                              }
                                                          } else {
                                                              throw new SJIOException(
                                                                "Unexpected inbranch label: " +
                                                                _sjbranch_$0);
                                                          }
                                            }
                                            if (!ex) {
                                                {
                                                    SJRuntime.
                                                      outlabel(
                                                      "IdPSelected",
                                                      s);
                                                    SJRuntime.
                                                      send(
                                                      str,
                                                      "DS",
                                                      s);
                                                }
                                            } else {
                                                {
                                                    SJRuntime.
                                                      outlabel(
                                                      "NoIdPSelectedException",
                                                      s);
                                                }
                                            }
                                        }
                                    } else
                                              if (_sjbranch_$1.
                                                    equals(
                                                    "passive")) {
                                                  {
                                                      
                                                  }
                                              } else {
                                                  throw new SJIOException(
                                                    "Unexpected inbranch label: " +
                                                    _sjbranch_$1);
                                              }
                                }
                                res =
                                  (String)
                                    SJRuntime.
                                      receive(
                                      "DS",
                                      s);
                            }
                        } else
                                  if (_sjbranch_$2.
                                        equals(
                                        "noDiscovery")) {
                                      {
                                          
                                      }
                                  } else {
                                      throw new SJIOException(
                                        "Unexpected inbranch label: " +
                                        _sjbranch_$2);
                                  }
                    }
                    SJRuntime.
                      send(
                      str,
                      "SP",
                      s);
                    res =
                      (String)
                        SJRuntime.
                          receive(
                          "SP",
                          s);
                    {
                        SJRuntime.
                          negotiateOutsync(
                          false,
                          s);
                        while (SJRuntime.
                                 outsync(
                                 doAgain,
                                 s)) {
                            doAgain =
                              false;
                            SJRuntime.
                              send(
                              req,
                              "IdP",
                              s);
                            SJRuntime.
                              send(
                              req,
                              "IdP",
                              s);
                            res =
                              (String)
                                SJRuntime.
                                  receive(
                                  "IdP",
                                  s);
                            {
                                String _sjbranch_$4 =
                                  SJRuntime.
                                    inlabel(
                                    "IdP",
                                    s);
                                if (_sjbranch_$4.
                                      equals(
                                      "AuthenticationException")) {
                                    {
                                        doAgain =
                                          true;
                                    }
                                } else
                                          if (_sjbranch_$4.
                                                equals(
                                                "NoException")) {
                                              {
                                                  str =
                                                    (String)
                                                      SJRuntime.
                                                        receive(
                                                        "IdP",
                                                        s);
                                                  SJRuntime.
                                                    send(
                                                    str,
                                                    "SP",
                                                    s);
                                                  {
                                                      SJRuntime.
                                                        negotiateNormalInwhile(
                                                        "SP",
                                                        s);
                                                      while (SJRuntime.
                                                               insync(
                                                               "SP",
                                                               s)) {
                                                          {
                                                              String _sjbranch_$3 =
                                                                SJRuntime.
                                                                  inlabel(
                                                                  "SP",
                                                                  s);
                                                              if (_sjbranch_$3.
                                                                    equals(
                                                                    "AuthorizationException")) {
                                                                  {
                                                                      doAgain =
                                                                        true;
                                                                      SJRuntime.
                                                                        pass(
                                                                        new Boolean(
                                                                          doAgain),
                                                                        "SP",
                                                                        s);
                                                                  }
                                                              } else
                                                                        if (_sjbranch_$3.
                                                                              equals(
                                                                              "ExpiredException")) {
                                                                            {
                                                                                SJRuntime.
                                                                                  send(
                                                                                  req,
                                                                                  "IdP",
                                                                                  s);
                                                                                ticket =
                                                                                  (String)
                                                                                    SJRuntime.
                                                                                      receive(
                                                                                      "IdP",
                                                                                      s);
                                                                            }
                                                                        } else
                                                                                  if (_sjbranch_$3.
                                                                                        equals(
                                                                                        "NoException")) {
                                                                                      {
                                                                                          str =
                                                                                            (String)
                                                                                              SJRuntime.
                                                                                                receive(
                                                                                                "SP",
                                                                                                s);
                                                                                      }
                                                                                  } else {
                                                                                      throw new SJIOException(
                                                                                        "Unexpected inbranch label: " +
                                                                                        _sjbranch_$3);
                                                                                  }
                                                          }
                                                      }
                                                  }
                                              }
                                          } else {
                                              throw new SJIOException(
                                                "Unexpected inbranch label: " +
                                                _sjbranch_$4);
                                          }
                            }
                        }
                    }
                }
            }
            long duration =
              System.
                nanoTime() -
              startTime;
            System.
              out.
              println(
              "Each request has an average latency of: " +
              duration /
                (count *
                   1000.0) +
              " microseconds");
        }
        finally {
            SJRuntime.
              close(
              s);
        }
    }
    
    boolean
      isAuthenticationExceptionResponse(
      String str) {
        return str.
                 equals(
                 "AuthenticationException");
    }
    
    boolean
      isExpiredExceptionResponse(
      String str) {
        return str.
                 equals(
                 "ExpiredException");
    }
    
    public static void
      main(
      String[] args)
          throws Exception {
        Client a =
          new Client(
          );
        a.
          run(
          1);
    }
    
    String
      repeat(
      String str,
      int n) {
        String str2 =
          new String(
          );
        for (int i =
               0;
             i <
               n;
             ++i) {
            str2 +=
              str;
        }
        return str2;
    }
    
    public Client() {
        super();
    }
    
    final public static String
      jlc$CompilerVersion$jl =
      "2.3.0";
    final public static long
      jlc$SourceLastModified$jl =
      1377543522000L;
    final public static String
      jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO1dC3AcxZnuXUmrZ2xJlo3fTwE2MRIk4IKIxNiyhGXWsizJ" +
       "jhGVyLOzLe1YszPj\nmR5p5ctRDlTODqkjx4FNcCWmKhWKyh1XFZOQo/LO8U" +
       "rIg8DdOdzVkaoruAtUwt1RVxeoO0Pu/7vn\nrdVaQn7I8qhqf/X03/33393/" +
       "4+vd2Z3H3yIVlklaLGpZiq4daGHjBrU41TMHqMyslr4dPZJp0Wy7\nKllWPz" +
       "AG5f3vK3tPNdy9PUkSA6RR07eoimT150zdHs715xSrYJLVhq6OD6s6cyROkP" +
       "GxdWfGfn5k\nx7IyMn+AzFe0PiYxRW7XNUYLbIDU5Wk+Q01rSzZLswOkQaM0" +
       "20dNRVKVQ9BQ12BgSxnWJGab1Oql\nlq6OYsNGyzaoycd0K9OkTtY1i5m2zH" +
       "TTYqQ+fUAalVptpqitacVibWmSGlKomrUOkrtIMk0qhlRp\nGBouSruzaOUS" +
       "WzuxHprXKKCmOSTJ1O1SPqJoWUZWRXt4M26+HRpA18o8ZTndG6pck6CCNAqV" +
       "VEkb\nbu1jpqINQ9MK3YZRGFk6qVBoVGVI8og0TAcZWRxt1yNY0KqaLwt2YW" +
       "RhtBmXBHu2NLJngd3alap7\n796ed1bDjoPOWSqrqH8KOq2MdOqlQ9SkmkxF" +
       "x3ftlge77rCXJwmBxgsjjUWbLVf+7Z70Gz9cJdos\nK9JmF7fFQfnMpuUrXt" +
       "7yenUZqlFl6JaCphCaOd/VHofTVjDAuhd5EpHZ4jJ/1PvcHYf/iv4uSaq6\n" +
       "SErWVTuvdZFqqmXbnXIllNOKRkXtrqEhi7IuUq7yqpTOr2E5hhSV4nJUQNmQ" +
       "WI6XCwYhpBJeCXg9\nTsRfNRJGqttVhWqsxTrASBujFrNaLVNuNWwza9NWK6" +
       "dkMroKZtIKdjsKDUFZSR10fBS33+ldwJHm\njSUSMMnlUYdTwTq362qWmoPy" +
       "Y6+98JmO2z9/VGwfmpyjI4N+fNQWf9RBGLVFjEESCS58AVqnWL0t\npimNo9" +
       "cUPvvyioefl74CewFrYimHKJ9yYqwcKXT6SMmg0u67ZBeUJLCYQbnp8BtLT/" +
       "z9159NkrKi\ngSXtVXbqZl5S0TZcT2p0hotywKSao4ZdbOz/uHfnN0//7NX1" +
       "vokz0jzB8yb2RM9ZG118U5dpFiKT\nL/6h/93+Xw9U3PxkkpSDO8ISMwnMCL" +
       "x7ZXSMkAe1udEI51KWJrVDEyZew2CBxgITRlqHpF4YCOxF\nU0RBHsjevSd1" +
       "3a+/V/ssn7Eb8+YHgmMfZcKDGvz97zcphfpXv9TzwLG3jtxZBj5rGGLPGUkZ" +
       "dkZV\n5AJ0uSLsdKheFs3m90+01d93rfVtvsXVSj5vMymjUgjSkqrqYzQ7yH" +
       "iUaghERB6IYCXqMhDQIDYO\nqiBIzNVIjIJ5FgkZLYubHjy+4cu/xqBi8IVZ" +
       "hM7HNSUFXtGcQLp+AhOvV6AFN/nThjAwIiZQt6Hv\nUzv2H13LZx4Ut9G5KH" +
       "gCfV+4oaQvdGLyAZthOkQh32T2f+GV3Tv3fbJVxMXrS4roBp/Ocjl+/2Nd\n" +
       "2uYfLDytJdFKUtYBz+/TJGkxRtanXZGO5eGlKPXt6BMsNzdsPPsE/IGVz/zh" +
       "s0+8eKwOBh4glYrV\nqUD8wt22uoX3FskbERGHfrDn5Lu/YL/htum7C6q/vD" +
       "Ax2u2VAp580+nRhtQ3HsknSeUAqee5X9LY\nXkm10XIHIHtb7U5lmnwoxA9n" +
       "YpF22rxwsDzqqoFho45aHljtcmyN5Srhm7zN/D+Kv/fxhYaDFyI/\nNLbreQ" +
       "OSirn6NgqTlhjNGoVEwsBuN/HOKzldI+wvyWBoXGJGKg1TGZUQQpF6Y5ti6a" +
       "PUHAfcNKo4\nUGUBI8u8rTRtyC15ihDPMT4eLxLcLzaD2TZHdt0zkBY0ECbS" +
       "9/Onb3lCY8tf41tV6eA2BE9+IIGE\nqsJK8oxsgseVkuqZ3aDsZM2ECFByTl" +
       "GzqNlHQMa6kvYout9f2ffYJ4cf/FrS8elagwezq3yv9vWy\nmvdoeT2rDCk8" +
       "GoGfn5l/5fVP/v6+epEP/IgDvnB2AX79kq3k8M8+/c5KLiYho4x2JyBt9MLD" +
       "1SVW\npH0rHVYmLAhGhKtK9Ap0+pj60POP9rx91F2GbQbG5w0lOu+y2RgsNi" +
       "026JUl+qV13RB9RnZ8deDH\nO95Ni8XL6NlxsXHO+LgNpQT1AdwqNviNJfrs" +
       "hDKAXXCdvK0pMj8kCBmP3XjPK8fvbv0fSDl3kiqq\n0jxAG7DQlXeGUDfkln" +
       "4TQFOHaAAOXZsXMvtd94UwyiRzmDIBn6a2ml1axoQIkSti0yFppc1ga1EZ\n" +
       "EF8bFWsbNWDBQGd1XORZcBYJOjOyIOCE2yUrt1My2jy18f9urn4pj+ylMlVG" +
       "i9gCdu91xHQbjk3v\ndioGAvLx/x5oQMJIwtGnovKff/z0ov0vlZFkJ6lRdS" +
       "nbKXF8RaoB2FArBxi2YGy+lQ9cN1YFtB6D\nHghb6KnNBYIBShmqBlani1Tl" +
       "YJR2PQsAo0yVMqjKpoLxrcaNDzFyxRab5RBeC2PpKMjUwIKYibxk\nuwUIuL" +
       "Zb9xgTZlZ65bq0ol4U3Xeku9z1E+uEJWnClMuEXg3WR/8A4RWV103nNBxWEV" +
       "QDVO/adwva\nd8tE+052XnPLLe+tvZkjJBDfB9NZVqKDVP3sias2vfo5QLBd" +
       "sFGQjrttjPVpMg/To4SnVo7UnKxX\nheeibj8L1oiTb7d/+iAktRoSlT8mQH" +
       "0qwTG6VhRakMPIh2CpfG24eAv0XcY+YDxgZE0ptjNq6hZF\nU9gnvOHmsymG" +
       "LMCuwUsuDoX8iSfqE1j4UyR3MVJljUBIYs7WIbvGZyM57DFuwAKPpIdYKDh5" +
       "LQaC\nLao1sPt2Vdd8/i/Z1LMvI02RGmdlqhmcAcJyX8HCESRHGSmXdWPcY6" +
       "1ngWQtWQKxoWZuou6GsrNq\n/qUzFEdOnqibg1sQFSUCpCtsQbjCEbcoq1hS" +
       "PqMM24CR/OG8Ac4wsiIaU1wstgcuLb4moRpvex/w\npDSXmjHmyMCM/csigs" +
       "5g4RiS4yGGAGjTYZDrWSBHFV+6dkgZrmZXTKychn7kRizcj+Qvz9eMJp9q\n" +
       "Mxa+hOThCz74hdCKfJQFoF90Lx1Y7m5kU6RmOru4LxgsRhVLYYGTwjYI+Sh2" +
       "q63ge0yApiblOc43\nL4OX/JyHDbxh2rDwLSRPQmxRqTRK2yXV598H7uQd94" +
       "QaHaapm9slLQtZaHgvVumgwZJi1d6En/IW\nth4L30HyXTg58QG9wU5BBIgM" +
       "5rwn7Q2zIFzhDfB9bwA4kC2NCMHV9yTUB66cxVnAm3Vkh2GfdsGh\nzVQCYe" +
       "mfsPB3SJ6GFfJaevy/YYG3QNAg3N2vDUW/Gt6zHY9RXtc3sfATJD91RePhx+" +
       "NvZmRxSDTP\n8FsB0KP8+sCVm6z9QUzq57T/86eA5Jlic0PynD8pXzMkL3iM" +
       "R4qqhCblqySuvK351fnQ480w4+ce\nYxxMMaRgn26bMu2EnCGifuDynKh4Kr" +
       "iJFXwDPN5NQYMeMtF0tWyLY3w9sFSwZIErZxfLTNvbu2Q/\nC7wp74nok3M0" +
       "a6vo+vO8stO9ErqjNM8j/hsLv0XyhuDepkuehyeeCnJrJcZo3mChFl/2WyB5" +
       "K2Zc\nEIY6GWNDcMfmw37264iKAMcqASD718E46BmOC58gVrhF12xkce0JuB" +
       "cKPA9iSK1zuOg4nmWRMUYa\nvTHykqK17AQCsQz/OXIrLDhv+S7RjQIrkVQh" +
       "qfYYV4BKXsLD/kXazMPLOs4AeIoDuu+rNfjnmK26\nDmkFtEj29ZztMGnYWD" +
       "jID2DOIKnVWOD1o0jG/DMPFgS+R+IfKeaXBvahQzxHBaGaSc4oiSVIlmKV\n" +
       "fwipmYxxQ1i3e4odSpB8zj+NYEGcGpB8vthxAskX/MMEFv4cyX1IvugfDbAw" +
       "HcR5IWAiuR4LJ5E8\nMkWtYuR8XpEzFr6B5NQU92MfFgQ4RfLtYqgViYcuhW" +
       "EKdBliBGEnEg8uCl1+iORHIUYiiYXzDFY2\nY4E74otIzgtS4sb/j0hOn7cx" +
       "JkdjWPgXJK/OdPBT4TH+1QdZWHgNyetI/s2HTljwE+ibxQARkt8V\nw0JIZg" +
       "kQuHwZU4FASP7oo56DHmhBUlYMzSCp8DHMwUkAyeRI5aCHQg5OBk+QzHPBSX" +
       "3wjV18pzaA\nTd556rkXoEVHwVBMmp3wVvJEoNI/E6ByMAQfZgngiJFIjERi" +
       "JBIjkfM6wRiJxIzLF4kgGWGkrCvb\nc86AROBT0qKfriIJA4mzfa6KZApA4l" +
       "osuJ93ijuTYiwRY4mLolWMJUiMJWIsETOmwZg7WKLA38jg\nxIMVO+cArMAp" +
       "vnR2THExwcbsTIezU6s4SZM4ScdJOmZMgzE3knQwMadnmJgv2gcH00/Mcf6d" +
       "VVrF\n+ZfE+TfOvzFjGoy5kX+dQ3LoffcZ3WmIhTlwQJ5+5l5R+htg/rdfvW" +
       "/2hL42xb8G6wlrZNP4Ci4j\nC6NV7i2byRc9kWgtyZeQvBxmfBovf4Hkl+Hl" +
       "PIerdi7XOaRuYB6Nk03wQsx8UnWPsal9T56R+sCV\nd8utrxMGoiSmkuTrUx" +
       "x6Uiz5cSz4aMdn3IGFGNTEoCYGNZcnY+6AGg/N9M4QzVxC7yrMlWQaw4iJ\n" +
       "MOJgKPvHsCCGBdOZYAwLYkYMC4KwYPcMYcEl9CbHJZYD4+wfZ/84+8fZn8yu" +
       "HHj5MuZg9t8xw+w/\nF94UiNNpnE7jdBqn05gRp9OZ3bjXNcNsegmdpeOkGS" +
       "fNOGnGSTNmxEnzAyXNyX6+PcnrZeOmR/+C\nkeptiiXzp3Pw2iI/l+/W+z+7" +
       "0znDJHwJ/ezOpfV9t/g+dRJnzjhzztLEMucZcyRzbus7S+Y80rn4\nHxip0X" +
       "SGvy2tOL/avoc/h+Wa0vdSF38Cj3iGzd4Sj1xxRl77esd+RhZ1613Znj6KT3" +
       "YK/E6e87iY\nu6+57jpGagMt3IzuZ/DuGWbwi3aMnp1pd1b+EM1F1SpGIiRG" +
       "IjESmaWJes4z5gwSKZwFELzX1vQ+\nI01wiDdUabxHGqZTf3qcDwd2zhAOzL" +
       "4D/YX4ibs468dZP876cdYnsyv3Xb6MuZP1ORX5+1cv6Ffj\n87TFOw2GYHmZ" +
       "u2OGmXsufB4ev+MeZ7w448UZ7zJkzJmM5yW0bTNMaJfQ7dJx3orzVpy34rx1" +
       "GTLm\nSN5yH1y2d8/h/2SkVtO9m6mMQvi+5dtmmNYuoXNafBdyfBdynCHjDB" +
       "kz4gwJKZDf2rRD3EW8ktM1\nxlg5dOHniXWC0UyQrufljZxL8GaqFd4D1cUt" +
       "VO2qZFl481Tz7YqWPbLv7bo/k575FN4/ZQYevm4z\nRW3p0Oz8jY+8QjfcWi" +
       "cnSSJNyjUpT1F+RcFgpJrpxrUqHaUqH3MRDFjBx62AYa+N3MOFVM8coDLD\n" +
       "u7h2UpbTs12axSRNpoNyWd/mDVdvrP1tkpQPkEZN36IqktWfM3V7ONefU6w0" +
       "aXAqeymzTQ31xzGr\n0thaQkanbuYlFRlcmyRwHBWiHJjoqsiiRPVpGF22uy" +
       "yn/CRJymDWWSqrjKxKu51aeafWcKe24PKk\nSY0ZVpRv4TKuwHxYIvwIeh2m" +
       "IiL++H9kNiBp5K3RAFKbxN4m/L3FdU6I3Yd1XhmZSY+p5BXmPQz+\n/pVf+/" +
       "dvvtbbJLZvBHackXXRiYT6cLNo4wrU8rvx1pQagbd+5sNrHr+r9zcZ5ya8VB" +
       "sjZYrGCiVV\nx+sFjCzwn2XrfbjOhWwFIabNP2hPdYo76FNdjJSP6koWRaZ2" +
       "ByydV2wvFK9JbfaWPQGvTfA67iz7\n8WLLPtHNSMmpcD8t3oI43VGLvYysUa" +
       "wtNstRjSmyhDP1ptxLLUPXLBqdbmVG11UqaXw6g5H5uaNO\nqInMuBVeJ5wZ" +
       "n5jM0PadgymCcS1VrOizh9258Sl84Ing62p4nXQmcnJqW8dx2DpGUuClsOql" +
       "bdIk\nSyPGvsU0pXHhSk+UNb+d/O6iZohR4EoZyXIjUGpIoc4jAyHq1IDlU3" +
       "NIkr04VJnngcIJPkhrvFkt\ngdeq0rNKjBT1HTyGpEYLCWJgoUhu4DP/uEgQ" +
       "MH+VasMsx70CiV3wpCZF8yIe2a7qGpUyKnV5TZyn\n6C191FQg7B5CZqGYfq" +
       "lbhX58rMkDGSnlX0HTuhsfzYjquKoEHoK9i+eVwtmcNNXNJeUhiOQlReMx\n" +
       "pHgksSdEEruYX62B16POxj06Pb9KeluUGAnErlIr8EXYRJMaVGK8V8I3jY3F" +
       "hU2sRjtoVxWIPwbY\n+uJoYJfkEWkYLH3ty/vXP200/FRYOmY/FFeZJlVDtq" +
       "oGklww4aUMkw4pfN6VnNYZXO0TjCw0bDNr\n0xYrp2QyEM5YblDWNQbuGqrg" +
       "K/yw6PUV0FT0wquT3MaPFhL/DwWUpaPjogAA");
}
