package Uri._9_Ramadan_April;

import java.util.Scanner;

public class SquareMatrix_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int row, col, k, inputNum,  a, b;


        while (true) {
            inputNum = sc.nextInt();
            //todo: including input number...
            int arrayOf[][] = new int[inputNum][inputNum];
            if (inputNum == 0) {
                break;
            } else {
                //todo: be even num then show the half num
                int hn = inputNum / 2;
                //todo: be odd num show the full num with add 1.
                if (inputNum % 2 == 1) {
                    hn++;
                }

                a = 0;
                b = inputNum - 1;


                //todo: just business logic here..
                for (k = 1; k <= hn; k++) {

                    //todo: first layer print 1
                    for (row = a; row <= b; row++) {
                        for (col = a; col <= b; col++) {
                            arrayOf[row][col] = k;
                        }
                    }
                    a++;
                    b--;
                }


                //todo: print
                for (row = 0; row < inputNum; row++) {
                    for (col = 0; col < inputNum; col++) {
                        //todo: first column - 0 then space 2
                        if (col == 0) {
                            System.out.printf("%3d", arrayOf[row][col]);
                        }
                        //todo: first column don't - 0 then space 3
                        else {
                            System.out.printf(" %3d", arrayOf[row][col]);
                        }
                    }
                    //todo: new line print for col with row.
                    System.out.println();
                }
                System.out.println();
            }
        }
    }
}
