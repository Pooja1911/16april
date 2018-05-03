package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IRetailerDao;
import com.cg.model.Customer;
import com.cg.model.Goods;
import com.cg.model.Supplier;

@Service("retailerService")
public class RetailerServiceImpl implements IRetailerService {
	@Autowired
	public IRetailerDao retailerDao;

	@Override
	public List<Goods> viewGoods(String retailerName) {
		// TODO Auto-generated method stub
		return retailerDao.viewGoods(retailerName);
	}

	@Override
	public List<Customer> viewCustomer(String retailerName) {
		// TODO Auto-generated method stub
		return retailerDao.viewCustomer(retailerName);
	}

	@Override
	public List<Supplier> viewSupplier(String retailerName) {
		// TODO Auto-generated method stub
		return retailerDao.viewSupplier(retailerName);
	}

}
