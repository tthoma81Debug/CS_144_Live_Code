package mainPackage;

public class Dog 
{
	private int age;
	private String breed;
	private String color;
	private String dogName;
	private int loudness;
	private Lungs dogLungs;
	private Heart dogHeart;
	
	Dog() //constructor
	{
		System.out.println("Dog initialized");
	}
	
	public void setName(String incomingName) //"mutator" method or "setter"
	{
		dogName = incomingName;
	}
	
	public String getName() //"accessor" method or "getter"
	{
		return dogName;
	}
	
	
	Dog(int incomingAge, String incomingBreed, String incomingColor, String incomingName, int incomingLoudness)
	{
		age = incomingAge;
		breed = incomingBreed;
		color = incomingColor;
		dogName = incomingName;
		loudness = incomingLoudness; 
		
		//setup organs
		
		dogLungs = new Lungs();
		dogHeart = new Heart();
	}
	
	public void bark(String dogSays)
	{
		
		System.out.println(dogName + " just barked with loudness of " + loudness + " and it says " + dogSays);
	}
	
	public int calmDown()
	{
		loudness = loudness - 20;
		
		return loudness;
	}
	
	public void run()
	{
		System.out.println("The dog of age " + age + " just ran");
		System.out.println(dogName + " just took off running");
		System.out.println("The " + color + " " + breed + "jumped over the horrified person who walked by");
		//System.out.println(dogSays);
	}
	
	public void breath() 
	{
		dogLungs.inhale();
		dogLungs.exhale();
	}
	
	public void pant()
	{
		System.out.println("Panting!!!!");
		dogLungs.inhale();
		System.out.println("After Inhaling, " + dogLungs.getCurrentAir() + " air in lungs");
		dogLungs.exhale();
		System.out.println("After exhaling, " + dogLungs.getCurrentAir() + " air in lungs");
		dogHeart.pump();
		System.out.println("Dog's bpm is now " + dogHeart.bpm);
		
		double newBreathVolume = dogLungs.getBreath() * dogHeart.bpm;
		dogLungs.setBreath(newBreathVolume);
		
		System.out.println("Dogs heart pumped blood");
		System.out.println("Dogs breath volume is now " + dogLungs.getBreath());
		
		
		/*
		System.out.print("Dog panting now. Oxygen level is ");
		System.out.print(dogLungs.getCurrentAir());
		System.out.println(" liters of air is in the dogs lungs");
		
		System.out.print("Dog inhaling. Air in dogs lungs is now ");
		dogLungs.inhale();
		System.out.print(dogLungs.getCurrentAir());
		System.out.println(" liters");
		System.out.print("Dog exhaling. After exhaling. Air in dogs lungs is now ");
		dogLungs.exhale();
		System.out.print(dogLungs.getCurrentAir());
		System.out.print(" liters");
		
		*/
		
		
	}
}
