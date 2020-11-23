package OOP.Association.ListAssociation;

import java.util.List;

public class Institute {
    private String instituteName;
    private List<Department> departmentList;

    Institute(String instituteName, List<Department> departmentList) {
        this.instituteName = instituteName;
        this.departmentList = departmentList;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName() {
        this.instituteName = instituteName;
    }

    public void setDepartmentList() {
        this.departmentList = departmentList;
    }

    public List<Department> departmentList() {
        return departmentList;
    }

    public int getTotalStudentsInstitute(){
        int noOfStudents = 0;
        List<Student> students;
        for (Department dept: departmentList){
            students = dept.getStudentList();
            for (Student s: students){
                noOfStudents++;
            }
        }
        return noOfStudents;
    }
}
