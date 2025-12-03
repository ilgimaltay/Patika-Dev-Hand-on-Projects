package src;

import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        int day, month;
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Ay giriniz:");
        month = input.nextInt();
        System.out.print("Gun giriniz:");
        day = input.nextInt();

        String sign = "";

        switch (month) {

            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        sign = "Oglak";
                    } else {
                        sign = "Kova";
                    }
                } else {
                    isError = true;
                }
                break;

            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        sign = "Kova";
                    } else {
                        sign = "Balik";
                    }
                } else {
                    isError = true;
                }
                break;

            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        sign = "Balik";
                    } else {
                        sign = "Koc";
                    }
                } else {
                    isError = true;
                }
                break;

            case 4:
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        sign = "Koc";
                    } else {
                        sign = "Boga";
                    }
                } else {
                    isError = true;
                }
                break;

            case 5:
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        sign = "Boga";
                    } else {
                        sign = "Ikizler";
                    }
                } else {
                    isError = true;
                }
                break;
            case 6:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        sign = " Ikizler";
                    } else {
                        sign = "Yengec";
                    }
                } else {
                    isError = true;
                }
                break;

            case 7:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        sign = "Yengec";
                    } else {
                        sign = "Aslan";
                    }
                } else {
                    isError = true;
                }
                break;

            case 8:
                if (day >=1 && day <= 31){
                    if (day < 23){
                        sign = "Aslan";
                    } else {
                        sign = "Basak";
                    }
                } else {
                    isError = true;
                }
                break;

            case 9:
                if (day >= 1 && day <= 30){
                    if (day < 23){
                        sign ="Basak";
                    }else {
                        sign = "Terazi";
                    }
                }else {
                    isError = true;
                }
            break;

            case 10:
                if (day >=1 && day <=31){
                    if (day <23 ){
                        sign = "Terazi";
                    }else {
                        sign = "Akrep";
                    }
                } else {
                    isError = true;
                }
            break;

            case 11:
                if (day >=1 && day <=31){
                    if (day < 22){
                        sign = "Akrep";
                    } else {
                        sign = "Yay";
                    }
                } else {
                    isError = true;
                }
            break;

            case 12:
                if(day >=1 && day <=30){
                    if (day < 22){
                        sign = "Yay";
                    } else {
                        sign = "Oglak";
                    }
                } else {
                    isError = true;
                }
            break;
            default:
                isError = true;
        }
        if (isError){
            System.out.println("Hatali giris yaptiniz");
        } else {
        System.out.println("Burcunuz: "+sign);
        }

        input.close();
    }
}
