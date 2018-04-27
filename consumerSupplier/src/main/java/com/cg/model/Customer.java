package com.cg.model;

public class Customer {
	
	
	public long customerId;
	public String customerName;
	public Address customerAddress;
	public String paymentMode;
	public Goods customerGoods;
	/**
	 * method name: getCustomerGoods
	 * method description : to get the customer's goods
	 */
	public Goods getCustomerGoods() {
		return customerGoods;
	}
	/**
	 * method name: setCustomerGoods(Goods)
	 * method description: to set the customer goods
	 */
	public void setCustomerGoods(Goods customerGoods) {
		this.customerGoods = customerGoods;
	}
	/**
	 * method name: getCustomerId()
	 * method description: this method get the customer id
	 */
	public long getCustomerId() {
		return customerId;
	}
	/**
	 * method name: setCustomerId(long)
	 * method description: this method get the name of street
	 */
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	/**
	 * method name: getCustomerName()
	 * method description: this method get the name of customer
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * method name : setCustomerName(String)
	 * method description: this method get the name of street
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * method name: getCustomerAddress()
	 * method description: this method get customer Address
	 */
	public Address getCustomerAddress() {
		return customerAddress;
	}
	/**
	 * method name: setCustomerAddress(Address)
	 * method description: this method set customer address
	 */
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	/**
	 * method name: getPaymentMode()
	 * method description: this method get the mode of payment
	 */
	public String getPaymentMode() {
		return paymentMode;
	}
	/**
	 * method name: setPaymentMode(String)
	 * method description: this method set the mode of payment
	 */
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	

}
