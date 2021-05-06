package com.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Book;

public class AutoWireDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Book b = (Book) context.getBean("book");
		b.displayInfo();
	}
}
