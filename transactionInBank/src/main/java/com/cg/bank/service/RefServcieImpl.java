package com.cg.bank.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.RefMoney;
import com.cg.bank.repository.RefMoneyRepository;
@Service
public class RefServcieImpl implements IRefServcie {
	
@Autowired
private RefMoneyRepository refRepo;
	@Override
	public void createDenomination(List<BigDecimal> list) throws BankException{
		for(BigDecimal denomination: list )
		{
		if(!refRepo.findBydenomination(denomination).isPresent())
		{
			RefMoney refMoney=new RefMoney();
			refMoney.setDenomination(denomination);
			refRepo.save(refMoney);
			//return true;
		}
		else
		{
			throw new BankException("Denomination already exist!!!!");
		}
	}
	}

	@Override
	public List<RefMoney> returnAll() throws BankException {
		
		List<RefMoney> list=refRepo.findAll();
		if(list.isEmpty())
		{
			throw new BankException("no denomination found");
		}
		else
		{
			return list;
		}
	}

}
