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
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

}
