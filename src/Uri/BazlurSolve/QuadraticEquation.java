package Uri.BazlurSolve;

public class QuadraticEquation {
    public static void main(String[] args) {

        int a = 2, b = 6, c = 4;
        int b1, b2;
        int qua = (int) Math.sqrt(b * b - 4 * a * c);

        b1 = (-b + qua) / 2 * a;
        b2 = (-b - qua) / 2 * a;
        System.out.println("First Quadratic : " + b1);
        System.out.println("Second Quadratic : " + b2);

    }
}

