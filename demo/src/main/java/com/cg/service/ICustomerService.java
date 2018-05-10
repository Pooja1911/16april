package com.cg.service;

import java.util.List;

import com.cg.Exception.ConsumerException;
import com.cg.model.Customer;

public interface ICustomerService {
	
	public Customer addCustomer(Customer customer) throws ConsumerException;
	public List<Customer> retriveCustomer()throws ConsumerException;
	public Long updateCustomer(Customer customerReq,Long id) throws ConsumerException;
	public void deleteCustomer(Long id) throws ConsumerException;
	public List<Customer> search(String customerName,String customerAddress) throws ConsumerException;
    public List<Long> updateMultipleCustomer(List<Customer> customer) throws ConsumerException;
}
