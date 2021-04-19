package BITMJava21.JavaBasic;

import java.util.Scanner;

public class Class_One_IfElse {
    public static void main(String[] args) {

        int[] arrayOfNum = new int[100];
        int max, min, testNum, i, j;
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();

        //todo: input in array with index print....:
        for (i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.printf("Array[%d] = %d\n", i, arrayOfNum[i]);
        }

        //todo: array max and min....:
        max = arrayOfNum[0];
        min = arrayOfNum[0];

        for (i = 1; i < testNum; i++) {
            if (arrayOfNum[i] > max) {
                max = arrayOfNum[i];
            }else {
                if (arrayOfNum[i] < min) {
                    min = arrayOfNum[i];
                }
            }


        }
        System.out.println();

        //todo: max & min number....:
        for (j = 0; j < testNum; j++) {
            if (arrayOfNum[j] == max) {
                System.out.printf("Maximum [%d] = %d\n", j, max);
            }

            if (arrayOfNum[j] == min) {
                System.out.printf("Minimum [%d] = %d\n", j, min);
            }
        }


    }
}
