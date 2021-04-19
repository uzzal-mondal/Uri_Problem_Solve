package BITMJava21.Association_Day_04;

public class StudentAddress {
    private String city;
    private String zipCode;

    public StudentAddress() {

    }

    public StudentAddress(String city, String zipCode) {
        this.city = city;
        this.zipCode = zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getZipCode() {
        return zipCode;
    }

}
