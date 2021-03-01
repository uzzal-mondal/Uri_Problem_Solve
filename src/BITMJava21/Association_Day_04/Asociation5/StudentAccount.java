package BITMJava21.Association_Day_04.Asociation5;

public class StudentContact {
    private String phnNum;
    private String address;

    public StudentContact(String phnNum, String address) {
        this.phnNum = phnNum;
        this.address = address;
    }

    public String getPhnNum() {
        return phnNum;
    }

    public void setPhnNum(String phnNum) {
        this.phnNum = phnNum;
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
                "phnNum='" + phnNum + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
