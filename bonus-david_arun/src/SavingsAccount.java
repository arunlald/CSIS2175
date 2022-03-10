public class SavingsAccount extends BankAccount {

	/*
	 * The SavingsAccount class should have a status field to represent an active or
	 * inactive account. If the balance of a savings account falls below $25, it
	 * becomes inactive. (The status field could be a boolean variable.) No more
	 * withdrawals may be made until the balance is raised above $25, at which time
	 * the account becomes active again.
	 */
	
	private boolean active;

	//The constructor should accept arguments for the balance, annual interest rate and monthly service charges. 
	//It should set the status field based on the above instruction.
	
	public SavingsAccount(double balance, double annualInterestRate, double monthlyServiceCharge) {
		super(balance, annualInterestRate, monthlyServiceCharge);
		// TODO Auto-generated constructor stub
		if (balance<25) {
			active = false;
		}
		else {
			active = true;
		}
	}
	
	/*
	 * A method that determines whether the account is inactive before a withdrawal
	 * is made. (No withdrawal will be allowed if the account is not active.) A
	 * withdrawal is then made by calling the superclass version of the method.
	 */
	
	public void withdraw (double withdrawalAmount) {
		if (active) {
			super.withdraw(withdrawalAmount);
			if (balance<25) {
				active=false;
			}
		}
		
	}
	
	/*
	 * A method that determines whether the account is inactive before a deposit is
	 * made. If the account is inactive and the deposit brings the balance above
	 * $25, the account becomes active again. A deposit is then made by calling the
	 * superclass version of the method.
	 */
	
	public void deposit(double depositAmount) {
		if (active) {
			super.deposit(depositAmount);
		}
		/*
		 * if(!active) { if(balance+depositAmount>=25) { active = true; } }
		 */
	}
	
	/*
	 * Before the superclass method is called, this method checks the number of
	 * withdrawals. If the number of withdrawals for the month is more than 4, a
	 * service charge of $1 for each withdrawal above 4 is added to the superclass
	 * field that holds the monthly service charges. (Don’t forget to check the
	 * account balance after the service charge is taken. If the balance falls below
	 * $25, the account becomes inactive.)
	 */
	
	public void monthlyProcess() {
		if (numWithdrawals>4) {
			monthlyServiceCharge +=1;
		}
		balance -= monthlyServiceCharge;
		calcInterest();
		if (balance<25) {
			active = false;
		}
		// not mentioned on the PDF but without this the last output will be incorrect.
		numWithdrawals = 0;
		numDeposits = 0;
		
	}
	
}
