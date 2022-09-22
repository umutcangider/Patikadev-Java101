package GirilenSayilardanMinVeMaxDegerleriBulma;

import java.util.Scanner;

public class GirilenSayilardanMinVeMaxDegerleriBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        int n = input.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.print("Sayı Giriniz : ");
            int number = input.nextInt();
            if(min > number) {
                min = number;
            } else if(max < number){
                max = number;
            }
        }

        System.out.println("En Büyük Sayı : " + max);
        System.out.println("En Küçük Sayı : " + min);
    }
}
