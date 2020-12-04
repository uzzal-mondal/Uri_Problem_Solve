package Uri._5_November;

import java.util.Scanner;

public class Uri_1157_Divisors {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.printf("%d\n", i);
            }
        }
    }
}
