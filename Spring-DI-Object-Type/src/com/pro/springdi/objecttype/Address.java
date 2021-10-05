package com.pro.springdi.objecttype;

public class Address {

	public Address() {
		super();
		System.out.println("Address class object");
	}

	private int streetNo;
	private String city;
	private String state;

	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getStreetNo() {
		return streetNo;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}
	
	
	
}
