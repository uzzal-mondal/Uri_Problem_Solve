package Java.Array.January.ArrayInAscending;

import java.util.Scanner;

public class ArrayInAscending {
    public static void main(String[] args) {

        int[] arrayOfNum = new int[10];
        int testNum, i, j, temp, min;
        System.out.println("Enter your test data: ");
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();

        System.out.println("Enter array elements : ");
        for (i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.printf("index[%d] = %d\n", i, arrayOfNum[i]);
        }

        System.out.println("Array Descending elements are: ");
        for (i = 0; i < testNum; i++) {
            System.out.printf("%d ", arrayOfNum[i]);
        }

        System.out.println("\nArray ascending elements are: ");
        for (i = 0; i < testNum; i++) {
            for (j = i + 1; j < testNum; j++) {
                if (arrayOfNum[i] > arrayOfNum[j]) {
                    temp = arrayOfNum[i];
                    arrayOfNum[i] = arrayOfNum[j];
                    arrayOfNum[j] = temp;
                }
            }
        }

        for (j = 0; j < testNum; j++) {
            System.out.printf("%d ", arrayOfNum[j]);
        }

    }
}
