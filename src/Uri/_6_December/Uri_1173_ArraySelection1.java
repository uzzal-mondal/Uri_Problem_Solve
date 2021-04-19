package Uri._6_December;

import java.util.Scanner;

public class Uri_1173_ArraySelection1 {
    public static void main(String[] args) {

        int[] numOfArray = new int[100];
        double[] arrayNum = new double[numOfArray.length];
        double num;
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < arrayNum.length; i++) {
            num = sc.nextDouble();
            if (num <= 10) {
                arrayNum[i] = num;
                System.out.printf("A[%d] = %.1f\n", i, arrayNum[i]);
            }
        }

    }
}
