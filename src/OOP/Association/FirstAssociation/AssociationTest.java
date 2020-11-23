package OOP.Association.FirstAssociation;

public class AssociationTest {
    public static void main(String[] args) {
        Bank bank = new Bank("DBBL Bank");
        Employee employee = new Employee("uzzalcontact@gmail.com");

        System.out.println(bank.getBank() + " Is employee of: " + employee.getName());

    }
}
