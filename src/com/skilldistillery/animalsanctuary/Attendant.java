package com.skilldistillery.animalsanctuary;

import java.util.Random;

public class Attendant {

	public void makeRounds(Animal[] animals) {
		Random rand = new Random();
		System.out.println("Another wonderful day at the zoo!");
		
		for (Animal animal : animals) {
			int amount = rand.nextInt(10);
			
			if (animal != null) {
				System.out.println("I am feeding " + animal.getName() + " " + amount + " foods"); 
				animal.eatFood(amount);
				System.out.println();
			} else {
				System.out.println("This enclosure's empty, I can move on");
			}
		}
		System.out.println("Everyone's fed, time for break!");
	}
}
