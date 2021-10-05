package com.pro.springLooseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student cheat = context.getBean("student",Student.class);
		System.out.println(cheat);
		cheat.displayCheat();
	}
}
