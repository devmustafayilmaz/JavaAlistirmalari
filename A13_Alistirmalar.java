package JavaAlistirmalari;

import java.util.Scanner;

public class A13_Alistirmalar {
    public static void main(String[] args) {
        /*
        Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
hesaplayin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 20 den kucuk bir sayi giriniz:");
        int sayi= scan.nextInt();
        int faktoriyel=1;
        if(sayi<=20){

            for (int i = 1; i <=sayi ; i++) {
                faktoriyel*=i;

            }System.out.println("girmiş oluğunuz sayinin faktoriyeli: "+faktoriyel);

        }else {
            System.out.println("20 den kucuk sayi giriniz....!!");
        }

    }
}
