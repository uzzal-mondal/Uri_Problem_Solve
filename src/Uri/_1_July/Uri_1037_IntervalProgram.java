package Uri._1_July;

import java.util.Scanner;

public class Uri_1037_IntervalProgram {
    public static void main(String args[]) {
        float n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextFloat();

        if (n >= 0 && n <= 25.0000) {
            System.out.println("Intervalo [0,25]");
        } else if (n >= 25.00001 && n <= 50.0000000) {
            System.out.println("Intervalo (25,50]");
        } else if (n >= 50.00000001 && n <= 75.0000000) {
            System.out.println("Intervalo (50,75]");
        } else if (n >= 75.00000001 && n <= 100.0000000) {
            System.out.println("Intervalo (75,100]");
        }else if (n > 0 || n < 100){
            System.out.println("Fora de intervalo");
        }


    }
}
