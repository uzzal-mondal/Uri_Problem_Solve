package Uri._5_November;

import java.util.Scanner;

public class Uri_1146_GrowingSequence {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);


        while (true) {
            num = sc.nextInt();
            if (num == 0) {
                break;
            } else {
                for (int i = 1; i <= num; i++) {
                    if (i != num) {
                        System.out.print(i + " ");
                    } else if (i == num) {
                        System.out.println(i);
                    }
                }

            }
        }

    }
}
