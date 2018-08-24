public class Accounts {
    private String firstName;
    private String lastName;
    private int accountNumber;

    public Accounts(String firstName, String lastName, int accountNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}