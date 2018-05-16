package com.cg.bank.service;

import java.util.List;

import com.cg.bank.entities.Customer;

public interface ICustomerService {
	public Customer createCustomer(Customer customer);
	public Customer getCustomerDetails(Long id);

}
