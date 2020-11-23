package Uri._2_August;

import java.util.Scanner;

public class URI_1040_Average3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3, n4;
        double avg1, avg2;
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        avg1 = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        System.out.printf("Media: %.1f\n", avg1);

        if (avg1 >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (avg1 < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.printf("Aluno em exame.\n");

            float e1;
            e1 = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n",e1);
            avg2 = (avg1 + e1) / 2;
            if (avg2 >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", avg2);
        }
    }
}
