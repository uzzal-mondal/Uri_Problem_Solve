package Uri._1_July;

import java.util.Scanner;

public class URI_1014_Conssumption {
    public static void main(String[] args) {

        int X;
        double Y, avg_per_leter;
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        Y = sc.nextDouble();

        avg_per_leter = X / Y;
        System.out.printf("%.3f km/l\n", avg_per_leter);

    }
}
