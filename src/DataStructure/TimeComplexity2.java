package DataStructure;

import java.util.Scanner;

public class TimeComplexity2 {
    public static void main(String[] args) {

        int i, j, n, count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                count = count + 1;
                //System.out.println(n+"  "+count);
            }
        }

        System.out.println(n+"  "+count);

    }
}
