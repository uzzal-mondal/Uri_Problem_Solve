package Java.Array.January.SimpleArray;

import java.util.Scanner;

public class SimpleArray {
    public static void main(String args[]) {

        // sum of array.

        int sum = 0, avg = 0, count = 0;
        int[] arrayOfNum = new int[5];
        Scanner sc = new Scanner(System.in);

        // array index join this data.
        for (int i = 0; i < arrayOfNum.length; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.printf("index[%d] , %d\n", i, arrayOfNum[i]);
        }

        // array adding every number.
        System.out.println("\nEvery data are print: ");
        for (int i = 0; i < arrayOfNum.length; i++) {
            System.out.printf("Index[%d] = %d\n", i, arrayOfNum[i]);
            sum = sum + arrayOfNum[i];

            //System.out.println(sum);
        }

        /*for (int res : arrayOfNum) {
            sum = sum + res;
            ++count;

        }*/

        avg = sum / arrayOfNum.length;
        System.out.printf("Sum = %d\n", sum);
        System.out.printf("Average = %d\n", avg);
        System.out.printf("Count Array = %d\n", avg);


    }
}
