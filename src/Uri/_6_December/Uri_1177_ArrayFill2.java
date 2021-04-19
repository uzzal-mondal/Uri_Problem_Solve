package Uri._6_December;

import java.util.Scanner;

public class Uri_1177_ArrayFill2 {
    public static void main(String[] args) {

        int testNum, i, j = 0;
        int[] arrayOfNum = new int[1000];
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();

        for (i = 0; i < arrayOfNum.length; i++) {
            System.out.printf("N[%d] = %d\n", i, j);
            j++;
            if (testNum == j) {
                j = 0;
            }


        }




      /*  for (i = 0; i < arrayOfNum.length; i++) {
            arrayOfNum[i] = i;
            //System.out.printf("N[%d] = %d\n",arrayOfNum[i], i);
            for (j = 0; j < testNum; j++) {
                System.out.printf("N[%d] = %d\n", i, j);
            }
           // System.out.printf("N[%d] = %d\n", i, arrayOfNum[i]);
        }

        *//*for (i = 0; i < testNum; i++) {
            System.out.printf("N[%d] = %d\n", i, arrayOfNum[i]);
        }*/




        /*for (i = 0; i < arrayOfNum.length; i++) {
            arrayOfNum[i] = j;
            System.out.printf("N[%d] = %d\n", i, arrayOfNum[i]);
        }*/


    }
}
