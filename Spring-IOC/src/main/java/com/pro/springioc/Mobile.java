package com.pro.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		
		/* It is manually created object
		 * 
		 * Sim sim = new Vodaphone(); 
		 * sim.calling(); 
		 * sim.data();
		 */
		//Object is created which are configered in config file
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config file is loaded");
		
		// Get the object
		Sim sim = context.getBean("sim",Sim.class);
		System.out.println(sim);
		sim.calling();
		sim.data();
	}

}
