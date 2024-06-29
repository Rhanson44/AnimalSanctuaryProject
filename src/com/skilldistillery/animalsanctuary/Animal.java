package com.skilldistillery.animalsanctuary;

public class Animal {
	private String name;
	
	public void makeNoise() {
		System.out.println("*generic animal noise*");
	}
	
	public void eatFood(int amount) {
		System.out.println("I am eating " + amount + " foods");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
