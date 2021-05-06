package com.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {

	private String name;

	@Autowired
	private Author author;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public void displayInfo() {
		System.out.print(name + " " + author.toString());
	}
}
