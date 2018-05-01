package com.cg.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.model.Supplier;

public class SupplierDaoImpl implements ISupplierDao {

	JdbcTemplate jdbcTemplate;

	public long addSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO supplier VALUES('"
				+ supplier.getSupplierId() + "','" + supplier.getSupplierName()
				+ "','" + supplier.getSupplierAddress() + "','"
				+ supplier.getQuantityOrder() + "','" + supplier.getOrderId()
				+ "','" + supplier.getAmount() + "','"
				+ supplier.getRetailerName() + "')";
		jdbcTemplate.update(query);
		return supplier.getSupplierId();
	}

	/**
	 * @param jdbcTemplate
	 */
	public SupplierDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public long updateSupplier(long supplierId, float amount) {
		String query = "UPDATE supplier SET amount='" + amount
				+ "' WHERE supplier_id='" + supplierId + "'";
		return jdbcTemplate.update(query);

	}

	public long deleteSupplier(long supplierId) {
		String query = "DELETE FROM supplier WHERE supplier_id='" + supplierId
				+ "'";
		return jdbcTemplate.update(query);

	}

}
