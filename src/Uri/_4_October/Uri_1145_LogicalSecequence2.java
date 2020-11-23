package Uri._4_October;

import java.util.Scanner;

public class Uri_1145_LogicalSecequence2 {
    public static void main(String[] args) {
        int n, a, i, j, k, l, m = 1;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); // this is for line. // 3
        System.out.println("A = " + a);

        n = sc.nextInt(); // kotodur porjonto jabe. //99
        System.out.println("N= " + n);

        k = n / a; // loop ta koto dur jabe eta sure hote first value dara second value ke vag.
        System.out.println("k " + k); // 33
        l = a;  // need to 3 lines calculte. // 3
        System.out.println("L " + l);


        System.out.println("\n\n");

        for (i = 1; i <= k; i++) {
            System.out.printf("%d", m);  // 1 er age no need to sapce.
            for (j = m + 1; j <= l; j++) {  //  l = 3 # r ei porjonto jasse.

                System.out.printf(" %d", j); // all number are space.
            }
            System.out.println(); // using for new line.
            m += a;
            //System.out.println("M= "+m); //every numbers are 3 adding.
            l += a;
            //System.out.println("L= "+l); // every numbers are 3 adding.*/

        }
    }
}
