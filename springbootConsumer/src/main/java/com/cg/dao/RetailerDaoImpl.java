package com.cg.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cg.model.Customer;
import com.cg.model.Goods;
import com.cg.model.Supplier;

@Repository()
@Qualifier("retailerDao")
public class RetailerDaoImpl implements IRetailerDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Goods> viewGoods(String retailerName) {
		// TODO Auto-generated method stub
		List<Goods> list = (List<Goods>) jdbcTemplate
				.query("SELECT * FROM goods where supplier_id=(SELECT supplier_id FROM supplier WHERE retailer_name  = '"
						+ retailerName + "' ", new Object[] { retailerName },
						new BeanPropertyRowMapper<Goods>(Goods.class));
		return list;
	}

	public List<Customer> viewCustomer(String retailerName) {
		// TODO Auto-generated method stub
		List<Customer> list = (List<Customer>) jdbcTemplate.query(
				"SELECT * FROM customer where retailer_name  = '"
						+ retailerName + "' ", new Object[] { retailerName },
				new BeanPropertyRowMapper<Customer>(Customer.class));
		return list;
	}

	public List<Supplier> viewSupplier(String retailerName) {
		// TODO Auto-generated method stub
		List<Supplier> list = null;
		list = (List<Supplier>) jdbcTemplate.query(
				"SELECT * FROM supplier where retailer_name  = '"
						+ retailerName + "' ", new Object[] { retailerName },
				new RowMapper<Supplier>() {
					public Supplier mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Supplier supplier = new Supplier();

						supplier.setSupplierId(rs.getLong("supplier_id"));
						supplier.setSupplierName(rs.getString("supplier_name"));
						supplier.setSupplierAddress(rs
								.getString("supplier_address"));
						supplier.setQuantityOrder(rs.getLong("quantity_order"));
						supplier.setOrderId(rs.getLong("order_id"));
						supplier.setAmount(rs.getFloat("amount"));
						// list.add(supplier);
						return supplier;

					}
				});
		// list.addAll(list);

		return list;
	}

}
