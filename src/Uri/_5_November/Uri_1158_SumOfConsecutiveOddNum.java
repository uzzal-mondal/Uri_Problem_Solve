package Uri._5_November;

import java.util.Scanner;

public class Uri_1158_SumOfConsecutiveOddNum {
    public static void main(String[] args) {
        int n, x, y, sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();


        for (int j = 0; j < n; j++) {
            x = sc.nextInt();
            y = sc.nextInt();

            if (x % 2 == 0) {
                x++;
            }

            for (int i = 0; i < y; i++) {
                // int res = i * 2;
                sum = sum + x;
                x += 2;
                // System.out.printf("%d ",res);
            }

            System.out.println(sum);
            sum = 0;

        }
    }
}

