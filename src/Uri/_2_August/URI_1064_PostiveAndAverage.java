package Uri._2_August;

import java.util.Scanner;

public class URI_1064_PostiveAndAverage {
    public static void main(String[] args) {
        float x, avg = 0, pos = 0, sum = 0;
        Scanner sc = new Scanner(System.in);

        for (float i = 1; i <= 6; i++) {
            x = sc.nextFloat();

            if (x > 0) {
                pos += 1;
                sum = sum + x;

            }

        }
        avg = (sum / pos);
        System.out.printf("%.0f valores positivos\n", pos);
        System.out.printf("%.1f\n", avg);
    }
}
