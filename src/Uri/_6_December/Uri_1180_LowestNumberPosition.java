package Uri._6_December;

import java.util.Scanner;

public class Uri_1180_LowestNumberPosition {
    public static void main(String[] args) {
        int[] arrayOfNum = new int[1000];
        int testNum, i, lowestNum;
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();

        // take a array input.
        for (i = 0; i < testNum; i++) {
            arrayOfNum[i] = sc.nextInt();
            //System.out.printf("Array Index = [%d] , Num %d\n", i, arrayOfNum[i]);
        }

        /*// array input print ...
        for (i = 0; i < testNum; i++) {
            System.out.printf("%d ", arrayOfNum[i]);
        }*/

        //lowest num find logic..
        lowestNum = arrayOfNum[0];
        for (i = 1; i < testNum; i++) {
            if (arrayOfNum[i] < lowestNum) {
                lowestNum = arrayOfNum[i];
            }
        }

        //lowest num print out.
        for (int j = 0; j < arrayOfNum.length-1; j++) {
            if (lowestNum == arrayOfNum[j]) {
                //System.out.println("Menor valor: " + lowestNum);
                System.out.printf("Menor valor: %d\nPosicao: %d\n", lowestNum, j);

            }

        }

    }
}
