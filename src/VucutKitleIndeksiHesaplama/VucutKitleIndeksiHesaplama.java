package VucutKitleIndeksiHesaplama;

import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        double boy, kilo, vucutKitleIndeksi;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        vucutKitleIndeksi = kilo / (boy * boy);

        System.out.println("Boyunuz : " + boy);
        System.out.println("Kilonuz : " + kilo);
        System.out.println("Vücut Kitle İndeksiniz : " + vucutKitleIndeksi);
    }
}
