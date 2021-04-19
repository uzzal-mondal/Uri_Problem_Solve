package BITMJava21.Association_Day_04;

public class BitmStudent {
    private String studentName;
    private int age;
    private int seId;
    private String phnNum;
    private StudentAddress studentAddress; //on to one association.

    public BitmStudent() {

    }

    public BitmStudent(String studentName, int age) {
        this.studentName = studentName;
        this.age = age;
    }

    public BitmStudent(String studentName, int age, int seId, String phnNum) {
        this.studentName = studentName;
        this.age = age;
        this.seId = seId;
        this.phnNum = phnNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSeId() {
        return seId;
    }

    public void setSeId(int seId) {
        this.seId = seId;
    }

    public String getPhnNum() {
        return phnNum;
    }

    public void setPhnNum(String phnNum) {
        this.phnNum = phnNum;
    }

    public StudentAddress getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(StudentAddress studentAddress) {
        this.studentAddress = studentAddress;
    }

    /* public void studentInfo() {
        System.out.println("Student name " + studentName);
        System.out.println("Age " + age);
        System.out.println("SeId " + seId);
        System.out.println("Phone Num" + phnNum);
    }*/

    public String getInfo() {
        return studentName + "\n " + age + " \n "
                + seId + "\n " + phnNum + "\n " + studentAddress;
    }
}
