package com.cg.model;

/**
 * @author pooja jain
 * Project Name: bankSpringApplication
 * Project Description : contains pojo class for user contact details
 *
 */
public class Contact {
	
	private long mobile;
	private long phone;
	private String email;
	private Address address;
	/**
	 * @return the mobile
	 */
	public long getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	/**
	 * @return the phone
	 */
	public long getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(long phone) {
		this.phone = phone;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	public Contact(long mobile, long phone, String email, Address address) {
		super();
		this.mobile = mobile;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	
	

}
