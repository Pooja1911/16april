package com.cg.service;

import java.util.List;

import com.cg.model.Customer;

import com.cg.repository.ICustomerDao;

public class CustomerServiceImpl  implements ICustomerService{
	public ICustomerDao customerDao;
	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param customerDao
	 */
	public CustomerServiceImpl(final ICustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}


	public List<Customer> addCustomer(final Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.addCustomer(customer);
	}

	
	

}
