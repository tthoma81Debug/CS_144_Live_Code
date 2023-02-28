package mainpackage;

public class RgbColor {

	//stuff up here is instance variables
	private int red;
	private int green;
	private int blue;
	
	
	RgbColor(int red, int green, int blue)
	{
		//red up top = red in this method turned into code is:
		this.red = red;
		this.green = green;
		this.blue = blue;				
		//this is a constructor
		//should store red green, and blue in "instance variables"
	}
	
	//getter or accessor (same thing) for red variable
	public int getRed()
	{
		return red;
	}
	
	public int getGreen()
	{
		return green;
	}
	
	public int getBlue()
	{
		return blue;
	}
	
	//finds a value and subtracts it from all three
	
	public void greyRemover()
	{
		// if red < blue and red < green then lowest value is red
		
		//else if blue is < red and blue < green, then blue is lowest value
		
		int lowestValue;
		
		if(red < blue && red < green)
		{
			//lowest value is red
			lowestValue = red;
		}
		else if(blue < red && blue < green)
		{
			//lowest value is blue
			lowestValue = blue;
		}
		else if(green < red && green < blue)
		{
			//lowest value is green
			lowestValue = green;
		}
		else
		{
			//should never happen
			lowestValue = 0;
		}
		
		//subract it from all three		
		red = red - lowestValue;
		green = green - lowestValue;
		blue = blue - lowestValue;
		
		
	}
	
}
