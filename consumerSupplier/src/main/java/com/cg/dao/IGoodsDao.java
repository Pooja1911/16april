package com.cg.dao;

import com.cg.model.Goods;

public interface IGoodsDao {
	
	public long addGoods(Goods goods);
	public void removeGoods(long goodsId);
	public void update(long goodsId,float price);
	

}
