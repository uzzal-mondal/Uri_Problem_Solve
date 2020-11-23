package Uri._3_September;

import java.util.Scanner;

public class Uri_1079_WeightedAverages {
    public static void main(String[] args) {
        int N, i;
        float number1, number2, number3, weightedAvg;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for (i = 0; i < N; i++) {
            number1 = sc.nextFloat();
            number2 = sc.nextFloat();
            number3 = sc.nextFloat();

            weightedAvg = (number1 * 2 + number2 * 3 + number3 * 5) / 10;
            System.out.printf("%.1f\n", weightedAvg);
        }


    }
}
