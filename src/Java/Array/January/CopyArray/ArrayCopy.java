package Java.Array.January.CopyArray;

import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arrayOfNum_One = new int[10];
        int[] arrayOfNum_Two = new int[10];

        int testNum, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your test num data:     ");
        testNum = sc.nextInt();
        System.out.println("Enter your array elements: ");

        for (i = 0; i < testNum; i++) {
            arrayOfNum_One[i] = sc.nextInt();
        }

        //elements arrays are print..:
        System.out.printf("Array1 : ");
        for (i = 0; i < testNum; i++) {
            System.out.printf("%d ", arrayOfNum_One[i]);
        }

        System.out.printf("\nArray2 : ");
        for (i = 0; i < testNum; i++) {
            arrayOfNum_Two[i] = arrayOfNum_One[i];
            System.out.printf("%d ", arrayOfNum_Two[i]);
        }


    }
}
