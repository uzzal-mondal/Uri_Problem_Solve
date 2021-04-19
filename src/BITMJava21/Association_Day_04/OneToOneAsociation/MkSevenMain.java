package BITMJava21.Association_Day_04.OneToOneAsociation;

public class MkSevenMain {
    public static void main(String[] args) {

        EmployeeMkSeven e1 = new EmployeeMkSeven("uzzal", "android", 2536.00);
        EmployeeMkSeven e2 = new EmployeeMkSeven("hozort", "react", 2536.00);
        EmployeeMkSeven e3 = new EmployeeMkSeven("sohel", "ios", 2536.00);
        EmployeeMkSeven e4 = new EmployeeMkSeven("nowshed", "marketing", 2536.00);
        EmployeeMkSeven e5 = new EmployeeMkSeven("rishad", "backend", 2536.00);
        EmployeeMkSeven e6 = new EmployeeMkSeven("khalid", "design", 2536.00);
        EmployeeMkSeven e7 = new EmployeeMkSeven("mijan", "video editor", 2536.00);
        EmployeeMkSeven e8 = new EmployeeMkSeven("tamim", "Backend", 2536.00);


        System.out.println(e1.showInfo());
        e1.setAddressEmployeeMkSeven(new Address("khulna","bangladesh"));
        System.out.println(e1.getAddressEmployeeMkSeven().getAddress());



    }
}
