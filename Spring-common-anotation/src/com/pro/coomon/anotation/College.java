package com.pro.coomon.anotation;

import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College {
	
	public College() {
		System.out.println("College class object is created");
	}
	
	public void testClass() {
		System.out.println("Yes test is successfully..");
	}
}
