package JavaAlistirmalari;

public class A4_Soru {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
basariyla kaydedildi" yazdirin
- ilk harf kucuk harf olmali
- son karakter rakam olmali
- sifre bosluk icermemeli
- uzunlugu en az 10 karakter olmali
         */

        String sifre="mustafa123000000";
        int bayrak=0;
        if(!(sifre.charAt(0)>='a'&& sifre.charAt(0)<='z')){
            System.out.println("ilk harf kucuk girilmeli");
            bayrak++;

        }if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("son karakter rakam olmali");
            bayrak++;

        }if((sifre.contains(" "))){
            System.out.println("sifre bosluk icermemeli!!");
            bayrak++;
        }
        if (!(sifre.length()>=10) ){
            System.out.println("sifre en az 10 karakter içermeli!!");
            bayrak++;
        }
        if (bayrak == 0) {
            System.out.println("şifreniz başarılı kaydedildi...");

        }






    }
}
