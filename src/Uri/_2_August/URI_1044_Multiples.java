package Uri._2_August;

import java.util.Scanner;

public class URI_1044_Multiples {
    public static void main(String[] args) {
        int a, b, temp;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if (a < b) {
            if (b % a == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        } else {
            if (a % b == 0){
                System.out.println("Sao Multiplos");
            }else {
                System.out.println("Nao sao Multiplos");
            }
        }

       /* if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a % b == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }*/



        /*if (a % b == 0 || b % a == 0){
            System.out.println("Sao Multiplos");
        }else {
            System.out.println("Nao sao Multiplos");
        }*/


        /*if (a % b == 0) {
            System.out.println("Sao Multiplos");
        } else if (b % a == 0){
            System.out.println("Sao Multiplos");
        }else {
            System.out.println("Nao sao Multiplos");
        }*/
    }
}
