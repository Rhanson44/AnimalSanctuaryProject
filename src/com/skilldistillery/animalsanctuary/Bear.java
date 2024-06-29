package com.skilldistillery.animalsanctuary;

public class Bear extends Animal{
	private static String noise = "GRRR";
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	@Override
	public void eatFood(int amount) {
		System.out.println(noise + " I'm munching on " + amount + " honeycombs");
	}
}
