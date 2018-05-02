package com.cg.model;
/**
 * Project Name: ConsumerSupplier
 * Project Description: this application is to perform various functions between a retailer and customer
 * Author Name: Pooja Jain
 *
 */
public class Goods {
	
	public long goodsId;//goods_id
	public String goodsName;
	public long goodsQuantity;
	public float goodsPrice;
	public long SupplierId;
	
	
	/**
	 * @param goodsId
	 * @param goodsName
	 * @param goodsQuantity
	 * @param goodsPrice
	 * @param supplierId
	 */
	public Goods(long goodsId, String goodsName, long goodsQuantity, float goodsPrice, long supplierId) {
		super();
		this.goodsId = goodsId;
		this.goodsName = goodsName;
		this.goodsQuantity = goodsQuantity;
		this.goodsPrice = goodsPrice;
		SupplierId = supplierId;
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
	/**
	 * method name: getGoodsId
	 * method description: to get the goods id
	 */
	public long getGoodsId() {
		return goodsId;
	}
	/**
	 * method name: setGoodsId(long)
	 * method description: to set the goods id
	 */
	public void setGoodsId(long goodsId) {
		this.goodsId = goodsId;
	}
	/**
	 * method name: getGoodsName
	 * method description: to get the goods name
	 */
	public String getGoodsName() {
		return goodsName;
	}
	/**
	 * method name: setGoodsName(String)
	 * method description: to set the goods name
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	/**
	 * method name: getGoodsQuantity
	 * method description: to get the goods quantity
	 */
	public long getGoodsQuantity() {
		return goodsQuantity;
	}
	/**
	 * method name: setGoodsQuantity(long)
	 * method description: to get the goods id
	 */
	public void setGoodsQuantity(long goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}
	/**
	 * method name: getGoodsPrice
	 * method description: to get the goods price
	 */
	public float getGoodsPrice() {
		return goodsPrice;
	}
	/**
	 * method name: setGoodsPrice(float)
	 * method description: to set the goods price
	 */
	public void setGoodsPrice(float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (goodsId ^ (goodsId >>> 32));
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
		Goods other = (Goods) obj;
		if (goodsId != other.goodsId)
			return false;
		return true;
	}
	
public Goods() {
	// TODO Auto-generated constructor stub
}
}
