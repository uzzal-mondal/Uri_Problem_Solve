package Uri._1_July;


import java.util.Scanner;
import java.lang.Math;

public class URI_1036_BhaskaraFormula {
    public static void main(String[] args) {
        double A, B, C, n, p, q;
        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        n = (B * B) - (4 * A * C);

        if (n < 0) {
            System.out.print("Impossivel calcular\n");
        } else if (A == 0) {
            System.out.print("Impossivel calcular\n");
        } else {

            p = ((-B) + Math.sqrt(n)) / (2 * A);
            q = ((-B) - Math.sqrt(n)) / (2 * A);

            System.out.printf("R1 = %.5f\n", p);
            System.out.printf("R2 = %.5f\n", q);

        }


    }
}
