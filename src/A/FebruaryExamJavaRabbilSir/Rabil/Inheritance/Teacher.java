package A.FebruaryExamJavaRabbilSir.Rabil.Inheritance;

public class Teacher extends Person {
    private String subjectName;


    public Teacher(String name, int age, String qualification) {
        super(name, age, qualification);
    }

    public Teacher(String name, int age, String qualification, String subjectName) {
        super(name, age, qualification);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Subject Name: "+subjectName);
    }
}
