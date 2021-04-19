package Uri._6_December;

import java.util.Scanner;

public class Uri_1182_ColumnInArray {
    public static void main(String[] args) {
        double[][] arrayOfM = new double[5][5];
        int r, c, columnInputNum;
        double sum = 0.0, avg;
        String T;
        Scanner sc = new Scanner(System.in);
        System.out.println("Column input");
        columnInputNum = sc.nextInt();
        System.out.println("Chr input");
        T = sc.next();

        // user input this array
        for (r = 0; r < arrayOfM.length; r++) {
            for (c = 0; c < arrayOfM.length; c++) {
                arrayOfM[r][c] = sc.nextDouble();
                System.out.printf("array[%d][%d] = %.1f\n", r, c, arrayOfM[r][c]);
            }
        }

        //print the array input num..

        System.out.println("Array of length print : - ");
        for (r = 0; r < arrayOfM.length; r++) {
            for (c = 0; c < arrayOfM.length; c++) {
                System.out.printf("%.1f  ", arrayOfM[r][c]);
            }

            System.out.println();
        }

        //column of num ..
        System.out.println("column input num showing :- " + columnInputNum);
        for (r = 0; r < arrayOfM.length; r++) {
            System.out.printf("[%d][%d] = %.1f \n", columnInputNum, r, arrayOfM[r][columnInputNum]);
        }


        //column input adding the number.
        // System.out.println("Sum  = ");
        for (r = 0; r < arrayOfM.length; r++) {
            sum = sum + arrayOfM[r][columnInputNum];
        }


        //checking the s, m;
        if (T.equals("S")) {
            System.out.printf("\nsum = %.1f\n", sum);
        } else if (T.equals("M")) {
            System.out.printf("\navg = %.1f\n", sum / arrayOfM.length);
        }
    }
}
