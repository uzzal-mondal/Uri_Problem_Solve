package Java.Array.January.Two_D_Array;

import java.util.Scanner;

public class UserInputRowAndCol {
    public static void main(String[] args) {
        int[][] arrayOfNum = new int[2][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for A Matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Row[%d] Col[%d] = ", i, j);
                arrayOfNum[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter elements for B Matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Row[%d] Col[%d] = ", i, j);
                arrayOfNum[i][j] = sc.nextInt();
            }
            System.out.println();
        }


        System.out.printf("A = \n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", arrayOfNum[i][j]);
            }
            System.out.println(" ");
        }

        System.out.printf("\nB = \n");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", arrayOfNum[i][j]);
            }
            System.out.println(" ");
        }
    }
}
