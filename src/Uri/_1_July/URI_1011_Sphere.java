package Uri._1_July;

import java.util.Scanner;

public class URI_1011_Sphere {
    public static void main(String[] args) {

        double r, result;
        double pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();

        result = (4.0 / 3.0) * pi * r * r * r;
        System.out.printf("VOLUME = %.3f\n", result);


    }
}
