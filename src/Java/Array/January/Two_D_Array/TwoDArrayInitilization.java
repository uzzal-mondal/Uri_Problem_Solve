package Java.Array.January.Two_D_Array;

public class TwoDArrayInitilization {
    public static void main(String[] args) {
        int[][] arrayOfNum = new int[2][3];
        arrayOfNum[0][0] = 10;
        arrayOfNum[0][1] = 20;
        arrayOfNum[0][2] = 30;
        arrayOfNum[1][0] = 40;
        arrayOfNum[1][1] = 50;
        arrayOfNum[1][2] = 60;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Row[%d] Col[%d] = %d\n", i, j, arrayOfNum[i][j]);
            }
            //System.out.println();
        }

    }
}
