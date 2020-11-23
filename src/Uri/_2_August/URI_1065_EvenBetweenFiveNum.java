package Uri._2_August;

import java.util.Scanner;

public class URI_1065_EvenBetweenFiveNum {
    public static void main(String[] args) {

        int n, i, x, even = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i = 0; i < n; i++) {
            x = sc.nextInt();
            if (x % 2 == 0) {
                even += 1;
            }
        }
        System.out.println(even+" valores pares");
    }
}
