package com.demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {
	public static void main(String a[]) {
		@SuppressWarnings("resource")
		final ApplicationContext context  =new ClassPathXmlApplicationContext("NewFile.xml");
		Student s = (Student)context.getBean("s1"); 
		s.display();
		
	}

}
