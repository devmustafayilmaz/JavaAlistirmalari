package JavaAlistirmalari;

public class A11_Alistirma {
    public static void main(String[] args) {

        /*

        soru
[ Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
		//Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.
		//örneğin 6 Mukemmel Sayidir.(kendisinin dışında pozitif bölenleri:3,2,1 dir,toplamları 6 yapar..
		======================
		//Input7
		//Output:	7 Mukemmel sayı degildir.

         */

        int input = 6;
        int toplam = 0;

        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                toplam += i;
            }
        }
        if (toplam == input) {
            System.out.println("Sayi mukemmeldir");


        } else {
            System.out.println("sayi mukemmel değildir...");

        }

    }

}