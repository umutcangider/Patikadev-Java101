package ATMProjesi;

import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int balance = 1500;


        while(right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();
            int select;

            if(userName.equals("admin") && password.equals("admin123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();
                if (select == 1) {
                    System.out.print("Para miktarı : ");
                    int price = input.nextInt();
                    balance += price;
                } else if (select == 2) {
                    System.out.print("Para miktarı : ");
                    int price = input.nextInt();
                    if (price > balance) {
                        System.out.println("Bakiye yetersiz.");
                    } else {
                        balance -= price;
                    }
                } else if (select == 3) {
                    System.out.println("Bakiyeniz : " + balance);
                }
                }while(select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre");
                if(right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }

    }
}
