package Uri._4_October;

import java.util.Scanner;

public class Uri_1144_LogicalSecequenceSolution {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i = 1; i <= n; i++){
            System.out.printf("%d %d %d\n",i,i*i,i*i*i);
            System.out.printf("%d %d %d\n",i,i*i+1,i*i*i+1);
        }

    }
}
