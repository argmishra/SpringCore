package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Problem;

public class SetterDIMapDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Problem p = (Problem) context.getBean("problemBean");
		p.displayInfo();
	}

}
