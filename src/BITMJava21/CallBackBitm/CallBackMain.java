package BITMJava21.CallBackBitm;

import java.util.Scanner;

public class CallBackMain {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String email = sc.nextLine();
        System.out.println("Enter your password: ");
        String password = sc.nextLine();

        ValidatorClass validator = new ValidatorClass();
        validator.validatorShow(email, password, new UserValidationListener() {
            @Override
            public void onSuccess() {
                System.out.println("welcome");
            }

            @Override
            public void onFailure(){
                System.out.println("email or password invalid.");
            }
        });


    }
}
