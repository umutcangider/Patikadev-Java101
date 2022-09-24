package GirilenSayininDizidekiEnYakinEnKucukVeEnBuyukDegerleriBulma;


import java.util.Arrays;
import java.util.Scanner;

public class GirilenSayininDizidekiEnYakinEnKucukVeEnBuyukDegerleriBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int inputNumber = input.nextInt();

        int[] arr = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int min = inputNumber;
        int max = inputNumber;

        for (int i: arr) {
            if(i > max) {
                max = i;
                break;
            }
        }

        for(int i = arr.length - 1; i > 0; i--) {
            if (arr[i] < min) {
                min = arr[i];
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
