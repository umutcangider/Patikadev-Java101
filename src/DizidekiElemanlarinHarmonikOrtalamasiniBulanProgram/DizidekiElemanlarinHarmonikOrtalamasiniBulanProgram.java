package DizidekiElemanlarinHarmonikOrtalamasiniBulanProgram;

public class DizidekiElemanlarinHarmonikOrtalamasiniBulanProgram {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        double harmonicSeriesSum = 1;

        for (double i : list) {
            harmonicSeriesSum +=  (1/i);
        }

        System.out.println("harmonicSeriesSum : " + harmonicSeriesSum);
        double harmonicAvarage = list.length / harmonicSeriesSum;
        System.out.println("harmonicAvarage : " + harmonicAvarage);
    }

}
