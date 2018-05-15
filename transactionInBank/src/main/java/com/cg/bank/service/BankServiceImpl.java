package com.cg.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bank.entities.Bank;
import com.cg.bank.repository.BankRepository;

@Service("bankService")
public class BankServiceImpl implements IBankService{

	@Autowired
	private BankRepository bankRepository;
	@Override
	public Bank createBank(Bank bank) {
		// TODO Auto-generated method stub
		return bankRepository.save(bank);
	}
	@Override
	public List<Bank> getBankDetails() {
		// TODO Auto-generated method stub
		return bankRepository.findAll();
	}

}
