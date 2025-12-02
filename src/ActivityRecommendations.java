
package src;

import java.util.Scanner;

public class ActivityRecommendations {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava sicakligi giriniz: ");
        heat = input.nextInt();

        if (heat <= 5) {
            System.out.println("Kayak yapabilirsin.");
        } else if (heat > 5 && heat <= 15) {
            System.out.println("Sinemaya gidebilirsin.");
        } else if (heat > 15 && heat <= 25) {
            System.out.println("Piknik yapabilirsin.");
        } else {
            System.out.println("Yuzmeye gidebilirsin.");
        }

        input.close();

    }
}
