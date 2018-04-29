package com.cg.dao;

import com.cg.model.Supplier;

public interface ISupplierDao {
	
	public long addSupplier(Supplier supplier);
	public void updateSupplier(long supplierId,float amount);
	public void deleteSupplier(long supplierId);

}
