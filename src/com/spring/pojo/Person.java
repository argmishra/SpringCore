package com.spring.pojo;

public class Person {
	private Ability ability;

	public Ability getAbility() {
		return ability;
	}

	public void setAbility(Ability ability) {
		this.ability = ability;
	}

	public void displayInfo() {
		System.out.print("ability = " + ability.getSkill());
	}

}
