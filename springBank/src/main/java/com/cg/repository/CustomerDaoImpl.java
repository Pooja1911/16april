package com.cg.repository;

import java.util.ArrayList;
import java.util.List;

import com.cg.model.Customer;

public class CustomerDaoImpl implements ICustomerDao{

	public List<Customer> addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		List<Customer> list=new ArrayList();
		list.add(customer);
		return list;
	}

}
