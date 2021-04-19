package Uri._6_December;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Uri_1176_Fibonacci {
    public static void main(String[] args) {

        int testNum, indexValueOf;
        long[] arrayOfNum = new long[61];
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();

        arrayOfNum[0] = 0; //this is index.
        arrayOfNum[1] = 1;

        for (int i = 2; i < arrayOfNum.length; i++) {
            arrayOfNum[i] = arrayOfNum[i - 1] + arrayOfNum[i - 2];
            //System.out.printf("Index = [%d] array Length %d\n",i,arrayOfNum[i]);
        }


        for (int i = 0; i < testNum; i++) {
            indexValueOf = sc.nextInt();
            System.out.printf("Fib(%d) = %d\n", indexValueOf, arrayOfNum[indexValueOf]);
        }

        /*int testNum;
        int[] arrayOfNum = new int[60];
        Scanner sc = new Scanner(System.in);


        arrayOfNum[0] = 0;
        arrayOfNum[1] = 1;
        for (int i = 2; i < arrayOfNum.length; i++) {
            arrayOfNum[i] = arrayOfNum[i - 1] + arrayOfNum[i - 2];
        }

        testNum = sc.nextInt();
        for (int i = 0; i < testNum; i++) {
            int indexValue = sc.nextInt();
            System.out.printf("Fib (%d) = %d\n",  i, arrayOfNum[indexValue]);
        }*/




        /*int[] num = new int[4];
        num[0] = 0;
        num[1] = 1;
        num[2] = 2;
        num[3] = 3;
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= 0 && num[i] <= 1) {
                int res = num[0] + num[1];
                System.out.printf("Index[%d] = %d + %d = %d\n", i, num[0], num[1], res);
            } else {
                int sRes = num[2] + num[3];
                System.out.printf("Index[%d] = %d + %d = %d\n", i, num[2], num[3], sRes);
            }*/


        //System.out.println(num[i]);


       /* int testNum;
        int[] arrayOfFib = new int[60];

        arrayOfFib[0] = 0;
        arrayOfFib[1] = 1;

        for (int i = 2; i < arrayOfFib.length; i++) {
            arrayOfFib[i] =  arrayOfFib[i-1] + arrayOfFib[i - 2];
            System.out.printf("Fib");
        }*/










      /*  int testNum;
        int[] arrayOfFib = new int[60];
        Scanner sc = new Scanner(System.in);

        arrayOfFib[0] = 0;
        arrayOfFib[1] = 1;

        for (int i = 2; i < arrayOfFib.length; i++) {
            arrayOfFib[i] = arrayOfFib[i - 1] + arrayOfFib[i - 2];
        }
        testNum = sc.nextInt();
        for (int i = 0; i < testNum; i++) {
            System.out.printf("Fib (%d) = %d\n", i, arrayOfFib[i]);
        }*/



       /* int testNum, input, fNum = 0, sNum = 1, fibo;
        int[] arrayOfFib = new int[60];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your num: - ");
        testNum = sc.nextInt();


        for (int i = 0; i < testNum; i++) {
            System.out.println("Enter your array num input: ");
            arrayOfFib[i] = sc.nextInt();
        }


        arrayOfFib[0] = 0;
        arrayOfFib[1] = 1;
        for (int i = 2; i < arrayOfFib.length; i++) {
            arrayOfFib[i] = arrayOfFib[i - 1] + arrayOfFib[i - 2];

            //arrayOfFib[i] = fibo;
        }

        for (int i = 0; i < arrayOfFib.length; i++) {
            if (arrayOfFib[i] == testNum) {
                System.out.printf("Fib (%d) = %d\n", i, arrayOfFib[i]);
            }
        }*/




       /* for (int i = 0; i < arrayOfFib.length; i++) {
            arrayOfFib[i] = sc.nextInt();
        }

        arrayOfFib[0] = 0;
        arrayOfFib[1] = 1;
        for (int i = 2; i < testNum; i++) {

            fibo = fNum + sNum;
            fNum = sNum;
            sNum = fibo;
            arrayOfFib[i] = fibo;
        }

        for (int i = 0; i < arrayOfFib.length; i++) {
            input = sc.nextInt();
            if (arrayOfFib[i] == input) {
                System.out.printf("Fib (%d) = %d\n", i, input);
            }
        }*/



       /* int testNum, fNum = 0, sNum = 1, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input number: - ");
        testNum = sc.nextInt();


        int[] arrayOfFib = new int[100];
        arrayOfFib[0] = 0;
        arrayOfFib[1] = 1;

        for (int i = 2; i < testNum; i++) {
            res = fNum + sNum;
            fNum = sNum;
            sNum = res;
            arrayOfFib[i] = res;
            System.out.printf("Fib (%d) = %d\n", i, res);
        }

        for (int i = 0; i < testNum; i++) {
            System.out.println("Enter your arrray num : - ");
            int input = sc.nextInt();
            for (i=0; i<arrayOfFib.length; i++) {
                if (arrayOfFib[i] == input ){
                    System.out.printf("Fib (%d) = %d\n", i, input);
                }
            }
        }*/





        /*for (int i = 0; i < num; i++) {
            System.out.println("Enter your arrray num : - ");
            arrayNum[i] = sc.nextInt();
        }
        arrayNum[0] = 0;
        arrayNum[1] = 1;
        for (int i = 2; i < num; i++) {
            arrayNum[i] = arrayNum[i - 1] + arrayNum[i - 2];
        }
        for (int i = 0; i < num; i++) {
            System.out.printf("Fib (%d) = %d\n", i, arrayNum[i]);
        }*/





        /*for (int i = 0; i < testNum; i++) {
            System.out.printf("Fib (%d) = \n", i);
            num = sc.nextInt();
            res = fNum + sNum;
            fNum = sNum;
            sNum = res;
            System.out.printf("Fib (%d) = %d\n", i, res);
        }*/













        /*int testNum, fNum = 0, sNum = 1, res;
        Scanner sc = new Scanner(System.in);
        //testNum = sc.nextInt();

        while (true) {
            testNum = sc.nextInt();
            System.out.printf("Fib(%d) = %d\n", fNum);
            res = fNum + sNum;
            fNum = sNum;
            sNum = res;
            System.out.printf("Fib(%d) = %d\n", res);
        }*/

        /*for (int i = 2; i < testNum; i++) {

            System.out.printf("Fib(%d) = %d\n", i, res);
        }*/

        /*System.out.printf("Fib(%d) = %d\n",fNum, fNum);
        System.out.printf("Fib(%d) = %d\n",sNum, sNum);
        for (int i = 2; i < testNum; i++) {
            res = fNum + sNum;
            fNum = sNum;
            sNum = res;
            System.out.printf("Fib(%d) = %d\n", i, res);
        }
*/


       /* int fNum = 0, sNum = 1;
        int num, result;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            result = fNum + sNum;
            fNum = sNum;
            sNum = result;
            System.out.println(result);
        }*/
    }
}
