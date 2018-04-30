package com.cg.service;

import com.cg.dao.ISupplierDao;
import com.cg.dao.SupplierDaoImpl;
import com.cg.model.Supplier;

public class SupplierServiceImpl implements ISupplierService{
     ISupplierDao supplierDao;
	/**
	 * @param supplierDao
	 */
	public SupplierServiceImpl(ISupplierDao supplierDao) {
		super();
		this.supplierDao = supplierDao;
	}

	public long addSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return supplierDao.addSupplier(supplier);
	}

	public long updateSupplier(long supplierId, float amount) {
		// TODO Auto-generated method stub
		return supplierDao.updateSupplier(supplierId, amount);
		
	}

	public long deleteSupplier(long supplierId) {
		// TODO Auto-generated method stub
		return supplierDao.deleteSupplier(supplierId);
	}
	

}
