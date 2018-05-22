package com.cg.bank.entities;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="ref_money")
@Entity
public class RefMoney {
	@Id
	private BigDecimal denomination;

	/**
	 * @return the denomination
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
public RefMoney() {
	// TODO Auto-generated constructor stub
}
}
