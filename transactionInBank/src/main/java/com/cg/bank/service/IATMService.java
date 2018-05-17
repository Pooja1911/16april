package com.cg.bank.service;

import java.math.BigDecimal;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.ATM;
import com.cg.bank.vo.ATMReq;
import com.cg.bank.vo.AddMoneyReq;
import com.cg.bank.vo.WithrawMoneyReq;

public interface IATMService {
	
	public ATM createATM(ATM atm) throws BankException;
	
	public String addMoneyFromBank(AddMoneyReq atm) throws BankException;
	
	public String withrawMoney(WithrawMoneyReq withdraw) throws BankException;

}
