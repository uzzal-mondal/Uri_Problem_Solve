package BITMJava21.Association_Day_04.Asociation5;

import java.util.ArrayList;

public class Student {
    private String name;
    private String age;
    private String occupation;
    private StudentContact studentContact;
    private StudentAccount studentAccount;
    private ArrayList<StudentCourse> courses;

    public Student(String name, String age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public Student(String name, String age, String occupation, StudentContact studentContact,
                   StudentAccount studentAccount, ArrayList<StudentCourse> courses) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.studentContact = studentContact;
        this.studentAccount = studentAccount;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public StudentContact getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(StudentContact studentContact) {
        this.studentContact = studentContact;
    }

    public StudentAccount getStudentAccount() {
        return studentAccount;
    }

    public void setStudentAccount(StudentAccount studentAccount) {
        this.studentAccount = studentAccount;
    }

    public ArrayList<StudentCourse> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<StudentCourse> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", occupation='" + occupation + '\'' +
                ", studentContact=" + studentContact +
                ", studentAccount=" + studentAccount +
                ", courses=" + courses +
                '}';
    }
}
