package Uri._3_September;

import java.util.Scanner;

public class Uri_1099_SumOfConsecutiveOddNumbers {
    public static void main(String args[]) {
        int n, x, y, i, temp, j, sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x > y) {
                temp = x;
                x = y;
                y = temp;
            }
            if (x % 2 == 0) {
                x = x - 1;
            }
            x = x + 2;

            for (j = x; j < y; j += 2) {
                sum = sum + j;
            }
            System.out.printf("%d\n", sum);
            sum = 0;

        }

    }
}

