package DeseneGoreMetotOlusturma;

import java.util.Scanner;

public class DeseneGoreMetotOlusturma {

    static void pattern(int n) {
        if(n > 0) {
            System.out.print(n + " ");
            pattern(n - 5);
        }
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Desen için sayı gir: ");
        int number = scan.nextInt();

        pattern(number);


    }
}
