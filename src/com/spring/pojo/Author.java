package com.spring.pojo;

public class Author {

	private String name;

	public Author() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "by :" + name;
	}

}
