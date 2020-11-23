package Uri._1_July;

import java.util.Scanner;

public class URI_1010_SimpleCalculate {
    public static void main(String[] args) {

        int code_one, unit_one, code_two, unit_two;
        double price_one, price_two, total_calculate;

        Scanner sc = new Scanner(System.in);
        code_one = sc.nextInt();
        unit_one = sc.nextInt();
        price_one = sc.nextDouble();

        code_two = sc.nextInt();
        unit_two = sc.nextInt();
        price_two = sc.nextDouble();

        total_calculate = (unit_one * price_one) + (unit_two * price_two);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total_calculate);


    }
}
