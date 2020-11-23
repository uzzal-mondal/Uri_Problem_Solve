package Uri._3_September;

import java.util.Scanner;

public class Uri_1080_HeightedAndPosition {
    public static void main(String[] args) {
        int numbers, highest = 0, position = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            numbers = sc.nextInt();
            if (numbers > highest) {
                highest = numbers;
                position  = i;
            }
        }
        System.out.println(highest);
        System.out.println(position);
    }
}
