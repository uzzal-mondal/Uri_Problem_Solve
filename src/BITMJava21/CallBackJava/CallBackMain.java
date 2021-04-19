package BITMJava21.CallBackJava;

import java.util.Scanner;

public class CallBackMain {
    public static void main(String[] args) {
        String email, password;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your email: ");
        email = sc.nextLine();
        System.out.println("Enter your pass: ");
        password = sc.nextLine();

        Validator validator = new Validator();
        validator.validate(email, password, new UserValidationListener() {
            @Override
            public void onSuccess() {
                System.out.println("Welcome");
            }

            @Override
            public void onFailure() {
                System.out.println("Invalid email or password.");
            }
        });


    }
}
