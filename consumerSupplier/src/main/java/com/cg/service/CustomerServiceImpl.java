package com.cg.service;

import com.cg.dao.CustomerDaoImpl;
import com.cg.dao.ICustomerDao;
import com.cg.model.Customer;

public class CustomerServiceImpl implements ICustomerService {
	ICustomerDao customerDao=new CustomerDaoImpl();

	public long addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.addCustomer(customer);
	}

	public void removeCustomer(long customerId) {
		// TODO Auto-generated method stub
		customerDao.removeCustomer(customerId);
		
	}

	public void updateCustomer(String paymentMode, long customerId) {
		// TODO Auto-generated method stub
		customerDao.updateCustomer(paymentMode, customerId);
	}

}
