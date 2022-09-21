package KombinasyonHesaplamaProgrami;

import java.util.Scanner;

public class KombinasyonHesaplamaProgrami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n, r;

        System.out.print("n değerini giriniz : ");
        n = scan.nextInt();
        System.out.print("r değerini giriniz : ");
        r = scan.nextInt();

        if(r > n) {
            System.out.println("Hatalı Giriş Yaptınız");
            System.exit(0);
        }

        double combination = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("Kombinasyon : " + (int) combination);
    }

    public static double factorial(int n) {
        if(n == 0)
            return 1;
        else
            return (n * factorial(n-1));
    }
}
