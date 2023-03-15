package Week04;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {

        /*
     Kullanicidan 150'den küçük pozitif bir sayi alin, 1’den baslayarak tum
    tamsayilari yazdirin, sira
    - 3 ile bolunebilen bir sayiya gelirse, sayi yerine WISE
    - 5 ile bolunebilen bir sayiya gelirse sayi yerine QUARTER
    - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine WISE QUARTER
    yazdirin
    */

        Scanner scan=new Scanner(System.in);
        System.out.println("150 den kucuk bir sayi girin");
        int sayi= scan.nextInt();

        for (int i = 0; i <=sayi ; i++) {

            if (i%3==0 && i%5==0){
                System.out.print("WQ");
            } else if (i%3==0) {
                System.out.print("W");

            } else if (i%5==0) {
                System.out.print("Q");

            }else {
                System.out.print(i+ " ");
            }

        }

    }
}
