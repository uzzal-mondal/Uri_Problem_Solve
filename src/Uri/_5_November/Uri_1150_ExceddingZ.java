package Uri._5_November;

import java.util.Scanner;

public class Uri_1150_ExceddingZ {
    public static void main(String[] args) {
        int x, z, counter = 1, sum = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        z = sc.nextInt();

        while (z <= x) {
            z = sc.nextInt();
        }
        for (int i = x; i <= z; i++) {
            sum = sum + i;
            if (sum > z) {
                break;
            }else {
                counter++; // counter - 1; /2 /
            }

        }
        System.out.println(counter);



        /*while (sum < z) {
            sum = sum + x;
            x++;
            count++;
        }
        System.out.println(count);*/

    }
}
