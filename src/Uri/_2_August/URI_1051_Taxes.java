package Uri._2_August;

import java.util.Scanner;

public class URI_1051_Taxes {
    public static void main(String[] args) {
        double num, ft, st;
        Scanner sc = new Scanner(System.in);
        num = sc.nextDouble();

        ft = (3000.00 - 2000.00) * 8 / 100;
        st = (4500.00 - 3000.00) * 18 / 100;

        if (num >= 0.00 && num <= 2000.00) {
            System.out.println("Isento");
        } else if (num > 2000.00 && num <= 3000.00) {
            num = num - 2000.00;
            num = num * 8 / 100;
            System.out.printf("R$ %.2f\n",num);
        } else if (num > 3000.00 && num <= 4500.00) {
            num = num - 3000.00;
            num = num * 18 / 100 + ft;
            System.out.printf("R$ %.2f\n",num);
        } else if (num > 4500.00) {
            num = num - 4500.00;
            num = num * 28 / 100 + ft + st;
            System.out.printf("R$ %.2f\n",num);
        }
    }
}
