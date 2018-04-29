package com.cg.dbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	private static Connection connection=null;
	public static Connection getdbConnection() throws SQLException{
		connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","anjali");
		return connection;
}
}
