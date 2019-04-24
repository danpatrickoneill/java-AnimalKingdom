package animals;

import java.util.ArrayList;

public class Main
{
	public static void showFiltered(ArrayList<Animal> animals, CheckAnimal tester)
	{
		for (Animal a : animals)
		{
			if (tester.test(a))
			{
				System.out.println(a.toString());
			}
		}
	}

	public static void main(String[] args)
	{
		// Instantiating mammals
		Mammal panda = new Mammal("Panda", 1869);
		Mammal zebra = new Mammal("Zebra", 1778);
		Mammal koala = new Mammal("Koala", 1816);
		Mammal sloth = new Mammal("Sloth", 1804);
		Mammal armadillo = new Mammal("Armadillo", 1758);
		Mammal raccoon = new Mammal("Raccoon", 1758);
		Mammal bigfoot = new Mammal("Bigfoot", 2021);

		// Instantiating birds
		Bird pigeon = new Bird("Pigeon", 1837);
		Bird peacock = new Bird("Peacock", 1821);
		Bird toucan = new Bird("Toucan", 1758);
		Bird parrot = new Bird("Parrot", 1824);
		Bird swan = new Bird("Swan", 1758);

		// Instantiating mammals
		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		ArrayList<Animal> kingdom = new ArrayList<Animal>();
		kingdom.add(panda);
		kingdom.add(zebra);
		kingdom.add(koala);
		kingdom.add(sloth);
		kingdom.add(armadillo);
		kingdom.add(raccoon);
		kingdom.add(bigfoot);
		kingdom.add(pigeon);
		kingdom.add(peacock);
		kingdom.add(toucan);
		kingdom.add(parrot);
		kingdom.add(swan);
		kingdom.add(salmon);
		kingdom.add(catfish);
		kingdom.add(perch);

		// System.out.println(kingdom.toString());

		System.out.println("*** SORTED BY DESCENDING YEAR OF DISCOVERY***");
		kingdom.sort((a1, a2) -> a2.yearDiscovered - a1.yearDiscovered);
		kingdom.forEach(a -> System.out.println(a.toString()));

		System.out.println("*** SORTED ALPHABETICALLY ***");
		kingdom.sort((a1, a2) -> a1.name.compareToIgnoreCase(a2.name));
		kingdom.forEach(a -> System.out.println(a.toString()));

		System.out.println("*** SORTED BY MOVEMENT STYLE ***");
		kingdom.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
		kingdom.forEach(a -> System.out.println(a.toString()));

		System.out.println("*** LUNG BREATHERS ***");
		showFiltered(kingdom, a -> a.breathe() == "Lungs");

		System.out.println("*** LUNG BREATHERS OF 1758 ***");
		showFiltered(kingdom, a -> a.breathe() == "Lungs" && a.yearDiscovered == 1758);

		System.out.println("*** EGG-LAYING LUNG BREATHERS ***");
		showFiltered(kingdom, a -> a.breathe() == "Lungs" && a.reproduce() == "Eggs");

		System.out.println("*** ANIMAL CLASS OF 1758 ***");
		showFiltered(kingdom, a -> a.yearDiscovered == 1758);

		System.out.println("*** MAMMALS SORTED ALPHABETICALLY ***");
		kingdom.sort((a1, a2) -> a1.name.compareToIgnoreCase(a2.name));
		showFiltered(kingdom, a -> a instanceof Mammal);

	}
}