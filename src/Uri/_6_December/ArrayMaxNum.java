package Uri._6_December;

import java.util.Scanner;

public class LucasNumTest {
    public static void main(String[] args) {

        //user input greater and smaller num showing..:)
        int[] arrayOfNum = new int[6];
        int testNum, max, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your test num ");
        testNum = sc.nextInt();

        System.out.println("Enter your array num ");
        for (i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.printf("Num[%d] = %d\n", i, arrayOfNum[i]);
        }

        max = arrayOfNum[0];
        for (i = 1; i < testNum; i++) {
            if (arrayOfNum[i] > max) {
                max = arrayOfNum[i];
            }
            if (max == arrayOfNum[i]) {
                System.out.printf("\nindex = [%d], arrayLargeNum = %d\n", i, max);
            }

        }

       /* for (j = 0; j < arrayOfNum.length; j++) {
            if (max == arrayOfNum[j]) {
                System.out.printf("\nindex = [%d], arrayLargeNum = %d\n", j, max);
            }
        }*/


        //System.out.printf("\nindex = [%d], arrayLargeNum = %d\n", arrayOfNum[i], max);


        //System.out.println("large num :"+max);


    }
}
