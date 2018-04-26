package com.cg.model;

/**
 * Author name: Pooja Jain 
 * Project Name : SpringBank
 *  Project Description:  pojo for bank class
 *
 */
public class Bank {

	@Override
	public String toString() {
		return "Bank [name=" + name + "]";
	}

	private String name;

	/**
	 * method name: getName method description : to get the bank name
	 */
	public String getName() {
		return name;
	}

	public Bank() {
		// TODO Auto-generated constructor stub
	}

	public Bank(String name) {
		super();
		this.name = name;
	}

}
