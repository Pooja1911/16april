package bank.bankapplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author POOJA project name: Bank Application project Description: Flexible
 *         saving account has all implemented methods of Account interface
 *
 */
public class FlexibleSavingAccount implements Account {

	private float balance = 0.0f;
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
	 * @param balance
	 *            the balance to set
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
	 * @param interestRate
	 *            the interestRate to set
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
	 * @param interestPeriod
	 *            the interestPeriod to set
	 */
	public void setInterestPeriod(Period interestPeriod) {
		this.interestPeriod = interestPeriod;
	}

	// to withdraw a particular amount
	public List withdraw(float amount) {
		// TODO Auto-generated method stub

		if (balance > 0) {
			balance = balance - amount;
		}
		Date date = new Date();
		System.out.println("The balance is" + balance);
		List list = new ArrayList();
		list.add(date);
		return list;

	}

	public FlexibleSavingAccount() {
		// TODO Auto-generated constructor stub
	}

	// to deposit a particular amount
	public List deposit(float amount) {
		// TODO Auto-generated method stub
		balance = balance + amount;
		// System.out.println("The balance is" + balance);
		Date date = new Date();

		// System.out.println("The balance is"+balance);
		List list = new ArrayList();
		list.add(date);
		return list;

	}

	// to retrive the statement list
	@Override
	public List<Account> getStatment(List list) {
		// TODO Auto-generated method stub
		List list1 = new ArrayList();

		list1.add(list);
		return list1;
	}

}
