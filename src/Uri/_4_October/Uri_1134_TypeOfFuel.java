package Uri._4_October;

import java.util.Scanner;

public class Uri_1134_TypeOfFuel {
    public static void main(String[] args) {

        int num, alcool = 0, gasolina = 0, diesel = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("MUITO OBRIGADO");

        while (true) {
            num = sc.nextInt();
            if (num > 0 && num < 4) {
                if (num == 1) {
                    alcool++;
                } else if (num == 2) {
                    gasolina++;
                } else if (num == 3) {
                    diesel++;
                }
            } else if (num == 4) {
                break;
            }
        }

        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);


    }
}
