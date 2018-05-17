package com.cg.bank.service;

import com.cg.bank.Exception.BankException;
import com.cg.bank.entities.Customer;

public interface ICustomerService {
	public Customer createCustomer(Customer customer) throws BankException;

	public Customer getCustomerDetails(Long id) throws BankException;

}
