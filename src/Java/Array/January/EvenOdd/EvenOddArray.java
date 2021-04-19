package Java.Array.January.EvenOdd;

import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        //even odd using in function..

        int testNum;
        int[] arrayOfNum = new int[20];
        System.out.println("Enter the size of the array : ");
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();

        System.out.println("Enter array elements : ");
        for (int i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
        }

        System.out.println("Even number in array:");
        findEvenNum(arrayOfNum, testNum);

        System.out.println("Odd number in array :");
        findOddNum(arrayOfNum, testNum);






        /*int[] arrayOfNum = new int[5];
        int i, testNum;
        System.out.println("Enter the size of the array : " + arrayOfNum.length);
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();
        System.out.println("Enter array elements: ");

        //array input
        for (i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.printf("index[%d] = %d\testNum", i, arrayOfNum[i]);
        }

        System.out.println("Even numbers in the array : ");
        for (i = 0; i < testNum; i++) {
            if (arrayOfNum[i] % 2 == 0) {
                System.out.printf("Even[%d] = %d\testNum", i, arrayOfNum[i]);
            } else {
                System.out.printf("Odd[%d] = %d\testNum", i, arrayOfNum[i]);
            }
        }*/

       /* System.out.println("Odd numbers in the array : ");
        for (i = 0; i < testNum; i++) {
            if (arrayOfNum[i] % 2 != 0) {
                System.out.printf("Odd[%d] = %d\testNum", i, arrayOfNum[i]);
            }
        }*/
    }


    private static void findEvenNum(int arrayOfNum[], int size) {
        for (int i = 0; i < size; i++) {
            if (arrayOfNum[i] % 2 == 0) {
                System.out.printf("Even[%d]  = %d\n", i, arrayOfNum[i]);
            }
        }
    }

    private static void findOddNum(int arrayOfNum[], int size) {
        for (int i = 0; i < size; i++) {
            if (arrayOfNum[i] % 2 != 0) {
                System.out.printf("Odd[%d] = %d\n", i, arrayOfNum[i]);
            }
        }
    }
}
