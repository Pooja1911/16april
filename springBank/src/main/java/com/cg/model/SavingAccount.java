package com.cg.model;



public class SavingAccount {
	private float balance;
	private int accountNumber;
	
	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the balance
	 */
	public float getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(final float balance) {
		this.balance = balance;
	}
	/**
	 * @return the interestRate
	
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param balance
	 */
	public SavingAccount(final float balance) {
		super();
		this.balance = balance;
	}
	/**
	 * @param balance
	 * @param accountNumber
	 */
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	public SavingAccount(final float balance, final int accountNumber) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SavingAccount [balance=" + balance + ", accountNumber=" + accountNumber + "]";
	}
	
	

	
	

}
