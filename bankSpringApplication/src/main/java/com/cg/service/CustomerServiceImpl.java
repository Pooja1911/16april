package com.cg.service;

import java.util.List;

import com.cg.model.Customer;
import com.cg.repository.CustomerDaoImpl;
import com.cg.repository.ICustomerDao;

public class CustomerServiceImpl  implements ICustomerService{
	public ICustomerDao customerDao=new CustomerDaoImpl();

	public List<Customer> addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.addCustomer(customer);
	}

	
	

}
