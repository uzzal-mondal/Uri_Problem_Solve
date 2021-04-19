package Uri._6_December;

import java.util.Scanner;

public class Uri_1159_SumOfConsecutiveEvenNum {
    public static void main(String[] args) {

        int x, sum = 0;
        Scanner sc = new Scanner(System.in);

        while (true) {
            x = sc.nextInt();
            if (x == 0) {
                break;
            } else {
                if (x % 2 == 0) {
                    for (int i = 0; i < 5; i++) {
                        sum = sum + x;
                        x = x + 2;
                    }


                }
            }
        }
    }
}
