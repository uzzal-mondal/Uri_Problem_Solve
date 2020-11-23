package Uri._1_July;

import java.util.Scanner;

public class URI_1018_BankNotes {
    public static void main(String[] args) {

        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        System.out.printf("%d\n", x);
        System.out.printf("%d nota(s) de R$ 100,00\n", x / 100);

        x = x % 100;
        System.out.printf("%d nota(s) de R$ 50,00\n", x / 50);

        x = x % 50;
        System.out.printf("%d nota(s) de R$ 20,00\n", x / 20);

        x = x % 20;
        System.out.printf("%d nota(s) de R$ 10,00\n", x / 10);

        x = x % 10;
        System.out.printf("%d nota(s) de R$ 5,00\n", x / 5);

        x = x % 5;
        System.out.printf("%d nota(s) de R$ 2,00\n", x / 2);

        x = x % 2;
        System.out.printf("%d nota(s) de R$ 1,00\n", x);


    }
}
