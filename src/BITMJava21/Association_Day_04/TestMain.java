package BITMJava21.Association;

public class TestMain {
    public static void main(String[] args) {

        BitmStudent s1 = new BitmStudent("uzzal", 25);
        BitmStudent s2 = new BitmStudent("sajal", 30, 21, "01795710178");
        BitmStudent s3 = new BitmStudent();

        StudentAddress address = new StudentAddress("koyra", "9290");

        s2.setStudentAddress(address);
        System.out.println(s2.getInfo());

        //student s2 find out city..
        System.out.println(s2.getStudentAddress().getCity());


    }
}
