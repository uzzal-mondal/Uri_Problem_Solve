package Uri._4_October;

import java.util.Scanner;

public class Uri_1133_RestOfDivision {
    public static void main(String[] args) {
        int x, y, temp, i;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        if (x > y) {
            temp = x;
            x = y;
            y = temp;
        }
        //x++;

        for (i = x+1; i < y; i++) {
            if (i % 5 == 2 || i % 5 == 3 ) {
                System.out.println(i);
            }

        }



    }
}
