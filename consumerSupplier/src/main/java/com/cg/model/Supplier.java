package com.cg.model;

import java.util.List;

public class Supplier {
	public  long supplierId;
	public String supplierName;
	public String  supplierAddress;
	public long quantityOrder;
	public long orderId;
	public float amount;
	public String retailerName;
	/**
	 * method name: getSupplierId
	 * method description to get the supplier id
	 */
	public long getSupplierId() {
		return supplierId;
	}
	
	/**
	 * method name: getSupplierId
	 * method description to get the supplier id
	 */
	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}
	/**
	 * method name: getSupplierName
	 * method description: to get supplier name
	 */
	public String getSupplierName() {
		return supplierName;
	}
	/**
	 * method name: setSupplierName(String)
	 * method description to set the name of supplier
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public long getQuantityOrder() {
		return quantityOrder;
	}
	/**
	 * method name: setQuantityOrder()long
	 * method description to set quantity of good to order
	 */
	public void setQuantityOrder(long quantityOrder) {
		this.quantityOrder = quantityOrder;
	}
	/**
	 * method name: getOrderId
	 * method description to get the order id
	 */
	public long getOrderId() {
		return orderId;
	}
	/**
	 * method name: setOderId(long)
	 * method description : to set order id
	 */
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	/**
	 * method name: getAmount
	 * method description to get the amount of goods
	 */
	public float getAmount() {
		return amount;
	}
	/**
	 * method name: setAmount(float)
	 * method description: to set the amount of goods
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}

	/**
	 * @return the supplierAddress
	 */
	public String getSupplierAddress() {
		return supplierAddress;
	}

	/**
	 * @param supplierAddress the supplierAddress to set
	 */
	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	/**
	 * @return the retailerName
	 */
	public String getRetailerName() {
		return retailerName;
	}

	/**
	 * @param retailerName the retailerName to set
	 */
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}
	
}
