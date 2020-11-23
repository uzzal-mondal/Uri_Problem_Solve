package Uri._2_August;

import java.util.Scanner;

public class URI_1066_EvenOddPosNeg {
    public static void main(String[] args) {
        int n, x, even = 0, odd = 0, pos = 0, neg = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            x = sc.nextInt();
            if (x % 2 == 0) {
                even += 1;
            }
            if (x % 2 != 0) {
                odd += 1;
            }
            if (x > 0) {
                pos += 1;
            }
            if (x < 0) {
                neg++;
            }
        }

        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");


    }
}
