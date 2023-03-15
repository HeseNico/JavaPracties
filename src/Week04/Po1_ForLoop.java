package Week04;

import java.util.Scanner;

public class Po1_ForLoop {
    public static void main(String[] args) {

        /*
         Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
         dahil) 7 ila bolunebilen sayilari yazdirin.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tam sayi yazin");
        int girilensayi= scan.nextInt();

        for (int i = 1; i <girilensayi ; i++) {

            if (i%7==0){

                System.out.print(i + "-");
            }

        }

    }
}
