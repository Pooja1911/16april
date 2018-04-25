package com.cg.model;

/**
 * @author Pooja Jain
 * Project Name : bankSpringApplication
 * Project Description: pojo for bank class
 *
 */
public class Bank {
	
	 /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bank [name=" + name + "]";
	}

	private String name;

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
