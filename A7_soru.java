package JavaAlistirmalari;

public class A7_soru {
    public static void main(String[] args) {
        /*
        Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
:) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
yazdirin
         */
        String input="mustafa";
        if(input.length()%2==0){
            System.out.println("must:)afa");
        }else{
            System.out.println("must:(afa");
        }
    }
}
