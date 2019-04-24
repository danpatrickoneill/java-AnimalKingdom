package animals;

public abstract class Animal
{
	// fields
	private static int maxId = 0;
	public int id;
	public String name;
	public int yearDiscovered;

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

	@Override
	public String toString()
	{
		return id + ": " + name + ", discovered " + yearDiscovered + "\n"
		+ move() + ", " + breathe() + ", " + reproduce() + "\n";
	}
}