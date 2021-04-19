package BITMJava21.Constructor;

public class Bitm {
    private String studentName;
    private int age;
    private String address;

    public Bitm() {

    }

    public Bitm(String studentName, int age) {
        this.studentName = studentName;
        this.age = age;

    }

    public Bitm(String studentName, int age, String address) {
        this.studentName = studentName;
        this.age = age;
        this.address = address;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }



}
