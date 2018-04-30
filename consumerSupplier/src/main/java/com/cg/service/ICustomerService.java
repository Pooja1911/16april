package com.cg.service;

import com.cg.model.Customer;

public interface ICustomerService {
	public long addCustomer(Customer customer);
	public long removeCustomer(long customerId);
	public long updateCustomer(String paymentMode,long customerId);
}
