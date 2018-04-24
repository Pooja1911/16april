package bank.bankapplication;

import java.util.List;
import java.util.Set;

/**
 * @author Pooja project name: Bank Application project Description: Customer
 *         details with account number
 *
 */
public class Customer extends Contact {

	private String firstName;
	private String lastName;
	static Integer customerId = 100;
	static Integer accountNumber = 1000;
	Set<String> listBank;

	public Customer(String firstName, String lastName, Set<String> listBank) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.customerId = ++customerId;
		this.accountNumber = ++accountNumber;
		this.listBank = listBank;
	}

	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId
	 *            the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the accountNumber
	 */
	public Integer getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber
	 *            the accountNumber to set
	 */
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the listBank
	 */
	public Set<String> getListBank() {
		return listBank;
	}

	/**
	 * @param listBank
	 *            the listBank to set
	 */
	public void setListBank(Set<String> listBank) {
		this.listBank = listBank;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Customer(String string, String string2, int i, Set<String> bankname) {
		// TODO Auto-generated constructor stub
	}

	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
public Customer() {
	// TODO Auto-generated constructor stub
}
	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", listBank=" + listBank + "]";
	}
}
