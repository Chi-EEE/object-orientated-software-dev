public class SavingsAccount
{
    static private int s_accountNumber = 0;
    static private double annualInterestRate = 0;

    private int accountNumber;
    private int savingsBalance;
    public SavingsAccount()
    {
        s_accountNumber += 1;
        accountNumber = s_accountNumber;
        savingsBalance = 0;
    }
    
    public SavingsAccount(int balance)
    {
        s_accountNumber += 1;
        accountNumber = s_accountNumber;
        savingsBalance = balance;
    }
    
    /**
     * The function calculates the monthly interest and rounds down the interest and 
     * adds it to the balance
     */
    public void calculateMonthlyInterest()
    {
        savingsBalance += savingsBalance * annualInterestRate / 12.0;
    }

    /**
     * This function sets the current annual interest rate
     * into a new annual interest rate 
     * @param newAnnualInterestRate
     */
    static public void modifyInterestRate(double newAnnualInterestRate)
    {
        annualInterestRate = newAnnualInterestRate;
    }

    public int getBalance() {
        return savingsBalance;
    }

    public void addCash(int cash) {
        savingsBalance += cash;
    }

    public void removeCash(int cash) {
        savingsBalance -= cash;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}