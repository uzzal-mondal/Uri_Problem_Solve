package Uri._1_July;

import java.util.Scanner;

public class URI_1006 {
    public static void main(String args[]) {

        double A, B, C, AVG;
        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        AVG = (A * 2 + B * 3 + C * 5) / (2 + 3 + 5);
        System.out.printf("MEDIA = %.1f\n", AVG);





       /* double A, B, C, AVG;
        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        AVG = (((A * 2) + (B * 3) + (C * 5)) / (2 + 3 + 5));
        System.out.printf("MEDIA = %.1f",AVG);*/

    }
}
