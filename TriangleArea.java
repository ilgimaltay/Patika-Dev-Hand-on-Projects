
import java.util.Scanner;

public class TriangleArea {
     public static void main(String[]args){
        
        /*Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        𝑢 = (a+b+c) / 2
        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐) */

double a , b , c , u , alan;

Scanner input = new Scanner(System.in);
System.out.print("a sayisi: ");
a = input.nextDouble();

System.out.print("b sayisi: ");
b = input.nextDouble();

System.out.print("c sayisi: ");
c = input.nextDouble();
u = ( a+b+c ) / 2;

alan = Math.sqrt(u * (u - a)* (u - b) * (u - c));
System.out.println("Ücgen Alan: " +alan);
input.close();
     }
}
