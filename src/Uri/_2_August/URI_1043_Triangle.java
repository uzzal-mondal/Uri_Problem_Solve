package Uri._2_August;

import java.util.Scanner;

public class URI_1043_Triangle {
    public static void main(String args[]) {
        float A, B, C, area, peri;
        Scanner sc = new Scanner(System.in);
        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();

        if (((A + B) > C && (A + C) > B && (B + C) > A)) {
            peri = (A + B + C); // perimeter formula adding three arms.
            System.out.printf("Perimetro = %.1f\n", peri);
        } else {
            area = ((A + B) * C) / 2;
            System.out.printf("Area = %.1f\n", area);
        }


    }
}
