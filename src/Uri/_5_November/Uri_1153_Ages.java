package Uri._5_November;

import java.util.Scanner;

public class Uri_1153_Ages {
    public static void main(String[] args) {
        int age, sum = 0, count = 0;
        float avg = 0;
        Scanner sc = new Scanner(System.in);


        while (true) {
            age = sc.nextInt();
            if (age <= 0) {
                break;
            } else {
                count++;
                sum = sum + age;
                avg = (float) sum / count;

            }
        }

        System.out.printf("%.2f\n", avg);


    }
}
