package Uri.BazlurSolve;

public class Gpa {
    public static void main(String[] args) {
        GradeCalculator res = new GradeCalculator();
        char showRes = res.calculate(80);
        System.out.println(showRes);
    }
}

class GradeCalculator {
    public char calculate(int num) {
        if (num > 70) {
            return 'A';
        } else {
            return 'F';
        }
    }
}
