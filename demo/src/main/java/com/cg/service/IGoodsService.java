package com.cg.service;

import java.util.List;

import com.cg.model.Customer;
import com.cg.model.Goods;

public interface IGoodsService {
	public Goods addGoods(Goods goods);
	public List<Goods> retriveGoods();
	public Long updateGoods(Goods goods,Long id);
	public void deleteGoods(Long id);

}
