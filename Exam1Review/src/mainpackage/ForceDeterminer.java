package mainpackage;

public class ForceDeterminer 
{
	
	
	//method here
	public void printForceScore(int alignmentScore)
	{
		if(alignmentScore <= -10)
		{
			System.out.println("So this is how democracy ends..with thundrous applause");
			
		}
		else if(alignmentScore <= -5)
		{
			System.out.println("You are a sith master, deserving of the darth title");
		}
		else if(alignmentScore <= 2)
		{
			System.out.println("You are a grey jedi. Siding with neither light nor dark (or a padawan)");
			
		}
		else if (alignmentScore <= 5)
		{
			System.out.println("Study, young jedi apprentice");
		}
		else if (alignmentScore <= 10)
		{
			System.out.println("Greetings, Master Yoda");
		}
		else
		{
			System.out.println("should never happen");
		}
			
	}
}
