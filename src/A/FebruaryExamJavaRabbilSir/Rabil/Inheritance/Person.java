package A.FebruaryExamJavaRabbilSir.Rabil.Inheritance;

public class Person {
    private String name;
    private int age;
    private String qualification;

    public Person(String name, int age, String qualification){
        this.name = name;
        this.age = age;
        this.qualification=qualification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void showInfo(){
        System.out.println("Name : "+name);
        System.out.println("age : "+age);
        System.out.println("Qualification : "+qualification);
    }

    public void add(){
        int a = 10;
        int b = 10;
        System.out.println(a+b);
    }
}
