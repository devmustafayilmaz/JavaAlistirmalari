package JavaAlistirmalari;

public class A6_soru {
    public static void main(String[] args) {
        /*
        Kullanicidan isim ve soyismini ayri ayri alin.
- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
yazdirin
- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
harflerle yazdirin.
         */
        String isim = "mustafa";
        String soyIsim = "yılmazzz";
        if (isim.length() > soyIsim.length()) {
            System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()

                    +" "+soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).toLowerCase());

        }else if (isim.length() < soyIsim.length()){

            System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" "+soyIsim.toUpperCase());

        }



    }
}
