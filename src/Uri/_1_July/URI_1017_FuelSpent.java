package Uri._1_July;

import java.util.Scanner;

public class URI_1017_FuelSpent {
    public static void main(String[] args) {

        int time, speed, distance;
        Scanner sc = new Scanner(System.in);
        time = sc.nextInt();
        speed = sc.nextInt();

        distance = time * speed;
        double avg = (double) (distance / 12.0);
        System.out.printf("%.3f\n", avg);


    }
}
