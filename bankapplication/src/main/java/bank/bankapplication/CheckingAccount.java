package bank.bankapplication;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

/**
 * @author pooja project name: Bank Application project Description: Checking
 *         account which have all the methods of interface account
 *
 */
public class CheckingAccount implements Account {
	final static Logger LOGGER = Logger.getLogger(App.class.getName());
	private float balance;
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

	// to withdraw the amount

	public List withdraw(float amount) {
		// TODO Auto-generated method stub

		if (balance > 0) {
			balance = balance - amount;
		}
		LOGGER.info("The balance is" + balance);
		Date date = new Date();
		LOGGER.info("The balance is" + balance);
		List list = new ArrayList();
		list.add(date);
		return list;

	}

	public CheckingAccount() {
		// TODO Auto-generated constructor stub
	}

	// to deposit amount and return a date
	public List deposit(float amount) {
		// TODO Auto-generated method stub
		balance = balance + amount;
		LOGGER.info("The balance is" + balance);
		Date date = new Date();
		LOGGER.info("The balance is" + balance);
		List list = new ArrayList();
		list.add(date);
		return list;

	}

	// return a list of statment done by a particular customer	@Override
	public List<Account> getStatment(List list) {
		// TODO Auto-generated method stub
		List list1 = new ArrayList();
		list1.add(list);
		return list1;
	}

}
