package com.spring.pojo;

public class Car {
	public int year;
	public String name;

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void dispayCarDetail() {
		System.out.print("Name of car = " + name + " and year is = " + year);
	}
}
