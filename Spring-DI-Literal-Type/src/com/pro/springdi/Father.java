package com.pro.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Father {

	public static void main(String[] args) {

		// creation of beans(object)
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Loaded");

		Myself myself = context.getBean("myself", Myself.class);
		System.out.println(myself);
		myself.displayMyselfInfo();

		
		  Myself mybrother = context.getBean("mybrother",Myself.class);
		  System.out.println(mybrother); 
		  mybrother.displayMyselfInfo();
		 

		Myself myself1 = context.getBean("myself1", Myself.class);
		System.out.println(myself1);
		myself1.displayMyselfInfo();
		
		Myself myid1 = context.getBean("myid1",Myself.class);
		System.out.println(myid1);
		myid1.displayMyselfInfo();
	}

}