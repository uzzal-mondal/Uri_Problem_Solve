package Java.January.SimpleArray;

import java.util.Scanner;

public class PositiveAndNegativeArray {
    public static void main(String[] args) {

        int[] arrayOfNum = new int[100];
        System.out.println("Enter array size 1 - 100");
        int i, testNum, pos = 0, neg = 0, zero = 0, posSum = 0, negSum = 0;
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();
        System.out.println("Enter array elements: ");

        // array input
        for (i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.printf("index[%d] = %d\n", i, arrayOfNum[i]);
        }

        // array print
        System.out.println("\n");
        for (i = 0; i < testNum; i++) {
            if (arrayOfNum[i] > 0) {
                //System.out.println("positive num "+arrayOfNum[i]);
                posSum = posSum + arrayOfNum[i];
                //System.out.println("Positive number is sum " + sum);
                pos++;
            } else if (arrayOfNum[i] < 0) {
                //System.out.println("negative num "+arrayOfNum[i]);
                negSum = negSum + arrayOfNum[i];
                neg++;
            } else {
                //System.out.println("zero num "+arrayOfNum[i]);
                zero++;
            }

        }

        int totalSum = posSum + negSum;
        System.out.println("Positive number count is : " + pos);
        System.out.println("All positive number sum : " + posSum);
        System.out.println("Negative number count is : " + neg);
        System.out.println("All negative number sum : " + negSum);
        System.out.println("Zero count is : " + zero);
        System.out.println("Total sum = " + totalSum);

    }
}
