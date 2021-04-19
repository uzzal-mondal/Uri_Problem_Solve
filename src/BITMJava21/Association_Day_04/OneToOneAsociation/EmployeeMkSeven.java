package BITMJava21.Association_Day_04.OneToOneAsociation;

public class EmployeeMkSeven {
    private String name;
    private String department;
    private double salary;
    private Address address; //on to one association.

    public EmployeeMkSeven() {

    }

    public EmployeeMkSeven(String name, String department, double salary, Address address) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.address = address;
    }


    public EmployeeMkSeven(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment(String department) {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary(double salary) {
        return salary;
    }

    public Address getAddressEmployeeMkSeven() {
        return address;
    }

    public void setAddressEmployeeMkSeven(Address address) {
        this.address = address;
    }

    public String showInfo() {
        return name+"\n "+department+"\n "+salary;
       /* System.out.println("Name: " + name);
        System.out.println("department: " + department);
        System.out.println("salary: " + salary);*/
    }
}
