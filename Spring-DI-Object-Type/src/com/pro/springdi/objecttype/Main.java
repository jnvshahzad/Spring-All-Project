package com.pro.springdi.objecttype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		Student studentDetails_1 = context.getBean("studentDetails_1", Student.class);
		studentDetails_1.studentInfo();

		System.out.println();

		Student studentDetails_2 = context.getBean("studentDetails_2", Student.class);
		studentDetails_2.studentInfo();

	}

}
