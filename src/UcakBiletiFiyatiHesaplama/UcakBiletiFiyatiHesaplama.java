package UcakBiletiFiyatiHesaplama;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Gidilecek mesafeyi (km) giriniz: ");
        double distance = input.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        int age = input.nextInt();

        System.out.println("Yolculuk Tipini Seçiniz:\n1 => Tek Yön\n2 => Gidiş-Dönüş");
        int travelType = input.nextInt();

        double pricePerDistance = distance * 0.1;

        if (distance > 0 && travelType == 1 || travelType == 2) {
            switch (travelType) {
                case 1:
                    if(age < 12){
                        System.out.println("Toplam Tutar :" + (pricePerDistance - (pricePerDistance * 0.5)));
                    } else if (age > 12 && age < 24){
                        System.out.println("Toplam Tutar :" + (pricePerDistance - (pricePerDistance * 0.1)));
                    } else if (age > 65){
                        System.out.println("Toplam Tutar :" + (pricePerDistance - (pricePerDistance * 0.3)));
                    } else {
                        System.out.println("Toplam Tutar :" + pricePerDistance);
                    }
                    break;
                case 2:
                    double roundTripDiscount = pricePerDistance - (pricePerDistance * 0.2);

                    if(age < 12){
                        System.out.println("Toplam Tutar :" + (roundTripDiscount - (roundTripDiscount * 0.5)) * 2);
                    } else if (age > 12 && age < 24){
                        System.out.println("Toplam Tutar :" + (roundTripDiscount - (roundTripDiscount * 0.1)) * 2);
                    } else if (age > 65){
                        System.out.println("Toplam Tutar :" + (roundTripDiscount - (roundTripDiscount * 0.3)) * 2);
                    } else {
                        System.out.println("Toplam Tutar :" + roundTripDiscount * 2);
                    }
                    break;
            }
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

    }
}
