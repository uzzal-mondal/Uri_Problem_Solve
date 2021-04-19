package A.FebruaryExamJavaRabbilSir.Rabil.MethodOverloading;

public class MethodTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.studentNum(10, 20);
        s.studentNum(10.0, 20.0);
        s.studentNum(4, 5, 8);
    }
}
