package com.cg.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cg.model.Goods;

@Repository()
@Qualifier("goodsDao")
public class GoodsDaoImpl implements IGoodsDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public long addGoods(Goods goods) {

		final String query = "INSERT INTO goods VALUES('" + goods.getGoodsId()
				+ "','" + goods.getGoodsName() + "','"
				+ goods.getGoodsQuantity() + "','" + goods.getGoodsPrice()
				+ "','" + goods.getSupplierId() + "')";
		jdbcTemplate.update(query);
		return goods.goodsId;
	}

	public long removeGoods(long goodsId) {
		final String query = "DELETE FROM goods WHERE goods_id='" + goodsId + "'";
		return jdbcTemplate.update(query);

	}

	public long update(long goodsId, float price) {
		final String query = "UPDATE goods SET goods_price='" + price
				+ "' WHERE goods_id='" + goodsId + "'";
		return jdbcTemplate.update(query);

	}

}
