package com.cg.bank.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * author name : Pooja Jain application name : Transaction in bank description :
 * to perform multiple transcation
 */

@Table(name = "bank_details")
@Entity
public class Bank {

	@Id
	@SequenceGenerator(name = "bank_seq", initialValue = 1, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bank_seq")
	@Column(name = "id")
	private Long bankId;

	@Column(name = "amount")
	private BigDecimal amount;
	@OneToMany
	@JoinColumn(name = "id", referencedColumnName = "id")
	List<ATM> atmList = new ArrayList();

	public Bank() {
	}

	/**
	 * method name : getBankId() return type : Long decription : it we get all bank
	 * id
	 */
	public Long getBankId() {
		return bankId;
	}

	/**
	 * method name : setBankId(final Long bankId) method description : it will set
	 * the bank id
	 */
	public void setBankId(final Long bankId) {
		this.bankId = bankId;
	}

	/**
	 * method name : getAmount method description : it will get the total bank
	 * amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}

	/**
	 * method name : setAmount method parameters : BigDecimal method description :
	 * it will set bank amount
	 */
	public void setAmount(final BigDecimal amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Bank [bankId=" + bankId + ", amount=" + amount + "]";
	}

	/**
	 * @param bankId
	 * @param amount
	 */
	public Bank(Long bankId, BigDecimal amount) {
		super();
		this.bankId = bankId;
		this.amount = amount;
	}

}
