package BITMJava21.CallBackJava;

public class Validator {
    public static final String EMAIL = "uzzalcontact@gmail.com";
    public static final String PASSWORD = "123456";

    // equals method and == operator.
    //annoymous class.
    public void validate(String email, String password,
                         UserValidationListener listener) {
        if (email.equals(EMAIL) && (password.equals(PASSWORD))) {
            listener.onSuccess();
        } else {
            listener.onFailure();
        }

    }

}
