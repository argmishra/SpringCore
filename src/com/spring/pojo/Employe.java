package com.spring.pojo;

public class Employe {

	private String name;
	private int id;

	public Employe(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public void dispayNameAndId() {
		System.out.print("Name of student = " + name + " and id is = " + id);
	}

}
