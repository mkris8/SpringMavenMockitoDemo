package com.hello;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringDemo {
	
	public String show() {

		ApplicationContext context = new FileSystemXmlApplicationContext("Spring-Beans.xml");
		Person person = context.getBean(Person.class);
		return "Hello"+person.getFirstName();
	}

}
