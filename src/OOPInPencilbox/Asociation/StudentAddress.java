package OOPInPencilbox.Asociation;

public class StudentAddress {
    private String city;
    private String zipCode;

    public StudentAddress(String city, String zipCode) {
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void showAddress(){
        System.out.println("city "+city);
        System.out.println("zipcode "+zipCode);
    }
}
