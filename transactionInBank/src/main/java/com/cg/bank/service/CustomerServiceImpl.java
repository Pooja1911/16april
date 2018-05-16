package com.cg.bank.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bank.entities.Customer;
import com.cg.bank.repository.CustomerRepository;
@Service("customerService")
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}
	@Override
	public Customer getCustomerDetails(Long id) {
	
				
		Customer customer = customerRepository.findById(id).get();
		
		
	 return	customer;
		
	
	}

}
