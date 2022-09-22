package UsluSayiHesaplamaRecursive;


import java.util.Scanner;

public class UsluSayiHesaplamaRecursive {
    static int exponentialNumber(int base, int power) {
        if(power == 0) {
            return 1;
        } else if (base == 1) {
            return 1;
        } else {
            return base * exponentialNumber(base, power - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üstel Sayının Tabanını Girin : ");
        int base = input.nextInt();
        System.out.print("Üstel Sayının Üssünü Girin : ");
        int power = input.nextInt();
        System.out.println(exponentialNumber(base, power));
    }
}
