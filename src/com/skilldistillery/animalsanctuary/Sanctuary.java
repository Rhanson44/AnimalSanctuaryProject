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
		Animal[] animalsRem = new Animal[animals.length];
		for (int i = 0; i < animals.length; i++) {
			if (animals[whichAnimal] != null) {
				animals[whichAnimal] = null;
				animalsRem[i] = animals[i];
			}
		} 
		return animalsRem;
	}
	
	public boolean isValidIndex(int whichAnimal) {
		if (whichAnimal >= animals.length) {
			System.out.println("Please enter a valid enclosure");
			return false;
		}
		return true;
	}
	
	public void startAttendantRounds() {
		attendant.makeRounds(animals);
	}

	public Animal[] expand() {
		Animal[] animals2 = new Animal[animals.length * 2];
		for (int i = 0; i < animals.length; i++) {
			animals2[i] = animals[i];
		}
		return animals2;
	}
	
	public Animal[] getAnimals() {
		return animals;
	}

	public void setAnimals(Animal[] animals) {
		this.animals = animals;
	}


}
