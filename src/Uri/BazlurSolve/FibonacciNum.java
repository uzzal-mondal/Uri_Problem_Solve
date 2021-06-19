package Uri.BazlurSolve;

import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] args) {

        int fNum, sNum, fibo;
        int[] inputNum = new int[5];
        inputNum[0] = 0;
        inputNum[1] = 1;
        Scanner sc = new Scanner(System.in);
        for (int i = 2; i < 10; i++) {
            inputNum[i] = sc.nextInt();
            System.out.printf("index = %d \t value = %d\n", i, inputNum[i]);
        }








       /* int fNum, sNum, fib;
        Scanner sc = new Scanner(System.in);
        System.out.println("First num: ");
        fNum = sc.nextInt();
        System.out.println("Second num: ");
        sNum = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            fib = fNum + sNum;
            fNum = sNum;
            sNum = fib;
            System.out.println(fib);
        }*/
    }
}
