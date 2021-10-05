package com.pro.spring.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilConnection {
	
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/world";
	String user="shahzad";
	String password="root";
	
	Connection connection=null;
	
	public Connection getConnection() throws ClassNotFoundException, SQLException
	{
		Class.forName(driver);
		connection = DriverManager.getConnection(url, user, password);
		return connection;
	}
}
