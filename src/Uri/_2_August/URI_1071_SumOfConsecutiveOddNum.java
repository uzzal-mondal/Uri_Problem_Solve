package Uri._2_August;

import java.util.Scanner;

public class URI_1071_SumOfConsecutiveOddNum {
    public static void main(String[] args) {
        int x, y, sum = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

         if (x > y) {
            for (int i = y + 1; i < x; i++) {
                if (i % 2 != 0) {
                    sum = sum + i;
                }
            }
        }

        System.out.println(sum);


    }
}
