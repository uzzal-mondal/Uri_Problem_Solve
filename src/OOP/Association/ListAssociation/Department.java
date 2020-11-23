package OOP.Association.ListAssociation;

import java.util.List;

public class Department {
    private String name;
    private List<Student> studentList;

    Department(String name, List<Student> studentList){
        this.name = name;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
