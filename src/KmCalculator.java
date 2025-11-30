package src;
import java.util.Scanner;

public class KmCalculator {
    public static void main(String[] args) {

/*Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir. */

        int km;
        double perKm, finalCost, totalCost, startingPrice;
    
        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek Mesafeyi KM cinsinden Giriniz: ");
        km = input.nextInt();

        //Strating price is 10 , per km price is 2,20

        perKm = 2.20;
        startingPrice = 10;
        totalCost = perKm * km + startingPrice;
      
        finalCost = totalCost < 20 ? 20 : totalCost;
        System.out.println("Toplam tutar: "+finalCost);


input.close(); 

    }
}
