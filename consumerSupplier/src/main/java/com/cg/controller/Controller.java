package com.cg.controller;

import java.util.Scanner;

import com.cg.model.Goods;
import com.cg.service.GoodsServiceImpl;
import com.cg.service.IGoodsService;

public class Controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan=new Scanner(System.in);
		IGoodsService goodsService=new GoodsServiceImpl();
		while(true)
		{
			System.out.println("Enter your choice");
		int choice=scan.nextInt();
		switch(choice)
		{
		case 1: System.out.println("Enter goods u want to enter");
	System.out.println("Enter goods name");
	String goodsName=scan.next();
	System.out.println("Enter goods quantity");
	long goodsQuantity=scan.nextLong();
	System.out.println("Enter goods price");
	float goodsPrice=scan.nextFloat();
	System.out.println("Enter supplier id");
	long supplierId=scan.nextLong();
	Goods goods=new Goods(goodsName,goodsQuantity,goodsPrice,supplierId);
	
	long goodsId=goodsService.addGoods(goods);
	break;
		case 2: System.out.println("Enter the id you want to remove");
		        goodsId=scan.nextLong();
		        goodsService.removeGoods(goodsId);
		        break;
		        
		case 3: System.out.println("Enter the data you want to update");
		        goodsPrice=scan.nextFloat();
		        System.out.println("Enter the id for which you want to update");
		        goodsId=scan.nextLong();
		        goodsService.update(goodsId, goodsPrice);
                break;		        
		        
		}
		
		
		
	}
	}
}
