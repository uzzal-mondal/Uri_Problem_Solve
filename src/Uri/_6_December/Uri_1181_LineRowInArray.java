package Uri._6_December;

import java.util.Scanner;

public class Uri_1181_LineRowInArray {
    public static void main(String[] args) {
        double[][] M = new double[12][12];
        double sum = 0.0, avg = 0.0;
        String T;
        int rowOfLine, r, c;

        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your num of Row Line: ");
        rowOfLine = sc.nextInt();
        //System.out.println("Enter your indicating sum / avg char");
        T = sc.next();

        //System.out.println("Bidimentional column and row input ");
        for (r = 0; r < 12; r++) {
            for (c = 0; c < 12; c++) {
                M[r][c] = sc.nextDouble();
            }
            //System.out.println();
        }

        for (c = 0; c < 12; c++) {
            System.out.println(M[rowOfLine][c]);
            //sum = sum + M[rowOfLine][c];
        }

        if (T.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else if (T.equals("M")) {
            avg = sum / 12;
            System.out.printf("%.1f\n", avg);
        }
    }
}
