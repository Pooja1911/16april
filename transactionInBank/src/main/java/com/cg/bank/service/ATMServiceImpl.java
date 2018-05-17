package com.cg.bank.service;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.ATM;
import com.cg.bank.entities.Account;
import com.cg.bank.entities.Bank;
import com.cg.bank.repository.ATMRepository;
import com.cg.bank.repository.AccountRepository;
import com.cg.bank.repository.BankRepository;
import com.cg.bank.vo.AddMoneyReq;
import com.cg.bank.vo.WithrawMoneyReq;
@Service("atmService")
public class ATMServiceImpl implements IATMService {

	
	@Autowired 
	private ATMRepository atmRepo;
	@Autowired
	private BankRepository bankrepo;
	@Autowired
	private AccountRepository accountRepo;
	@Override
	public ATM createATM(ATM atm) throws BankException {
		// TODO Auto-generated method stub
		ATM atm1=atmRepo.save(atm);
		if(atm1!=null)
		{
			return atm1;
		}
		else
		{
			throw new BankException("No such atm is created!!");
		}
	}
	@Override
	public String addMoneyFromBank(AddMoneyReq atmreq) throws BankException {
		// TODO Auto-generated method stub
		Optional<ATM> atm=atmRepo.findById(atmreq.getAtmId());
		if(atm.isPresent())
		{
			ATM atm1=atm.get();
			Long bankID=atmreq.getBankId();
			Long bankId=atm1.getBankId();
			if(bankID.equals(bankId))
			{
				BigDecimal amount=atmreq.getAmount();
				Bank bank=bankrepo.findById(bankId).get();
				BigDecimal bankAmount=bank.getAmount();
				if(amount.compareTo(BigDecimal.ZERO)>0)
				{
					if(amount.compareTo(bankAmount)==-1)
					{
						BigDecimal atmAmount=atm1.getAmount();
						atmAmount=atmAmount.add(amount);
						atm1.setAmount(atmAmount);
						bankAmount=bankAmount.subtract(amount);
						bank.setAmount(bankAmount);
						bankrepo.save(bank);
						atmRepo.save(atm1);
						
					}
				}
			}
		}
		return "added";
	}
	@Override
	public String withrawMoney(WithrawMoneyReq withdraw) throws BankException {
		Optional<ATM> atm=atmRepo.findById(withdraw.getAccountId());
if(atm.isPresent())
{     ATM atm1=atm.get();
	BigDecimal amount=atm1.getAmount();
	if(amount.compareTo(withdraw.getAmount())==1)
	{
		Account account=accountRepo.findById(withdraw.getAccountId()).get();
		BigDecimal accountAmount=account.getAmount();
		if(accountAmount.compareTo(withdraw.getAmount())==1)
		{
			amount=amount.subtract(withdraw.getAmount());
			atm1.setAmount(amount);
			accountAmount=accountAmount.subtract(withdraw.getAmount());
			account.setAmount(accountAmount);
			accountRepo.save(account);
			atmRepo.save(atm1);
		}
	}
}
		return "deducted";
	}

}
