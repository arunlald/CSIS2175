public class SavingsAccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Next, create a SavingsAccount object with a $100 balance, 3% interest rate, and a monthly service charge of $2.50. 
		Display the balance, number of deposits, number of withdrawals.*/
		
		SavingsAccount newAccount = new SavingsAccount(1000,0.03,2.5);
		
		System.out.println("Balance: " + newAccount.balance);
		System.out.println("Number of deposits: " + newAccount.numDeposits);
		System.out.println("Number of withdrawals: " + newAccount.numWithdrawals + "\n");
		
		//Then, make three deposits of $25, $10 and $35 and again display the balance, number of deposits, number of withdrawals.
		
		newAccount.deposit(25);
		newAccount.deposit(10);
		newAccount.deposit(35);
		
		System.out.println("Balance: " + newAccount.balance);
		System.out.println("Number of deposits: " + newAccount.numDeposits);
		System.out.println("Number of withdrawals: " + newAccount.numWithdrawals + "\n");
		
		//Then, make five withdrawals of $100, $50, $10, $1 and $1 and again display the balance, number of deposits, number of withdrawals.
		
		newAccount.withdraw(100);
		newAccount.withdraw(50);
		newAccount.withdraw(10);
		newAccount.withdraw(1);
		newAccount.withdraw(1);
		
		System.out.println("Balance: " + newAccount.balance);
		System.out.println("Number of deposits: " + newAccount.numDeposits);
		System.out.println("Number of withdrawals: " + newAccount.numWithdrawals + "\n");
		
		
		//Then, do the monthly processing and display the balance, number of deposits, number of withdrawals.
		
		newAccount.monthlyProcess();
		System.out.printf("Balance: %.2f",newAccount.balance);
		System.out.println("\n" + "Number of deposits: " + newAccount.numDeposits);
		System.out.println("Number of withdrawals: " + newAccount.numWithdrawals);
	}

}
