package com.cg.bank.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Ref_ATM_Denm")
@Entity
public class ATMDenomination {
	@Column(name="atm_id")
	private Long ATMId;
	@Id
	@Column(name="denomination")
	private int denomination;
	@Column(name="noofdenomination")
	private int noofDenomination;
	/**
	 * @return the aTMId
	 */
	public Long getATMId() {
		return ATMId;
	}
	/**
	 * @param aTMId the aTMId to set
	 */
	public void setATMId(Long aTMId) {
		ATMId = aTMId;
	}
	/**
	 * @return the denomination
	 */
	public int getDenomination() {
		return denomination;
	}
	/**
	 * @param denomination the denomination to set
	 */
	public void setDenomination(int denomination) {
		this.denomination = denomination;
	}
	/**
	 * @return the noofDenomination
	 */
	public int getNoofDenomination() {
		return noofDenomination;
	}
	/**
	 * @param noofDenomination the noofDenomination to set
	 */
	public void setNoofDenomination(int noofDenomination) {
		this.noofDenomination = noofDenomination;
	}
public ATMDenomination() {
	// TODO Auto-generated constructor stub
}
}
