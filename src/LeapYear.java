package src;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        
        int year;
        boolean leapYear = true;

        Scanner input = new Scanner(System.in);
        System.out.print("Yil giriniz: ");
        year = input.nextInt();

        if (year % 400 == 0){
            leapYear = true;
        } else if (year % 100 == 0){
            leapYear = false;
        }else if (year % 4 == 0){
            leapYear = true;
        }else{
            leapYear = false;
        }

        if (leapYear == true){
        System.out.println(year+ " artik yildir");
        } else {
        System.out.println(year+ " artik yil degildir.");
        }

input.close();    
    }
}
