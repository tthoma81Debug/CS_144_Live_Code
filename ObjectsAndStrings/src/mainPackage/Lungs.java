package mainPackage;

public class Lungs 
{
	//private double currentAirAmount; //in liters
	//private double maxAirCapacity; //in liters
	private Tubes bronchiolTubes;
	private double currentBreathVolume = 1.0; 
	
	Lungs()
	{
		bronchiolTubes = new Tubes();
		bronchiolTubes.currentAir = 0.0;
	}
	
	public void setAirCapacity(double incomingCapacity)
	{
		//maxAirCapacity = incomingCapacity;
		//assume ten in most cases
		bronchiolTubes.capacity = incomingCapacity;
	}
	
	public void setCurrentAir(double incomingAmount)
	{
		//currentAirAmount = incomingAmount;
		bronchiolTubes.currentAir = incomingAmount;
	}
	
	public void setBreath(double incomingBreath)
	{
		//maxAirCapacity = incomingCapacity;
		//assume ten in most cases
		currentBreathVolume = incomingBreath;
	}
	
	public double getBreath()
	{
		//currentAirAmount = incomingAmount;
		return currentBreathVolume;
	}
	
	public double getCurrentAir()
	{
		//return currentAirAmount;
		return bronchiolTubes.currentAir;
	}
	
	public double getCapacity()
	{
		//return maxAirCapacity;
		return bronchiolTubes.capacity;
	}
	
	public void inhale()
	{
		//currentAirAmount += 5.5;
		bronchiolTubes.currentAir += currentBreathVolume;
	}
	
	public void exhale()
	{
		//currentAirAmount -= 5.5;
		bronchiolTubes.currentAir -= currentBreathVolume;
	}
	
	public void breathe()
	{
		inhale();
		exhale();
	}
	
	
	
}
