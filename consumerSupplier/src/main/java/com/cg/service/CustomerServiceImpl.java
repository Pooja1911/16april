package com.cg.service;

import com.cg.dao.ICustomerDao;
import com.cg.model.Customer;

public class CustomerServiceImpl implements ICustomerService {
	ICustomerDao customerDao;

	/**
	 * @param customerDao
	 */
	public CustomerServiceImpl(ICustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}

	public long addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.addCustomer(customer);
	}

	public long removeCustomer(long customerId) {
		// TODO Auto-generated method stub
		return customerDao.removeCustomer(customerId);
		
	}

	public long updateCustomer(String paymentMode, long customerId) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomer(paymentMode, customerId);
	}

}
