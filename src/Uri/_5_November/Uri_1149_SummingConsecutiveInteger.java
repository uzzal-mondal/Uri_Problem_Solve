package Uri._5_November;

import java.util.Scanner;

public class Uri_1149_SummingConsecutiveInteger {
    public static void main(String[] args) {

        int a, n, sum = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt(); //3 = 1,2,3
        //n = sc.nextInt();

        while  ((n = sc.nextInt()) <= 0);


        for (int i = 0; i < n; i++) {
            sum = sum + i + a;
            // 0 + 0 = 0 + 3 = 3   ,  0 + 1 = 1 + 3 = 4 ,
        }
        System.out.println(sum);

    }
}

