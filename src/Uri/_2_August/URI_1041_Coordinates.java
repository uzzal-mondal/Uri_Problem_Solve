package Uri._2_August;

import java.util.Scanner;

public class URI_1041_Coordinates {
    public static void main(String[] args) {
        float x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextFloat();
        y = sc.nextFloat();

        if (x == 0.0) {
            if (y == 0.0) {
                System.out.println("Origem");
            } else {
                System.out.println("Eixo Y");
            }
        } else if (y == 0.0) {
            if (x == 0.0) {
                System.out.println("Origem");
            } else {
                System.out.println("Eixo X");
            }
        }
        if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else if (x > 0.0 && y < 0.0) {
            System.out.println("Q4");
        }


    }
}
