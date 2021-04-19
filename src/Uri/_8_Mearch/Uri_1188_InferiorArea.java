package Uri._8_Mearch;

import java.util.Scanner;

public class Uri_1188_InferiorArea {
    public static void main(String[] args) {
        int r, c;
        double sum = 0, count = 0;
        double[][] myArray = new double[12][12];
        Scanner sc = new Scanner(System.in);
        String T = sc.next();

        //array input
        for (r = 0; r < myArray.length; r++) {
            for (c = 0; c < myArray.length; c++) {
                myArray[r][c] = sc.nextDouble();
                //System.out.printf("[%d] [%d] = %.1f\n", r, c, myArray[r][c]);
            }
        }

        /*// array are print area
        for (r = 0; r < myArray.length; r++) {
            for (c = 0; c < myArray.length; c++) {
                System.out.printf(" %.1f", myArray[r][c]);
            }
        }
*/
        //logic part area.
        int m = 5, n = 6;
        int o = 7, p = 11;
        for (r = o; r <= p; r++) {
            for (c = m; c <= n; c++) {
                //System.out.printf(" %.1f\n", myArray[r][c]);
                sum = sum + myArray[r][c];
                count++;

            }
            m--;
            n++;
        }

        // reference check area
        if (T.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else if (T.equals("M")) {
            System.out.printf("%.1f\n", sum / count);
        }
    }
}
