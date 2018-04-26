package com.cg.service;

import java.util.List;

import com.cg.model.Customer;
import com.cg.model.SavingAccount;
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


	public void updateDetails(Customer customer, String update,Integer custId) {
		
		// TODO Auto-generated method stub
		if(custId.equals(customer.getCustomerId()))
				{
			 customer.getContact().setEmail(update);
			
				}
		
	}

	
	

}
