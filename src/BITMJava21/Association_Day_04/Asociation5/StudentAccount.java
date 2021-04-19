package BITMJava21.Association_Day_04.Asociation5;

public class StudentAccount {
    private String accountName;
    private String accountBalance;

    public StudentAccount(String accountName, String accountBalance) {
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "StudentAccount{" +
                "accountName='" + accountName + '\'' +
                ", accountBalance='" + accountBalance + '\'' +
                '}';
    }
}
