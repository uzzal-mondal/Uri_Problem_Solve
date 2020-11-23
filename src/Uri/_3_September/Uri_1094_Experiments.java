package Uri._3_September;

import java.util.Scanner;

public class Uri_1094_Experiments {
    public static void main(String[] args) {

        int n, amount, C = 0, R = 0, S = 0, totalAmount;
        char typeOfAnimal;
        double percentageOne, percentageTwo, percentageThree;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            amount = sc.nextInt();
            typeOfAnimal = sc.next().charAt(0);
            if (typeOfAnimal == 'C') {
                C += amount;
            } else if (typeOfAnimal == 'R') {
                R += amount;
            } else if (typeOfAnimal == 'S') {
                S += amount;
            }
        }

        totalAmount = C + R + S;
        percentageOne = (float) (C * 100) / totalAmount;
        percentageTwo = (float) (R * 100) / totalAmount;
        percentageThree = (float) (S * 100) / totalAmount;

        System.out.println("Total: " + totalAmount + " cobaias");
        System.out.println("Total de coelhos: " + C);
        System.out.println("Total de ratos: " + R);
        System.out.println("Total de sapos: " + S);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentageOne);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentageTwo);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentageThree);


    }
}
