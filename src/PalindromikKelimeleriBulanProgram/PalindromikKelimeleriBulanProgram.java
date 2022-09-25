package PalindromikKelimeleriBulanProgram;

import java.util.Scanner;

public class PalindromikKelimeleriBulanProgram {

    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
        String reverse = "";
        for(int i = str.length() - 1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        return str.equals(reverse);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Palindromik olup olmadığını sorgulamak istediğiniz kelimeyi yazınız : ");
        String word = input.nextLine();
        System.out.println(isPalindrome(word));
        System.out.println(isPalindrome2(word));

    }
}
