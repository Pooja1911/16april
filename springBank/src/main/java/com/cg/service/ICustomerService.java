package com.cg.service;

import java.util.List;

import com.cg.model.Customer;

public interface ICustomerService  {
	public List<Customer> addCustomer(Customer customer);
	 
	public void updateDetails(Customer customer,String update,Integer custId);


}
