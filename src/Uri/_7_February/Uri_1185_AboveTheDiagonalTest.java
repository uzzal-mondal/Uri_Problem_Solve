package Uri._7_February;

import java.util.Scanner;

public class Uri_1185_AboveTheDiagonalTest {
    public static void main(String[] args) {
        int[][] arrayOfNum = new int[5][5];
        Scanner sc = new Scanner(System.in);
        String T = sc.next();
        int r, c, vl = 4;

        System.out.println("Array are Scanner:-");
        for (r = 0; r < arrayOfNum.length; r++) {
            for (c = 0; c < arrayOfNum.length; c++) {
                arrayOfNum[r][c] = sc.nextInt();
                System.out.printf("[%d][%d] = %d\n", r, c, arrayOfNum[r][c]);
            }

        }

        System.out.println("Array are print:-");
        for (r = 0; r < arrayOfNum.length; r++) {
            for (c = 0; c < arrayOfNum.length; c++) {
                //arrayOfNum[r][c] = sc.nextInt();
                System.out.printf(" %d", arrayOfNum[r][c]);
            }
            System.out.println();
        }

        System.out.println("Array are logic part");
        for (r = 0; r < 5; r++) {
            for (c = 0; c < vl; c++) {
                //arrayOfNum[r][c] = sc.nextInt();
                System.out.printf(" %d", arrayOfNum[r][c]);
            }
            System.out.println();
            vl--;
        }

    }
}
