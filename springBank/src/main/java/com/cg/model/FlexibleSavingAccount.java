package com.cg.model;

public class FlexibleSavingAccount {
	
	private float balance;
	private float interestRate;
	private long period;
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
	 */
	public float getInterestRate() {
		return interestRate;
	}
	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(final float interestRate) {
		this.interestRate = interestRate;
	}
	/**
	 * @return the period
	 */
	public long getPeriod() {
		return period;
	}
	/**
	 * @param period the period to set
	 */
	public void setPeriod(final long period) {
		this.period = period;
	}
	public FlexibleSavingAccount() {
		// TODO Auto-generated constructor stub
	}

}
