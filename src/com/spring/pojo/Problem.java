package com.spring.pojo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Problem {

	private Map<String, String> solutions;

	public Map<String, String> getSolutions() {
		return solutions;
	}

	public void setSolutions(Map<String, String> solutions) {
		this.solutions = solutions;
	}

	public void displayInfo() {
		Set<Entry<String, String>> set = solutions.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.println("Model:" + entry.getKey() + " Year:" + entry.getValue());
		}
	}
}
