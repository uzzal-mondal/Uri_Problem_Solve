package OOPInPencilbox.Asociation;

public class Launcher {
    public static void main(String[] args) {
        Student s1 = new Student("uzzal", 20, "017");

        //System.out.println(s1.toString());
        StudentAddress sa = new StudentAddress("khulna", "9290");
        sa.showAddress();
        System.out.println(s1.getStudentAddress().getZipCode());
    }
}
