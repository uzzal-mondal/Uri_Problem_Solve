package BITMJava21.Association_Day_04.Asociation5;

public class StudentCourse {
    private String courseName;
    private String courseCredit;
    private double gpa;

    public StudentCourse(String courseName, String courseCredit, double gpa) {
        this.courseName = courseName;
        this.courseCredit = courseCredit;
        this.gpa = gpa;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(String courseCredit) {
        this.courseCredit = courseCredit;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "StudentCourse{" +
                "courseName='" + courseName + '\'' +
                ", courseCredit='" + courseCredit + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
