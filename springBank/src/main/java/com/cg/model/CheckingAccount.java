package com.cg.model;

public class CheckingAccount {
	private float balance;
	private float interestRate;
	private long period;
	/**
	 * method name: getBalance
	 * method description : to get the balance of an account
	 */
	public float getBalance() {
		return balance;
	}
	/**
	 * method name: setBalance
	 * method description : to set balance of an account
	 */
	public void setBalance(final float balance) {
		this.balance = balance;
	}
	/**
	 * method name: getInterestRate
	 * method description : to get the interest rate
	 */
	public float getInterestRate() {
		return interestRate;
	}
	/**
	 * method name: setInterestRate(float)
	 * method description : to set interest rate as per account type
	 */
	public void setInterestRate(final float interestRate) {
		this.interestRate = interestRate;
	}
	/**
	 * method name: getPeriod
	 * method description : to get the period
	 */
	public long getPeriod() {
		return period;
	}
	/**
	 * method name: setPeriod
	 * method description : to set Period
	 */
	public void setPeriod(final long period) {
		this.period = period;
	}
	public CheckingAccount() {
		// TODO Auto-generated constructor stub
	}

}
