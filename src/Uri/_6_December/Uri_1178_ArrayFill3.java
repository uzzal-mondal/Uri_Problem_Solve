package Uri._6_December;

import java.util.Scanner;

public class Uri_1178_ArrayFill3 {
    public static void main(String[] args) {
        double x;
        int[] arrayOfNum = new int[100];
        double[] arrayNum = new double[arrayOfNum.length];
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.printf("N[%d] = %.4f\n", i, x);
            x = x / 2;
        }
    }
}
