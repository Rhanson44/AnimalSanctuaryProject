package com.skilldistillery.animalsanctuary;

public class Snake extends Animal{
	private static String noise = "SSSSS";
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	@Override
	public void eatFood(int amount) {
		System.out.println(noise + " I'm eating " + amount + " mice!");
	}
}
