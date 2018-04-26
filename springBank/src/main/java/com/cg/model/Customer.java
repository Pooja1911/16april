package com.cg.model;

import java.util.List;

import com.cg.service.IAccountService;

public class Customer {
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	private String firstName;
	private String lastName;
	private int customerId;
	private List<IAccountService> accountList;
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
	public Customer(final String firstName, final String lastName, final int customerId, final List<IAccountService> accountList) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerId = customerId;
		this.accountList = accountList;
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
