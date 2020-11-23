package Uri._4_October;

import java.util.Scanner;

public class Uri_1118_SeveralScoreValidation {
    public static void main(String[] args) {

        int countNum = 0, x = 0;
        float score, sum = 0, avg;
        Scanner sc = new Scanner(System.in);


        while (true) {
            while (countNum < 2) {
                score = sc.nextFloat();
                if (score < 0 || score > 10) {
                    System.out.println("nota invalida");
                } else if (score >= 0 || score <= 10) {
                    countNum += 1;
                    sum = sum + score;
                }
            }
            avg = sum / 2;
            System.out.printf("media=%.2f\n", avg);
            sum = 0;
            countNum = 0;

            //this is for attach new logic..

            while (countNum < 2) {
                x = sc.nextInt();  //4 is to 0, and then next input 1, owo this is a match..
                System.out.println("novo calculo (1-sim 2-nao)");
                if (x == 1 || x == 2) {
                    break;
                }
            }
            if (x == 1) {
                continue;
            } else if (x == 2) {
                break;
            }
        }
    }
}
