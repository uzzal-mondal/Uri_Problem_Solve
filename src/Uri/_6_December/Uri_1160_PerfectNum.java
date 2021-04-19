package Uri._6_December;

import java.util.Scanner;

public class Uri_1160_PerfectNum {
    public static void main(String[] args) {
        int tesNum, num, res, sum = 0, i, j;
        Scanner sc = new Scanner(System.in);
        tesNum = sc.nextInt();


        for (j = 1; j <= tesNum; j++) {

            num = sc.nextInt();
            for (i = 2; i <= num; i++) {
                if (num % i == 0) {
                    res = num / i;
                    // System.out.printf("%d\n", res);
                    sum = sum + res;
                }
            }
            if (num == sum) {
                System.out.println(num + " eh perfeito");
                sum = 0;
            } else {
                System.out.println(num + " nao eh perfeito");
                sum = 0;
            }

        }

    }

}
