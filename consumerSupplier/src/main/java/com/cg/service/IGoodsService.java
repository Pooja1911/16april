package com.cg.service;

import com.cg.model.Goods;

public interface IGoodsService {
	public long addGoods(Goods goods);
	public long removeGoods(long goodsId);
	public long update(long goodsId,float price);

}
