package JavaAlistirmalari;

public class A9_MethodAlistirma {
    public static void main(String[] args) {
        /*
        Kullanicidan main method icinde ayri ayri isim ve soyismini alin
Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
isim bosluk soyisim seklinde bize donduren bir method olusturun
input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
         */
        String isim="recep";
        String soyisim="ağızlıvoyvoda";

        System.out.println(harfDUzenleme(isim,soyisim));




    }

    public static String harfDUzenleme(String isim,String soyisim){

        String isimSoyisim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase() + " " +
                soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
        return isimSoyisim;

      }

}
