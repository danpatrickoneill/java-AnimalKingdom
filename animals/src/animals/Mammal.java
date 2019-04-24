package animals;

public class Mammal extends Animal
{
	// fields

	// constructor
	public Mammal(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	// methods

	@Override
	public String move()
	{
		return "Walk";
	}

	@Override
	public String breathe()
	{
		return "Lungs";
	}

	@Override
	public String reproduce()
	{
		return "Live births";
	}
}