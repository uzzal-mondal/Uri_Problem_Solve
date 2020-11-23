package Uri._4_October;

import java.util.Scanner;

public class Uri_1145_LogicSequence2 {
    public static void main(String[] args) {
        int numOne, numTwo, i, j, k, z, m = 1;
        Scanner sc = new Scanner(System.in);
        numOne = sc.nextInt(); // 3 ## 3 number jave then break.
        numTwo = sc.nextInt(); // 99 , koto num porjonto jabe.

        k = numTwo / numOne; // this is 99/3 = 33
       // System.out.println("K " + k);
        z = numOne;
       // System.out.println("Z " + z);
       // System.out.println("\n");

        for (i = 1; i <= k; i++) {
            System.out.printf("%d", m);
            for (j = m + 1; j <= z; j++) {
                System.out.printf(" %d", j);
            }
            System.out.println();
            m = m + numOne;
            z = z + numOne;

        }
    }
}
