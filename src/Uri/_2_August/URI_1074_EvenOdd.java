package Uri._2_August;

import java.util.Scanner;

public class URI_1074_EvenOdd {
    public static void main(String[] args) {
        int x, num, i;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();


        for (i = 0; i < num; i++) {
            x = sc.nextInt();
            if (x == 0) {
                System.out.println("NULL");
            }
            if (x > 0) {
                if (x % 2 == 0) {
                    System.out.println("EVEN POSITIVE");
                } else {
                    System.out.println("ODD POSITIVE");
                }
            }else if (x < 0){
                if (x % 2 == 0){
                    System.out.println("EVEN NEGATIVE");
                }else {
                    System.out.println("ODD NEGATIVE");
                }
            }
        }
    }
}
