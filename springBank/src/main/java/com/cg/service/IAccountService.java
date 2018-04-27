package com.cg.service;

import java.util.List;

import com.cg.model.Customer;
import com.cg.model.SavingAccount;
import com.cg.model.Statment;

public interface IAccountService {

	public List<SavingAccount> addAccount(SavingAccount account);
	public SavingAccount deposit(final float amount,final Customer cust );

	public SavingAccount withdraw(final float amount, final Customer cust);
	public void deleteAccount(Customer cust,Integer custId);
	List<Statment> addStatement(Statment statment);
}
