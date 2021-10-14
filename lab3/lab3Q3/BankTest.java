public class BankTest {
    static public void main(String args[])
    {
        BankCustomer customer1 = new BankCustomer("Joe", "IT Carlow");
        SavingsAccount saving1 = new SavingsAccount();
        saving1.addCash(200);

        customer1.addAccount(saving1);
        saving1.addCash(300);

        customer1.summary();
    }
}
