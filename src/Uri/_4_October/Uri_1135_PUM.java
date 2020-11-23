package Uri._4_October;

import java.util.Scanner;

public class Uri_1135_PUM {
    public static void main(String[] args) {
        int num, a = 1, b = 2, c = 3;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.printf("%d %d %d PUM\n", a, b, c);
            a = a + 4;
            b = b + 4;
            c = c + 4;
        }


    }
}
