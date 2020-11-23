package Uri._3_September;

import java.util.Scanner;

public class Uri_1114_FixedPassword {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);

        while (true) {
            num = sc.nextInt();
            if (num == 2002) {
                System.out.println("Acesso Permitido");
                break;
            } else {
                System.out.println("Senha Invalida");
            }
        }


    }
}
