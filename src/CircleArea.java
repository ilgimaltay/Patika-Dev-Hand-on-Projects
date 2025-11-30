package src;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
     
    Scanner input = new Scanner(System.in);

    System.out.print("Yaricap giriniz: ");
        int r = input.nextInt();

        double pi = 3.14;
        double alan = pi * r * r;
        System.out.println("Dairenin alani: " +alan);

        double cevre = 2 * pi * r;
        System.out.println("Dairenin cevresi: "+cevre);

    /* Formül : (𝜋 * (r*r) * 𝛼) / 360 */

    System.out.print("Alfa degerini giriniz: ");
    double alfa = input.nextDouble();

    double sector = (pi * (r*r) * alfa) / 360;
    System.out.println("Alfa acisinin alani: " +sector);


    input.close();

    }
}
