package EbobEkokBulanProgram;

import java.util.Scanner;

public class EbobEkokBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n1 Sayısını Giriniz: ");
        int n1 = input.nextInt();
        System.out.print("n2 Sayısını Giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1;

        // EBOB
        for (int i = 1; i <= n1 ; i++) {
            if(n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
        }
        System.out.println("EBOB : " + ebob);

        // EBOB (II.YOL)
        for (int k = n1; k >= 1 ; k--) {
            if(n1 % k == 0 && n2 % k == 0) {
                ebob = k;
                break;
            }
        }
        System.out.println("EBOB (II.YOL) : " + ebob);

        // EKOK
        int ekok = 1;
        for (int i = 1; i <= (n1 * n2); i++) {
            if(i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                break;
            }
        }
        System.out.println("EKOK : " + ekok);

        System.out.println("EKOK : " + (n1 * n2) / ebob);

    }
}
