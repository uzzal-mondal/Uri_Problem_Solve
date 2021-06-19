package Uri._9_Ramadan_April;

import java.util.Scanner;

public class SquareMatrixOne {
    public static void main(String[] args) {
        int inputNum;
        int r, c;
        Scanner sc = new Scanner(System.in);


        while (true) {
            inputNum = sc.nextInt();
            if (inputNum == 0) {
                break;
            } else {
                for (r = 1; r <= inputNum; r++) {
                    for (c = 1; c <= inputNum; c++) {
                        System.out.printf("%3d", inputNum - c + 1);
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }
}
