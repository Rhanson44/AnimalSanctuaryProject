package com.skilldistillery.animalsanctuary;

public class Bear extends Animal{
	private static String noise = "GRRR";
	
	public void makeNoise() {
		System.out.println(noise);
	}
	
	public void eatFood(int amount) {
		System.out.println(noise + " I'm eating " + amount + " honeycombs!");
	}
}
