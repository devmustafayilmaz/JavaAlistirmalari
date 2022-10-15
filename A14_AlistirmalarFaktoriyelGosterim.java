package JavaAlistirmalari;

public class A14_AlistirmalarFaktoriyelGosterim {
    public static void main(String[] args) {
        /*
        Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720
         */
        int input=4;
        int faktoriyel=1;
        int i =1;
        System.out.print("4! = 4 ");
        for (i = input; i >=1 ; i--) {
            faktoriyel*=i;
            System.out.print("* "+i );
        }
        System.out.println("  = " +faktoriyel);
    }
}
