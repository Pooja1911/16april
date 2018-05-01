package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ICustomerDao;
import com.cg.model.Customer;

@Service("CustomerService")
public class CustomerServiceImpl implements ICustomerService {
	@Autowired
	ICustomerDao customerDao;

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
