package TersUcgenCizenProgram;

import java.util.Scanner;

public class TersUcgenCizenProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int n = input.nextInt();

        for (int i = n; i >= 1 ; i--) {
            for (int j = (n - i); j >= 1 ; j--) {
                System.out.print(" ");
            }
            for (int k = (2*i-1); k >= 1 ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
