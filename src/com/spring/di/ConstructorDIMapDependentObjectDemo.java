package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Country;

public class ConstructorDIMapDependentObjectDemo {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Country c = (Country) context.getBean("countryBean");
		c.displayInfo();
	}
}