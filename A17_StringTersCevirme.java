package JavaAlistirmalari;

public class A17_StringTersCevirme {
    public static void main(String[] args) {
        String str="java ne yapiyon";
        String tersinput="";
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
           tersinput+=str.substring(i,i+1);
        }
        System.out.println("\n"+tersinput);
    }
}
