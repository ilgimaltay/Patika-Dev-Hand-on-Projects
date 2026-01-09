package src;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        
        int count, sum=0 ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        count = inp.nextInt();

        for (int i=0 ; i<=count ; i++){
            if (i % 2 == 0 && i % 3 == 0){
                System.out.println(i);
                sum += i;
                count++;
            }
        }
                if (count > 0 ){
               double avarege = (double)sum / count;
               System.out.println("Ortalama:"+avarege);
            } else {
                System.out.println("Tam bolunebilen sayi bulunamadi.");
            }
        
        
    }
}
