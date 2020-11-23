package Uri._2_August;

import java.util.Scanner;

public class URI_1078_MultiplicationTable {
    public static void main(String[] args) {
        int n, mul;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf(i + " x " + n + " = " + i * n);
        }
    }
}
