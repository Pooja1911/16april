package com.cg.service;

import com.cg.dao.GoodsDaoImpl;
import com.cg.dao.IGoodsDao;
import com.cg.model.Goods;

public class GoodsServiceImpl implements IGoodsService {
 public IGoodsDao goodsDao=new GoodsDaoImpl();
	public long addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsDao.addGoods(goods);
	}

	public void removeGoods(long goodsId) {
		// TODO Auto-generated method stub
		goodsDao.removeGoods(goodsId);
	}

	public void update(long goodsId, float price) {
		// TODO Auto-generated method stub
		goodsDao.update(goodsId, price);
	}

}
