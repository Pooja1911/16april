package com.cg.service;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.cg.model.Customer;
import com.cg.model.SavingAccount;
import com.cg.model.Statment;
import com.cg.repository.IAccountDao;

public class AccountServiceImpl implements IAccountService {
	final Logger LOGGER = Logger.getLogger(AccountServiceImpl.class.getName());
	Scanner scan=new Scanner(System.in);
     IAccountDao accountDao;
	SavingAccount savingAccount;
	Iterator iterator;
	IAccountService accountServ;
public AccountServiceImpl() {
	// TODO Auto-generated constructor stub
}
	/**
	 * @param accountDao
	 */
	public AccountServiceImpl(IAccountDao accountDao) {
		super();
		this.accountDao = accountDao;
	}

	public SavingAccount withdraw(final float amount, final Customer cust) {

		
		LOGGER.info("Enter customer id");
		Integer custId=scan.nextInt();
		LOGGER.info("Enter account number");
		Integer accountNumber=scan.nextInt();
          if((custId).equals(cust.getCustomerId()))
          {
        	  List<SavingAccount> accountlist=cust.getAccountList();
        	 
        	  savingAccount=cust.getAccountList().get(0);
        	  
        	  if((accountNumber).equals(savingAccount.getAccountNumber()))
        	  {        	  
        		  float balance = savingAccount.getBalance();
        	  
		if (balance < amount) {
			LOGGER.info("your balance is less than amount!!!");

		} else if (amount < 0) {
			LOGGER.info("Negative amount is not possible");

		} else {

			balance = balance - amount;
			savingAccount.setBalance(balance);

		}
        	  }
          }
		return savingAccount;
	
	}
          

	public SavingAccount deposit(final float amount,final Customer cust )
	{
		LOGGER.info("Enter customer id");
		Integer custId=scan.nextInt();
		LOGGER.info("Enter account number");
		Integer accountNumber=scan.nextInt();
          if((custId).equals(cust.getCustomerId()))
          {
        	  List<SavingAccount> accountlist=cust.getAccountList();
        	 
        	  savingAccount=cust.getAccountList().get(0);
        	  
        	  if((accountNumber).equals(savingAccount.getAccountNumber()))
        	  {        	  
        	  if (amount < 0) {
      			LOGGER.info("Negative amount is not possible");

        	  }
        	  else {
			float balance = savingAccount.getBalance();
			System.out.println(balance);
			balance = balance + amount;
			savingAccount.setBalance(balance);
        	  }
		}
        	  }
       
          System.out.println("balance"+savingAccount);
		return savingAccount;
	}

	public List<SavingAccount> addAccount(SavingAccount account) {
		// TODO Auto-generated method stub
		return accountDao.addAccount(account);
	}
	public void deleteAccount(Customer cust,Integer custId) {
		// TODO Auto-generated method stub
		if(custId.equals(cust.getCustomerId()))
		{
			
			LOGGER.info("Enter the account no you want to delete");
			Integer accountNo=scan.nextInt();
              int count=0;
              
			List<SavingAccount> list=cust.getAccountList();
			savingAccount=cust.getAccountList().get(count);
			if(accountNo.equals(savingAccount.getAccountNumber()))
			{
			list.remove(count);
			}
			count++;
		}
	}
	@Override
	public List<Statment> addStatement(Statment statment) {
		// TODO Auto-generated method stub
		return accountDao.addStatement(statment);
	}

}
