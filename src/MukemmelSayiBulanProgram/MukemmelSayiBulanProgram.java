package MukemmelSayiBulanProgram;

import java.util.Scanner;

public class MukemmelSayiBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();

        int total = 0;

        for (int i = 1; i < number; i++) {
            if(number % i == 0) {
                total += i;
            }
        }
        if (number == total) {
            System.out.println(number + " Mükemmel bir sayıdır");
        } else {
            System.out.println(number + " Mükemmel bir sayı değildir");
        }

    }
}
