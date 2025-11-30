package src;
import java.util.Scanner;
public class BodyMassIndexCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    System.out.print("Lütfen boyunuzu giriniz(m): ");
    double boy = input.nextDouble();

    System.out.print("Lütfen kilonuzu giriniz(kg): ");
    double kilo = input.nextDouble();
    
    double index = kilo / (boy * boy);
    System.out.println("BMI: "+index);
   
    input.close();

    }
}
