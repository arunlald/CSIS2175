public abstract class BankAccount {
	/*
	 * Design an abstract class named BankAccount to hold the following data for a
	 * bank account: • Balance • Number of deposits this month • Number of
	 * withdrawals • Annual interest rate • Monthly service charges
	 */
	protected double balance;
	protected int numDeposits;
	protected int numWithdrawals;
	protected double annualInterestRate;
	protected double monthlyServiceCharge;
	
	//The constructor should accept arguments for the balance, annual interest rate and monthly service charges
	public BankAccount(double balance, double annualInterestRate, double monthlyServiceCharge) {
		super();
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.monthlyServiceCharge = monthlyServiceCharge;
	}
	
	//A method that accepts an argument for the amount of the deposit. 
	//The method should add the argument to the account balance. It should also increment the variable holding the number of deposits.
	public void deposit(double depositAmount) {
		balance += depositAmount;
		numDeposits++;
	}
	
	//A method that accepts an argument for the amount of the withdrawal. The method should subtract the argument from the balance. 
	//It should also increment the variable holding the number of withdrawals.
	public void withdraw(double withdrawalAmount) {
		if(withdrawalAmount<=balance) {
			balance -= withdrawalAmount;
			numWithdrawals++;
		}
	}
	
	/*
	 * A method that updates the balance by calculating the monthly interest earned
	 * by the account, and adding this interest to the balance. This is performed by
	 * the following formulas: MonthlyInterestRate=(AnnualInterestRate/12)
	 * MonthlyInterest=Balance*MonthlyInterestRate Balance=Balance+MonthlyInterest
	 */
	public void calcInterest() {
		double monthlyInterestRate = annualInterestRate/12;
		double monthlyInterest = balance*monthlyInterestRate;
		balance+=monthlyInterest;
	}
	
	//A method that subtracts the monthly service charges from the balance, calls the calcInterest method, 
	//and then sets the variables that hold the number of withdrawals, number of deposits, and monthly service charges to zero.
	public void monthlyProcess() {
		balance-=monthlyServiceCharge;
		calcInterest();
		numWithdrawals = 0;
		numDeposits = 0;
		monthlyServiceCharge = 0;
	}

}
