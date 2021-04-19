package Uri._6_December;

import java.util.Scanner;

public class Uri_1181_LineInArray {
    public static void main(String[] args) {

        double[][] arrayOfNum = new double[5][5];
        double sum = 0.0, avg;
        char[] charInput = new char[2];
        int numOfRowInput, row, col;

        Scanner sc = new Scanner(System.in);
        System.out.println("please ! num of row input the number");
        numOfRowInput = sc.nextInt();
        System.out.println("please ! num of char input ");
        charInput = sc.next().toCharArray();


        // input line in array.
        for (row = 0; row < arrayOfNum.length; row++) {
            for (col = 0; col < arrayOfNum.length; col++) {
                arrayOfNum[row][col] = sc.nextDouble();
                System.out.printf("index[%d][%d] = %.1f\n", row, col, arrayOfNum[row][col]);
            }
            System.out.println();
        }
    }
}