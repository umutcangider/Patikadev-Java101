package KullaniciGirisiProgrami;

import java.util.Scanner;

public class KullaniciGirisiProgrami {
    public static void main(String[] args) {
        String userName, password, passwordReset, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();

        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız");
        } else if(!userName.equals("patika") && !password.equals("java123")) {
            System.out.println("Kullanıcı Adını ve Şifreyi Yanlış Girdiniz.");
        } else if(!userName.equals("patika")) {
            System.out.println("Kullanıcı Adını Yanlış Girdiniz.");
        } else {
            System.out.println("Şifreniz Yanlış !");
            System.out.println("Yeni şifre belirlemek için 'yes' işlemi sonlandırmak için 'no' yazınız !");
            passwordReset = input.nextLine();

            if (passwordReset.equals("yes")) {
                System.out.println("Yeni Şifrenizi Yazınız");
                newPassword = input.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Şifreniz eski şifrenizle aynı olamaz");
                } else {
                    System.out.println("Şifreniz başarıyla değiştirildi.");
                }
            } else if (passwordReset.equals("no")) {
                System.out.println("İşlem Sonlandırıldı.");
            } else {
                System.out.println("Geçersiz bir giriş yaptınız");
            }
        }
    }
}
