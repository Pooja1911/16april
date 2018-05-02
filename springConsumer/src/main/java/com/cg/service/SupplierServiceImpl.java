package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ISupplierDao;
import com.cg.dao.SupplierDaoImpl;
import com.cg.model.Supplier;

@Service("supplierService")
public class SupplierServiceImpl implements ISupplierService {
	@Autowired
	ISupplierDao supplierDao;

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
