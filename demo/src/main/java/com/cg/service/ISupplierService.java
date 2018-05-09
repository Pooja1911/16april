package com.cg.service;

import java.util.List;

import com.cg.model.Goods;
import com.cg.model.Supplier;

public interface ISupplierService {
	public Supplier addSupplier(Supplier supplier);
	public List<Supplier> retriveSupplier();
	public Long updateSupplier(Supplier supplier,Long id);
	public void deleteSupplier(Long id);

}
