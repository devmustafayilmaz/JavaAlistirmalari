package JavaAlistirmalari;

import java.util.Scanner;

public class C019_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore
kontrol edin ve sifredeki hatalari yazdirin.
Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli
sifre girdiginde “Sifreniz Kabul edilmistir” yazdirin.
- Sifre kucuk harf icermelidir
- Sifre buyuk harf icermelidir
- Sifre ozel karakter icermelidir
- Sifre en az 8 karakter olmalidir
         */
        Scanner scan = new Scanner(System.in);
        int bayrak = 0;
        String sifre;
        boolean sifreDogruMu;


        do {
            System.out.println("lutfen bir sifre giriniz:");
             sifre = scan.nextLine();
            bayrak=0;

            int sonuc = kucukHarfkontrolYap(sifre);
            bayrak+=sonuc;
            sonuc=buyukHArfKontroluYap(sifre);
            bayrak+=sonuc;
            sonuc=OzelKarakterKontroluYap(sifre);
            bayrak+=sonuc;

            if (sifre.length() < 8) {
                System.out.println("lutfen 8 karakterden fazla giriniz:....");

            }else {
                bayrak++;
            }


        }while (bayrak!=4);
        System.out.println("şifre başarıyla oluşturuldu...");




    }



    public static int  OzelKarakterKontroluYap(String sifre) {
        int bayrak=0;
        String ozelKarakterler="!'^+%&/()=?_|}][§½#£>";
        // sifre ozel karakterker içermelidir
        // bunun içn tüm harfleri kontrol edecek bir forloop oluşturucaz.
        //eger sifrenin karakterlerinden bir tanesini ozel karakterler Stringi içeriyorsa
        //bizim için yeterli olur.
        for (int i = 0; i < sifre.length(); i++) {
            if (ozelKarakterler.contains(sifre.substring(i,i+1))) {
                bayrak++;

                break;
            }
        }
        if (bayrak == 0) {
            System.out.println("ozel karakter giriniz...");
            return 0;
        }else {
            return 1;
        }



    }

    public static int buyukHArfKontroluYap(String sifre) {
        int bayrak=0;
        for (int i = 0; i <sifre.length() ; i++) {
            if (sifre.charAt(i) >= 'A' && sifre.charAt(i)<= 'Z' ) {
                bayrak++;
                break;
            }


        }
        if (bayrak == 0) {
            System.out.println("Sifre buyuk harf icermelidir..!");
            return 0;
        }else {
            return 1;
        }

    }

    public static int kucukHarfkontrolYap(String sifre) {

        int bayrak=0;
        for (int i = 0; i <sifre.length() ; i++) {
            if (sifre.charAt(i) >= 'a' && sifre.charAt(i)<= 'z' ) {
                bayrak++;
                break;
            }


        }
        if (bayrak == 0) {
            System.out.println("Sifre kucuk harf icermelidir..!");
            return 0;
        }else {
            return 1;
        }
    }
}
