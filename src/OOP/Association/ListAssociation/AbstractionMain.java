package OOP.Association.ListAssociation;

import java.util.ArrayList;
import java.util.List;

public class AbstractionMain {
    public static void main(String[] args) {

        Student s1 = new Student(20, "Muzahid vai", "CSE");
        Student s2 = new Student(10, "Uzzal", "CSE");
        Student s3 = new Student(15, "Hazrot", "EEE");
        Student s4 = new Student(25, "Khalid vai", "EEE");

        //making list of cse students.
        //CSE Students
        List<Student> cseStudentList = new ArrayList<>();
        cseStudentList.add(s1);
        cseStudentList.add(s2);

        //making list of ee students.
        //EEE list of students.
        List<Student> eeeStudentList = new ArrayList<>();
        eeeStudentList.add(s3);
        eeeStudentList.add(s4);

        Department CSE = new Department("CSE",cseStudentList);
        Department EEE = new Department("EEE",eeeStudentList);


        List<Department> departmentList = new ArrayList<>();
        departmentList.add(CSE);
        departmentList.add(EEE);

        //creating an instance of institute
        Institute institute = new Institute("Khulna University",departmentList);

        System.out.println("Total students in institute: ");
        System.out.println(institute.getTotalStudentsInstitute());





    }
}
