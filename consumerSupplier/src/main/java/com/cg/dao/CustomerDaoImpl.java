package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.dbUtil.DbConnection;
import com.cg.model.Customer;

public class CustomerDaoImpl implements ICustomerDao{
	Connection connection=null;
	PreparedStatement preparedStatment=null;
	ResultSet resultSet=null;

	public long addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		long sequence=0;
		int queryResult=0;
		try {
			connection=DbConnection.getdbConnection();
			preparedStatment=connection.prepareStatement(IQueryMapper.customer_ID_QUERY_SEQUENCE);
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
				preparedStatment=connection.prepareStatement(IQueryMapper.INSERT_CUSTOMER);
				preparedStatment.setLong(1,sequence);
				preparedStatment.setString(2,customer.getCustomerName());
				preparedStatment.setString(3, customer.getCustomerAddress());
				preparedStatment.setString(4,customer.getPaymentMode());
				preparedStatment.setString(5, customer.getRetailerName());
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

	public void removeCustomer(long customerId) {
		// TODO Auto-generated method stub
		
		
		int deleteQuery=0;
		try {
			connection=preparedStatment.getConnection();
			preparedStatment=connection.prepareStatement(IQueryMapper.DELETE_CUSTOMER_QUERY);
            preparedStatment.setLong(1, customerId);
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

	public void updateCustomer(String paymentMode, long customerId) {
		// TODO Auto-generated method stub
			int updateQuery=0;
			try {
				connection=preparedStatment.getConnection();
				preparedStatment=connection.prepareStatement(IQueryMapper.UPDATE_CUSTOMER_QUERY);
				preparedStatment.setLong(1, customerId);
				preparedStatment.setString(2,paymentMode);
				
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
