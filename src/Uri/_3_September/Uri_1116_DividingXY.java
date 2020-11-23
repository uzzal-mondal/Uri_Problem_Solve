package Uri._3_September;

import java.util.Scanner;

public class Uri_1116_DividingXY {
    public static void main(String[] args) {

        int n, i, x, y;
        float res;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();

            if (y != 0) {
                res = (float) x / y;
                System.out.printf("%.1f\n", res);
            } else  {
                System.out.println("divisao impossivel");
            }
        }



       /* int tNum, i;
        float x, y, res;
        Scanner sc = new Scanner(System.in);
        tNum = sc.nextInt();

        for (i = 0; i < tNum; i++) {
            x = sc.nextFloat();
            y = sc.nextFloat();
            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                res = x / y;
                System.out.printf("%.1f\n", res);
            }
        }*/

    }
}
