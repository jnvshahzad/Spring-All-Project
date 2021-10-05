package com.pro.spring.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class City {

	public City() {
		System.out.println("City class object is created");
	}

	private int cityId;
	private String cityName;
	private String countryCode;
	private String district;
	private int population;

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public void fetchCityDetails() throws ClassNotFoundException, SQLException {
		String query = "select * from city limit 5";
		JDBCUtilConnection con = new JDBCUtilConnection();
		Connection connection = con.getConnection();
		System.out.println(connection);

		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(query);
		while (rs.next()) {
			cityId = rs.getInt(1);
			cityName = rs.getString(2);
			district = rs.getString(3);
			countryCode = rs.getString(4);
			population = rs.getInt(5);
			System.out.println(cityId + " " + cityName + " " + district + " " + countryCode + " " + population);
		}

	}

}
