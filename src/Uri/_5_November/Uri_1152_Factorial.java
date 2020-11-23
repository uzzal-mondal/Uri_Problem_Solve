package Uri._5_November;

import java.util.Scanner;

public class Uri_1152_Factorial {

    public static void main(String args[]) {

        int num, fac = 1;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (int i = num; i >= 1; i--) {
            fac = fac * i;
            //System.out.printf("%d X ", i);
        }
        System.out.println(fac);

    }

}
