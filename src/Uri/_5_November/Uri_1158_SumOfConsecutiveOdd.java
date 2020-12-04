package Uri._5_November;

import java.util.Scanner;

public class Uri_1158_SumOfConsecutiveOdd {
    public static void main(String[] args) {
        int i, n, x, y, sum = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                x = sc.nextInt();
                y = sc.nextInt();

                if (x % 2 == 0) {
                    x++;
                }
                for (i = 0; i < y; i++) {
                    int res = i * 2;
                    sum = sum + x + res;  //x always taken 1 num..
                }
                System.out.println(sum);
                sum = 0;
            }
            break;
        }

    }
}
