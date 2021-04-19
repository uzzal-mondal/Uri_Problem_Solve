package Uri._6_December;

import java.util.Scanner;

public class Uri_1160_ArrayFill1 {
    public static void main(String[] args) {

        int[] num = new int[10];
        int sum;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sum = x;


        for (int i = 0; i < num.length; i++) {
            num[i] = sum;
            sum = sum + sum;
            System.out.printf("N[%d] = %d\n", i, num[i]);
        }










        /*int[] num = new int[5];
        int totalCount;
        Scanner sc = new Scanner(System.in);
        totalCount = sc.nextInt();
        int sum = totalCount;


        for (int i = 0; i < num.length; i++) {
            num[i] = sum;
            sum = sum + sum;
            System.out.printf("N[%d] = %d\n", i, num[i]);
        }
*/



        /*int[] num = new int[10];

        Scanner sc = new Scanner(System.in);
        int testNum  = sc.nextInt();


        for (int i = 0; i < num.length; i++) {
            //num[i] = sc.nextInt();
            System.out.println(num[i]);
        }

        for (int i = 0; i < num.length; i++) {
            int res = num[i] + num[i];
            System.out.printf("N[%d] = %d\n", i, res);
        }*/



        /*int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("N[%d] = %d\n", i, arr[i]);
        }
*/

        /*int num, testNum;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while (true) {
            testNum = sc.nextInt();
            for (int i = 0; i < testNum; i++) {
                System.out.println(i);
            }
        }*/

        /*int[] num = new int[10];

        Scanner sc = new Scanner(System.in);
        int testNum  = sc.nextInt();


        for (int i = 0; i < num.length; i++) {
            //num[i] = sc.nextInt();
            System.out.println(num[i]);
        }

        for (int i = 0; i < num.length; i++) {
            int res = num[i] + num[i];
            System.out.printf("N[%d] = %d\n", i, res);
        }*/
    }
}
