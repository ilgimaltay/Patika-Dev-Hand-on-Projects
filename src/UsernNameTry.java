package src;
import java.util.Scanner;

public class UsernNameTry {

    public static void main(String[] args) {

        String userName, password, newPassword = "";

        Scanner input = new Scanner(System.in);

        // İlk giriş
        System.out.print("Kullanici adi: ");
        userName = input.nextLine();
        System.out.print("Sifre: ");
        password = input.nextLine();

        // İlk girilen şifreyi sakla
        String oldPassword = password;

        if (userName.equals("A") && password.equals("1")) {
            System.out.println("Basarili bir sekilde giris yaptiniz.");
        } else {
            System.out.println("Kullanici adi veya sifre yanlis, Lutfen tekrar deneyiniz.");
        }

        // Tekrar giriş
        System.out.print("Kullanici adi: ");
        userName = input.nextLine();
        System.out.print("Sifre: ");
        password = input.nextLine();

        // İkinci giriş doğruysa
        if (userName.equals("A") && password.equals("1")) {
            System.out.println("Basarili bir sekilde giris yaptiniz.");
        } 
        // İkinci giriş de yanlışsa → şifre sıfırlama
        else {
            System.out.println("Lutfen yeni sifrenizi giriniz: ");
            newPassword = input.nextLine();

            if (newPassword.equals(oldPassword)) {
                System.out.println("Yeni sifre bir onceki sifre ile ayni olamaz.");
            } else {
                System.out.println("Sifre basariyla kayit edildi.");
            }
        }

        input.close();
    }
}
