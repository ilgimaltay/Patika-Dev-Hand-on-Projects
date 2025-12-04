package src;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        
        int year = 0;
        
        String zodiac = "";

        Scanner input = new Scanner(System.in);
        System.out.print("Dogum yilinizi giriniz: ");
        year = input.nextInt();

        

        // Deger 0 dan buyuk olsun
        if (year <= 0 ){
            System.out.println("Gecersiz yil girdiniz.");
        return;
        } 

        //12 ye bolumunden kalan bulma
        int zodiacIndex = year % 12;


        switch(zodiacIndex){
            case 0:
                zodiac = "Maymun";
            break;

            case 1:
                zodiac = "Horoz";
            break;

            case 2:
                zodiac = "Kopek";
            break;

            case 3:
                zodiac = "Domuz";
            break;

            case 4:
                zodiac = "Fare";
            break;

            case 5:
                zodiac = "Okuz";
            break;

            case 6:
                zodiac = "Kaplan";
            break;

            case 7:
                zodiac = "Tavsan";
            break;

            case 8:
                zodiac = "Ejderha";
            break;

            case 9:
                zodiac = "Yilan";
            break;

            case 10:
                zodiac = "At";
            break;

            case 11:
                zodiac = "Koyun";
            break;
            default:
                System.out.println("Hatali giris");
        }
        System.out.println( "Çin yili: " +zodiac);
        input.close();
    }
}
