package com.cg.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.model.Customer;
import com.cg.model.Goods;
import com.cg.model.Supplier;

public class RetailerDaoImpl implements IRetailerDao{
JdbcTemplate jdbcTemplate; 
	/**
 * @param jdbcTemplate
 */
public RetailerDaoImpl(JdbcTemplate jdbcTemplate) {
	super();
	this.jdbcTemplate = jdbcTemplate;
}

	public Goods viewGoods(String retailerName) {
		// TODO Auto-generated method stub
		return null;
	}

	public List viewCustomer(String retailerName) {
		// TODO Auto-generated method stub
		String query="SELECT customer.customer_id,customer.customer_name,customer.customer_address,customer.payment_mode FROM customer INNER JOIN retailer ON customer.retailer_name==retailer.retailer_name";
		
		return null;
	}

	public Supplier viewSupplier(String retailerName) {
		// TODO Auto-generated method stub
		return null;
	}

}
