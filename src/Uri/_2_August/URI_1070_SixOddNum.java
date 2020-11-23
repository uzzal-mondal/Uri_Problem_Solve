package Uri._2_August;

import java.util.Scanner;

public class URI_1070_SixOddNum {
    public static void main(String[] args) {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        if (x % 2 == 0) {
            x += 1;
        }
        for (int i = 0; i <= 5; i++) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
            x += 2;
        }
    }
}
