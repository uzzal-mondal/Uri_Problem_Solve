package Uri._4_October;

import java.util.Scanner;

public class URI_1143_SquareAndCubic {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            for (int i = 1; i <= num; i++) {
                System.out.printf("%d %d %d\n", i, i*i,i*i*i);

            }

        }
}
