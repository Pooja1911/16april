package com.cg.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cg.model.Customer;

@Repository
@Qualifier("customerDao")
public class CustomerDaoImpl implements ICustomerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public long addCustomer(Customer customer) {
		final String query = "INSERT INTO customer VALUES('"
				+ customer.getCustomerId() + "','" + customer.getCustomerName()
				+ "','" + customer.getCustomerAddress() + "','"
				+ customer.getPaymentMode() + "','"
				+ customer.getRetailerName() + "')";

		jdbcTemplate.update(query);
		return customer.getCustomerId();
	}

	public long removeCustomer(long customerId) {
		// TODO Auto-generated method stub
		final String query = "DELETE FROM customer WHERE customer_id='" + customerId
				+ "'";
		return jdbcTemplate.update(query);

	}

	public long updateCustomer(String paymentMode, long customerId) {

	final	String query = "UPDATE customer SET payment_mode='" + paymentMode
				+ "' WHERE customer_id='" + customerId + "'";
		return jdbcTemplate.update(query);
	}
}
