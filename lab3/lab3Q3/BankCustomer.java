public class BankCustomer 
{
    static private int s_totalAccountAmount = 3;

    String name;
    String address;

    int accountAmount = 0;
    SavingsAccount accounts[];

    public BankCustomer(String t_name, String t_address)
    {
        name = t_name;
        address = t_address;
    }
    
    public void addAccount(SavingsAccount account)
    {
        if (accountAmount < s_totalAccountAmount - 1)
        accounts[accountAmount] = account;
        accountAmount++;
    }
    
    public int balance()
    {
        int totalBalance = 0;
        for (int i = 0; i < s_totalAccountAmount - 1; i++)
        {
            totalBalance += accounts[i].getBalance();
        }
        return totalBalance;
    }
    
    public void summary() 
    {
        for (int i = 0; i < s_totalAccountAmount - 1; i++)
        {
            System.out.println("The account number of " + accounts[i].getAccountNumber() + " has " + accounts[i].getBalance() + " money.");
        }
    }
}
