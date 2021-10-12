public class SavingsAccount() {
    static private int s_accountNumber = 0;
    static private annualInterestRate;

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
    
    public void calculateMonthlyInterest()
    {
        savingsBalance += savingsBalance * annualInterestRate / 12
    }

    public void modifyInterestRate(int newAnnualInterestRate)
    {
        annualInterestRate = newAnnualInterestRate;
    }

    public int getBalance() {
        return savingsBalance;
    }

    public void setBalance(int balance) {
        savingsBalance = balance;
    }
}