package Uri._2_August;

import java.util.Scanner;

public class URI_1040_Avg3 {
    public static void main(String[] args) {
        double n1, n2, n3, n4, avg, f, avg2;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();

        avg = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        System.out.printf("Media = %.1f\n", avg);

        if (avg >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (avg < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (avg >= 5.0 && avg <= 6.9) {
            System.out.println("Aluno em exame.");
            f = sc.nextDouble();
            System.out.println("Nota do exame: "+f);
            avg2 = (avg + f) / 2;
            System.out.println("Aluno aprovado.");
            if (avg2 >= 5.0){
                System.out.println("Aluno aprovado.");
            }else if (avg2 <= 4.9){
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.2f\n",avg2);

        }

    }
}
