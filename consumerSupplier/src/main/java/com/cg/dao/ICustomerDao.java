package com.cg.dao;

import com.cg.model.Customer;

public interface ICustomerDao {
	
	public long addCustomer(Customer customer);
	public void removeCustomer(long customerId);
	public void updateCustomer(String paymentMode,long customerId);

}
