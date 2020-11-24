package Uri._5_November;

public class Uri_1156_SSquare2 {
    public static void main(String[] args) {

        double i, b = 1, r, sum = 0;
        for (i = 1; i <= 39; i += 2) {

            r = i / b;
            sum = sum + r;
            b = b * 2;
            //System.out.printf("%.0f - %.0f\n", i, b);
        }
        System.out.printf("%.2f\n", sum);

    }
}
