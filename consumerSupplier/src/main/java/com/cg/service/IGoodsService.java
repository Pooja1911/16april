package com.cg.service;

import com.cg.model.Goods;

public interface IGoodsService {
	public long addGoods(Goods goods);
	public void removeGoods(long goodsId);
	public void update(long goodsId,float price);

}
