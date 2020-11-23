package Uri._2_August;

import java.util.Scanner;

public class URI_1075_Remaning2 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i < 10000; i++) {
            if (i % n == 2) {
                System.out.println(i);
            }

        }

    }
}
