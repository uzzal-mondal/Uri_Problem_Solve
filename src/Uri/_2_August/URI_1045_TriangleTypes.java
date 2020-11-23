package Uri._2_August;

import java.util.Scanner;

public class URI_1045_TriangleTypes {
    public static void main(String[] args) {
        double a, b, c, temp;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a < c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }

        if (a >= (b + c)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if ((a * a) == (b * b) + (c * c)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if ((a * a) > ((b * b) + (c * c))) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if ((a * a) < ((b * b) + (c * c))) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (a == b && a == c && b == c) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if (((a == b && a != c) || (b == c && a != c))) {
                System.out.println("TRIANGULO ISOSCELES");
            }
            /*if (a==b || a==c || b==c){
                System.out.println("TRIANGULO ISOSCELES");
            }*/

        }


    }
}
