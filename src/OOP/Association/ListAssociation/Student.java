package OOP.Association.ListAssociation;

public class Student {
    private int age;
    private String name, department;

    public Student(int age, String name, String department) {
        this.age = age;
        this.name = name;
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
