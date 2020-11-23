package Java;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
       //5=5*4*3*2*1;
        int n, fac= 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            fac = fac * i;
            System.out.println(fac);
        }
    }
}
