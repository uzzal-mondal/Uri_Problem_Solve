package Java.Array.January.ArrayInAscending;

import java.util.Scanner;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arrayOfNum = new int[10];
        int testNum, max, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many count data do you want.?");
        testNum = sc.nextInt();

        System.out.println("Enter your array input data: ");
        for (i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.printf("Index: [%d] = %d\n", i, arrayOfNum[i]);
        }

        System.out.print("Array elements are\n");
        for (i = 0; i < testNum; i++) {
            int dataOfNum = arrayOfNum[i];
            System.out.printf("%d ", dataOfNum);
        }

        //finding to maximum number..
        max = arrayOfNum[0];
        for (i = 1; i < testNum; i++) {
            if (arrayOfNum[i] > max) {
                max = arrayOfNum[i];
                //System.out.printf("Maximum number %d\n",max);
            }
        }
        System.out.printf("\nMaximum numbers are: %d\n", max);

        /*for (i = 0; i < testNum; i++) {
            if (max == arrayOfNum[i]) {
                System.out.printf("\nMaximum numbers are: %d\n", max);
            }
        }*/


    }
}
