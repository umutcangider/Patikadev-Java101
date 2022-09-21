package GirilenSayininBasamakSayilarininToplami;

import java.util.Scanner;

public class GirilenSayininBasamakSayilarininToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int number = input.nextInt();
        int basNumber = 0;
        int total = 0;

        while( number != 0) {
            total += (number % 10);
            number /= 10;
            basNumber++;
        }
        System.out.println("Basamak Sayısı : " + basNumber);
        System.out.println("Basamak Sayılarının Toplamı : " + total);
    }
}
