package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.dao.SupplierRepository;
import com.cg.model.Supplier;
@Service("supplierService")
public class SupplierServiceImpl implements ISupplierService {

	@Autowired
	public SupplierRepository supplierRepository;
	@Override
	public Supplier addSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		return supplierRepository.save(supplier);
	}

	@Override
	public List<Supplier> retriveSupplier() {
		// TODO Auto-generated method stub
		return supplierRepository.findAll();
	}

	@Override
	public Long updateSupplier(Supplier supplier, Long id) {
		// TODO Auto-generated method stub
		Optional<Supplier> suppliers=supplierRepository.findById(id);
		if(suppliers.isPresent())
		{
			Supplier supp=supplierRepository.getOne(id);
			if(supplier.getQuantityOrder()!=0)
			{
				supp.setQuantityOrder(supplier.getQuantityOrder());
			}
			 supplierRepository.save(supp);
		}
		
		
		return id;
	}

	@Override
	public void deleteSupplier(Long id) {
		// TODO Auto-generated method stub
		Optional<Supplier> suppliers=supplierRepository.findById(id);
		if(suppliers.isPresent())
		{
			supplierRepository.deleteById(id);
		}
		
	}

}
