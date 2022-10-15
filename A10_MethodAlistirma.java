package JavaAlistirmalari;

public class A10_MethodAlistirma {
    public static void main(String[] args) {

        /*
        Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
sonuclarini donduren bir method olusturun.
         */
        int sayi=23;
        String input="javanın boyle guzel olusu yok mu";
        A8_MethodAlistirmalari.indexYazdir(input,6,12);
        System.out.println(asalMi(sayi));

    }

    public static String asalMi(int sayi){
        String sonuc="";
        for (int i = 2; i < sayi ; i++) {
            if (sayi%i==0){
                 sonuc="asal değil";
                break;

            }else{
                 sonuc="asaldir";
            }

        }

       return sonuc;

    }




}
