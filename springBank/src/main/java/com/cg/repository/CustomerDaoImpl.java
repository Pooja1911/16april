package com.cg.repository;

import java.util.ArrayList;
import java.util.List;

import com.cg.model.Customer;

public class CustomerDaoImpl implements ICustomerDao{
	List<Customer> list;
	public List<Customer> addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		if(list.isEmpty())
		{
		 list=new ArrayList<Customer>();
		}
		else
		{
		list.add(customer);
		}
		return list;
	}

}
