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
	 * @return the houseNumber
	 */
	public String getHouseNumber() {
		return houseNumber;
	}
	
	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param street
	 * @param houseNumber
	 * @param zipCode
	 * @param city
	 */
	public Address(String street, String houseNumber, String zipCode, String city) {
		super();
		this.street = street;
		this.houseNumber = houseNumber;
		this.zipCode = zipCode;
		this.city = city;
	}
	
	
}
