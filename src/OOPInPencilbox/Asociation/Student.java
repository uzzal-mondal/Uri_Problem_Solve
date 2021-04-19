package OOPInPencilbox.Asociation;

public class Student {
    private String name;
    private int age;
    private String phn;
    //has a relationship, one to one relationship, composition relationship.
    private StudentAddress studentAddress;

    public Student(String name, int age, String phn, StudentAddress studentAddress) {
        this.name = name;
        this.age = age;
        this.phn = phn;
        this.studentAddress = studentAddress;
    }

    public Student(String name, int age, String phn) {
        this.name = name;
        this.age = age;
        this.phn = phn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public StudentAddress getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(StudentAddress studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phn='" + phn + '\'' +
                ", studentAddress=" + studentAddress +
                '}';
    }
}
