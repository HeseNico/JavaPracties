package Week04;

import java.util.Scanner;

public class p02 {
    public static void main(String[] args) {

        /*
          Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
          dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
          baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir baslangic girin");
        int baslangicdegeri= scan.nextInt();
        System.out.println("Bir bitisdegeri girin");
        int bitisdegeri=scan.nextInt();

        int toplam=0;

       if (bitisdegeri<baslangicdegeri){
           System.out.println("Bas degri bitisten kucuk olmali");
       }else {
           for (int i = baslangicdegeri; i <=bitisdegeri ; i++) {

               toplam +=i;


           }
           System.out.println(toplam);
       }

        System.err.println(toplam);
    }
}
