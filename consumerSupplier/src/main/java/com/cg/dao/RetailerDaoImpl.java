package com.cg.dao;


import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.cg.model.Customer;
import com.cg.model.Goods;
import com.cg.model.Supplier;

public class RetailerDaoImpl implements IRetailerDao {
	JdbcTemplate jdbcTemplate;

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
				.query("SELECT g.goods_id,g.goods_name,g.goods_quantity,g.goods_price from goods g,supplier s where supplier_id=(SELECT s.supplier_id from supplier s,retailer r where retailer_name='"+retailerName+"'",
						new BeanPropertyRowMapper<Goods>(Goods.class));
		return list;
	}

	public List<Customer> viewCustomer(String retailerName) {
		// TODO Auto-generated method stub
		// String
		// query="SELECT customer.customer_id,customer.customer_name,customer.customer_address,customer.payment_mode FROM customer INNER JOIN retailer ON customer.retailer_name=retailer.retailer_name";
		List<Customer> list = jdbcTemplate
				.query("SELECT c.customer_id,c.customer_name,c.customer_address,c.payment_mode from customer c,retailer r WHERE retailer_name='"+retailerName+"'",
						new BeanPropertyRowMapper<Customer>(Customer.class));

		return list;
	}

	public List<Supplier> viewSupplier(String retailerName) {
		//
		List<Supplier> list = jdbcTemplate
				.query("SELECT s.supplier_id,s.supplier_name,s.supplier_address,s.quantity_order,s.order_id,s.amount FROM supplier s,retailer r WHERE retailer_name='"+retailerName+"'",
						new BeanPropertyRowMapper<Supplier>(Supplier.class));
		return list;
	}

}
