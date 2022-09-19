package DaireDilimininAlani;

import java.util.Scanner;

public class DaireDilimininAlani {
    public static void main(String[] args) {
        int r, a;
        double pi = 3.14, daireDiliminiAlani;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçap değeri giriniz : ");
        r = input.nextInt();

        System.out.print("Dairenin merkez açısını giriniz : ");
        a = input.nextInt();

        daireDiliminiAlani = (pi * (r * r) * a) / 360;

        System.out.print("Daire Diliminin Alanı : " + daireDiliminiAlani);
    }
}
