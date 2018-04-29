package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.cg.model.Supplier;

public class SupplierDaoImpl implements ISupplierDao {
	Connection connection=null;
	PreparedStatement preparedStatment=null;
	ResultSet resultSet=null;

	public long addSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void updateSupplier(long supplierId, float amount) {
		// TODO Auto-generated method stub
		
	}

	public void deleteSupplier(long supplierId) {
		// TODO Auto-generated method stub
		
	}

}
