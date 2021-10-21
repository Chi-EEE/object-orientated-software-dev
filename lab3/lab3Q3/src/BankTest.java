public class BankTest {
	public static void main(String args[]) 
    {
        BankCustomer customer1 = new BankCustomer("Joe", "IT Carlow");
        SavingsAccount saving1 = new SavingsAccount();
        saving1.addCash(200);

        customer1.addAccount(saving1);
        saving1.addCash(220);

        SavingsAccount saving2 = new SavingsAccount();
        saving2.addCash(500);

        customer1.addAccount(saving2);
        customer1.summary();

        SavingsAccount saving3 = new SavingsAccount();
        saving3.addCash(1000);

        customer1.addAccount(saving3);
        customer1.summary();

        SavingsAccount saving4 = new SavingsAccount();
        saving4.addCash(1);

        customer1.addAccount(saving4); // Unable to add account because 3 is max

        customer1.summary();
        
        System.out.println(customer1.getName() + " at " + customer1.getAddress() + " has " + customer1.balance() + " money in their account");
        
        BankCustomer customer2 = new BankCustomer("Pat", "An Example Address");

        SavingsAccount saving5 = new SavingsAccount();

        saving5.addCash(2000);

        customer2.addAccount(saving5);
        customer2.summary();
        System.out.println(customer2.getName() + " at " + customer2.getAddress() + " has " + customer2.balance() + " money in their account");

    }
}
