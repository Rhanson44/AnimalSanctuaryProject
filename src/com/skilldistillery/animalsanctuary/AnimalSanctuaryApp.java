package com.skilldistillery.animalsanctuary;

import java.util.Scanner;

public class AnimalSanctuaryApp {
	Sanctuary sanctuary;
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();
	}

	private void launchApp() {
		System.out.println("How many animals would you like to hold in our sanctuary?");
		int arrSize = scan.nextInt();
		
		Sanctuary sanctuary = new Sanctuary(arrSize);
		Attendant attendant = new Attendant();
		sanctuary.setAttendant(attendant);
		
		boolean isTrue = true;
		int animalsAdded = 0;
		
		while (isTrue) {
			System.out.println("######################");
			System.out.println("Select an option: ");
			System.out.println("1. List animals");
			System.out.println("2. Add new animal");
			System.out.println("3. Attendant rounds");
			System.out.println("4. Rehabilitate animal");
			System.out.println("5. Quit");
			System.out.println("######################");
			int input = scan.nextInt();
			scan.nextLine();
			if (animalsAdded >= sanctuary.getAnimals().length && input == 2) {
				sanctuary.setAnimals(sanctuary.expand());
				System.out.println("Sanctuary expanded to include " + sanctuary.getAnimals().length + " animals!");
			}
			switch (input) {
			case 1:
				sanctuary.listAnimals();
				break;
			case 2:
				System.out.println("Choose an animal to add: Monkey, Bear, Snake");
				String addAnimal = scan.nextLine();
				Animal animal = null;
				
				if (addAnimal.equalsIgnoreCase("Monkey")) {
					animal = new Monkey();
					sanctuary.addAnimal(animal);
					animalsAdded++;
				} else if(addAnimal.equalsIgnoreCase("Bear")) {
					animal = new Bear();
					sanctuary.addAnimal(animal);
					animalsAdded++;
				} else if (addAnimal.equalsIgnoreCase("Snake")) {
					animal = new Snake();
					sanctuary.addAnimal(animal);
					animalsAdded++;
				} else {
					System.out.println("Invalid animal");
					break;
				}
				
				System.out.println("Choose a name for the animal");
				String addAnimalName = scan.nextLine();
				animal.setName(addAnimalName);
				break;
			case 3:
				sanctuary.startAttendantRounds();
				break;
			case 4:
				System.out.println("Select an animal - position in list '0 -> " + (sanctuary.getAnimals().length - 1) + "'");
				int animalChoice = scan.nextInt();
				if(sanctuary.isValidIndex(animalChoice)) {		
					sanctuary.removeAnimal(animalChoice);
				}
				break;
			case 5:
				isTrue = false;
				break;
			}
		}
	}

}
