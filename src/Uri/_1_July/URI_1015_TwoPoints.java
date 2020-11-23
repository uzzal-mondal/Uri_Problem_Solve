package Uri._1_July;

import java.util.Scanner;

public class URI_1015_TwoPoints {
    public static void main(String[] args) {

        double x1, y1, x2, y2, distance;

        Scanner sc = new Scanner(System.in);
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();

        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.printf("%.4f\n", distance);


    }
}
