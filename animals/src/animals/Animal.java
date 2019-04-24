package animals;

public abstract class Animal
{
	// fields
	int maxId = 0;
	int id;
	String name;
	int yearDiscovered;

	// constructor
	public Animal(String name, int yearDiscovered)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.yearDiscovered = yearDiscovered;
	}


	// methods
	public abstract String move();
	public abstract String breathe();
	public abstract String reproduce();
}