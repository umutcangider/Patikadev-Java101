package FaktoriyelHesaplamaProgrami;

import java.util.Scanner;

public class FaktoriyelHesaplamaProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Faktöriyeli hesaplanacak sayıyı giriniz : ");
        int n = input.nextInt();
        int total = 1;

        for (int i = 1; i <= n; i++) {
            total *= i;
        }

        System.out.println(n + " sayısının faktöriyeli : " + total);
    }
}
