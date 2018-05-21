package com.cg.bank.entities;

import java.math.BigDecimal;

public class RefMoney {
	
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

}
