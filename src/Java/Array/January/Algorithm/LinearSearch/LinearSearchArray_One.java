package Java.Array.January.LinearSearch;

import java.util.Scanner;

public class LinearSearchArray_One {
    public static void main(String[] args) {
        int[] arrayOfNum = new int[100];
        int testNum, i, pos = -1, count = 0;
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();
        System.out.println("Enter array size [1-1000]: " + testNum);

        //input this array input:-
        for (i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.printf("Enter array elements: [%d]  = %d\n", i, arrayOfNum[i]);
        }

        //enter array elements.
        System.out.printf("\nEnter array elements: \n");
        for (i = 0; i < testNum; i++) {
            System.out.printf(" %d ", arrayOfNum[i]);
        }

        //array linear search.
        System.out.println("\nInput your search value: ");
        int search = sc.nextInt();
        for (i = 0; i < testNum; i++) {
            if (arrayOfNum[i] == search) {
                pos = i + 1;
                for (i = 0; i < testNum; i++) {
                    if (arrayOfNum[i] == search) {
                        count++;
                    }
                }
                System.out.printf("position is : %d\narray index: %d\n",
                        pos, pos - 1);
                break;
            }
        }


        if (pos == -1) {
            System.out.println("data don't match " + search);
        } else {
            System.out.printf("Congrats! your searching data is: %d\n" +
                    "same search data are: %d\n", search, count);
        }


    }
}
