package BITMJava21.Association_Day_04.OneToOneAs;

public class StudentMain {
    public static void main(String[] args) {
        Student st1 = new Student("uzzal", 20, "523067", "01795-710178");

        st1.setStudentAddress(new StudentAddress("Koyra", "9290"));
        System.out.println(st1.showInfo());
        System.out.println("student address: " + st1.getStudentAddress().getCityName());
        System.out.println("student address: " + st1.getStudentAddress().getZipCode());

        st1.setStudentDepartment(new StudentDepartment("Adroid", "10", "Mujahid Khan"));
        System.out.println("Department name: " + st1.getStudentDepartment().getDept_name());
        System.out.println("Class Room" + st1.getStudentDepartment().getClass_room());
        System.out.println("Student address" + st1.getStudentDepartment().getLead_trainer());

    }
}
