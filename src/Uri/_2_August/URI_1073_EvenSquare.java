package Uri._2_August;

import java.util.Scanner;

public class URI_1073_EvenSquare {
    public static void main(String[] args) {
        int n, i, sq;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                sq = i * i;
                System.out.println(i + "^2" + " = " + sq);
            }
        }

    }
}
