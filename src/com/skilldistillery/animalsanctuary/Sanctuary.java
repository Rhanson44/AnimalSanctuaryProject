package com.skilldistillery.animalsanctuary;

public class Sanctuary {
	private Animal[] animals = new Animal[5];
	private Attendant attendant;

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	public void listAnimals() {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				System.out.println("This enclosure is empty");
			} else {
				System.out.println(animals[i].getName());
			}
		}
	}

	public void addAnimal(Animal animal) {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				continue;
			} else {
				animals[i] = animal;
				break;
			}
		}
	}

	public void startAttendantRounds() {
		attendant.makeRounds(animals);
	}

	public Animal[] getAnimals() {
		return animals;
	}
}
