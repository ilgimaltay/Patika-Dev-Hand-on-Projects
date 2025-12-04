package src;

import java.util.Scanner;


public class FlightTicket {
    public static void main(String[] args) {

        int km, travelType, age;
        double normalPrice;

        double DiscountRate1 = 0.5;
        double DiscountRate2 = 0.9;
        double DiscountRate3 = 0.7;
        double multiTravelDiscountRate = 0.8;
        double ageDiscountedPrice = 0;
        double finalPrice = 0;


        Scanner input = new Scanner(System.in);

        System.out.print("Mesafe giriniz(KM): ");
        km = input.nextInt();
        System.out.println("Yolculuk turunu giriniz\n 1- Tek yon, 2- Gidis-Donus");
        travelType = input.nextInt();
        System.out.println("Yas giriniz: ");
        age = input.nextInt();

        if ((km > 0 && age > 0) && (travelType == 1 || travelType == 2)) {
            // Normal price
            normalPrice = km * 0.1;

            if (travelType == 2) {
                normalPrice = normalPrice * 2;
            }
            //Age discount
            if (age < 12) {
                ageDiscountedPrice = normalPrice * DiscountRate1;
            } else if (age <= 24) {
                ageDiscountedPrice = normalPrice * DiscountRate2;
            } else if (age > 65) {
                ageDiscountedPrice = normalPrice * DiscountRate3;
            } else {
                ageDiscountedPrice = normalPrice;
            }
        }

        if (travelType == 2) {
            finalPrice = ageDiscountedPrice * multiTravelDiscountRate;

        } else {
            finalPrice = ageDiscountedPrice;
        }
        System.out.println("Toplam Tutar: " + finalPrice + " TL");

        input.close();
    }

}
