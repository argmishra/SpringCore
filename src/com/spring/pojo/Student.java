package com.spring.pojo;

public class Student {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void dispayInfo() {
		System.out.print("Name of student = " + name);
	}

}
