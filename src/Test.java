package src;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        int a;

        Scanner input = new Scanner(System.in);
         System.out.println("Bir sayi giriniz:");
        a = input.nextInt();
       


        if (a > 0) { 
            System.out.println("pozitif");
        } else if (a<0) {
            System.out.println("Negatif");
        }else {
            System.out.println("Sifir");
        }
        input.close();
    }
}
