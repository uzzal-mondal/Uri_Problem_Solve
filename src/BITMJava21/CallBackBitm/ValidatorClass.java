package BITMJava21.CallBackBitm;

public class ValidatorClass {
    public static final String EMAIL="uzzalcontact@gmail.com";
    public static final String PASSWORD = "123456";

    public void validatorShow(String email, String pass,
                              UserValidationListener validationListener){
        if (email.equals(EMAIL) && pass.equals(PASSWORD)){
            validationListener.onSuccess();
        }else {
            validationListener.onFailure();
        }
    }
}
