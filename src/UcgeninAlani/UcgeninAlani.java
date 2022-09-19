package UcgeninAlani;

import java.util.Scanner;

public class UcgeninAlani {
    public static void main(String[] args) {
        int a, b, c, u;
        double ucgeninCevresi, ucgeninAlani;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı Uzunluğunu Giriniz : ");
        a = input.nextInt();

        System.out.print("2. Kenarı Uzunluğunu Giriniz : ");
        b = input.nextInt();

        System.out.print("3. Kenarı Uzunluğunu Giriniz : ");
        c = input.nextInt();

        u = (a + b + c) / 2;
        ucgeninCevresi = 2 * u;
        ucgeninAlani = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Çevresi : " + ucgeninCevresi);
        System.out.println("Üçgenin Alanı : " + ucgeninAlani);
    }

}
