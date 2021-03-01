package Java.January.EvenOdd;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        int[] arrayOfNum = new int[100];
        int testNum, i;
        System.out.println("Enter size of the array");
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();

        System.out.println("Input this user number ");
        for (i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.printf("size[%d] = %d\n", i, arrayOfNum[i]);
        }

        System.out.println("Even number in the array are:");
        for (i = 0; i < testNum; i++) {
            if (arrayOfNum[i] % 2 == 0) {
                System.out.printf(" index [%d]  = Even num : %d\n", i, arrayOfNum[i]);
            }
        }

        System.out.println("Odd number in the array are:");
        for (i = 0; i < testNum; i++) {
            if (arrayOfNum[i] % 2 != 0) {
                System.out.printf(" index [%d]  = odd num : %d\n", i, arrayOfNum[i]);
            }
        }

    }
}
