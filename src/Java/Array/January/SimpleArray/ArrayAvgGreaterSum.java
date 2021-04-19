package Java.Array.January.SimpleArray;

import java.util.Scanner;

public class ArrayAvgGreaterSum {
    public static void main(String[] args) {

        int[] arrayOfNum = new int[100];
        System.out.println("Enter array size 1-100");
        int testNum, i, sum = 0;
        float avg;
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();

        //array input area.

        for (i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
            //System.out.printf("Enter  %d  elements: %d\n", i, arrayOfNum[i]);
        }
        //System.out.printf("Enter  %d  elements: %d %d %d\n", i, arrayOfNum[i],arrayOfNum[i], arrayOfNum[i]);
        System.out.println("Enter array elements: "+testNum);

        //array for sum
        int max = arrayOfNum[0];
        for (i = 0; i < testNum; i++) {
            sum = sum + arrayOfNum[i];
            if (arrayOfNum[i] > max) {
                max = arrayOfNum[i];
            }
        }
        avg = (float) sum / testNum;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Number greater than average are : " + max);


    }
}
