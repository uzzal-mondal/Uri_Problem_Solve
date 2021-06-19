package Uri.BazlurSolve;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputNum;

        while (true) {
            inputNum = sc.nextInt();
            if (inputNum == 0) {
                break;
            } else {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(inputNum + " X " + i + " = " + inputNum * i);
                }
            }

        }
    }
};



