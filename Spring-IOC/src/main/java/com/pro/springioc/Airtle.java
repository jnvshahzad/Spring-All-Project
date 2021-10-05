package com.pro.springioc;

public class Airtle implements Sim {

	Airtle()
	{
		System.out.println("Airtle object is created by IOC Container");
	}
	@Override
	public void calling() {
		System.out.println("Calling using Airtle sim");
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using Airtle sim");
		
	}

}
