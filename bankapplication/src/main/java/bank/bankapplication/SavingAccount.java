package bank.bankapplication;

public class SavingAccount implements Account{
	 private float balance=0.0f;
	 private InterestRate interestRate;
	 private Period interestPeriod;
	
	// Money money=new Money();
	 

	/**
	 * @return the balance
	 */
	public float getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(float balance) {
		this.balance = balance;
	}

	/**
	 * @return the interestRate
	 */
	public InterestRate getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(InterestRate interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * @return the interestPeriod
	 */
	public Period getInterestPeriod() {
		return interestPeriod;
	}

	/**
	 * @param interestPeriod the interestPeriod to set
	 */
	public void setInterestPeriod(Period interestPeriod) {
		this.interestPeriod = interestPeriod;
	}

	
	
	public SavingAccount(float balance) {
		super();
		this.balance = balance;
	}

	public void withdraw(float amount)
	{
		// TODO Auto-generated method stub
		 
		 if(balance>0)
		 {
			 balance=balance-amount;
		 }
		 System.out.println("The balance is"+balance); 
          	
		
	}
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}

	public void deposit(float amount) {
		// TODO Auto-generated method stub
		balance=balance+amount;
		System.out.println("The balance is"+balance);
		
	}



	
		
	}
	


