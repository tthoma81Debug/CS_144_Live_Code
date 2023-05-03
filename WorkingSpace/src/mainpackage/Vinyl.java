package mainpackage;

public class Vinyl 
{
	
	public String artistName;
	
	
	//default constructor
	Vinyl()
	{
		//optional stuff here
		System.out.println("Vinyl record created");
		artistName = "Unknown Artist";
	}
	
	//overloaded constructor
	Vinyl(String incomingName)
	{
		System.out.println("Overload constructor called");
		artistName = incomingName;
	}
}
