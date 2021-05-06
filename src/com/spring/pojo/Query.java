package com.spring.pojo;

import java.util.Iterator;
import java.util.List;

public class Query {
	private List<Answer> answers;

	public Query() {
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println("Answers are:");
		Iterator<Answer> itr = answers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
