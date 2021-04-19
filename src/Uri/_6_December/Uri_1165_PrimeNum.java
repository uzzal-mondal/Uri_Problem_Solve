package Uri._6_December;

import java.util.Scanner;

public class Uri_1165_PrimeNum {
    public static void main(String[] args) {
        int num, count = 0, testNum;
        Scanner sc = new Scanner(System.in);
        testNum = sc.nextInt();

        for (int j = 1; j <= testNum; j++) {
            num = sc.nextInt();
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                }

            }
            if (count == 0) {
                System.out.println(num + " eh primo");
                count = 0;
            } else {
                System.out.println(num + " nao eh primo");
                count = 0;
            }

        }


    }
}
