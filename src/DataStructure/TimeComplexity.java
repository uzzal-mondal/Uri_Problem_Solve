package DataStructure;

import java.util.Scanner;

public class TimeComplexity {
    public static void main(String[] args) {
        int n, sum = 0, count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i <= n; i += 1) {
            sum = sum + i;
            count++;
            System.out.println("Result  = " + sum);
            System.out.println(i + "x" + 2 + " =" + count * 2);

        }
    }
}
