package src;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("Birici sayiyi giriniz: ");
        n1 = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Cikartma\n3-Carpma\n4-Bolme");
        System.out.println("Yapmak istedigini islemi seciniz!");
        select = input.nextInt();

        if (select == 1) {
            System.out.print("Toplam: " + (n1 + n2));
        } else if (select == 2) {
            System.out.print("Toplam: " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("Toplam: " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0) {
                System.out.println("Toplam: " + (n1 / n2));
            }else {
                System.out.println("Bir sayi 0'a bolunemze");
            }
        } else {
            System.out.println("Yanlis bir secim yaptiniz.Tekrar deneyiniz.");
        }

        input.close();
    }
}
