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
		Sanctuary sanctuary = new Sanctuary();
		Attendant attendant = new Attendant();
		sanctuary.setAttendant(attendant);
		boolean isTrue = true;
		while (isTrue) {
			System.out.println("###################");
			System.out.println("Select an option: ");
			System.out.println("1. List animals");
			System.out.println("2. Add new animal");
			System.out.println("3. Attendant rounds");
			System.out.println("4. Quit");
			System.out.println("###################");
			int input = scan.nextInt();
			scan.nextLine();
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
				} else if(addAnimal.equalsIgnoreCase("Bear")) {
					animal = new Bear();
					sanctuary.addAnimal(animal);
				} else if (addAnimal.equalsIgnoreCase("Snake")) {
					animal = new Snake();
					sanctuary.addAnimal(animal);
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
				isTrue = false;
				break;
			}
		}
	}

}