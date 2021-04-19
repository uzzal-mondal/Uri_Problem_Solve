package Uri._8_Mearch;

import java.util.Scanner;

public class Fac {
    public static void main(String[] args) {

        int fact = 1, num, i, testNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your test Num: ");
        testNum = sc.nextInt();
        System.out.println("Your test num is : " + testNum);

        for (i = 0; i < testNum; i++) {

            while (true) {
                num = sc.nextInt();
                if (num <= 0) {
                    break;
                } else {
                    for (i = 1; i <= num; i++) {
                        fact = fact * i;
                    }
                    System.out.println("Your Factorial num is : " + fact);
                }
                fact = 1;
            }
        }
    }
}
