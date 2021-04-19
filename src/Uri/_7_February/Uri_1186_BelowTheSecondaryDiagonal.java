package Uri._7_February;

import java.util.Scanner;

public class Uri_1186_BelowTheSecondaryDiagonal {
    public static void main(String[] args) {
        int r, c, n = 11;
        double[][] arrayOfNum = new double[12][12];
        double sum = 0.0, count = 0;
        Scanner sc = new Scanner(System.in);
        String T = sc.next();

        System.out.println("Enter your data: ");
        for (r = 0; r < arrayOfNum.length; r++) {
            for (c = 0; c < arrayOfNum.length; c++) {
                arrayOfNum[r][c] = sc.nextDouble();
                System.out.printf("[%d],[%d] = %.1f\n", r, c, arrayOfNum[r][c]);

            }
        }
        System.out.println("all array are print");
        for (r = 0; r < arrayOfNum.length; r++) {
            for (c = 0; c < arrayOfNum.length; c++) {
                System.out.printf(" %.1f", arrayOfNum[r][c]);
            }
            System.out.println();
        }

        System.out.println("Logical part");
        for (r = 1; r < arrayOfNum.length; r++) {
            for (c = n; c < arrayOfNum.length; c++) {
                sum = sum + arrayOfNum[r][c];
                count++;
                //System.out.printf(" %.1f", arrayOfNum[r][c]);
            }
            System.out.println();
            n--;
        }

        if (T.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else if (T.equals("M")) {
            System.out.printf("%.1f\n", sum / count);
        }
    }
}
