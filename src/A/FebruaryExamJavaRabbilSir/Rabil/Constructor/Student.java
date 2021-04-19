package A.FebruaryExamJavaRabbilSir.Rabil.Constructor;

public class Student {

    public Student(){
        System.out.println("Default constructor.");
    }
    public Student(int a , int b){
        int res = a + b;
        System.out.println(res);
    }
    public Student(double a , int b){
        double res = a + b;
        System.out.println(res);
    }

    public void stdAdd(){
        System.out.println("Method.");
    }
}
