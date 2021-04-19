package Uri._6_December;

import java.util.Scanner;

public class Uri_1183_AboveTheMainDiagonal {
    public static void main(String[] args) {

        double[][] arrayOfNum = new double[4][4];
        int r, c;
        double sum = 0.0, avg = 0.0, count = 0.0;
        String T;
        Scanner sc = new Scanner(System.in);
        T = sc.next();

        // System.out.println("enter your row and column");
        for (r = 0; r < arrayOfNum.length; r++) {
            for (c = 0; c < arrayOfNum.length; c++) {
                arrayOfNum[r][c] = sc.nextDouble();
                 System.out.printf("row & col [%d][%d] = %.1f \n", r, c, arrayOfNum[r][c]);
            }
            System.out.println();
        }


        System.out.println("Enter array data: ");
        for (r = 0; r < arrayOfNum.length; r++) {
            for (c = 0; c < arrayOfNum.length; c++) {
                System.out.printf("%.1f ", arrayOfNum[r][c]);
            }
            System.out.println();
        }

         System.out.println("Follow the daigonal");
        for (r = 0; r < arrayOfNum.length; r++) {
            for (c = 0; c < arrayOfNum.length; c++) {
                if (r < c) {
                     System.out.printf("%.1f ", arrayOfNum[r][c]);
                    sum = sum + arrayOfNum[r][c];
                    count++;
                }
            }
            System.out.println();
        }

        if (T.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else if (T.equals("M")) {
            avg = sum / count;
            System.out.printf("%.1f\n", avg);
        }
    }
}
