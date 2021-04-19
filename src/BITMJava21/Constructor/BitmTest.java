package BITMJava21.Constructor;

public class BitmTest {
    public static void main(String[] args) {
        Bitm studentOne = new Bitm("Hozorot", 23);
        String name = studentOne.getStudentName();
        int age = studentOne.getAge();
        System.out.println(name + " \n " + age);

        Bitm s2 = new Bitm();
        System.out.println(s2.getAddress().length());


    }
}
