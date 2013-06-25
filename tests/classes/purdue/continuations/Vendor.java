package purdue.continuations;

import sessionj.runtime.*;
import sessionj.runtime.net.*;
import java.util.Hashtable;
import java.io.Serializable;

public class Vendor {
    final private SJProtocol onlineShopping =
      new SJProtocol(
      ("H4sIAAAAAAAAAO1Za2wUVRS+u21pC1iWp7yNWhB8bDU8BApiW1soLm1jiw+I" +
       "4uzM7e7A7Mw4c7e0\nxqjRqKgR45PEmJAYDTFADBgRfxliTBPf+sOoiYmvH5" +
       "roD2OMJmLiOXdm7p3Zzi4FAR9ZEk7PnXPv\nOeeee+4538we/InUuQ5pdqnr" +
       "6pa5I81GbOqmcehx/Zv6KRsAdrs6+unaIyab/22SJDKkvkALWeq4\njMzK7F" +
       "CGlJYi042WDsswqMpAU+uwQ5ZU1MpFnmbi/UtwzXVqXjc0RpZkguUtfFGLWN" +
       "4SWY6WLi6x\nhNTK7gBX0JZn5In6/v035Z5+MUkIrJhpW8ZIzrCYv8Kb07bo" +
       "9S2Z79+8wJszL2ZOL9e6XT2xcv6C\nT9q+a6xBlxtsy9Vx14zMzgSLvIj0+Z" +
       "LWYdsetiHUizFaaZSlZbTc5i1mwdL0QV3JGjSju+zElEVX\nvfbjnhQPSa0B" +
       "TxhJhSKNc3Dnl59cnXw+p53c++5tvy3kShPqHeRukuBOzZBaMrq5k2qofvLS" +
       "/ls3\n3b77ohoIhr2rFg8Ipl5S6VDbaU6PO9MJTHFyFLYwzduCoZi5ln7m6G" +
       "YON7G4gs6QyjXG3tGX+n7e\njaeDviftYbdylt1AVaoP0VKP8HBXVFi2GXgl" +
       "B4ErFIqmripMZOr+Ffd/9ux9Lb8mSc020kANWqAm\ng0uwcFtkY4q6c8BRVN" +
       "rpTWjNkEkFTyeqYWSmzBIvo3kiizjh5lKhLS6qeJFMbez+cO2Mk4an29wF\n" +
       "d21MeBIljlR2IGNZtqdh56YXth7f9HvGy9mspY3g+ppgI7aLzGzu1dKKXmUd" +
       "xVTzJ3erUi62x+pI\nbiXTdPc6akPU4GCMEZygYdFRYDEj00NXbKPi5jcrdq" +
       "vwn4DjU+VN8eV19V8cf2vW7R/XkGQXmWhY\nitalqMxyukkjyzvUzVuGNmyv" +
       "v5a7MHlXA9AU/E+CspnCf64QYqlkqRHytps05MFKh6XRDKkxlGz0\nBnnFCE" +
       "oLad4Potqe3t4+L8rNsHyQkZr2LbcEUbeLTpCmaVydHpumya5L167986LVmE" +
       "E2uNAJPs6r\nsEBpfPu5xSu/fCBJarth67pJe4rYFTKkSaOqoeD97jAUl7uQ" +
       "gjo5CNnWoxSoP55YoCxvaeIJGq0b\nhUInbQ5ACBXoBpM8Jo0SRs6DJJDecP" +
       "VXgL/z2Glea0YurCT2rU5Yq5s6u0aYm8LGeTMZmRoecnWo\nZIVQdQ0yVyNZ" +
       "xUiDuxMqC4M6HognSjGSNUKwHJllSJazSI0RM7aGZzSakEkdhmVK+Qds/H2a" +
       "kRkl\nT/zINDKHluj9DJk2JO2QmapljwjREhZq2IrrtVf0LGjWPcD7UZND31" +
       "QtC+9udfgISlV5JSBQNj36\nwFc3S9NdpZDVc0WFUWlOGDjByILSWwoZYkMi" +
       "O1tg6PKYRJ6I490caEkkkOlF0hcRkOZKocDKGgqF\nHI61QE6UsVDW9KkLyD" +
       "IW6tSlzvowMfB3RsmTU3CZ3BxOySEdABTo73MsZqmWcR0UFlTbXgSUSB1o\n" +
       "vWVl/hE3ZXHYpVNDwwnCTCsytyHZDhlsUGWIdiiGlO+BsxEI0HOj03EsZ6Ni" +
       "alDrcjfiIws8mBP3\nWGw4KwKbQkZDAhCgjhsUxg5DnpUY6wA8SYeZMDM9+k" +
       "AYyAkDSUbmlijB6AsNqdDID850Pq1Ty8E5\n9Q5Rx9FDyf85MgaSAkRIzBTy" +
       "Q7Be2MOECE5/UuSOTeQrOxDWi6U/IOMgcQPViDmFfD1A6Yhq3kfa\nAVOg/l" +
       "RoFLQEacShsnL+IbeAxIzbGxJbbkp6hkS6tC/WJUwp6ZI3Ekdz59nw44eoYE" +
       "gIRiAVIw72\nW0VHpV1QmbwSEhqeERcPhw+xjh+AkK0KJ/Sgg6lramk/+fog" +
       "VBCy0Mg/xRqnKOwmB1joFUyo6Ffz\nVCsaePWbBO8vr4flqE3ciF+QeQLJk5" +
       "50g6WIG544FpZOUhijBZtFZjwvZyDZWxWcE4FRTrA0fGJT\n4DwHLOy9gJb0" +
       "EFw6EK6DInGCJg21ImCDtFG9sVDwCDIHkBxkZLIvxYsjMovsAigubBQU3Uxv" +
       "BgK1\nDP/4eutceF+RV6IHGX5njiB5VQjOB5dEw8P1MXOakDnKBQCC0CCA8/" +
       "klXyj6DIDDGy1sfvCu+u07\nd3Ve//Bu73XMlCAby0TR0Yo0rUJodLPIoS40" +
       "ccvMgdN2HnDccMAUcdFl4EB74ErdKDItSK5EcpXE\n38h4WBOJhLdTkJH4NR" +
       "b3IpHAdjyIF8m6OKCLZL0QXIFMgES9r0sS/UoZko44+IqkUwgWVAb98m1Y\n" +
       "YLYIUuavxULZnMrgO/J+zjFV5Imo4e8LhfXIfIjko6iA45x3kbwXjU7ZCJxB" +
       "QdlgPsPG9+kRekVo\nJPYtd8ErCe9TX4zT9BJkNiDZiKRbCNYhw5NpW1RwLQ" +
       "t9cIiFpfB64RoKh1oLyon8PDif+U9odKKw\nxq/WV0i+RiJQJNmDjIciI4Iw" +
       "vEQiYKFXcnQkOyKCRBKZswxK1iPDP6Hwr0FnBRHtQ+YeJPeeNRvl\nURcyDy" +
       "J56O8aPxy18agEU8g8hoSf/uMSIiEjG+VTccAHyTNxmAfJv6Thn2PsgORlCR" +
       "eQ8bo9kkNx\nMADJK7L5IxPXycu3eGSOxgiaooJjXPAGgudyLbrbHLSC7jym" +
       "S7f+D7o0ktFz24eQke3jHPcVZGSl\n/6baAqotgFRbQLUFzI1tAW1GtlgYU/" +
       "dF6T2dul/5LSTyIyp/C4k8KfNrRqIfCU/OaL+IFfyj/aLa\nFqptodoWqm2B" +
       "/DfaQir8izz+xF76MsDvVNNf+dHNn9slAAA="));
    
