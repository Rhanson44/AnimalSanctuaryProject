package com.skilldistillery.animalsanctuary;

import java.util.Random;

public class Attendant {

	public void makeRounds(Animal[] animals) {
		Random rand = new Random();
		for (Animal animal : animals) {
			if (animal != null) {
				System.out.println("I am feeding " + animal.getName() + " " + rand.nextInt(10) + " foods");
			} else {
				System.out.println("This enclosure's empty");
			}
		}
		System.out.println("Everyone's fed, time for break!");
	}
}
