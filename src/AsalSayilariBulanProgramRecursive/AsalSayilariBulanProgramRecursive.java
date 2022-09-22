package AsalSayilariBulanProgramRecursive;

import java.util.Scanner;

public class AsalSayilariBulanProgramRecursive {

    static boolean isPrime(int number,int index){
        if(number % index == 0){
            return false;
        } else if(index*index>number){
            return true;
        } else {
            return isPrime(number,index+1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = 0;
        while(number >= 0) {
            System.out.print("Sayı giriniz: ");
            number = input.nextInt();
            if (isPrime(number, 2)) {
                System.out.println(number + " sayısı asaldır!");
                System.out.println("----------------------------------");
            } else {
                System.out.println(number + " sayısı asal değildir!");
                System.out.println("----------------------------------");
            }
        }
    }
}
