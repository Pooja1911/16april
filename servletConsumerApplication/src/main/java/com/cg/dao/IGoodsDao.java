package com.cg.dao;

import com.cg.model.Goods;

public interface IGoodsDao {

	public long addGoods(Goods goods);

	public long removeGoods(long goodsId);

	public long update(long goodsId, float price);

}
