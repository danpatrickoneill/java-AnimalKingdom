package animals;

public class Fish extends Animal
{
	// fields

	// constructor
	public Fish(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	// methods

	@Override
	public String move()
	{
		return "Swim";
	}

	@Override
	public String breathe()
	{
		return "Gills";
	}

	@Override
	public String reproduce()
	{
		return "Eggs";
	}
}