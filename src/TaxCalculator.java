package src;
import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[]args){

        /* Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/

    double tutar , kdvOrani , kdvTutar , kdvliTutar;

Scanner para = new Scanner(System.in);
    
System.out.print("Ücret tutarini giriniz: ");
tutar = para.nextDouble();

kdvOrani = (tutar < 1000 && tutar > 0 )? 0.18 : 0.08;
kdvTutar = tutar * kdvOrani;
kdvliTutar = kdvTutar + tutar;

System.out.println("Kdv Orani: " + kdvOrani);
System.out.println("Kdv Tutari: " + kdvTutar);
System.out.println("Kdv'li Tutar: " + kdvliTutar);

para.close();
    }
}
