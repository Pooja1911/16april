package com.cg.bank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * author name : Pooja Jain
 * application name : Transaction in bank
 * description : to perform multiple transcation
 */

@Table(name="bank_details")
@Entity
public class Bank {
	
	@Id
	@SequenceGenerator(name="bank_seq", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="bank_seq")
	@Column(name="bank_id")
	private Long bankId;
	
	 /**
	 * method name : getBankId()
	 * return type : Long
	 * decription : it we get all bank ids
	 */
	public Long getBankId() {
		return bankId;
	}

	/**
	 * @param bankId the bankId to set
	 */
	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}

	/**
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Column(name="amount")
	 private float amount;
public Bank() {
	// TODO Auto-generated constructor stub
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Bank [bankId=" + bankId + ", amount=" + amount + "]";
}

}
