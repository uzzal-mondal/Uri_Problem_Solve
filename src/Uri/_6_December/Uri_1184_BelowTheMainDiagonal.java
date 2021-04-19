package Uri._6_December;

import java.util.Scanner;

public class Uri_1184_BelowTheMainDiagonal {
    public static void main(String[] args) {

        double[][] arrayOfNum = new double[12][12];
        int r, c;
        String textInput;
        Scanner sc = new Scanner(System.in);
        textInput = sc.next();

        for (r = 0; r < arrayOfNum.length; r++) {
            for (c = 0; c < arrayOfNum.length; c++) {
                arrayOfNum[r][c] = sc.nextDouble();
            }
        }

        for (r = 0; r < arrayOfNum.length; r++) {
            for (c = 0; c < arrayOfNum.length; c++) {
                if (r > c) {

                }
            }
        }


    }
}
