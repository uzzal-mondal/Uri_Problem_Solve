package BITMJava21.Association_Day_04.Asociation5;

public class StudentContact {
    private String phnName;
    private String address;

    public StudentContact(String phnName, String address) {
        this.phnName = phnName;
        this.address = address;
    }

    public String getPhnName() {
        return phnName;
    }

    public void setPhnName(String phnName) {
        this.phnName = phnName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "StudentContact{" +
                "phnName='" + phnName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
