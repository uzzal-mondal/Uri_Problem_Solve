package BITMJava21.Association_Day_04.OneToOneAs;

public class Student {
    private String stdName;
    private int age;
    private String seId;
    private String phoneNum;
    private StudentAddress studentAddress;
    private StudentDepartment studentDepartment;

    public Student(String stdName, int age, String seId, String phoneNum) {
        this.stdName = stdName;
        this.age = age;
        this.seId = seId;
        this.phoneNum = phoneNum;
    }

    public Student(String stdName, int age, String seId, String phoneNum,
                   StudentAddress studentAddress, StudentDepartment studentDepartment) {
        this.stdName = stdName;
        this.age = age;
        this.seId = seId;
        this.phoneNum = phoneNum;
        this.studentAddress = studentAddress;
        this.studentDepartment = studentDepartment;
    }


    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSeId() {
        return seId;
    }

    public void setSeId(String seId) {
        this.seId = seId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public StudentAddress getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(StudentAddress studentAddress) {
        this.studentAddress = studentAddress;
    }

    public StudentDepartment getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(StudentDepartment studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    /*public void showInfo() {
        System.out.println("Name: " + stdName);
        System.out.println("Age: " + age);
        System.out.println("SeId: " + seId);
        System.out.println("Phone Num: " + phoneNum);
        System.out.println("Student Address: " + studentAddress);
        System.out.println("Student Department: " + studentDepartment);
    }*/

    public String showInfo() {
        return "Name: " + stdName + " Age: " + age + " SeId: " + seId + " phn: " + phoneNum;
    }
}
