package com.cg.service;

import java.util.List;
import java.util.Optional;

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


	@Override
	public Long updateCustomer(Customer customerReq, Long id) {
		// TODO Auto-generated method stub
		Optional<Customer> customer=customerRepository.findById(id);
		if(customer.isPresent())
		{
		Customer cust=customerRepository.getOne(id);
		if(customerReq.getPaymentMode() != null ) {
			cust.setPaymentMode(customerReq.getPaymentMode());
		}
		if(customerReq.getCustomerAddress() != null ) {
			cust.setCustomerAddress(customerReq.getCustomerAddress());
		}
		if(customerReq.getCustomerName() != null ) {
			cust.setCustomerName(customerReq.getCustomerName());
		}
		if(customerReq.getRetailerName() != null ) {
			cust.setRetailerName(customerReq.getRetailerName());
		}
		
		customerRepository.save(cust);
		}
		return id;
	}


	@Override
	public void deleteCustomer(Long id) {
		// TODO Auto-generated method stub
		Optional<Customer> customer=customerRepository.findById(id);
		if(customer.isPresent())
		{
			customerRepository.deleteById(id);
		}
		
	}


	@Override
	public List<Customer> search(String customerName,String customerAddress) {
		// TODO Auto-generated method stub
		 List<Customer> list=customerRepository.findByCustomerNameAndCustomerAddress(customerName,customerAddress);
		return list;
		
	}
	
	

}
