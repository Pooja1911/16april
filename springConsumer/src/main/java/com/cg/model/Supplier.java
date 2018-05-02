package com.cg.model;

import java.util.List;

public class Supplier {
	public long supplierId;//supplier_id
	public String supplierName;
	public String supplierAddress;
	public long quantityOrder;
	public long orderId;
	public float amount;
	public String retailerName;

	/**
	 * method name: getSupplierId method description to get the supplier id
	 */
	public long getSupplierId() {
		return supplierId;
	}

	public Supplier() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param supplierId
	 * @param supplierName
	 * @param supplierAddress
	 * @param quantityOrder
	 * @param orderId
	 * @param amount
	 * @param retailerName
	 */
	public Supplier(long supplierId, String supplierName,
			String supplierAddress, long quantityOrder, long orderId,
			float amount, String retailerName) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierAddress = supplierAddress;
		this.quantityOrder = quantityOrder;
		this.orderId = orderId;
		this.amount = amount;
		this.retailerName = retailerName;
	}
	

	/**
	 * method name: getSupplierId method description to get the supplier id
	 */
	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}

	/**
	 * method name: getSupplierName method description: to get supplier name
	 */
	public String getSupplierName() {
		return supplierName;
	}

	/**
	 * method name: setSupplierName(String) method description to set the name
	 * of supplier
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public long getQuantityOrder() {
		return quantityOrder;
	}

	/**
	 * method name: setQuantityOrder()long method description to set quantity of
	 * good to order
	 */
	public void setQuantityOrder(long quantityOrder) {
		this.quantityOrder = quantityOrder;
	}

	/**
	 * method name: getOrderId method description to get the order id
	 */
	public long getOrderId() {
		return orderId;
	}

	/**
	 * method name: setOderId(long) method description : to set order id
	 */
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	/**
	 * method name: getAmount method description to get the amount of goods
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * method name: setAmount(float) method description: to set the amount of
	 * goods
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
	 * @param supplierAddress
	 *            the supplierAddress to set
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
	 * @param retailerName
	 *            the retailerName to set
	 */
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (supplierId ^ (supplierId >>> 32));
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Supplier other = (Supplier) obj;
		if (supplierId != other.supplierId)
			return false;
		return true;
	}

}
