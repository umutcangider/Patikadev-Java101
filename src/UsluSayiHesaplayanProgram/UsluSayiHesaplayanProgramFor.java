package UsluSayiHesaplayanProgram;

import java.util.Scanner;

public class UsluSayiHesaplayanProgramFor {
    public static void main(String[] args) {
        int n, k;
        Scanner input = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        n = input.nextInt();
        System.out.print("Üs olacak sayı : ");
        k = input.nextInt();

        int total = 1;

        for (int i = 0; i < k; i++) {
            total *= n;
        }

        System.out.println("Sonuç : " + total);
    }
}
