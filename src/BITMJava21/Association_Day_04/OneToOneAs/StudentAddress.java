package BITMJava21.Association_Day_04.OneToOneAs;

public class StudentAddress {
    //nothing some easy in life...:)
    private String cityName;
    private String zipCode;

    public StudentAddress(String cityName, String zipCode) {
        this.cityName = cityName;
        this.zipCode = zipCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

}
