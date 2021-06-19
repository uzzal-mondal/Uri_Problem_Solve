package Uri._2_August;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n >= 0) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(n + " x " + i + " = " + i * n);
                }
            } else {
                break;
            }
        }
    }
}
