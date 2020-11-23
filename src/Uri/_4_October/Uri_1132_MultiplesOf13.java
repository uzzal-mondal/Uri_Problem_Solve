package Uri._4_October;

import java.util.Scanner;

public class Uri_1132_MultiplesOf13 {
    public static void main(String[] args) {

        int x, y, sum = 0, temp;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        if (x > y) {
            for (int i = y; i <= x; i++) {
                if (i % 13 != 0) {
                    sum = sum + i;
                }
            }
        } else if (x < y) {
            for (int i = x; i <= y; i++) {
                if (i % 13 != 0) {
                    sum = sum + i;
                }
            }
        }
        System.out.println(sum);

        /*if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }

        for (int i = x; i <= y; i++) {
            if (i % 13 != 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);*/
    }
}
