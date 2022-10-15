package JavaAlistirmalari;

public class A15_ForLoop {
    public static void main(String[] args) {
        int input = 1453;
        String str=""+input;
        int birlerBasamagi=0;
        int rakamlarToplam=0;
        for (int i = 1; i <= str.length(); i++) {
                birlerBasamagi=input%10;
                rakamlarToplam+=birlerBasamagi;
                input/=10;
        }
        System.out.println("rakamlar toplami = "+rakamlarToplam);
    }
}
