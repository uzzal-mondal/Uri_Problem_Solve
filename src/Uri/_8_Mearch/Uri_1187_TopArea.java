package Uri._8_Mearch;

import java.util.Scanner;

public class Uri_1187_TopArea {
    public static void main(String[] args) {

        double[][] myArray = new double[12][12];
        double sum = 0, count = 0;
        int r, c, m = 1, n = 10;
        Scanner sc = new Scanner(System.in);
        String T = sc.next();

        // 1. array input
        for (r = 0; r < myArray.length; r++) {
            for (c = 0; c < myArray.length; c++) {
                myArray[r][c] = sc.nextDouble();
                //System.out.printf("[%d] [%d] = %.1f\n", r, c, myArray[r][c]);
            }
        }

        /*// 2. input array print.
        for (r = 0; r < myArray.length; r++) {
            for (c = 0; c < myArray.length; c++) {
                System.out.printf("%.1f\n", myArray[r][c]);
            }
             System.out.println();
        }*/

        // 3. array logic
        for (r = 0; r <= 4; r++) {
            for (c = m; c <= n; c++) {
               // System.out.printf("%.1f\n", myArray[r][c]);
                sum = sum + myArray[r][c];
                count++;
            }
            m++;
            n--;
        }

        if (T.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else if (T.equals("M")) {
            System.out.printf("%.1f\n", sum / count);
        }
    }
}
