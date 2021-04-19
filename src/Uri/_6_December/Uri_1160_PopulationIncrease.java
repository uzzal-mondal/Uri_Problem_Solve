package Uri._6_December;

import java.util.Scanner;

public class Uri_1160_PopulationIncrease {
    public static void main(String[] args) {

        int test, pa, pb, yc = 0;
        double ga, gb;
        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            pa = sc.nextInt();
            pb = sc.nextInt();
            ga = sc.nextDouble();
            gb = sc.nextDouble();
            yc = 0;
            while (pa <= pb) {
                pa = (int) (pa + ((pa * ga) / 100));
                pb = (int) (pb + ((pb * gb) / 100));
                yc++;
                if (yc > 100) {
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }
            if (yc <= 100) {
                System.out.println(yc + " anos.");
            }
        }


    }
}
