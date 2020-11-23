package Uri._3_September;

import java.util.Scanner;

public class Uri_1115_Quadrant {
    public static void main(String []args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        while (true) {
            x = sc.nextInt();
            y = sc.nextInt();

            if (x == 0 || y == 0) {
                break;
            } else if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x > 0) {
                System.out.println("quarto");
            } else if (y < 0){
                System.out.println("terceiro");
            }else {
                System.out.println("segundo");
            }
        }
    }
}
