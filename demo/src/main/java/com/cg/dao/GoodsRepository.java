package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Goods;

public interface GoodsRepository extends JpaRepository<Goods,Long>{

}
