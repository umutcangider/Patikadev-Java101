package GirilenSayilardanUcVeDortTamBolunenSayilarinOrtalamasi;

import java.util.Scanner;

public class GirilenSayilardanUcVeDortTamBolunenSayilarinOrtalamasi {
    public static void main(String[] args) {
        int number,counter = 0,total = 0;
        double avarage;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();


        for (int i = 1; i <= number ; i++) {
            if(i % 3 == 0 || i % 4 == 0) {
                System.out.print(i + " ");
                total += i;
                counter++;
            }
        }

        avarage = (double) total / counter;

        System.out.println("\nTotal : " + total);
        System.out.println("Counter : " + counter);
        System.out.println("Avarage : " + avarage);
    }
}
