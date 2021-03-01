package Java.Array.January.LinearSearch;

import java.util.Scanner;

public class ArraySearchingNumber {
    public static void main(String args[]) {
        int[] arrayOfNum = new int[10];
        int i, testNum, position = -1, value;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your test num: ");

        testNum = sc.nextInt();
        System.out.println("Enter your value : ");
        value = sc.nextInt();

        //array input number..
        System.out.println("Enter your linear search value input: ");
        for (i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.printf("index[%d] = data %d\n", i, arrayOfNum[i]);
        }

        //array linear search.
        for (i = 0; i < arrayOfNum.length; i++) {
            if (value == arrayOfNum[i]) {
                position = i + 1;
            }
        }

        if (position == -1) {
            System.out.printf("position don't find out %d = data %d\n", position, value);
        } else {
            System.out.printf("position of find out %d = data %d\n", position, value);
        }
    }

}
