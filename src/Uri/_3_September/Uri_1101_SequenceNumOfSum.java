package Uri._3_September;

import java.util.Scanner;

public class Uri_1101_SequenceNumOfSum {
    public static void main(String[] args) {

        int m, n, temp, sum = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            m = sc.nextInt();
            n = sc.nextInt();

            if (m > n) {
                temp = m;
                m = n;
                n = temp;
            }
            if (m <= 0 || n <= 0) {
                break;
            } else {
                for (int i = m; i <= n; i++) {

                    sum = sum + i;
                    System.out.printf("%d ",i);
                }
            }
            System.out.printf("Sum = %d",sum);
        }


    }
}
