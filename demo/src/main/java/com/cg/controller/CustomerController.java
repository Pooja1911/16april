package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.Customer;
import com.cg.model.Goods;
import com.cg.model.Supplier;
import com.cg.service.ICustomerService;
import com.cg.service.IGoodsService;
import com.cg.service.ISupplierService;

@RestController
public class CustomerController {
 
	@Autowired
	ICustomerService customerService;
	@Autowired
	IGoodsService goodsService;
	@Autowired
	ISupplierService supplierService;
	@PostMapping("/customerCreate")
	public ResponseEntity<Customer> createCustomer(@RequestBody final Customer customer)
	{
		
		Customer cust=customerService.addCustomer(customer);
		return new ResponseEntity<Customer>(cust,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/customerRetrive")
	public ResponseEntity<List<Customer>> retrive()
	{
		List<Customer> list=customerService.retriveCustomer();
		return new ResponseEntity<List<Customer>>(list,HttpStatus.OK);
	}
	
	
	@PutMapping("/customerUpdate/{id}")
	public ResponseEntity<Long> customerUpdate(@RequestBody  Customer customer,@PathVariable(value="id") Long id)
	{
		Long customerId=customerService.updateCustomer(customer,id);
		return new ResponseEntity<Long>(customerId,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/customerDelete/{id}")
	public ResponseEntity<Void> customerDelete(@PathVariable Long id)
	{
		customerService.deleteCustomer(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	@GetMapping("/customerRetrive/{name}/{address}")
	public ResponseEntity <List<Customer>> retriveByName(@PathVariable(value="name") String customerName,@PathVariable(value="address") String customerAddress)
	{
		List<Customer> list=customerService.search(customerName,customerAddress);
		return new ResponseEntity<List<Customer>>(list,HttpStatus.OK);
	}
	
	
	@PostMapping("/goodsCreate")
	public ResponseEntity<Goods> createGoods(@RequestBody final Goods goods)
	{
		
		Goods good=goodsService.addGoods(goods);
		return new ResponseEntity<Goods>(good,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/goodsRetrive")
	public ResponseEntity<List<Goods>> retriveGoods()
	{
		List<Goods> list=goodsService.retriveGoods();
		return new ResponseEntity<List<Goods>>(list,HttpStatus.OK);
	}
	
	
	@PutMapping("/goodsUpdate/{id}")
	public ResponseEntity<Long> goodsUpdate(@RequestBody  Goods goods,@PathVariable(value="id") Long id)
	{
		Long goodsId=goodsService.updateGoods(goods,id);
		return new ResponseEntity<Long>(goodsId,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/goodsDelete/{id}")
	public ResponseEntity<Void> goodsDelete(@PathVariable Long id)
	{
		goodsService.deleteGoods(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	
	
	
	@PostMapping("/supplierCreate")
	public ResponseEntity<Supplier> createsupplier(@RequestBody final Supplier supplier)
	{
		
		Supplier supp=supplierService.addSupplier(supplier);
		return new ResponseEntity<Supplier>(supp,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/supplierRetrive")
	public ResponseEntity<List<Supplier>> retriveSupplier()
	{
		List<Supplier> list=supplierService.retriveSupplier();
		return new ResponseEntity<List<Supplier>>(list,HttpStatus.OK);
	}
	
	
	@PutMapping("/supplierUpdate/{id}")
	public ResponseEntity<Long> supplierUpdate(@RequestBody Supplier supplier,@PathVariable(value="id") Long id)
	{
		Long supplierId=supplierService.updateSupplier(supplier,id);
		return new ResponseEntity<Long>(supplierId,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/supplierDelete/{id}")
	public ResponseEntity<Void> supplierDelete(@PathVariable(value="id") Long id)
	{
	     supplierService.deleteSupplier(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	

}
