package Week04;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {

        //verilen bir poztif tam sayinin
        //pozitif tam bolenleriniz yazdiralim


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir pozitif sayi yazin");
        int girilensayi= scan.nextInt();

        if (girilensayi<=0){
            System.out.println("Pozitif olmali");
        }else {
            for (int i = 1; i <=girilensayi ; i++) {

                if (girilensayi%i==0){
                    System.out.print(i + ", ");
                }

            }
        }

    }
}
