package mainpackage;

public class Plane 
{
	private int weight;
	private int ammoCapacity;
	private boolean canCarryOrdinance;
	private int elevatorSize;
	private double fuelCapacity;
	private int range;
	private double maxSpeed;
	private String landingGearType;
	private String designation; //f18c/f35b etc
	private double price;
	
	public Ordinance planeArmaments[];
	
	
	Plane()
	{
		weight = 16;
		ammoCapacity = 412;
		canCarryOrdinance = true;
		elevatorSize = 8;
		fuelCapacity = 3500;
		range = 2069;
		maxSpeed = 1190;
		landingGearType = "tricycle";
		designation = "F/A18";
		price =  65000000;	
		planeArmaments = new Ordinance[3];
		
	}
	
	private void configureOrdinance()
	{
		Ordinance planeCannon = new Ordinance();
		planeCannon.capacity = 412;
		planeCannon.typeOfOrdinance = "Cannon";
		planeCannon.guided = false;
		
		planeArmaments[0] = planeCannon;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public void setWeight(int incomingWeight)
	{
		this.weight = incomingWeight;
	}
	
	
	
	
}