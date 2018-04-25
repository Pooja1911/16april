package com.cg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


import com.cg.model.SavingAccount;
import com.cg.repository.IAccountDao;
import com.cg.repository.SavingAccountImpl;

public class AccountServiceImpl implements IAccountService{
	//final  Logger LOGGER = Logger.getLogger(AccountServiceImpl.class.getName());
    public IAccountDao accountDao=new SavingAccountImpl();
    SavingAccount savingAccount=new SavingAccount();
    List list=new ArrayList();
	public List withdraw(float amount) {
		
		if(savingAccount.getBalance()<amount)
		{
			//LOGGER.info("your balance is less than amount!!!");
		}
		else if(amount<0)
		{
			//LOGGER.info("Negative amount is not possible");
		}
		else
		{
			
			list=accountDao.withdraw(amount);
			
		}
		return list;
	}

	public List deposit(float amount) {
		// TODO Auto-generated method stub

		
		if(amount<0)
		{
			//LOGGER.info("Negative amount is not possible");
		}
		else
		{
			
			list=accountDao.deposit(amount);
			
		}
		return list;
	}

	public List<SavingAccount> getStatment(List list) {
		// TODO Auto-generated method stub
		return accountDao.getStatment(list);
	}

}
