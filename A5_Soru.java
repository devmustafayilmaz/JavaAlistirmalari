package JavaAlistirmalari;

public class A5_Soru {
    public static void main(String[] args) {
        /*
        int i,j,k;//Değişekenlerimizi tanımladık.
        for (i=1; i<10; i++) {//Döngümüzün ne kadar döneceğini belirtir.
           for(j=i; j<10;j++) {//Üçgenimizi yaparken ekran çıktısının sol tarafındaki boşluğu belirtir.
               System.out.print(" ");//Boşluğumuzu belirtiyoruz.
           }
           for (k=1; k<=i; k++) {//Yıldız sembolümüzün yazılmasını sağlar.
               System.out.print("*");//Sembolümüzü belirledik ve çıktısını sağladık.
               System.out.print(" ");//Yıldız sembolümüzün arasına boşluk koyulmasını sağlar.
           }
            System.out.println(" ");//Döngüden sonra diğer satıra atlamamızı sağlar.
        }
         */

        for (int i = 10; i > 0; i--) {
            for (int j = i; j < 10 ; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");

            } System.out.println("");
        }

    }
}
