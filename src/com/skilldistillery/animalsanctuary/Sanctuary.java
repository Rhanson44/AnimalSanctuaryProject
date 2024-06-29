package com.skilldistillery.animalsanctuary;

public class Sanctuary {
	private Animal[] animals;
	private Attendant attendant;
	
	public Sanctuary(int size) {
		this.animals = new Animal[size];
	}

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	public void listAnimals() {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				System.out.println("This enclosure is empty");
			} else {
				System.out.println(animals[i].getClass().getSimpleName() + " " + animals[i].getName());
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
	
	public Animal[] removeAnimal(int whichAnimal) {
		if (animals[whichAnimal] != null) {
			animals[whichAnimal] = null;
		} 
		return animals;
	}
	
	public void startAttendantRounds() {
		attendant.makeRounds(animals);
	}

	public Animal[] getAnimals() {
		return animals;
	}

	public void setAnimals(Animal[] animals) {
		this.animals = animals;
	}

}
