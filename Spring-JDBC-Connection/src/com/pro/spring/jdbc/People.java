package com.pro.spring.jdbc;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class People {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		JDBCUtilConnection con = context.getBean("con",JDBCUtilConnection.class);
		City city = context.getBean("city", City.class);
		System.out.println(city);
		System.out.println("Connection ="+con.getConnection());
		city.fetchCityDetails();
		
	}

}
