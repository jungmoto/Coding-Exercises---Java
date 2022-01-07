package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    BankAccount bobsAccount = new BankAccount("1234567",0.00,
                "Bob Saget",
                "bogsaget@gmail.com", "561-221-8987");
        BankAccount sarahsAccount = new BankAccount("9876543",0.00,
                "Sarah Saget","sarahsaget@gmail.com","561-885-3040");

        System.out.println(bobsAccount.getNumber());
        bobsAccount.deposit(500.0);
        bobsAccount.withdrawal(100.0);

        System.out.println("\n");

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("John Saget",25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Peter Saget",100.00,"petersaget@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
