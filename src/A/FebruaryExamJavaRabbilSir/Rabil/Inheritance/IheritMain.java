package A.FebruaryExamJavaRabbilSir.Rabil.Inheritance;

public class IheritMain {
    public static void main(String[] args) {

        Student s1 = new Student("uzzal", 25, "Student", "class - 10,");
        s1.showInfo();
        System.out.println();
        s1.add();

        Teacher t1 = new Teacher("Mihir", 38, "Teacher", "Math");
        t1.showInfo();

    }
}
