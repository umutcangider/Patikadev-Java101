package AsalSayilariBulanProgram;

public class AsalSayilariBulanProgram {
    public static void main(String[] args) {

        boolean isPrime;
        int counter = 0;
        for (int i = 2; i <= 100 ; i++) {
            isPrime = true;
            for (int j = 2; j < i ; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                counter++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("1 ile 100 Arasında " + counter + " tane Asal Sayı vardır.");
    }
}
