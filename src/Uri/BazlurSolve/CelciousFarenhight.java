package Uri.BazlurSolve;

import java.util.Scanner;

public class CelciousFarenhight {
    public static void main(String[] args) {
        int faren, celsious;
        Scanner sc = new Scanner(System.in);
        celsious = sc.nextInt();

        faren = (celsious * 9 / 5) + 32;
        System.out.println("Farenhight: " + faren);
    }
}
