package com.cg.dao;

public interface IQueryMapper {
	public static final String INSERT_GOODS="INSERT INTO goods VALUES(?,?,?,?,?)";
	public static final String goods_ID_QUERY_SEQUENCE="SELECT goodsID_seq.NEXTVAL FROM DUAL";
	public static final String DELETE__GOODS_QUERY="DELETE FROM goods WHERE goods_id=?";
	public static final String UPDATE_GOODS_QUERY="UPDATE goods SET goods_price=? WHERE goods_id=? ";
	public static final String INSERT_CUSTOMER="INSERT INTO customer VALUES(?,?,?,?,?)";
	public static final String customer_ID_QUERY_SEQUENCE="SELECT customerID_seq.NEXTVAL FROM DUAL";
	public static final String DELETE_CUSTOMER_QUERY="DELETE FROM customer WHERE customer_id=?";
	public static final String UPDATE_CUSTOMER_QUERY="UPDATE FROM customer SET payment_mode=? WHERE customer_id=?";
	public static final String INSERT_SUPPLIER="INSERT INTO supplier VALUES(?,?,?,?,?,?,?)";
	public static final String DELETE_SUPPLIER="DELETE FROM supplier WHERE supplier_id=?";
	public static final String UPDATE_SUPPLIER="UPDATE FROM supplier SET amount=? WHERE supplier_id=?";
	public static final String supplier_ID_QUERY_SEQUENCE="SELECT supplierID_seq.NEXTVAL FROM DUAL";
	z


}
