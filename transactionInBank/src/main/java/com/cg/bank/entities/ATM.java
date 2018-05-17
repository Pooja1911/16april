package com.cg.bank.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="atm_info")
@Entity
public class ATM {

	@Id
	@SequenceGenerator(name="atm_seq", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="atm_seq")
	@Column(name="atm_id")
	private Long ATMId;
	@Column(name="amount")
	private BigDecimal amount;
	@Column(name="bank_id")
	private Long bankId;
	/**
	 * @return the aTMId
	 */
	public Long getATMId() {
		return ATMId;
	}
	/**
	 * @param aTMId the aTMId to set
	 */
	public void setATMId(final Long aTMId) {
		ATMId = aTMId;
	}
	/**
	 * @return the amount
	 */
	public BigDecimal getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(final BigDecimal amount) {
		this.amount = amount;
	}
	/**
	 * @return the bankId
	 */
	public Long getBankId() {
		return bankId;
	}
	/**
	 * @param bankId the bankId to set
	 */
	public void setBankId(final Long bankId) {
		this.bankId = bankId;
	}
	
	public ATM() {
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ATM [ATMId=" + ATMId + ", amount=" + amount + ", bankId=" + bankId + "]";
	}
	
	
	

}
