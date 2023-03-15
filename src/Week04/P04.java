package Week04;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {

        /*
        Kullanicidan bir String isteyin ve String'i tersine cevirip
        kaydedin.
       */

        Scanner scan=new Scanner(System.in);

        System.out.println("Bir kelime girin");

        String str= scan.next();

        String tersstr="";

        for (int i = str.length(); i >=1 ; i--) {

            tersstr+=str.substring(i-1,i);



        }
        str=tersstr;
        System.out.println(tersstr);
    }
}
