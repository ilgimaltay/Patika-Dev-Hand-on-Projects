import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[]args){

        //Degiskenler tanimlandi
int matematik,fizik,kimya,turkce,tarih,muzik;

//Scanner sinifi tanimlandi
Scanner degisken = new Scanner(System.in);
//Kullanicidan deger al

System.out.print("Matematik notunuzu giriniz: ");
matematik = degisken.nextInt();

System.out.print("Fizik notunuzu giriniz: ");
fizik = degisken.nextInt();

System.out.print("Kimya notunuzu giriniz: ");
kimya = degisken.nextInt();

System.out.print("Turkce notunuzu giriniz: ");
turkce = degisken.nextInt();

System.out.print("Tarih notunuzu giriniz: ");
tarih = degisken.nextInt();

System.out.print("Muzik notunuzu giriniz: ");
muzik = degisken.nextInt();

int toplam = matematik + kimya + fizik + turkce + tarih + muzik;

double ortalama =  toplam / 6;

System.out.println("Ortalamaniz :" +ortalama);

String sonuc = (ortalama > 60) ? "Gectiniz" : "Kaldiniz";

System.out.println(sonuc);

    }
}
