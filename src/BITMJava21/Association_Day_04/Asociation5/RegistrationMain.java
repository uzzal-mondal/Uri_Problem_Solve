package BITMJava21.Association_Day_04.Asociation5;

import java.util.ArrayList;

public class RegistrationMain {
    public static void main(String[] args) {
        Student s1 = new Student("uzzal", "25", "Android Dev");
        s1.setStudentContact(new StudentContact("01980450700", "Khulna"));
        s1.setStudentAccount(new StudentAccount("120.151", "1 Bilion"));

        ArrayList<StudentCourse> courseList = new ArrayList<>();
       /* courseList.add(new StudentCourse("Android", "2", 5.00));
        courseList.add(new StudentCourse("WEb", "2.5", 5.00));*/
        s1.setCourses(courseList);
        s1.getCourses().add(new StudentCourse("Android", "02", 4.50));
        s1.getCourses().add(new StudentCourse("Web", "02", 5.50));


        /*System.out.println(s1);
        System.out.println(s1.getStudentContact().getPhnName());
        System.out.println(s1.getStudentContact().getAddress());
        System.out.println(s1.getStudentAccount().getAccountName());
        System.out.println(s1.getStudentAccount().getAccountBalance());*/

        for (StudentCourse c : courseList) {
            System.out.println(c);
        }

    }
}
