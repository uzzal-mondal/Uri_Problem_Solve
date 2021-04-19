package A.FebruaryExamJavaRabbilSir.Rabil.Inheritance;

public class Student extends Person {
    private String className;

    //want to create a super matching constructor.
    public Student(String name, int age, String qualificaiton) {
        super(name, age, qualificaiton);
    }

    public Student(String name, int age, String qualification, String className) {
        super(name, age, qualification);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName() {
        this.className = className;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Class Name: "+className);
    }

    @Override
    public void add() {
        super.add();
    }
}
