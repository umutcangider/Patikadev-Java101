package GirilenSayiyaKadarOlanCiftSayilariBulma;

import java.util.Scanner;

public class GirilenSayiyaKadarOlanCiftSayilariBulma {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();

        for(int i = 1; i <= number; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
