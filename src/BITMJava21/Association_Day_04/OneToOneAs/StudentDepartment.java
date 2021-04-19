package BITMJava21.Association_Day_04.OneToOneAs;

public class StudentDepartment {
    private String dept_name;
    private String class_room;
    private String lead_trainer;

    public StudentDepartment() {

    }

    public StudentDepartment(String dept_name, String class_room, String lead_trainer) {
        this.dept_name = dept_name;
        this.class_room = class_room;
        this.lead_trainer = lead_trainer;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getClass_room() {
        return class_room;
    }

    public void setClass_room(String class_room) {
        this.class_room = class_room;
    }

    public String getLead_trainer() {
        return lead_trainer;
    }

    public void setLead_trainer(String lead_trainer) {
        this.lead_trainer = lead_trainer;
    }


    public String showInfo() {
        return dept_name + " , " + class_room + " , " + lead_trainer;
    }
}
