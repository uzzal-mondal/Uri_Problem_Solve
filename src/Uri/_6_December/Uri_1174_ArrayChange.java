package Uri._6_December;

import java.util.Scanner;

public class Uri_1174_ArrayChange {
    public static void main(String[] args) {

        int[] arrayOf = new int[20];
        int y, temp;
        Scanner sc = new Scanner(System.in);


        // area of user input number.
        for (int i = arrayOf.length - 1; i >= 0; i--) {
            y = sc.nextInt();
            arrayOf[i] = y;

        }

        //area of index num.
        for (int i = 0; i < arrayOf.length; i++) {
            y = arrayOf[i];
            System.out.printf("N[%d] = %d\n", i, y);
        }

    }
}
