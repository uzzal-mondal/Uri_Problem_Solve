package Uri._8_Mearch;

import java.util.Scanner;

public class Uri_1189_LeftArea {
    public static void main(String[] args) {

        int r, c;
        double sum = 0, count = 0;
        double[][] myArray = new double[12][12];
        Scanner sc = new Scanner(System.in);
        String T = sc.next();

        //input r with c;
        for (r = 0; r < myArray.length; r++) {
            for (c = 0; c < myArray.length; c++) {
                myArray[r][c] = sc.nextDouble();
            }
        }

        /*//print r with c;
        for (r = 0; r < myArray.length; r++) {
            for (c = 0; c < myArray.length; c++) {
                System.out.printf(" %.1f\n", myArray[r][c]);
            }
        }*/

        //logic
        int p = 0, q = 4;
        for (r = 1; r <= 10; r++) {
            if (r <= 5) {
                for (c = 0; c <= p; c++) {
                    sum = sum + myArray[r][c];
                    count++;
                }
                p++;
            }  if (r >= 6) {
                for (c = 0; c <= q; c++) {
                    sum = sum + myArray[r][c];
                    count++;
                }
                q--;
            }
        }

        if (T.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else if (T.equals("M")) {
            System.out.printf("%.1f\n", sum / count);
        }

    }

}
