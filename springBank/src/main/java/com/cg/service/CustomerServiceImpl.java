package com.cg.service;

import java.util.List;

import com.cg.model.Customer;
import com.cg.repository.CustomerDaoImpl;
import com.cg.repository.ICustomerDao;

public class CustomerServiceImpl  implements ICustomerService{
	public ICustomerDao customerDao;
	public CustomerServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param customerDao
	 */
	public CustomerServiceImpl(ICustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}


	public List<Customer> addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.addCustomer(customer);
	}

	
	

}
