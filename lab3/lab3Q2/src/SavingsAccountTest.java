//Driver program to test the SavingsAccount class.
public class SavingsAccountTest
{
	public static void main(String args[]) 
	{
        SavingsAccount saver1 = new SavingsAccount(2000);
		SavingsAccount saver2 = new SavingsAccount();
		saver2.addCash(3000);
		
		SavingsAccount.modifyInterestRate(0.04);
		
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		// Check balance and number
		System.out.println("Saver1's balance: " + saver1.getBalance() + " and their account number is: " + saver1.getAccountNumber());
		System.out.println("Saver2's balance: " + saver2.getBalance() + " and their account number is: " + saver2.getAccountNumber());
	}
}
