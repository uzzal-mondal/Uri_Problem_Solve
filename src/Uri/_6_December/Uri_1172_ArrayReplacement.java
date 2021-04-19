package Uri._6_December;

import java.util.Scanner;

public class Uri_1172_ArrayReplacement {
    public static void main(String[] args) {

        int[] num = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();

        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] <= 0) {
                num[i] = 1;
                System.out.printf("X[%d] = %d\n", i, num[i]);
            } else {
                System.out.printf("X[%d] = %d\n", i, num[i]);
            }
        }
    }
}
