package FibonacciSerisi;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç Elemanlı Fibonacci Serisi Oluşturulsun : ");
        int n = input.nextInt();

        int x = 0;
        int y = 1;
        int z;
        System.out.print(x + " " + y + " ");
        for (int i = 2; i < n ; i++) {
            z = x + y;
            x = y;
            y = z;
            System.out.print(z + " ");
        }
    }
}
