package Uri.JavaBasic.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int[] arrayOfNum = new int[10];
        int fNum = 0, sNum = 1, fibo, count = 0;
        int totalFibo = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Find out Fibonacci number: ");

        System.out.print("Index:" + "\t\t" + "value:" + "\n");
        for (int i = 0; i < arrayOfNum.length; i++) {
            arrayOfNum[i] = sc.nextInt();
            System.out.print(i + "\t\t" + arrayOfNum[i] + "\n");
        }

        //logical part in a fibonacci.

        System.out.print("Element " + "\t\t" + "Value" + "\n");
        System.out.println(fNum + "\t\t\t\t" + sNum);
        for (int i = 0; i < arrayOfNum.length; i++) {
            fibo = fNum + sNum;
            fNum = sNum;
            sNum = fibo;
            count++;
            System.out.print(count + "\t\t\t\t" + fibo + "\n");
            totalFibo++;
        }
        System.out.println("Toatal fibo : " + totalFibo);
    }
}
