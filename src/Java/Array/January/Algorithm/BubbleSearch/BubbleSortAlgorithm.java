package Java.Array.January.ArrayInAscending;

import java.util.Scanner;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {

        int[] arrayOfNum = new int[5];
        System.out.println("Enter your user only a data input : ");
        int testNum, i, j, temp;
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();

        System.out.println("Enter user data : ");
        for (i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.printf("index[%d] = %d\n", i, arrayOfNum[i]);
        }
        System.out.println("User descending array data: ");
        for (i = 0; i < testNum; i++) {
            System.out.printf("%d ", arrayOfNum[i]);
        }

        System.out.println("\nEnter bubble sort algorithm here..");
        for (i = 0; i < testNum - 1; i++) {
            for (j = 0; j < testNum - i - 1; j++) {
                if (arrayOfNum[j] > arrayOfNum[j + 1]) {
                    temp = arrayOfNum[j];
                    arrayOfNum[j] = arrayOfNum[j + 1];
                    arrayOfNum[j + 1] = temp;
                }
            }

        }


        for (i = 0; i < testNum; i++) {
            System.out.printf("%d ", arrayOfNum[i]);
        }

    }
}
