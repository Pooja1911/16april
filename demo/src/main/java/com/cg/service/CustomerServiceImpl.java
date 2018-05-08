package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.CustomerRepository;
import com.cg.model.Customer;

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService{
	@Autowired 
	public CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		return customer;
	}


	@Override
	public List<Customer> retriveCustomer() {
		// TODO Auto-generated method stub
		List<Customer> list=customerRepository.findAll();
		return list;
	}
	
	

}
