package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.GoodsDaoImpl;
import com.cg.dao.IGoodsDao;
import com.cg.model.Goods;

@Service("goodsService")
public class GoodsServiceImpl implements IGoodsService {
	@Autowired
	public IGoodsDao goodsDao;

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
