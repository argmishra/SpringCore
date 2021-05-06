package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Customer;

public class AutoWireByName {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Customer customer = (Customer) context.getBean("customer");
		customer.displayInfo();
	}

}
