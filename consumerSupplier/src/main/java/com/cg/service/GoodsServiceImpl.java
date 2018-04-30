package com.cg.service;

import com.cg.dao.GoodsDaoImpl;
import com.cg.dao.IGoodsDao;
import com.cg.model.Goods;

public class GoodsServiceImpl implements IGoodsService {
 public IGoodsDao goodsDao;
	/**
 * @param goodsDao
 */
public GoodsServiceImpl(IGoodsDao goodsDao) {
	super();
	this.goodsDao = goodsDao;
}

	public long addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsDao.addGoods(goods);
	}

	public long removeGoods(long goodsId) {
		// TODO Auto-generated method stub
		return goodsDao.removeGoods(goodsId);
	}

	public long update(long goodsId, float price) {
		// TODO Auto-generated method stub
		return goodsDao.update(goodsId, price);
	}

}
