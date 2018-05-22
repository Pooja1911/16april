package com.cg.bank.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Bank;
import com.cg.bank.entities.BankDenomination;
import com.cg.bank.entities.RefMoney;
import com.cg.bank.repository.DenominationRepository;




@Service
public class BankDenominationServiceImpl implements IBankDenominationService {
	@Autowired
	private DenominationRepository denominationRepo;
	@Autowired
	private IBankService bankServcie;
	@Autowired
	private DenominationHelper denominationHelper;
	@Autowired
	private IRefServcie refService;
	@Override
	public void bankDenominationCreate(Long bankId) throws BankException {
		Bank bank = bankServcie.getBankDetailsByID(bankId).get();
		// to retreive values from db TODO
		final BankDenomination first = new BankDenomination(new BigDecimal(2000), 0);

		first.setBank(bank);
		final BankDenomination second = new BankDenomination(new BigDecimal(500), 0);
		second.setBank(bank);
		final BankDenomination third = new BankDenomination(new BigDecimal(200), 0);
		third.setBank(bank);
		final BankDenomination fourth = new BankDenomination(new BigDecimal(100), 0);
		fourth.setBank(bank);

		denominationRepo.save(first);
		denominationRepo.save(second);
		denominationRepo.save(third);
		denominationRepo.save(fourth);
	}

	

	@Override
	public void bankDenominationWithdraw(BigDecimal amount, Long bankId) throws BankException {
      
	}

	@Override
	public void bankDenominationDeposit(BigDecimal amount, Long bankId) throws BankException {
		List<RefMoney> newList=refService.returnAll();
		List<BigDecimal> list = new ArrayList<>();
		for(RefMoney deno:newList)
		{
			list.add(deno.getDenomination());
		}
		Map<BigDecimal, Integer> denomValues = denominationHelper.getDenominatioValues(amount, list);
		
		
		
	}

}
