package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Employe;

public class ConstructerDIDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employe e = (Employe) context.getBean("employeBean");
		e.dispayNameAndId();
	}
}
