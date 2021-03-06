package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

import lombok.Data;
import lombok.Getter;



@Table(name="customer")
@Entity
@Data
public class Customer {
	@Id
	@SequenceGenerator(name="seq11", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq11")
	@Column(name="customer_id")
	@Getter
	public Long customerId;
	@Column(name="customer_name")
	public String customerName;
	@Column(name="customer_address")
	public String customerAddress;
	@Column(name="payment_mode")
	public String paymentMode;
	@Column(name="retailer_name")
	public String retailerName;
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", paymentMode=" + paymentMode + ", retailerName=" + retailerName + "]";
	}
	
	
	/**
	 * @return the customerId
	 */
	public Long getCustomerId() {
		return customerId;
	}


	/**
	 * @param customerName
	 * @param customerAddress
	 * @param paymentMode
	 * @param retailerName
	 */
	public Customer(String customerName, String customerAddress, String paymentMode, String retailerName) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.paymentMode = paymentMode;
		this.retailerName = retailerName;
	}


	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}


	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}


	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	/**
	 * @return the customerAddress
	 */
	public String getCustomerAddress() {
		return customerAddress;
	}


	/**
	 * @param customerAddress the customerAddress to set
	 */
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}


	/**
	 * @return the paymentMode
	 */
	public String getPaymentMode() {
		return paymentMode;
	}


	/**
	 * @param paymentMode the paymentMode to set
	 */
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}


	/**
	 * @return the retailerName
	 */
	public String getRetailerName() {
		return retailerName;
	}


	/**
	 * @param retailerName the retailerName to set
	 */
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}


	/**
	 * @param customerId
	 * @param customerName
	 * @param customerAddress
	 * @param paymentMode
	 * @param retailerName
	 */
	public Customer(Long customerId, String customerName, String customerAddress, String paymentMode,
			String retailerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.paymentMode = paymentMode;
		this.retailerName = retailerName;
	}


	public Customer() {
		// TODO Auto-generated constructor stub
	}

}
