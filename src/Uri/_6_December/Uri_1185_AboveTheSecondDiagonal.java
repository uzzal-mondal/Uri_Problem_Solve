package Uri._6_December;

import java.util.Scanner;

public class Uri_1185_AboveTheSecondDiagonal {
    public static void main(String[] args) {
        int[][] arrayOfNum = new int[4][4];
        int r, c;
        Scanner sc = new Scanner(System.in);

        for (r = 0; r < arrayOfNum.length; r++) {
            for (c = 0; c < arrayOfNum.length; c++) {
                arrayOfNum[r][c] = sc.nextInt();
                System.out.printf("row & col[%d][%d] = %d\n", r, c, arrayOfNum[r][c]);
            }
        }

        System.out.println("All array are the print ");
        for (r = 0; r < arrayOfNum.length; r++) {
            for (c = 0; c < arrayOfNum.length; c++) {
                System.out.printf("%d ", arrayOfNum[r][c]);
            }
            System.out.println();
        }

        //logic print
        System.out.println("array diagonal: ");

        for (r = 0; r < arrayOfNum.length; r++) {
            for (c = 0; c <= arrayOfNum.length; c++) {
                if (c < arrayOfNum.length - 1 - r) {
                    System.out.printf("%d ", arrayOfNum[r][c]);
                }
            }
            System.out.println();
        }
    }
}
