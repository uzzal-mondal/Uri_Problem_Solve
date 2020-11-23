package Uri._1_July;

import java.util.Scanner;

public class URI_1012_Area {
    public static void main(String[] args) {

        double A, B, C;
        double triangle, circle, trapizium, square, rectangle;
        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangle = 0.5 * A * C;
        circle = 3.14159 * C * C;
        trapizium = 0.5 * (A + B) * C;
        square = B * B;
        rectangle = (A * B);

        System.out.printf("TRIANGULO: %.3f\n", triangle);
        System.out.printf("CIRCULO: %.3f\n", circle);
        System.out.printf("TRAPEZIO: %.3f\n", trapizium);
        System.out.printf("QUADRADO: %.3f\n", square);
        System.out.printf("RETANGULO: %.3f\n", rectangle);

    }
}
