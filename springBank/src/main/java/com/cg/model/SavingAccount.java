package com.cg.model;

import java.util.List;

import com.cg.service.IAccountService;

public class SavingAccount implements IAccountService{
	private float balance;
	private int accountNumber;
	private List<Statment> statementList;
	
	/**
	 * @param balance
	 * @param accountNumber
	 * @param statementList
	 */
	public SavingAccount(float balance, int accountNumber, List<Statment> statementList) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.statementList = statementList;
	}
	/**
	 * @return the statementList
	 */
	public List<Statment> getStatementList() {
		return statementList;
	}
	/**
	 * @param statementList the statementList to set
	 */
	public void setStatementList(List<Statment> statementList) {
		this.statementList = statementList;
	}
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
	public List<SavingAccount> addAccount(SavingAccount account) {
		// TODO Auto-generated method stub
		return null;
	}
	public SavingAccount deposit(float amount, Customer cust) {
		// TODO Auto-generated method stub
		return null;
	}
	public SavingAccount withdraw(float amount, Customer cust) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void deleteAccount(Customer cust, Integer custId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Statment> addStatement(Statment statment) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	

}
