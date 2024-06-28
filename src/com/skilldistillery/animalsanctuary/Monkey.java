package com.skilldistillery.animalsanctuary;

public class Monkey extends Animal{
	private static String noise = "OO EE AHH AH";
	
	public void makeNoise() {
		System.out.println(noise);
	}
	
	public void eatFood(int amount) {
		System.out.println(noise + " I'm eating " + amount + " bananas!");
	}

}
