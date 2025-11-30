package src;
import java.util.Scanner;

public class GroceryBillCalculator {
    public static void main(String[] args) {


        double armutBirimFiyat = 2.14; 
        double elmaBirimFiyat = 3.67;
        double domatesBirimFiyat = 1.11; 
        double muzBirimFiyat = 0.95;
        double patlicanBirimFiyat = 5.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kilogramini girniz: ");
        double armut = input.nextDouble();
        System.out.print("Elma kilogramini giriniz: ");
        double elma = input.nextDouble();
        System.out.print("Domates kilogramini girniz: ");
        double domates = input.nextDouble();
        System.out.print("Muz kilogramini girniz: ");
        double muz = input.nextDouble();
        System.out.print("Patlican kilogramini giriniz: ");
        double patlican = input.nextDouble();

        double toplamTutar = (armut * armutBirimFiyat)
                           + (elma * elmaBirimFiyat)
                           + (domates * domatesBirimFiyat)
                           + (muz * muzBirimFiyat)
                           + (patlican * patlicanBirimFiyat);

        System.out.println("Toplam tutar: "+toplamTutar);

        input.close();
    }
}
