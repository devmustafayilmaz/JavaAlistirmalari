package JavaAlistirmalari;

import java.util.Scanner;

public class A12_Alistimalar {
    public static void main(String[] args) {
        /*
        Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
baslangic degerinden kucuk olsa da program calissin
         */
        Scanner scan = new Scanner(System.in);

        int sayi;
        int toplam=0;
        System.out.println("lufen pozitif tamsayilardan baslangic ve bitis degeri giriniz:");
        int baslangic=scan.nextInt();
        int bitisdegeri=scan.nextInt();
        if((baslangic>bitisdegeri || baslangic<bitisdegeri) && baslangic>0 && bitisdegeri>0){


        for ( baslangic=baslangic; baslangic <=bitisdegeri ; baslangic++) {

            toplam+=baslangic;

        }
            System.out.println("sayılar arasindaki pozitif tam sayilerin toplami :"+toplam);

        }


    }



}
