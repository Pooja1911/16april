package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cg.model.Supplier;

@Repository()
@Qualifier("supplierDao")
public class SupplierDaoImpl implements ISupplierDao {
	@Autowired
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
