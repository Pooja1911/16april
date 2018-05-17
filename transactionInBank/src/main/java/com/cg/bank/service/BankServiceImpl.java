package com.cg.bank.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Bank;
import com.cg.bank.repository.BankRepository;

@Service("bankService")
public class BankServiceImpl implements IBankService {

	final Logger LOGGER = LoggerFactory.getLogger(BankServiceImpl.class);
	@Autowired
	private BankRepository bankRepository;

	@Override
	public Bank createBank(final Bank bank) throws BankException {
		final Bank bank1 = bankRepository.save(bank);
		if (bank1 != null) {
			return bank1;
		} else {
			throw new BankException("No Bank is Added");
		}
	}

	@Override
	public List<Bank> getBankDetails() throws BankException {
		final List<Bank> list = bankRepository.findAll();
		if (list.isEmpty()) {
			throw new BankException("No bank found");
		} else {
			return list;
		}
	}

	@Override
	public Optional<Bank> getBankDetailsByID(long ID) throws BankException {
		// TODO Auto-generated method stub
		final Optional<Bank> bank = bankRepository.findById(ID);
		if (bank.isPresent()) {
			return bank;
		} else {
			throw new BankException("No such bank found");
		}
	}

}
