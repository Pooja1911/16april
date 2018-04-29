package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.dbUtil.DbConnection;
import com.cg.model.Goods;

public class GoodsDaoImpl implements IGoodsDao{
    Connection connection=null;
	PreparedStatement preparedStatment=null;
	ResultSet resultSet=null;
	public long addGoods(Goods goods) {
		// TODO Auto-generated method stub
		long sequence=0;
		int queryResult=0;
		try {
			connection=DbConnection.getdbConnection();
			preparedStatment=connection.prepareStatement(IQueryMapper.goods_ID_QUERY_SEQUENCE);
			resultSet=preparedStatment.executeQuery();
			if(resultSet.next())
			{
				sequence=resultSet.getLong(1);
			}
			else
			{
				sequence=0;
			}
			if(sequence!=0){
				preparedStatment=connection.prepareStatement(IQueryMapper.INSERT_GOODS);
				preparedStatment.setLong(1,sequence);
				preparedStatment.setString(2,goods.getGoodsName());
				preparedStatment.setLong(3, goods.getGoodsQuantity());
				preparedStatment.setFloat(4,goods.getGoodsPrice());
				preparedStatment.setLong(5, goods.getSupplierId());
				queryResult=preparedStatment.executeUpdate();
				if(queryResult==0)
				{
					System.out.println("insertion failed");
					
				}
				else
				{
					System.out.println("Insertion done");
				
				}
				//return sequence;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return sequence;
	}

	public void removeGoods(long goodsId) {
		// TODO Auto-generated method stub
		int deleteQuery=0;
		try {
			connection=preparedStatment.getConnection();
			preparedStatment=connection.prepareStatement(IQueryMapper.DELETE__GOODS_QUERY);
           preparedStatment.setLong(1, goodsId);
			deleteQuery=preparedStatment.executeUpdate();
            if(deleteQuery==0)
            {
            	System.out.println("Deletion is not done");
            }
            else
            {
            	System.out.println("Deletion is done");
            }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	public void update(long goodsId, float price) {
		// TODO Auto-generated method stub
		int updateQuery=0;
		try {
			connection=preparedStatment.getConnection();
			preparedStatment=connection.prepareStatement(IQueryMapper.UPDATE_GOODS_QUERY);
			preparedStatment.setLong(1, goodsId);
			preparedStatment.setFloat(2,price);
			
		    updateQuery=preparedStatment.executeUpdate();
			if(updateQuery==0)
			{
				System.out.println("not updated");
			}else
			{
				System.out.println("Data is updated");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
