package animals;

public class Bird extends Animal
{
	// fields

	// constructor
	public Bird(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	// methods

	@Override
	public String move()
	{
		return "Fly";
	}

	@Override
	public String breathe()
	{
		return "Lungs";
	}

	@Override
	public String reproduce()
	{
		return "Eggs";
	}
}