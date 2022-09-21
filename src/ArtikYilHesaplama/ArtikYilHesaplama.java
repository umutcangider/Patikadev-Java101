package ArtikYilHesaplama;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Artık yıl olup olmadığını sorgulamak istediğiniz yılı giriniz: ");
        int year = input.nextInt();
        boolean leapYear = false;

        if(year % 4 == 0){
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    leapYear = true;
                } else {
                    leapYear = false;
                }
            } else {
                leapYear = true;
            }
        } else {
            leapYear = false;
        }

        if(leapYear) {
            System.out.println(year + " artık yıldır.");
        } else {
            System.out.println(year + " artık yıl değildir");
        }
    }
}
