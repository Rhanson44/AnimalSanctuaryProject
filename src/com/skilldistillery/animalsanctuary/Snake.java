package com.skilldistillery.animalsanctuary;

public class Snake extends Animal{
	private static String noise = "SSSSS";
	
	public void makeNoise() {
		System.out.println(noise);
	}
	
	public void eatFood(int amount) {
		System.out.println(noise + " I'm eating " + amount + " mice!");
	}
}
