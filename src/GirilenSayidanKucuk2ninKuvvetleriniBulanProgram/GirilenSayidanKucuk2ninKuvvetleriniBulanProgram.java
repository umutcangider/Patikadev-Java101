package GirilenSayidanKucuk2ninKuvvetleriniBulanProgram;

import java.util.Scanner;

public class GirilenSayidanKucuk2ninKuvvetleriniBulanProgram {
    public static void main(String[] args) {

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz : ");
        number = input.nextInt();

        for (int i = 1; i <= number ; i*=2) {
            System.out.println(i);
        }
    }
}
