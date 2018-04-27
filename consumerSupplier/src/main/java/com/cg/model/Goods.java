package com.cg.model;

/**
 * Project Name: ConsumerSupplier
 * Project Description: this application is to perform various functions between a retailer and customer
 * Author Name: Pooja Jain
 *
 */
public class Goods {
	
	public long goodsId;
	public String goodsName;
	public long goodsQuantity;
	public float goodsPrice;
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
	

}
