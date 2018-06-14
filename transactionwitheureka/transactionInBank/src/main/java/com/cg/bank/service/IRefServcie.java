package com.cg.bank.service;

import java.math.BigDecimal;
import java.util.List;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.RefMoney;

/**
 * @author trainee
 *
 */
public interface IRefServcie {
	
	/**
	 * 
	 * @param denomination
	 * @return
	 * @throws BankException
	 */
	
	/**
	 * 
	 * @return
	 * @throws BankException
	 */
	List<RefMoney> returnAll() throws BankException;
	void createDenomination(List<BigDecimal> list) throws BankException;

}
