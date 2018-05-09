package com.cg.service;

import java.util.List;

import com.cg.model.Customer;

public interface ICustomerService {
	
	public Customer addCustomer(Customer customer);
	public List<Customer> retriveCustomer();
	public Long updateCustomer(Customer customerReq,Long id);
	public void deleteCustomer(Long id);
	public List<Customer> search(String customerName,String customerAddress);

}
