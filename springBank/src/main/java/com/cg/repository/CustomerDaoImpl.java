package com.cg.repository;

import java.util.ArrayList;
import java.util.List;

import com.cg.model.Customer;

public class CustomerDaoImpl implements ICustomerDao{
	List<Customer> list;
	public List<Customer> addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		if(this.list==null)
		{
		 this.list=new ArrayList<Customer>();
		 this.list.add(customer);
		}
		else
		{
		this.list.add(customer);
		}
		return list;
	}

}
