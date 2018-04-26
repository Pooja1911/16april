package com.cg.model;

import java.util.List;

import com.cg.service.IAccountService;

public class Customer {
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	private String firstName;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	private String lastName;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", customerId=" + customerId
				+ ", contact=" + contact + ", accountList=" + accountList + "]";
	}
	private Integer customerId;
	private Contact contact;
	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the accountList
	 */
	public List<SavingAccount> getAccountList() {
		return accountList;
	}
	/**
	 * @param accountList the accountList to set
	 */
	public void setAccountList(List<SavingAccount> accountList) {
		this.accountList = accountList;
	}
	private List<SavingAccount> accountList;
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}
	public Customer(final String firstName, final String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param customerId
	 * @param accountList
	 */
	public Customer(final String firstName, final String lastName, final Integer customerId, final List<SavingAccount> accountList,Contact contact) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerId = customerId;
		this.accountList = accountList;
		this.contact=contact;
	}
	/**
	 * @return the contact
	 */
	public Contact getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	

}
