package com.cg.bank.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.cg.bank.Exception.BankException;

public interface IBankDenominationService {
	
	//void bankDenominationCreate(Long bankId) throws BankException;
	void bankDenominationWithdraw(BigDecimal amount,Long bankId) throws BankException;
	void bankDenominationDeposit(BigDecimal amount, Long bankId) throws BankException ;
	void bankDenominationCreate(List<BigDecimal> list,Long bankId)throws BankException;

}
