package Uri._1_July;

import java.util.Scanner;

public class URI_1038_Snack {
    public static void main(String[] args) {

        int X, Y;
        double total = 0.0;
        Scanner sc = new Scanner(System.in);
         X = sc.nextInt();
         Y = sc.nextInt();

        if (X == 1){
            total = Y * 4.00;
        } if (X == 2){
            total = Y * 4.50;
        } if (X == 3){
            total = Y * 5.00;
        } if (X == 4){
            total = Y * 2.00;
        } if (X == 5){
            total = Y * 1.50;
        }

        System.out.printf("Total: R$ %.2f\n",total);

    }
}
