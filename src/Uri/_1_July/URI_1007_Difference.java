package Uri._1_July;

import java.util.Scanner;

public class URI_1007_Difference {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A, B, C, D;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int res = ((A*B) - (C*D));
        System.out.println("DIFERENCA = "+res);

    }
}
