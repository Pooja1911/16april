 package com.cg.bank.service;

import java.math.BigDecimal;
import java.util.List;

import com.cg.bank.Exception.BankException;

public interface IAtmDenoService {
	
	
	
	
	void atmDenominationCreate(List<BigDecimal> list,Long atmId)throws BankException;
	void atmDenominationDeposit(BigDecimal amount, Long atmId) throws BankException;
}
