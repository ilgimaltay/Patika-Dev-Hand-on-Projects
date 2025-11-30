package src;

import java.util.Scanner;

public class PasswordReset {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username, password, newPassword;
        String realUser = "A";
        String realPass = "1";

        System.out.print("Kullanıcı adı: ");
        username = input.nextLine();

        System.out.print("Şifre: ");
        password = input.nextLine();

        // Doğru giriş
        if (username.equals(realUser) && password.equals(realPass)) {
            System.out.println("Başarılı şekilde giriş yaptınız.");
        } 
        // Yanlış giriş
        else {
            System.out.println("Kullanıcı adı veya şifre yanlış!");

            System.out.print("Şifreyi sıfırlamak ister misiniz? (evet/hayır): ");
            String answer = input.nextLine();

            if (answer.equals("evet")) {

                System.out.print("Yeni şifreyi giriniz: ");
                newPassword = input.nextLine();

                if (newPassword.equals(realPass)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }

            } else {
                System.out.println("İşlem iptal edildi.");
            }
        }

        input.close();
    }
}
