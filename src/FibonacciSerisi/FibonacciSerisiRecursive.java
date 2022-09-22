package FibonacciSerisi;

import java.util.Scanner;

public class FibonacciSerisiRecursive {

    static int fib(int n) {
        if(n == 1 || n == 2) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç Elemanlı Fibonacci Serisi Oluşturulsun : ");
        int n = input.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.print(fib(i) + " ");

        }

    }
}
