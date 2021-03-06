package com.cg.dao;

import java.util.List;

import com.cg.model.Customer;
import com.cg.model.Goods;
import com.cg.model.Supplier;

public interface IRetailerDao {
	
	public List<Goods> viewGoods(String retailerName);
	public List<Customer> viewCustomer(String retailerName);
	public List<Supplier> viewSupplier(String retailerName);

}
