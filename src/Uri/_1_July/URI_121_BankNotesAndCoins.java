package Uri._1_July;

import java.util.Scanner;

public class URI_121_BankNotesAndCoins {
    public static void main(String[] args) {

        int a, b, c, d, e, f, g, h, i, j, k, l, n;
        double input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextDouble();

        n = (int) (input * 100);
        a = n / 10000;
        n = n % 10000;

        b = n / 5000;
        n = n % 5000;

        c = n / 2000;
        n = n % 2000;

        d = n / 1000;
        n = n % 1000;

        e = n / 500;
        n = n % 500;

        f = n / 200;
        n = n % 200;

        g = n / 100;
        n = n % 100;

        h = n / 50;
        n = n % 50;

        i = n / 25;
        n = n % 25;

        j = n / 10;
        n = n % 10;

        k = n / 5;
        n = n % 5;

        //l = n;

        System.out.printf("NOTAS:\n");
        System.out.printf("%d nota(s) de R$ 100.00\n",a);
        System.out.printf("%d nota(s) de R$ 50.00\n",b);
        System.out.printf("%d nota(s) de R$ 20.00\n",c);
        System.out.printf("%d nota(s) de R$ 10.00\n",d);
        System.out.printf("%d nota(s) de R$ 5.00\n",e);
        System.out.printf("%d nota(s) de R$ 2.00\n",f);
        System.out.printf("MOEDAS:\n");
        System.out.printf("%d moeda(s) de R$ 1.00\n",g);
        System.out.printf("%d moeda(s) de R$ 0.50\n",h);
        System.out.printf("%d moeda(s) de R$ 0.25\n",i);
        System.out.printf("%d moeda(s) de R$ 0.10\n",j);
        System.out.printf("%d moeda(s) de R$ 0.05\n",k);
        System.out.printf("%d moeda(s) de R$ 0.01\n",n);

    }
}
