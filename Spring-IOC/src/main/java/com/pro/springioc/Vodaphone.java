package com.pro.springioc;

public class Vodaphone implements Sim {

	@Override
	public void calling() {
		System.out.println("Calling using Vodaphone sim");
	}

	@Override
	public void data() {
		System.out.println("Browsing internet using Vodaphone sim");
		
	}

}
