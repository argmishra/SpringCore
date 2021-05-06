package com.spring.pojo;

public class State {

	private String name;

	public State() {
	}

	public State(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "name:" + name;
	}

}
