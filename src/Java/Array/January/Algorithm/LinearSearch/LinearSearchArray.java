package Java.Array.January.Algorithm.LinearSearch;

import java.util.Scanner;

public class LinearSearchArray {
    public static void main(String[] args) {
        int[] arrayOfNUm = new int[10];
        int testNum, i, value, position = -1, count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your user data: ");
        testNum = sc.nextInt();
        System.out.println("Searching value for user data");
        value = sc.nextInt();


        System.out.println("Enter user array number input");
        for (i = 0; i < testNum; i++) {
            arrayOfNUm[i] = sc.nextInt();
            System.out.printf("index[%d] = %d\n", i, arrayOfNUm[i]);
        }

        //linear searching array..
        for (i = 0; i < testNum; i++) {
            if (arrayOfNUm[i] == value) {
                position = i + 1;
                count++;
            }
        }


        if (position == -1) {
            System.out.printf("\n don't find the value %d\n", position);
        } else {
            System.out.printf("\nvalue = %d  is present locate position = %d, data = %d \n", value,
                    position, arrayOfNUm[position - 1]);
            if (count != 0) {
                System.out.printf("same value are: %d", count);
            }
        }
    }

}

