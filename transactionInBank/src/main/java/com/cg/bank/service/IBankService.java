package com.cg.bank.service;

import java.util.List;

import com.cg.bank.entities.Bank;

public interface IBankService {
	public Bank createBank(Bank bank);
	public List<Bank> getBankDetails();

}
