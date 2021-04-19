package Uri._7_February;

import java.util.Scanner;

public class Uri_1185_AboveTheSecondaryDiagonal {
    public static void main(String[] args) {
        int r, c;
        double sum = 0, count = 0;
        double[][] arrayOfNum = new double[12][12];
        Scanner sc = new Scanner(System.in);
        String T = sc.next();

        //input the array:
        for (r = 0; r < arrayOfNum.length; r++) {
            for (c = 0; c < arrayOfNum.length; c++) {
                arrayOfNum[r][c] = sc.nextDouble();
                //System.out.printf("Array Of num [%d][%d] = %.1f\n", r, c, arrayOfNum[r][c]);
            }
        }

       /* //array print area:
        System.out.println("Array print area: ");
        for (r = 0; r < arrayOfNum.length; r++) {
            for (c = 0; c < arrayOfNum.length; c++) {
                System.out.printf(" %.1f", arrayOfNum[r][c]);
            }
            System.out.println();
        }*/

        //login area:
      //  System.out.println("Diagonal array: ");
        for (r = 0; r < arrayOfNum.length; r++) {
            for (c = 0; c < arrayOfNum.length; c++) {
                if (c < arrayOfNum.length - 1 - r) {
                    //System.out.printf(" %.1f", arrayOfNum[r][c]);
                    sum = sum + arrayOfNum[r][c];
                    count++;
                }
            }
            //System.out.println();
        }

        //upper case char sequence.
        if (T.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else if (T.equals("M")) {
            System.out.printf("%.1f\n", sum / count);
        }
    }
}
