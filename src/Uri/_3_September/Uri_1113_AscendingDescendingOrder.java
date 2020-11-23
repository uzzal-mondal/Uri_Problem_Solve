package Uri._3_September;

import java.util.Scanner;

public class Uri_1113_AscendingDescendingOrder {
    public static void main(String[] args) {

        int x, y, i;
        Scanner sc = new Scanner(System.in);

        while (true) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x == y) {
                break;
            } else if (x < y) {
                System.out.println("Crescente");
            } else if (x > y) {
                System.out.println("Decrescente");
            }
        }
    }
}
