package Uri._1_July;

import java.util.Scanner;

public class URI_1035_SelectionToolsOne {
    public static void main(String[] args) {

        int A, B, C, D;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        if (B > C && D > A && C + D > A + B && A % 2 == 0){
            System.out.printf("Valores aceitos\n");
        }else {
            System.out.printf("Valores nao aceitos\n");
        }
    }
}
