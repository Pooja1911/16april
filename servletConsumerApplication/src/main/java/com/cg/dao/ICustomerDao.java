package com.cg.dao;

import com.cg.model.Customer;


public interface ICustomerDao {

	public long addCustomer(Customer customer);

	public long removeCustomer(long customerId);

	public long updateCustomer(String paymentMode, long customerId);

}
