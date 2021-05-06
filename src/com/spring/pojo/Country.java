package com.spring.pojo;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Country {

	private int rank;
	private Map<City, State> country;

	public Country() {
	}

	public Country(int rank, Map<City, State> country) {
		this.rank = rank;
		this.country = country;
	}

	public void displayInfo() {
		System.out.println("rank:" + rank);
		System.out.println("Country");
		Set<Entry<City, State>> set = country.entrySet();
		Iterator<Entry<City, State>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<City, State> entry = itr.next();
			City city = entry.getKey();
			State state = entry.getValue();
			System.out.println("City :");
			System.out.println(city);
			System.out.println("State:");
			System.out.println(state);
		}
	}
}
