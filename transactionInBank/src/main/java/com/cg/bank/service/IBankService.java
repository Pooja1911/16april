package com.cg.bank.service;

import java.util.List;
import java.util.Optional;

import com.cg.bank.entities.Bank;

public interface IBankService {
	public Bank createBank(Bank bank);
	public List<Bank> getBankDetails();
	Optional<Bank> getBankDetailsByID(long ID);

}
