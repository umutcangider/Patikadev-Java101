package GirilenDizidekiElemanlariSiralama;

import java.util.Arrays;
import java.util.Scanner;

public class GirilenDizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizi Boyutunu Giriniz : ");
        int arrayLength = input.nextInt();
        int[] arr = new int[arrayLength];


        for (int i = 0; i < arrayLength; i++) {
            System.out.print((i+1) +". Dizi Elemanını Giriniz : ");
            int arrayElement = input.nextInt();
            arr[i] = arrayElement;
        }

        System.out.println("Dizi : " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sıralanmış Dizi : " + Arrays.toString(arr));
    }
}
