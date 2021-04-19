package Java.Array.January.SimpleArray;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int[] arrayOfNum = new int[100];
        int testNum, fac = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array test num : ");
        testNum = sc.nextInt();

        // input this array..
        System.out.println("Enter your index & data ");
        for (int i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.printf("index[%d] = %d\n", i, arrayOfNum[i]);
        }


        //factorial num find out
        System.out.println();
        for (int i = 0; i < testNum; i++) {
            for (int j = 1; j <= arrayOfNum[i]; j++) {
                if (arrayOfNum[j] < 6) {
                    fac = fac * j;
                    System.out.printf("Fact Index[%d] , %d\n", j - 1, fac);
                } else {
                    System.out.println("Array bound of exception : " + i);
                    break;
                }
            }

            System.out.println();
            fac = 1;

        }







       /* int[] arrayOfNum = new int[100];
        int testNum, fac = 1, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input number. ");
        testNum = sc.nextInt();

        System.out.println("Enter your factorial element number : " + testNum);
        for (i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.printf("Array[%d] - %d\n", i, arrayOfNum[i]);
        }


        //factorial print here..
        System.out.println();
        for (i = 0; i < testNum; i++) {
            for (int n = 1; n <= arrayOfNum[i]; n++) {
                if (arrayOfNum[i] < 5) {
                    fac = fac * n;
                    System.out.printf("arrayOfNum[%d] , data %d\n", n - 1, fac);
                } else {
                    System.out.println("\nArray out of bound of exception - " + arrayOfNum[i]);
                    break;
                }

            }
            fac = 1;
        }*/




        /*int[] arrayOfNum = new int[5];
        int fac = 1, testNum;
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();

        for (int i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
        }


        for (int i = 1; i < arrayOfNum.length; i++) {
            fac = fac * i;
            System.out.printf("index [%d]  , %d\n", i - 1, fac);
        }*/

        /*for (int i = 1; i < arrayOfNum.length; i++) {
            fac = fac * arrayOfNum[i];
            System.out.printf("index[%d] , Fac %d\n", i, fac);
        }*/


        /*int i, fac = 1;
        for (i = 1; i <= 5; i++) {
            fac = fac * i;
            System.out.println(fac);
        }*/
    }
}
