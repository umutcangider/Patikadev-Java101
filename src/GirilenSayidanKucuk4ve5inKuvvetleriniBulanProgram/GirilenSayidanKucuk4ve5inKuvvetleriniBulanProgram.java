package GirilenSayidanKucuk4ve5inKuvvetleriniBulanProgram;

import java.util.Scanner;

public class GirilenSayidanKucuk4ve5inKuvvetleriniBulanProgram {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz : ");
        number = input.nextInt();

        System.out.println("4'ün Kuvvetleri :");
        for (int i = 1; i <= number ; i*=4) {
            System.out.print(i + " ");
        }

        System.out.println("\n5'in Kuvvetleri :");
        for (int i = 1; i <= number ; i*=5) {
            System.out.print(i + " ");
        }
    }
}
