package com.cg.bank.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Table(name="Bank_Denm")
@Entity
public class BankDenomination {
	
	@Id
	@Column(name="denomination")
	private BigDecimal denomination;
	@Column(name="noOfDenomination")
	private int noOfDenomination;
	@ManyToOne(targetEntity=Bank.class)
	private Bank bank;
	/**
	 * @return the bank
	 */
	
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	/**
	 * @return the bankId
	 */
	public BigDecimal getDenomination() {
		return denomination;
	}
	/**
	 * @param denomination the denomination to set
	 */
	public void setDenomination(BigDecimal denomination) {
		this.denomination = denomination;
	}
	/**
	 * @return the noOfDenomination
	 */
	public int getNoOfDenomination() {
		return noOfDenomination;
	}
	/**
	 * @param noOfDenomination the noOfDenomination to set
	 */
	public void setNoOfDenomination(int noOfDenomination) {
		this.noOfDenomination = noOfDenomination;
	}
	public BankDenomination() {
		// TODO Auto-generated constructor stub
	}
/**
 * @param bankId
 * @param denomination
 * @param noOfDenomination
 */
public BankDenomination( BigDecimal denomination, int noOfDenomination) {
	
	this.denomination = denomination;
	this.noOfDenomination = noOfDenomination;
}
}