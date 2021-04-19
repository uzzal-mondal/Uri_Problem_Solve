package BITMJava21.ClassAndObj;

public class Student {
    private String stdName;
    private int age;
    private String phnNum;

    public void setStdName(String stdName1) {
        this.stdName = stdName1;
    }

    public String getStdName() {
        return stdName;
    }

    public void setAge(int age) {
        if (age > 20 && age < 45) {
            this.age = age;
        } else {
            System.out.println("Your age is should be 20 to 45");
        }
    }

    public int getAge() {
        return age;
    }

    public void setPhnNum(String phnNum) {
        this.phnNum = phnNum;
    }

    public String getPhnNum() {
        return phnNum;
    }

    /*public void getInfo() {
        System.out.println("Name: " + stdName);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }*/

    public String getInfo() {
        return stdName + "\n " + age + " \n " + phnNum;
    }

}
