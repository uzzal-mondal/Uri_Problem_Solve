package Uri._5_November;

import java.util.Scanner;

public class Uri_1155_SSquare {
    public static void main(String[] args) {
        double i, sum = 0, div;

        for (i = 1; i <= 100; i++) {
            div = 1 / i;
            sum = sum + div;
        }
        System.out.printf("%.2f\n", sum);
    }
}
