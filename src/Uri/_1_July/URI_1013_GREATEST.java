package Uri._1_July;

import java.util.Scanner;
import java.lang.Math;

public class URI_1013_GREATEST {
    public static void main(String[] args) {

        int a, b, c, x;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        x = (a + b + Math.abs(a - b)) / 2;
        x = (x + c + Math.abs(x - c)) / 2;
        System.out.printf("%d eh o maior\n",x);





       /* int a, b, c, max_value;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        max_value = a;
        if (b > max_value)
            max_value = b;
        if (c > max_value)
            max_value = c;
        System.out.println(max_value+" eh o maior");*/

    }
}
