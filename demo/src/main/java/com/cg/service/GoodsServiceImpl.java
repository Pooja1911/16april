package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.CustomerRepository;
import com.cg.dao.GoodsRepository;
import com.cg.model.Goods;
@Service("goodsService")
public class GoodsServiceImpl implements IGoodsService{
   @Autowired
   public GoodsRepository goodsRepository; 
	@Override
	public Goods addGoods(Goods goods) {
		// TODO Auto-generated method stub
		return goodsRepository.save(goods);
	}

	@Override
	public List<Goods> retriveGoods() {
		// TODO Auto-generated method stub
		return goodsRepository.findAll();
	}

	@Override
	public Long updateGoods(Goods goods, Long id) {
		// TODO Auto-generated method stub
		Optional<Goods> good=goodsRepository.findById(id);
		if(good.isPresent())
		{
			Goods myGoods=goodsRepository.getOne(id);
			if(goods.getGoodsName()!=null)
			{
				myGoods.setGoodsName(goods.getGoodsName());
			}
			if(goods.getGoodsPrice()!=0)
			{
				myGoods.setGoodsPrice(goods.getGoodsPrice());
			}
			if(goods.getGoodsQuantity()!=0)
			{
				myGoods.setGoodsQuantity(goods.getGoodsQuantity());
			}
			if(goods.getSupplierId()!=0)
			{
				myGoods.setSupplierId(goods.getSupplierId());
			}
		}
		return id;
	}

	@Override
	public void deleteGoods(Long id) {
		// TODO Auto-generated method stub
		Optional<Goods> goods=goodsRepository.findById(id);
		if(goods.isPresent())
		{
			goodsRepository.deleteById(id);
		}
	}

}
