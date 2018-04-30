package com.cg.dao;

import com.cg.model.Supplier;

public interface ISupplierDao {
	
	public long addSupplier(Supplier supplier);
	public long  updateSupplier(long supplierId,float amount);
	public  long deleteSupplier(long supplierId);
	 
}
