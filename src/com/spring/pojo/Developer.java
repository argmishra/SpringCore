package com.spring.pojo;

public class Developer {

	private Language language;

    public Developer(Language language) {
        this.language = language;
    }
    
    public void displayInfo() {
		System.out.print("Language = " + language.getName());
	}
}
