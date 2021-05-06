package com.spring.pojo;

public class City {
	private String name;

	public City() {
	}

	public City(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name:" + name;
	}
}
