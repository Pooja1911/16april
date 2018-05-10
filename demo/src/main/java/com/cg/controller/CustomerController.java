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

import com.cg.Exception.ConsumerException;
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
	public ResponseEntity<?> createCustomer(@RequestBody final Customer customer) {

		Customer cust;
		try {
			cust = customerService.addCustomer(customer);
			return new ResponseEntity<Customer>(cust, HttpStatus.CREATED);
		} catch (ConsumerException e) {
			// TODO Auto-generated catch block
			String msg = e.getMessage();
			System.out.println("EXP MSG: " + msg);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		}

	}

	@GetMapping("/customerRetrive")
	public ResponseEntity<?> retrive() {
		List<Customer> list;
		try {
			list = customerService.retriveCustomer();
			return new ResponseEntity<List<Customer>>(list, HttpStatus.OK);
		} catch (ConsumerException e) {
			// TODO Auto-generated catch block
			String msg = e.getMessage();
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		}

	}

	@PutMapping("/customerUpdate/{id}")
	public ResponseEntity<?> customerUpdate(@RequestBody final Customer customer,
			@PathVariable(value = "id") final Long id) {
		Long customerId;
		try {
			customerId = customerService.updateCustomer(customer, id);
			return new ResponseEntity<Long>(customerId, HttpStatus.OK);
		} catch (ConsumerException e) {
			// TODO Auto-generated catch block
			String msg = e.getMessage();
			return new ResponseEntity<String>(msg, HttpStatus.OK);

		}

	}

	@DeleteMapping("/customerDelete/{id}")
	public ResponseEntity<?> customerDelete(@PathVariable final Long id) {
		try {
			customerService.deleteCustomer(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} catch (ConsumerException e) {
			// TODO Auto-generated catch block
			String msg = e.getMessage();
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		}

	}

	@GetMapping("/customerRetrive/{name}/{address}")
	public ResponseEntity<?> retriveByName(@PathVariable(value = "name") final String customerName,
			@PathVariable(value = "address") final String customerAddress) {
		List<Customer> list;
		try {
			list = customerService.search(customerName, customerAddress);
			return new ResponseEntity<List<Customer>>(list, HttpStatus.OK);
		} catch (ConsumerException e) {
			// TODO Auto-generated catch block
			String msg = e.getMessage();

			return new ResponseEntity<String>(msg, HttpStatus.OK);
		}
	}
	
	
@PutMapping("/customerupdate")
public ResponseEntity<?> multipleupdate(@RequestBody final List<Customer> customer)
{
	try {
		List<Customer> list=customerService.updateMultipleCustomer(customer);
		return new ResponseEntity<List<Customer>>(list, HttpStatus.OK);
	} catch (ConsumerException e) {
		// TODO Auto-generated catch block
		
		return new ResponseEntity<>( HttpStatus.OK);
	}
}

	@PostMapping("/goodsCreate")
	public ResponseEntity<Goods> createGoods(@RequestBody final Goods goods) {

		Goods good = goodsService.addGoods(goods);
		return new ResponseEntity<Goods>(good, HttpStatus.CREATED);
	}

	@GetMapping("/goodsRetrive")
	public ResponseEntity<List<Goods>> retriveGoods() {
		List<Goods> list = goodsService.retriveGoods();
		return new ResponseEntity<List<Goods>>(list, HttpStatus.OK);
	}

	@PutMapping("/goodsUpdate/{id}")
	public ResponseEntity<Long> goodsUpdate(@RequestBody final Goods goods, @PathVariable(value = "id") final Long id) {
		Long goodsId = goodsService.updateGoods(goods, id);
		return new ResponseEntity<Long>(goodsId, HttpStatus.OK);
	}

	@DeleteMapping("/goodsDelete/{id}")
	public ResponseEntity<Void> goodsDelete(@PathVariable final Long id) {
		goodsService.deleteGoods(id);
		return new ResponseEntity<Void>(HttpStatus.OK);

	}

	@PostMapping("/supplierCreate")
	public ResponseEntity<Supplier> createsupplier(@RequestBody final Supplier supplier) {

		Supplier supp = supplierService.addSupplier(supplier);
		return new ResponseEntity<Supplier>(supp, HttpStatus.CREATED);

	}

	@GetMapping("/supplierRetrive")
	public ResponseEntity<List<Supplier>> retriveSupplier() {
		List<Supplier> list = supplierService.retriveSupplier();
		return new ResponseEntity<List<Supplier>>(list, HttpStatus.OK);
	}

	@PutMapping("/supplierUpdate/{id}")
	public ResponseEntity<Long> supplierUpdate(@RequestBody final Supplier supplier,
			@PathVariable(value = "id") final Long id) {
		Long supplierId = supplierService.updateSupplier(supplier, id);
		return new ResponseEntity<Long>(supplierId, HttpStatus.OK);
	}

	@DeleteMapping("/supplierDelete/{id}")
	public ResponseEntity<Void> supplierDelete(@PathVariable(value = "id") final Long id) {
		supplierService.deleteSupplier(id);
		return new ResponseEntity<Void>(HttpStatus.OK);

	}

}
