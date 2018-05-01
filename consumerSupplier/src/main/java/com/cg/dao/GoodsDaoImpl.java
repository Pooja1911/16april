package com.cg.dao;

import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cg.model.Goods;

public class GoodsDaoImpl implements IGoodsDao{
    
	JdbcTemplate jdbcTemplate;
	/**
	 * @param jdbcTemplate
	 */
	public GoodsDaoImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public long addGoods(Goods goods) {
		
		String query="INSERT INTO goods VALUES('"+goods.getGoodsId()+"','"+goods.getGoodsName()+"','"+goods.getGoodsQuantity()+"','"+goods.getGoodsPrice()+"','"+goods.getSupplierId()+"')";
	     jdbcTemplate.update(query);
	     return goods.goodsId;
	}

	public long removeGoods(long goodsId)
	{
	String query="DELETE FROM goods WHERE goods_id='"+goodsId+"'";	
    return jdbcTemplate.update(query);		
		
	}

	public long update(long goodsId, float price)
	{
		String query="UPDATE goods SET goods_price='"+price+"' WHERE goods_id='"+goodsId+"'";
		return jdbcTemplate.update(query);
		
	}

}
