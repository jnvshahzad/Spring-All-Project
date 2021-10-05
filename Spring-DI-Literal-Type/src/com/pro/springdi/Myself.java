package com.pro.springdi;

public class Myself {

	private int myId;
	private String myName;
	int count=0;
	Myself() {
		System.out.println("Myself class Object is created");
		++count;
	}
	
	public Myself(int myId) {
		this.myId = myId;
	}

	public Myself(int myId, String myName) {
		super();
		this.myId = myId;
		this.myName = myName;
	}

	public void setMyId(int myId) {
		this.myId = myId;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public void displayMyselfInfo() {
		System.out.println("My Id is " + myId + " and Name is " + myName);
		System.out.println(count);
	}
}
