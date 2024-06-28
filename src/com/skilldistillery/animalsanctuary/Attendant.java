package com.skilldistillery.animalsanctuary;

public class Attendant {

	public void makeRounds(Animal[] animals) {
		for (Animal animal : animals) {
			if (animal != null) {
				System.out.println(animal.getName());
			}
		}
	}
}
