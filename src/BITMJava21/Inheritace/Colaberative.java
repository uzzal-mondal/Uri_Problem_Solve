package BITMJava21.Inheritace;

public class Colaberative extends BitmStudent {
    private double courseFee;
    private String companyName;

    public Colaberative(String name, String nid, String phnNum,
                        double courseFee, String companyName) {
        super(name, nid, phnNum);
        this.courseFee = courseFee;
        this.companyName = companyName;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
