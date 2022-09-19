package DaireninAlaniniVeCevresiniHesaplayanProgram;

import java.util.Scanner;

public class DaireninAlaniniVeCevresiniHesaplayanProgram {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçap değeri giriniz : ");
        r = input.nextInt();

        double daireninAlani = pi * r *r;
        double daireninCevresi = 2 * pi * r;

        System.out.println("Dairenin Alanı : " + daireninAlani);
        System.out.println("Dairenin Çevresi : " + daireninCevresi);
    }
}
