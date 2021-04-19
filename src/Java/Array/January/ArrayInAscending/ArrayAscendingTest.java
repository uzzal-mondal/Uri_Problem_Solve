package Java.Array.January.ArrayInAscending;

import java.util.Scanner;

public class ArrayAscendingTest {
    public static void main(String[] args) {
        int[] arrayOfNum = new int[10];
        int testNum, i, j, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many data do you want to show ..?");
        testNum = sc.nextInt();

        System.out.println("Enter your data input : ");
        for (i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.printf("index: [%d] = %d\n", i, arrayOfNum[i]);
        }

        System.out.println("Enter data elements are: ");
        for (i = 0; i < testNum; i++) {
            System.out.printf("%d ", arrayOfNum[i]);
        }

        System.out.println("\nEnter Ascending array are: ");
        for (i = 0; i < testNum; i++) {
            for (j = i + 1; j < testNum; j++) {
                temp = arrayOfNum[i];
                arrayOfNum[i] = arrayOfNum[j];
                arrayOfNum[j] = temp;
            }
        }

        for (i = 0; i < testNum; i++) {
            System.out.printf("%d ", arrayOfNum[i]);
        }


    }
}
