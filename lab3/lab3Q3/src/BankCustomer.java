public class BankCustomer 
{
    static private int s_totalAccountAmount = 3;

    String name;
    String address;

    int accountAmount = 0;
    SavingsAccount accounts[] = new SavingsAccount[3];

    public BankCustomer(String t_name, String t_address)
    {
        name = t_name;
        address = t_address;
    }
    
    /**
     * Checks if the account owner hasn't reached the maximum account number and 
     * adds the inputed SavingsAccount to the accounts array
     * @param account
     */
    public void addAccount(SavingsAccount account)
    {
        if (accounts.length < s_totalAccountAmount)
        {
            accounts[accountAmount] = account;
            accountAmount++;
        }
        else
        	System.out.println("Unable to add another savings account to BankAccount: " + getName() + " at " + getAddress());
    }
    
    public String getName()
    {
    	return name;
    }
    
    public String getAddress()
    {
    	return address;
    }
    
    /**
     * Returns the balance of all the savings accounts
     * @return
     */
    public int balance()
    {
        int totalBalance = 0;
        for (int i = 0; i < accounts.length; i++)
        {
            totalBalance += accounts[i].getBalance();
        }
        return totalBalance;
    }
    
    /**
     * Prints out all of the account numbers and it's balance
     */
    public void summary() 
    {
        for (int i = 0; i < accounts.length; i++)
        {
            System.out.println("The account number of " + accounts[i].getAccountNumber() + " has " + accounts[i].getBalance() + " money.");
        }
    }
}
