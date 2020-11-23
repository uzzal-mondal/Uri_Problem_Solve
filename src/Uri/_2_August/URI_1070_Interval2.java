package Uri._2_August;

import java.util.Scanner;

public class URI_1070_Interval2 {
    public static void main(String[] args) {
        int num, x, i, countIn = 0, countOut = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for (i = 1; i <= num; i++) {
            x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                countIn++;
            } else {
                countOut++;
            }
        }
        System.out.println(countIn + " in");
        System.out.println(countOut + " out");
    }
}
