package A.FebruaryExamJavaRabbilSir.Rabil.MethodOverloading;

public class Student {

    public void studentNum(int x, int y) {
        int z = x + y;
        System.out.println("First " + z);
    }
    public void studentNum(double x, double y) {
        double z = x + y;
        System.out.println("second " + z);
    }
    public void studentNum(int x, int y, int z) {
        int res = x + y + z;
        System.out.println("third " + res);
    }
}
