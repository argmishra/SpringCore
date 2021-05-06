package com.spring.pojo;

import java.util.Iterator;
import java.util.List;

public class Question {
	private List<String> answers;

	public Question() {
	}

	public Question(List<String> answers) {
		super();
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println("Answers are:");
		Iterator<String> itr = answers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
