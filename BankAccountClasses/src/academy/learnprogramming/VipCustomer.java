package academy.learnprogramming;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        System.out.println("Account constructor with 3 parameters");
        this.name = name;                   //This is the only constructor that saves into fields
        this.creditLimit = creditLimit;     //
        this.emailAddress = emailAddress;   //
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit,"unknown@email.com");
    }

    public VipCustomer() {
        this("Default name", 50000.00,"default@email.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
