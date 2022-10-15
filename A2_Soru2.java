package JavaAlistirmalari;

import com.sun.jdi.IntegerValue;

public class A2_Soru2 {
    public static void main(String[] args) {
        /*
        Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
input1 : “15.30 €” , input2 : “11.40 €”
output : 36.70 €
         */
        String str2="15,30 Tl";
        String str1="36,70 Tl";
        int strA=Integer.parseInt(str1.replaceAll("\\D",""));
        int strB= Integer.parseInt(str2.replaceAll("\\D",""));


        System.out.println("toplam fiyat : "+(double)((strA+strB)/100));




    }
}
