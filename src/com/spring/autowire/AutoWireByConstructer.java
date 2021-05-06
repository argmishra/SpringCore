package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Developer;

public class AutoWireByConstructer {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Developer developer = (Developer) context.getBean("developer");
		developer.displayInfo();
	}

}