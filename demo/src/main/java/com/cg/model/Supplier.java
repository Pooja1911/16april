package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="supplier")
@Entity
public class Supplier {
	@Id
	@SequenceGenerator(name="seq1", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq1")
	@Column(name="supplier_id")
	public long supplierId;
	@Column(name="supplier_name")
	public String supplierName;
	@Column(name="supplier_address")
	public String supplierAddress;
	@Column(name="quantity_order")
	public long quantityOrder;
	@Column(name="order_id")
	public long orderId;
	@Column(name="amount")
	public float amount;
	@Column(name="retailer_name")
	public String retailerName;
	/**
	 * @return the supplierId
	 */
	public long getSupplierId() {
		return supplierId;
	}
	/**
	 * @param supplierId the supplierId to set
	 */
	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}
	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}
	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
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
	 * @return the quantityOrder
	 */
	public long getQuantityOrder() {
		return quantityOrder;
	}
	/**
	 * @param quantityOrder the quantityOrder to set
	 */
	public void setQuantityOrder(long quantityOrder) {
		this.quantityOrder = quantityOrder;
	}
	/**
	 * @return the orderId
	 */
	public long getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the amount
	 */
	public float getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(float amount) {
		this.amount = amount;
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
   public Supplier() {
	// TODO Auto-generated constructor stub
}
}
