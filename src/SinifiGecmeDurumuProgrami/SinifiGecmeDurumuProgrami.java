package SinifiGecmeDurumuProgrami;

import java.util.Scanner;

public class SinifiGecmeDurumuProgrami {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik, lessonsNumber = 0;
        double avarage = 0;
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();
        if (mat>=0 && mat<=100) {
            avarage += mat;
            lessonsNumber++;
        }

        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();
        if (turkce>=0 && turkce<=100) {
            avarage += turkce;
            lessonsNumber++;
        }

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();
        if (fizik>=0 && fizik<=100) {
            avarage += fizik;
            lessonsNumber++;
        }

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();
        if (kimya>=0 && kimya<=100) {
            avarage += kimya;
            lessonsNumber++;
        }

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();
        if (muzik>=0 && muzik<=100) {
            avarage += muzik;
            lessonsNumber++;
        }


        avarage = avarage / lessonsNumber ;


        if (avarage <= 55) {
            System.out.println("Girilen Ders Sayisi : " +lessonsNumber);
            System.out.println("Ortalamanız : " + avarage);
            System.out.println("KALDINIZ...");
        } else {
            System.out.println("Ortalamanız : " + avarage);
            System.out.println("GEÇTİNİZ...");
        }


    }
}
