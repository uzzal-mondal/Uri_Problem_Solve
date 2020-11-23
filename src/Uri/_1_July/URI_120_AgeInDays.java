package Uri._1_July;

import java.util.Scanner;

public class URI_120_AgeInDays {
    public static void main(String[] args) {

        int years = 0, months = 0, days;
        Scanner sc = new Scanner(System.in);
        days = sc.nextInt();

        years = days / 365;
        days = days % 365;
        months = days / 30;
        days = days % 30;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", years, months, days);

    }
}
