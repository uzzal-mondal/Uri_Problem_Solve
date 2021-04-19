package BITMJava21.Association_Day_04.OneToOneAsociation;

public class Address {

    private String address;
    private String countryName;

    public Address(String address, String countryName) {
        this.address = address;
        this.countryName = countryName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
