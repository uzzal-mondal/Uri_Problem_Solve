package Java.Array.January.Algorithm.BubbleSearch;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        //bubble sort algorithm..

        int[] arrayOfName = new int[10];
        int testNum, i, j, temp, flag;
        System.out.println("Enter your user input data: ");
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();

        System.out.println("Data are assign to array");
        for (i = 0; i < testNum; i++) {
            arrayOfName[i] = sc.nextInt();
            System.out.printf("index:[%d] = %d\n", i, arrayOfName[i]);
        }

        System.out.println("user data elements are: ");
        for (i = 0; i < testNum; i++) {
            System.out.printf("%d ", arrayOfName[i]);
        }

        //bubble sort algorithm are now start this program..
        for (i = 0; i < testNum - 1; i++) {
            flag = 0;
            for (j = 0; j < testNum - i - 1; j++) {
                if (arrayOfName[j] > arrayOfName[j + 1]) {
                    temp = arrayOfName[j];
                    arrayOfName[j] = arrayOfName[j + 1];
                    arrayOfName[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }

        System.out.println("\nBubble sort algorithm are: ");
        for (j = 0; j < testNum; j++) {
            System.out.printf("%d ", arrayOfName[j]);
        }


    }
}
