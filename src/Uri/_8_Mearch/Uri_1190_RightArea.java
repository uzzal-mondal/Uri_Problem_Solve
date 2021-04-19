package Uri._8_Mearch;

import java.util.Scanner;

public class Uri_1190_RightArea {
    public static void main(String[] args) {

        int r, c;
        double[][] myArray = new double[12][12];
        double sum = 0, count = 0;
        Scanner sc = new Scanner(System.in);
        String T = sc.next();

        //this is array input area.
        for (r = 0; r < myArray.length; r++) {
            for (c = 0; c < myArray.length; c++) {
                myArray[r][c] = sc.nextDouble();
            }
        }

        int p = 11, q = 7;
        for (r = 1; r <= 10; r++) {
            if (r <= 5) {
                for (c = p; c < myArray.length; c++) {
                    //  System.out.printf("%.1f\n", myArray[r][c]);
                    sum = sum + myArray[r][c];
                    count++;
                }
                p--;
            }
            if (r >= 6) {
                for (c = q; c < myArray.length; c++) {
                    sum = sum + myArray[r][c];
                    count++;
                }
                q++;
            }
        }

        if (T.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else if (T.equals("M")) {
            System.out.printf("%.1f\n", sum / count);
        }
    }
}
