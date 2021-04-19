package Java.Array.January.Two_D_Array;

public class SimpleArray {
    public static void main(String[] args) {
        int[][] arrayOfNum = {{10, 20, 25}, {30, 40, 50}};

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", arrayOfNum[i][j]);
            }
            System.out.println();
        }
    }
}
