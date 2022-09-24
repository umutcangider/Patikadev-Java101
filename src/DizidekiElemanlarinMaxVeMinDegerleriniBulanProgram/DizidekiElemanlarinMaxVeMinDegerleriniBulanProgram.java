package DizidekiElemanlarinMaxVeMinDegerleriniBulanProgram;

public class DizidekiElemanlarinMaxVeMinDegerleriniBulanProgram {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];
        for (int i : list) {
            if(min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }

        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
