package Uri._5_November;

import java.util.Scanner;

public class Uri_1151_Fibonacci {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int collection[] = new int[100];
        collection[0] = 0;
        collection[1] = 1;

        //array index...
        for (int i = 2; i < num; i++) {
            collection[i] = collection[i - 1] + collection[i - 2];
            System.out.println(collection[i]);
        }
        for (int i = 1; i < num; i++) {

        }


       /* int firsNum = 0, secNum = 1, fibo;
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        System.out.print(firsNum+" "+secNum);
        for (int i = 3; i <= num; i++) {
            fibo = firsNum + secNum;
            firsNum = secNum;
            secNum = fibo;
            System.out.printf(" %d",fibo);
        }
        System.out.println();*/

    }
}
