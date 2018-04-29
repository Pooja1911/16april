package com.cg.service;

import com.cg.model.Customer;

public interface ICustomerService {
	public long addCustomer(Customer customer);
	public void removeCustomer(long customerId);
	public void updateCustomer(String paymentMode,long customerId);
}
