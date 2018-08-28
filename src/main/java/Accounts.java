import javax.persistence.*;

@Entity
public class Accounts {
    @Id @GeneratedValue (strategy= GenerationType.AUTO)
    private long id;
    @Column (name = "first_name")
    private String firstName;
    @Column (name = "last_name")
    private String lastName;
    @Column (name = "account_number")
    private String accountNumber;

    public Accounts(){}

    public Accounts(String firstName, String lastName, String accountNumber){
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