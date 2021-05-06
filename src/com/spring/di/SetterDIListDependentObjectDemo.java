package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.pojo.Query;

public class SetterDIListDependentObjectDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Query q = (Query) context.getBean("queryBeanListDO");
		q.displayInfo();
	}
}