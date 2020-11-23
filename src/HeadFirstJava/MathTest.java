package HeadFirstJava;

import java.lang.*;
import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your a data");
        a = sc.nextInt();
        System.out.println("Enter your b data");
        b = sc.nextInt();

        int result = (a >= b) ? a : b;
        System.out.println("result = " + result);
        System.out.printf("a = %d,  b = %d\n", a, b);
    }
}

