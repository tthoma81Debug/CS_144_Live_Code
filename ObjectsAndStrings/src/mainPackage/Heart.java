package mainPackage;

public class Heart 
{
	
	public double bloodPressure;
	public double bloodPumpedPerPump = 3.4;
	public int bpm = 1;
	public boolean isArrest = false;
	public double totalBloodPumpedInLife = 1000.0;
	
	public void pump()
	{
		totalBloodPumpedInLife += (bloodPumpedPerPump * bpm);
		bpm++;
	}
	
}
