package com.cg.model;

public class Address {
	private String street;
	private String houseNumber;
	private String zipCode;
	private String city;

	/**
	 * method name: getStreet 
	 * method description: to get street value
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * method name: getHouseNumber
	 *  method description : to get the houseNumber
	 */
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * method name: getZipCode 
	 * method description : to get the zipcode
	 */

	public String getZipCode() {
		return zipCode;
	}

	/**
	 * method name: getCity 
	 * method description : to get the city
	 */

	public String getCity() {
		return city;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String street, String houseNumber, String zipCode, String city) {
		super();
		this.street = street;
		this.houseNumber = houseNumber;
		this.zipCode = zipCode;
		this.city = city;
	}

}
