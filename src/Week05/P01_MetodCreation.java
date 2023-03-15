package Week05;

import java.util.Scanner;

public class P01_MetodCreation {

    static String output="";

    public static void main(String[] args) {


         /*
        Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        bir method olusturun.
        - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
        mesaji verin
        - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        yazdirin.
        */


        Scanner scan = new Scanner(System.in );
        System.out.printf("Lutfen bir ifade giriniz");

        String input= scan.nextLine();
        stringdekiHarfleriYazdir(input,4,12);

    }

    public static void stringdekiHarfleriYazdir(String input, int baslangic, int bitis) {

        if (baslangic>bitis){
            System.err.printf("HATA : Baslangic degeri bitis degerinden buyuk olamaz");
        }
        if (baslangic>input.length()-1 || bitis>input.length()-1){
            System.err.printf("HATA : Girilen deger Stringin sinirlari disinda bir degerdir");
        }
        input=input.replace(" ","");
        for (int i = baslangic; i <bitis; i++) {

            output +=input.charAt(i)+",";

        }
        System.out.printf(output);
    }

}
