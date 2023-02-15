package mainPackage;

public class Cat 
{
	private int age;
	private String breed;
	private String color;
	private String catName;
	private int loudness;
	private Lungs catLungs;
	private Heart catHeart;
	
	Cat() //constructor
	{
		System.out.println("Cat initialized");
		catLungs = new Lungs();
		catHeart = new Heart();
		catLungs.setBreath(0.15);
		catHeart.bpm = 3;
	}
	
	public void setName(String incomingName) //"mutator" method or "setter"
	{
		catName = incomingName;
	}
	
	public String getName() //"accessor" method or "getter"
	{
		return catName;
	}
	
	
	Cat(int incomingAge, String incomingBreed, String incomingColor, String incomingName, int incomingLoudness)
	{
		age = incomingAge;
		breed = incomingBreed;
		color = incomingColor;
		catName = incomingName;
		loudness = incomingLoudness; 
		
		//setup organs
		
		catLungs = new Lungs();
		catHeart = new Heart();
	}
	
	public void meow(String catSays)
	{
		
		System.out.println(catName + " just meowed with loudness of " + loudness + " and it says " + catSays);
	}
	
	public int calmDown()
	{
		loudness = loudness - 20;
		
		return loudness;
	}
	
	public void run()
	{
		System.out.println("The cat of age " + age + " just ran");
		System.out.println(catName + " just took off running");
		System.out.println("The " + color + " " + breed + "jumped over the horrified person who walked by");
		//System.out.println(dogSays);
	}
	
	public void breath() 
	{
		catLungs.inhale();
		catLungs.exhale();
	}
	
	public void pant()
	{
		System.out.println("Panting!!!!");
		catLungs.inhale();
		System.out.println("After Inhaling, " + catLungs.getCurrentAir() + " air in lungs");
		catLungs.exhale();
		System.out.println("After exhaling, " + catLungs.getCurrentAir() + " air in lungs");
		catHeart.pump();
		System.out.println("Cat's bpm is now " + catHeart.bpm);
		
		double newBreathVolume = catLungs.getBreath() * catHeart.bpm;
		catLungs.setBreath(newBreathVolume);
		
		System.out.println("Cat's heart pumped blood");
		System.out.println("Cat's breath volume is now " + catLungs.getBreath());
		
		
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
