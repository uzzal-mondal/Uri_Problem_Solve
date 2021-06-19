package Uri.HackerRankBest;

import java.util.Scanner;

public class LoopsSecond {
    public static void main(String[] args) {
        int inputNum, a, b, n, i, j;
        Scanner sc = new Scanner(System.in);
        inputNum = sc.nextInt();

        for (i = 0; i < inputNum; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            for (j = 0; j < n; j++) {
                a = (int) (a + Math.pow(2, j) * b);
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
