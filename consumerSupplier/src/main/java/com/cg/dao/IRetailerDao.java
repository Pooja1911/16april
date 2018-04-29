package com.cg.dao;

import com.cg.model.Customer;
import com.cg.model.Goods;
import com.cg.model.Supplier;

public interface IRetailerDao {
	
	public Goods viewGoods(String retailerName);
	public Customer viewCustomer(String retailerName);
	public Supplier viewSupplier(String retailerName);

}
