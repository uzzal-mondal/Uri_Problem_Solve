package Uri._3_September;

import java.util.Scanner;

public class Uri_1117_ScoreValidation {
    public static void main(String[] args) {

        float score, avg, sum = 0;
        int count = 0;
        Scanner sc = new Scanner(System.in);

        while (count < 2) {
            score = sc.nextFloat();
            if (score < 0.0 || score > 10.0) {
                System.out.println("nota invalida");
            } else if (score >= 0.0 || score <= 10.0) {
                count++;
                sum = sum + score;
            }
        }
        avg = sum / 2;
        System.out.printf("media = %.2f\n", avg);
    }
}
