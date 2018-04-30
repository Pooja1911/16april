package com.cg.dao;

import java.sql.Connection;
import java.sql.JDBCType;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.dbUtil.DbConnection;
import com.cg.model.Customer;
import com.cg.model.Retailer;

public class CustomerDaoImpl implements ICustomerDao {

	public CustomerDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	JdbcTemplate jdbcTemplate;

	public long addCustomer(Customer customer) {
		String query = "INSERT INTO customer VALUES('" + customer.getCustomerId() + "','" + customer.getCustomerName()
				+ "','" + customer.getCustomerAddress() + "','" + customer.getPaymentMode() + "','"
				+ customer.getRetailerName() + "')";

		jdbcTemplate.update(query);
		return customer.getCustomerId();
	}

	public long removeCustomer(long customerId) {
		// TODO Auto-generated method stub
		String query = "DELETE FROM customer WHERE customer_id='" + customerId + "'";
		return jdbcTemplate.update(query);

	}

	public long updateCustomer(String paymentMode, long customerId) {

		String query = "UPDATE customer SET payment_mode='" + paymentMode + "' WHERE customer_id='" + customerId + "'";
		return jdbcTemplate.update(query);
	}
}
