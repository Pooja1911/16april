package com.cg.repository;

import java.util.List;

import com.cg.model.Bank;
import com.cg.model.Customer;

public interface ICustomerDao {
	
	public List<Customer> addCustomer(Customer customer);


}
