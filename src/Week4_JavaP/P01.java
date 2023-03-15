package Week4_JavaP;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /*
        Kullanicidan bir cumle alin
      - cumlede ev geciyorsa, "home home sweet home" yazdirin
      - cumlede is geciyorsa, "calismak guzeldir"
      - ikisini de iceriyorsa "Hem ev lazim hem is"
      - hicbirini icermiyorsa "cok calisman lazim" yazdirin.
         */

        System.out.println("Lutfen bir cumle giriniz : ");

        String cumle= scan.nextLine();
        String kucukCumle=cumle.toLowerCase();// harfler kucuk oldugu icin kucuk ile koontrol ediyoruz

        if (kucukCumle.contains("ev")&& kucukCumle.contains("is")){
            System.out.println("Hem ev lazim hem is");

        } else if (kucukCumle.contains("is")) {
            System.out.println("calismak gzeldir");

        } else if (kucukCumle.contains("ev ") ) {
            System.out.println("home home sweet home");
        }else {
            System.out.println("cok calismak lazim");
        }
    }
}
