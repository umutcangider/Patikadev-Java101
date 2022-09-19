package ManavKasaProgrami;

import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican = 5.00;

        double kg, toplamTutar = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        kg = input.nextDouble();
        toplamTutar += armut * kg;

        System.out.print("Elma Kaç Kilo ? : ");
        kg = input.nextDouble();
        toplamTutar += elma * kg;

        System.out.print("Domates Kaç Kilo ? : ");
        kg = input.nextDouble();
        toplamTutar += domates * kg;

        System.out.print("Muz Kaç Kilo ? : ");
        kg = input.nextDouble();
        toplamTutar += muz * kg;

        System.out.print("Patlıcan Kaç Kilo ? : ");
        kg = input.nextDouble();
        toplamTutar += patlican * kg;

        System.out.println("Toplam Tutar : " + toplamTutar);

    }
}
