package JavaAlistirmalari;

public class A3_Soru3 {
    public static void main(String[] args) {
       /* Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
                sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
                input : java1 ogRe2@nMek3 #ne +Gu=zel
        output : Java ogrenmek ne guzel.*/

        String str1="java1 ogRe2@nMek3 #ne +Gu=zel";
        String str2=str1.replaceAll("\\d","").replaceAll("\\W","");
        String str3=str2.substring(0,1).toUpperCase()+str2.substring(1).toLowerCase();
        System.out.println(str3);




    }
}
