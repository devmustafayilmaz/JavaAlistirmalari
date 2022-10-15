package JavaAlistirmalari;

public class A8_MethodAlistirmalari {
    public static void main(String[] args) {
        /*
        Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
bir method olusturun.
- kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
mesaji verin
- kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
yazdirin.
         */
        String input="java cok eglenceli";
        int basIndex =5;
        int sonIndex=7;
        indexYazdir("java",0,4);



    }

    public static void indexYazdir(String input,int basIndex,int sonIndex){
        if (basIndex > sonIndex) {
            System.out.println("hatali giriş...");
        } else if (input.length() < sonIndex) {
            System.out.println("sınırlar dısında");
        }else{
            for (int i = basIndex; i < sonIndex; i++) {
                System.out.print(input.charAt(i));
            }
            System.out.println("");
        }


    }


}
