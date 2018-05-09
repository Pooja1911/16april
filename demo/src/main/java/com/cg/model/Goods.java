package com.cg.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Table(name="goods")
@Entity
public class Goods {
	@Id
	@SequenceGenerator(name="seq", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@Column(name="goods_id")
	long goodsId;
	@Column(name="goods_name")
	public String goodsName;
	@Column(name="goods_quantity")
	public long goodsQuantity;
	@Column(name="goods_price")
	public float goodsPrice;
	@Column(name="supplier_id")
	public long SupplierId;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Goods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsQuantity=" + goodsQuantity
				+ ", goodsPrice=" + goodsPrice + ", SupplierId=" + SupplierId + "]";
	}
	/**
	 * @return the goodsId
	 */
	public long getGoodsId() {
		return goodsId;
	}
	/**
	 * @param goodsId the goodsId to set
	 */
	public void setGoodsId(long goodsId) {
		this.goodsId = goodsId;
	}
	/**
	 * @return the goodsName
	 */
	public String getGoodsName() {
		return goodsName;
	}
	/**
	 * @param goodsName the goodsName to set
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	/**
	 * @return the goodsQuantity
	 */
	public long getGoodsQuantity() {
		return goodsQuantity;
	}
	/**
	 * @param goodsQuantity the goodsQuantity to set
	 */
	public void setGoodsQuantity(long goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}
	/**
	 * @return the goodsPrice
	 */
	public float getGoodsPrice() {
		return goodsPrice;
	}
	/**
	 * @param goodsPrice the goodsPrice to set
	 */
	public void setGoodsPrice(float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	/**
	 * @return the supplierId
	 */
	public long getSupplierId() {
		return SupplierId;
	}
	/**
	 * @param supplierId the supplierId to set
	 */
	public void setSupplierId(long supplierId) {
		SupplierId = supplierId;
	}
public Goods() {
	// TODO Auto-generated constructor stub
}
}
