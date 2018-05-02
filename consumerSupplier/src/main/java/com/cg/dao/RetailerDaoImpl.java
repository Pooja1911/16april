package com.cg.dao;


import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cg.model.Customer;
import com.cg.model.Goods;
import com.cg.model.Supplier;

public class RetailerDaoImpl implements IRetailerDao {
	public JdbcTemplate jdbcTemplate;

	/**
	 * @param jdbcTemplate
	 */
	public RetailerDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Goods> viewGoods(String retailerName) {
		// TODO Auto-generated method stub
		List<Goods> list = jdbcTemplate
				.query("SELECT * FROM goods where supplier_id in (SELECT supplier_id from supplier where retailer_name='"+retailerName+"')",
						new BeanPropertyRowMapper<Goods>(Goods.class));
		return list;
	}

	public List<Customer> viewCustomer(String retailerName) {
		// TODO Auto-generated method stub
		// String
		// query="SELECT customer.customer_id,customer.customer_name,customer.customer_address,customer.payment_mode FROM customer INNER JOIN retailer ON customer.retailer_name=retailer.retailer_name";
		List<Customer> list = jdbcTemplate
				.query("SELECT * FROM customer WHERE retailer_name='"+retailerName+"'",
						new BeanPropertyRowMapper<Customer>(Customer.class));

		return list;
	}

	public List<Supplier> viewSupplier(String retailerName) {
		//
		List<Supplier> list = jdbcTemplate
				.query("SELECT * From supplier WHERE retailer_name='"+retailerName+"'",
						new BeanPropertyRowMapper<Supplier>(Supplier.class));
		return list;
	}

}
