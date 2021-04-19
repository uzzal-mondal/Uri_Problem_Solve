package Java.Array.January.EvenOdd;

import java.util.Scanner;

public class EvenOddArrayFunction {
    public static void main(String[] args) {

        int[] arrayOfNum = new int[20];
        System.out.println("Enter array size: ");
        int testNum;
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();
        System.out.println("Enter array  data number: ");

        //array input here.
        for (int i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.printf("index[%d] = %d\n", i, arrayOfNum[i]);
        }

        findEvenNum(arrayOfNum, testNum);
        findOddNum(arrayOfNum, testNum);

    }

    // even number..
    public static void findEvenNum(int[] arrayOfNum, int size) {
        System.out.println("\nEven num - ");
        int evenCount = 0, sum = 0;
        for (int i = 0; i < size; i++) {
            if (arrayOfNum[i] % 2 == 0) {
                System.out.printf("index[%d] = %d\n", i, arrayOfNum[i]);
                evenCount++;
                sum = sum + arrayOfNum[i];
            }
        }
        System.out.println("Total Even num : =" + evenCount);
        System.out.println("Total Array num count : =" + sum);
    }

    //odd number..
    public static void findOddNum(int[] arrayOfNum, int size) {
        System.out.println("\nodd num - ");
        int oddCount = 0, sum = 0;
        for (int i = 0; i < size; i++) {
            if (arrayOfNum[i] % 2 != 0) {
                System.out.printf("index[%d] = %d\n", i, arrayOfNum[i]);
                oddCount++;
                sum = sum + arrayOfNum[i];
            }
        }
        System.out.println("Total Odd count " + oddCount);
        System.out.println("Total array Num count " + sum);
    }
}

