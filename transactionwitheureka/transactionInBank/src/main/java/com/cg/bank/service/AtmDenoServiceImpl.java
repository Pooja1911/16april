package com.cg.bank.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.ATM;
import com.cg.bank.entities.ATMDenomination;
import com.cg.bank.entities.Bank;
import com.cg.bank.entities.BankDenomination;
import com.cg.bank.entities.RefMoney;
import com.cg.bank.repository.ATMDenoRepository;
import com.cg.bank.repository.ATMRepository;
import com.cg.bank.repository.DenominationRepository;

@Service
public class AtmDenoServiceImpl implements IAtmDenoService{

	
	@Autowired
	private IRefServcie refService;
	
	@Autowired 
	private DenominationHelper denominationHelper;
	
	@Autowired
	private ATMDenoRepository atmdenoRepository;
	@Autowired
	private ATMRepository atmRepo;
	@Autowired
	private DenominationRepository bankDeno;
	@Autowired
	IBankService bankService;
	@Override
	public void atmDenominationCreate(List<BigDecimal> list, Long atmId) throws BankException {
		// TODO Auto-generated method stub
		for(BigDecimal denom: list )
		{
			final ATMDenomination first = new ATMDenomination(atmId,new BigDecimal(denom.intValue()), 0);
			atmdenoRepository.save(first);

		}
	}
	@Override
	public void atmDenominationDeposit(BigDecimal amount, Long atmId) throws BankException {
		// TODO Auto-generated method stub
		
          List<RefMoney> newList=refService.returnAll();
		
		List<BigDecimal> list = new ArrayList<>();
		for(RefMoney deno:newList)
		{
			list.add(deno.getDenomination());
		}
		Map<BigDecimal, Integer> denomValues = denominationHelper.getDenominatioValues(amount, list);
		
		ATMDenomination atmDeno=new ATMDenomination();
	
		long i = 0;
		Iterator<Map.Entry<BigDecimal, Integer>> it = denomValues.entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry<BigDecimal, Integer> pair = it.next();
		    BigDecimal myValue = pair.getKey();
		    Integer count=pair.getValue();	
			System.out.println("key value"+myValue);
			Optional<ATMDenomination> deno=atmdenoRepository.findById(myValue);
			ATMDenomination denomination=deno.get();
		System.out.println("denomination"+denomination);
		System.out.println("count value"+count);
		ATM atm=atmRepo.findById(atmId).get();
		BankDenomination bank=bankDeno.findById(myValue).get();
		int newNum=bank.getNoOfDenomination()-count;
		bank.setNoOfDenomination(newNum);
		bankDeno.save(bank);
		denomination.setATMId(atmId);
		denomination.setNoofDenomination(denomination.getNoofDenomination()+count);
		
		atmdenoRepository.save(denomination);
		}
	}
	@Override
	public void atmDenominationWithdraw(BigDecimal amount, Long atmId) throws BankException {
		// TODO Auto-generated method stub

        List<RefMoney> newList=refService.returnAll();
		
		List<BigDecimal> list = new ArrayList<>();
		for(RefMoney deno:newList)
		{
			list.add(deno.getDenomination());
		}
		Map<BigDecimal, Integer> denomValues = denominationHelper.getcountDenomination(amount, list);
		
		ATMDenomination atmDeno=new ATMDenomination();
	
		long i = 0;
		Iterator<Map.Entry<BigDecimal, Integer>> it = denomValues.entrySet().iterator();
		while (it.hasNext()) {
		    Map.Entry<BigDecimal, Integer> pair = it.next();
		    BigDecimal myValue = pair.getKey();
		    Integer count=pair.getValue();	
			System.out.println("key value"+myValue);
			Optional<ATMDenomination> deno=atmdenoRepository.findById(myValue);
			ATMDenomination denomination=deno.get();
		System.out.println("denomination"+denomination);
		System.out.println("count value"+count);
	//	ATM atm=atmRepo.findById(atmId).get();
		denomination.setATMId(atmId);
		denomination.setNoofDenomination(denomination.getNoofDenomination()+count);
		
		atmdenoRepository.save(denomination);
		}
		
	}
	}
	
	


