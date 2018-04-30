package com.cg.dao;

import java.util.List;

import com.cg.model.Customer;
import com.cg.model.Goods;
import com.cg.model.Supplier;

public interface IRetailerDao {
	
	public Goods viewGoods(String retailerName);
	public List viewCustomer(String retailerName);
	public Supplier viewSupplier(String retailerName);

}
