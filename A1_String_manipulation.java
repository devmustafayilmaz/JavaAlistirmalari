package JavaAlistirmalari;

public class A1_String_manipulation {
    public static void main(String[] args) {

        /*
        : Kullanicidan bir cumle alin
- cumlede ev geciyorsa, "home home sweet home" yazdirin
- cumlede is geciyorsa, "calismak guzeldir"
- ikisini de iceriyorsa "Hem ev lazim hem is"
- hicbirini icermiyorsa "cok calisman lazim" yazdirin
         */
        String cumle="java evim gibidir te oyle";
        //String cumleCopy=cumle.toLowerCase();
        if(cumle.contains("ev") && cumle.contains("is")){
            System.out.println("hem ev lazim hem is");

        } else if (cumle.contains("ev")) {
            System.out.println("home home sweet home");
        }else if (cumle.contains("is")) {
            System.out.println("calismak guzeldir..");
        }else {

            System.out.println("cok calisman lazim..");
        }


    }
}
