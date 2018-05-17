package com.cg.bank.service;

import java.util.List;
import java.util.Optional;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Bank;

public interface IBankService {
	public Bank createBank(Bank bank) throws BankException;

	public List<Bank> getBankDetails() throws BankException;

	Optional<Bank> getBankDetailsByID(long ID) throws BankException;

}
