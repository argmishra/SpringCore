package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Student;

public class ApplicationContextDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s = (Student) context.getBean("studentBean");
		s.dispayInfo();
	}

}
