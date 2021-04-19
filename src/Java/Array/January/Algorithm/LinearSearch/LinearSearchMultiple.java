package Java.Array.January.Algorithm.LinearSearch;

import java.util.Scanner;

public class LinearSearchMultiple {
    public static void main(String[] args) {
        int[] arrayOfNum = new int[10];
        int testNum, i, searchNum, times = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        testNum = sc.nextInt();

        System.out.printf("Enter %d numbers\n", testNum);
        //user array input
        for (i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.printf("%d \n", arrayOfNum[i]);
        }

        System.out.println("Enter the number to search");
        searchNum = sc.nextInt();

        //linear searching logic..
        for (i = 0; i < testNum; i++) {
            if (arrayOfNum[i] == searchNum) {
                System.out.printf("%d is present at location %d\n", searchNum, i + 1);
                times++;
            }
        }
        System.out.printf("%d is present %d times in the array\n", searchNum, times);
    }
}
