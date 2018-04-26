package com.cg.service;

import java.util.List;

import com.cg.model.Customer;
import com.cg.model.SavingAccount;

public interface IAccountService {

	public List<SavingAccount> addAccount(SavingAccount account);
	public SavingAccount deposit(final float amount,final Customer cust );

	public SavingAccount withdraw(final float amount, final Customer cust);
	public void deleteAccount(Customer cust,Integer custId);

}
