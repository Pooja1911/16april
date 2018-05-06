package com.cg.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.cg.config.ApplicationConfig;
import com.cg.service.CustomerServiceImpl;
import com.cg.service.GoodsServiceImpl;
import com.cg.service.ICustomerService;
import com.cg.service.IGoodsService;
import com.cg.service.IRetailerService;
import com.cg.service.ISupplierService;
import com.cg.service.RetailerServiceImpl;
import com.cg.service.SupplierServiceImpl;

public class ConsumerMain {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		  AbstractApplicationContext context = new AnnotationConfigApplicationContext(
				ApplicationConfig.class);
		 IGoodsService goodsService = context.getBean("goodsService",
				GoodsServiceImpl.class);
		 ICustomerService customerService = context.getBean("customerService",
				CustomerServiceImpl.class);
		 ISupplierService supplierService = context.getBean("supplierService",
				SupplierServiceImpl.class);
		IRetailerService retailerService = context.getBean("retailerService",
				RetailerServiceImpl.class);
context.close();
	}

}
