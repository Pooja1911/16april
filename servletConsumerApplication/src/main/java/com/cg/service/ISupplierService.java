package com.cg.service;

import com.cg.model.Supplier;

public interface ISupplierService {
	public long addSupplier(Supplier supplier);

	public long updateSupplier(long supplierId, float amount);

	public long deleteSupplier(long supplierId);
}