    public void run() throws Exception {
        SongInfo[] songsInfo = new SongInfo[4];
        songsInfo[0] = new SongInfo("Song1", 8);
        songsInfo[1] = new SongInfo("Song2", 9);
        songsInfo[2] = new SongInfo("Song3", 10);
        songsInfo[3] = new SongInfo("Song4", 7);
        Song[] songs = new Song[4];
        songs[0] = new Song("Song1");
        songs[1] = new Song("Song2");
        songs[2] = new Song("Song3");
        songs[3] = new Song("Song4");
        Album beatlesAlbum = new Album("Beatles 2012", 4);
        SJServerSocket ss = null;
        try {
            ss = SJServerSocketImpl.create(onlineShopping, 20102,
                                           SJParticipantInfo.TYPE_SERVER);
            ss.participantName("vendor");
            ss.addParticipant("PC", "localhost", 20103,
                              SJParticipantInfo.TYPE_PC);
            ss.addParticipant("phone", "localhost", 20101,
                              SJParticipantInfo.TYPE_MOBILE);
            SJSocketGroup sg = null;
            try {
                sg = ss.accept("phone");
                String albumRequest = (String) SJRuntime.receive("phone", sg);
                System.out.println("Vendor: Received request from phone: " +
                                   albumRequest);
                SJRuntime.send(beatlesAlbum, "phone", sg);
                int i = 0;
                {
                    SJRuntime.negotiateNormalInwhile("phone", sg);
                    while (SJRuntime.insync("phone", sg)) {
                        SJRuntime.send(songsInfo[i], "phone", sg);
                        {
                            String _sjbranch_$0 =
                              SJRuntime.inlabel("phone", sg);
                            if (_sjbranch_$0.equals("BUY")) {
                                {
                                    System.out.println(
                                      "Vendor: Phone has elected to buy song " +
                                      songs[i].Name() + ". Sending song...");
                                    SJRuntime.send(songs[i], "phone", sg);
                                }
                            } else
                                      if (_sjbranch_$0.equals("NOOP")) {
                                          {  }
                                      } else {
                                          throw new SJIOException(
                                            "Unexpected inbranch label: " +
                                            _sjbranch_$0);
                                      }
                        }
                        i++;
                    }
                }
            }
            catch (Exception ex) {
                System.out.println("Vendor Exception: " + ex);
                ex.printStackTrace();
            }
            finally {
                SJRuntime.close(sg);
            }
        }
        catch (Exception ex) {
            System.out.println("Vendor Exception: " + ex);
            ex.printStackTrace();
        }
        finally {
            { if (ss != null) ss.close(); }
        }
    }
    
