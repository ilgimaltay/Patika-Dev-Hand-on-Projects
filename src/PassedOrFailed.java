package src;

import java.util.Scanner;

public class PassedOrFailed {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matematik, fizik, turkce, kimya, muzik;
        int sum = 0;
        int counter = 0;
        float realAverage = 0;

        System.out.print("Matemetik notu gir: ");
        matematik = input.nextInt();

        if (matematik > 0 && matematik < 100) {
            sum = sum + matematik;
            counter = counter + 1;
        } else {
            sum = sum + 0;
            counter = counter + 0;
            System.out.println("Gecersiz sayi girdiniz.");
            System.out.println("0-100 arasinda sayi girin.");
        }

        System.out.print("Fizik notu giriniz: ");
        fizik = input.nextInt();

        if (fizik > 0 && fizik < 100) {
            sum = sum + fizik;
            counter++;

        } else {
            sum = sum + 0;
            counter = counter + 0;
            System.out.println("Gecersiz sayi girdiniz.");
            System.out.println("0-100 arasinda sayi girin.");
        }

        System.out.print("Turkce notu giriniz: ");
        turkce = input.nextInt();

        if (turkce > 0 && turkce < 100) {
            sum += turkce;
            counter++;
        } else {
            sum = sum + 0;
            counter = counter + 0;
            System.out.println("Gecersiz sayi girdiniz.");
            System.out.println("0-100 arasinda sayi girin.");
        }

        System.out.print("Kimya notu giriniz.: ");
        kimya = input.nextInt();

        if (kimya > 0 && kimya < 100) {
            sum += kimya;
            counter++;
        } else {
            sum = sum + 0;
            counter = counter + 0;
            System.out.println("Gecersiz sayi girdiniz.");
            System.out.println("0-100 arasinda sayi girin.");
        }

        System.out.print("Muzik notu giriniz: ");
        muzik = input.nextInt();

        if (muzik > 0 && muzik < 100) {
            sum += muzik;
            counter++;
        } else {
            sum = sum + 0;
            counter = counter + 0;
            System.out.println("Gecersiz sayi girdiniz.");
            System.out.println("0-100 arasinda sayi girin.");
        }

        realAverage = sum / counter;

        System.out.println("Ortalama: " + realAverage);

        if (realAverage >= 55) {
            System.out.println("Gectiniz!!!!!!!!");
        } else {
            System.out.println("Kaldiniz");
        }
        input.close();
    }
}