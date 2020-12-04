package Uri._5_November;

import java.util.Scanner;

public class Uri_test {
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
                    sum = sum + x + i * 2;
                }
                System.out.println(sum);
                sum = 0;
            }
            break;
        }
    }
}