    public static void main(String[] args) throws Exception {
        Vendor a = new Vendor();
        a.run();
    }
    
    public Vendor() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.3.0";
    final public static long jlc$SourceLastModified$jl = 1328861215000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0bC4xU1fXO7P8j+wPkj8Cq0MJstWrURRFWVhaH3XV3QVmi" +
       "y5uZuzMP3rz3fO/O\n7kCNQU0VbUJiBH9VaayWWDUtGPtJGz/xg1VrW5sgNd" +
       "EmxVqtWEubVtKi9px737vvM7MDqLTG7iZz\n9t577j3n3HPP783c98j7pMK2" +
       "SMymtq0a+oYY22RSm0MjsYEmmR3rX9mrWDZNdWiKbQ8AYii5/mN1\nze6m61" +
       "dESWSQNOvGUk1V7IGMZeTSmYGMauctcoppaJvSmsEcigU0zp93ZPTlm1ZOLy" +
       "MNg6RB1fuZ\nwtRkh6EzmmeDpD5Lswlq2UtTKZoaJE06pal+aqmKpm6GiYYO" +
       "jG01rSssZ1G7j9qGNoITm+2cSS3O\n0x2Mk/qkodvMyiWZYdmMNMY3KCNKW4" +
       "6pWltctVl7nFQOq1RL2VeTa0k0TiqGNSUNEyfH3V20cYpt\nnTgO02tVENMa" +
       "VpLUXVK+UdVTjMwOr5A7br0UJsDSqixlGUOyKtcVGCDNQiRN0dNt/cxS9TRM" +
       "rTBy\nwIWRaWMShUnVppLcqKTpECNTwvN6BQpm1XC14BJGJoWncUpwZtNCZ+" +
       "Y7rZ7K+o9u6f3wFDhxkDlF\nkxrKXwmLZoUW9dFhalE9ScXCw7nY9q61uRlR" +
       "QmDypNBkMWfpqT9eHX/nydlizvQic3q4LQ4lj5wz\nY+arS9+qKUMxqk3DVt" +
       "EUAjvnp9rrYNrzJlj3ZEkRkTEX+VTf82u3fJ++FyXVXaQyaWi5rN5Faqie\n" +
       "6nDaVdCOqzoVoz3DwzZlXaRc40OVBu+DOoZVjaI6KqBtKizD23mTEFIFnwh8" +
       "1hPxV4eAkZo1QM6w\nYvYGRpYwajO7zbaSbWbOSuVoGxgrU/Uct/IhmjcNC7" +
       "rpNjNj6BT6StbUaJukkEduE0YjEdjojLDT\naWChKwwtRa2h5K4DL16z/NKb" +
       "t4ojRLNz5GSgcs455udsxwQLEolw2i1ooEKBSy1L2YSOk7/u1Zl3\n7VXuhe" +
       "MAtdjqZsp3HRktRwiLziwZVzo8r+yClgJGM5ScuOWdaXf/9qHnoqSsaGyJy8" +
       "FOw8oqGpqH\n60zNDrswBqyqNWzbxXj/5ZZVj+176Y35npUz0lrgfIUr0Xnm" +
       "hnVvGUmaguDkkb/jXyv+elvFeY9H\nSTl4JCpbAUsCB58V5hFwonY3IOFeyu" +
       "Kkbrhg47UMFDTq2zDCegSNwj7gLCaGBOSx7PANlV977ed1\nz/Edu2GvwRcf" +
       "+ykTTtTknf+ARSmMv3Fn72073r9pXRm4rWmKM2ek0swlNDWZhyUnB/0OxUuh" +
       "2Rzc\n0964bZH9I37ENWo2m2NKQqMQpxVNM0ZpaojxQNXkC4o8FoEm6hMQ08" +
       "AdhjQgJPZqRkbAPItEjdiU\nidtvX3DPaxhXTK6Yyeh/XFKS5wOtEYTzC5DY" +
       "n4kWPNHbNkSCjWID9Qv6r1y5futcvnM/uYVOJy8J\ner5wVklf6MT8AzbDDA" +
       "hEnsms/9b+y1ZdcXmbCI1nlCTRDS6d4nS89Tu69CVPTNqnR9FKKu0N0u3j\n" +
       "JGozRubHXZKO5WFXtPpX9guUmx4WHn0DHmP1mn9et+dXO+qB8SCpUu1OVVc0" +
       "PG27W3hvkdQRIrH5\nidX3Hf4le5PbpucuKP6MfGGwW6P4PPncfSNNlT/cmY" +
       "2SqkHSyNO/orM1ipZDyx2EBG53OINxclIA\nH0zGIvO0y3AwI+yqPrZhRy33" +
       "abscZ2O7Wvgmn9Pwifj7GD9oONgRKaK5w8iakFesUy6hsGmF0ZSZ\nj0RMXH" +
       "YuXzyLwznC/qIMWKOKGakyLXVEwSqKTDB0zFX9GcM0wWf4ghYI9/IgrRwE/C" +
       "zFGs8xPR4t\nItwrloDRtobOXJpHDM2Dify9d9/iPTqbcYAfVJVTuGH15IUR" +
       "yKga6JGnZAv8rRRVaXRDSSdtRkR4\nSmZULYWSnQk05pW0RrH81qr+XZentz" +
       "8QdTy6zuSh7DTPpz257NbVetZIqcMqj0Xg5UcaTj3j8YPb\nGkU28OINeMLR" +
       "CXjjU5eRLS9d9eEsTiaSRBodTjhaKIPD6aU0soym1WIKqWSKlaZMpHHYVgka" +
       "PhLn\na3fsfbD30FZXKRebGKtLHUkfTVJ1hIYlwIh0dollq6AN1ScYcjanq0" +
       "leVQgau86+Yf/t17f9AxLA\nOlJNNZqlOgOLmbUuUAZDpB+woIJZLiaAe9Vl" +
       "Bc0B15lCSvD2c2pJE9NThZvBtT1H1UWXPgpWWKCL\nwtMoJUDcMExBYePK+w" +
       "efXnk4LmwsYaQ2Cft2NiLMpI9LtaCkVAkLIlDm6GKVMrRlRWlA/G5W7Yup\n" +
       "CVqDU9A2iTwO7qjAYkZafG6+QrEzqxSzXcpPgpWDg6+oev3pZyav/00ZiXaS" +
       "Ws1QUp0Kr6dIDRQy\n1M5AyZo3l1zERagfrQbYiEEOiE2S8nOCoEslQTWftF" +
       "2kOgNcOowUFBRlmpJAUc4BSVp3JRgp7+7p\n6RVavQqmDzNStmz1WlfLUAa7" +
       "NhhDG4wV2mC08yuLF3809zxeUwDL5SDT9BILlJrn7j7tnDe+CTVf\nF2wVon" +
       "F3DuNjnEzAhKLgox6vbZw8UY0PE91e3qgVj4vdXrlOSMVeeIb1eEJxTBV49q" +
       "wTjRhiGDkJ\nDt2ThpMfBnmns0/ps4zMKYV2uFYuVnWVXSjZNbBj9ESo9vxd" +
       "Tg6J6JLUhdjg+e9qRqrtjRA2mOGh\naz00AlsizsIGz2tZFgggcsagf0aNDp" +
       "bTocGzlsS/wo49YzEyMTTiaKaGQdUcpLsfG5sRfAMsM2mY\nmyRqPvMlOMUW" +
       "NQ5K5ia3bmg7WvO6Ditea0hS5/mPIExKuLxLrCU44JCbnFJtJZtQ0/BgSD12" +
       "ksER\nRmaGvdKtXlZD1+Y6CYzI473RpSJKjq0Ibg4gSGspVWAk9anC6xZyIE" +
       "fG4DAm6+NHkK8zXxoOC+sU\nTK68E0MjxyEyucJvkiOqrTJfDXcxBBYkuyyn" +
       "4qM/5NUxcc4RT0hgl9ffOEGyacfGHQjuBAvWqDJC\nO+AZTeK3wdnIMlyIsd" +
       "yyDGuFoqcg1qXX4JABEkwtNiw3/G2p2EZs3IvgPqhoOUPJbDfYWYiZ83Wh\n" +
       "ZNMSHJAMviMZQKE8LUQEtS8pNPp6jnJa+LTlqTScU88ItSzVZ/y/w8aDCL4H" +
       "GpIzJf5R5ns0RYNw\nT78u4GO1fGUHFrhy6bvYeBjBIy5pLEslfgkjUwKkeR" +
       "5ZBjUE0m/09dyU4DGxqBc5/+1tAcGuYntD\n8JC3KU8yBI9KxM6iIqFJeSKJ" +
       "njyax06EHO8GET+QiE1gigEB+42claSdEJlECPF1PxcRd/sPsYIf\ngMSd6z" +
       "foYQtNV0/FHOPrBVWBynw95xTL4KHNJREdYL7vSyWJ/mSGpnIauv4E2XaWV8" +
       "FypCY94u/Y\neBHBSwJ7iaFID4/8xI+tUxijWZMFZtzjzUDw63HEfwWhjYVY" +
       "4D+xBjjPAQNzL1RLqq9cetgfB6Xh\nuEkaYoXbdM0mKfqSwC3YeAvBHxn+wM" +
       "Kx6Dhe5TXKSLPkkVVUPbYKAMQy/OfQrbDh+cRziW5s/BnB\newgOSsTJIJJM" +
       "eLi+yJwJ2PiAI6AIQobuNx5Ti37B3W/oaZCAf7Gedxs5XJICal0u3Yq92ODf" +
       "6qsI\nNnjFNDZE4YjA024DNrxitGgRi8DT1bGUrwhGilWtCPISsQgbblkpvj" +
       "TxSlkPh+CaYrUogmslYmbp\nCt57lJUFWKDs5c+0ktjU0pV04OGaF0iBETcg" +
       "RyokwSrsclAdRFyF3TIE5UHtjKmBzxExpjJ3sGP7\nRg0Cv68nE5G3CwwLkS" +
       "YEzcfIej42tiC4DsH1EnEBNm5DsD2IWIsNUfwhuKtYVYhAVm9kGzZE9RZA\n" +
       "+Ms6BLIcE+nxfgTfDSAiUWyc4GJgCTa4BHsQnJBKZCc2eBL96QnjMXa1g40n" +
       "ETz1WZnvDvJ41iti\nsPE8Ah4mX/BKE2x4CerlYgUHgleK1RoIviCJ9v8XcS" +
       "wlBoI/eFUFNkRRgODtYtUCgne8GgEbxRL+\n2JUANj4ogpgQRBxyk//MMZN/" +
       "lz5suHm/IP8v+xLkfwSf/Hcz3NWBxDSescYz1vFscDxjjSPGM9a0\nohlrqZ" +
       "bIZQvS1NLPkqZKP44Ffvflj2OBkTF+o4ncjoAH22B6K4r4n6a38Sw2nsXGs9" +
       "h4FvuCIb4k\nWazRfy0C7zmEH7X4LZGVIrgGbrPxn1fnOTc0CUJxQ9O9Xmlb" +
       "vh9OQnfV+T37m644VH+j8uyV4pJS\nc/Ae6nI9lz1753664KL6ZJHL0DXMMB" +
       "dpdISKnzjwEmdU3LEDtotK3jpbxe9qeLcQy/qXLDh9Yd2f\noqR8jLvMTc5g" +
       "H2U5S/dda4LZynFfcp4dUkpYnqaR6ZeVZdQXovx2orjQWPDGQnBRe/AaY60V" +
       "FJQf\n4XQuQAOoCG/qNGPFQcQf/49ITJmkWdxFBhB5XZztGLdviyLdm7SOdb" +
       "V41rU8n6Qm1khIP/K28xNZ\n4f3SXkvNqkzWL7fOeuDtxw70TRQ2IN7fmFfw" +
       "CoV/jXiHw71KCBzmlOLAZz/71TmPXNv3ZsK5YRb5\nPSPlI4aaws1FDgWtOt" +
       "yJHJCKxc/p8FnnKHZdMcUWOhLP5vMYqbT52zWlFVv4Agi/6C+Utaes9VD0\n" +
       "Z5Nb+d318oRiy/t3gTdnCl+MCbzvwuWslbuaCp/ZpXcV2VfUALBsjJJ8hH9l" +
       "Eo2OsfMLRByB/WsU\nwk+GK/UDUyj3b2AnIC02P8kXuHqhlfG7O3i108WJq+" +
       "GqEZPvJQGy8OY3MnhLiMt5fUrz991Mjzbg\n7zryKlEw1IoLy/mSR40iHOTS" +
       "fOj8UMatscAmIz7lBEZQpeL1ELxPOyXsBc4bScm5r66f/4zZ9Ath\nNO5bQ1" +
       "V4yy2naf7b0b52pWnRYZVbSpW4K23yTc8CjRd7LmL8/rbXR2mjM8WaOfx9BF" +
       "yDvbncWCbl\nI/8B1aeW4/Y2AAA=");
}
