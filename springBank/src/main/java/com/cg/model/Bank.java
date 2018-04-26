package com.cg.model;

/**
 * Author name: Pooja Jain 
 * Project Name : SpringBank
 *  Project Description:  pojo for bank class
 *
 */
public class Bank {

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bank [name=" + name + ", customer=" + customer + "]";
	}

	private String name;
	private Customer customer;

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * method name: getName method description : to get the bank name
	 */
	public String getName() {
		return name;
	}

	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public Bank(final String name) {
		super();
		this.name = name;
	}

	/**
	 * @param name
	 * @param customer
	 */
	public Bank(String name, Customer customer) {
		super();
		this.name = name;
		this.customer = customer;
	}
	

}
