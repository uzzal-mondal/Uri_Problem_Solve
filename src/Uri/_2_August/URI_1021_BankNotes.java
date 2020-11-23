package Uri._2_August;

import java.util.Scanner;

public class URI_1021_BankNotes {
    public static void main(String[] args) {

        double input;
        int num, hundred, fifty, twenty, ten, five, two, one,
                fiftyP, anotherP;
        Scanner sc = new Scanner(System.in);
        input = sc.nextDouble();
        num = (int) (input * 100);

        hundred = num / (100 * 100);
        num = num % (100 * 100);


    }
}
