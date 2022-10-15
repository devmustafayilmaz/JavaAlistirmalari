package JavaAlistirmalari;

public class A18_ForLoop {
    public static void main(String[] args) {

       int sayi=23;
       int sayac=0;
        for (int i = 2; i <sayi ; i++) {
            if(sayi%i==0){
                sayac++;
            }
        } if (sayac == 0) {
            System.out.println("sayi asaldir");
        }else{

            System.out.println("sayi asal sayi degildir...");
        }



    }
}
