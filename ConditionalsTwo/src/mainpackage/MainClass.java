package mainpackage;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("test");
		Scanner scnr = new Scanner(System.in);
		int red;
		int green;
		int blue;
		
		//determines whether input is good to go
		boolean redGood = false;
		boolean greenGood = false;
		boolean blueGood = false;
		
		//testing the RgbColor class
		
		//allow user to enter rgb values
		System.out.println("Enter Red, Green, and Blue Values");
		red = scnr.nextInt();
		green = scnr.nextInt();
		blue = scnr.nextInt();
		
		//lets make sure the values are valid
		
		if(red <= 255 && red >= 0)	
		{
			//red is good to go
			redGood = true;
		}
		
		if(green <= 255 && green >= 0)
		{
			//green is good to go
			greenGood = true;
		}
		
		if(blue <= 255 && blue >= 0)
		{
			//blue is good to go
			blueGood = true;
		}
		
		if(redGood == true && greenGood == true && blueGood == true)
		{
			System.out.println("All values valided. Proceeding with operation");
	
		
			//test the class. To do that. we need an instance of the class
		
			RgbColor testClass = new RgbColor(red, green, blue);
		
			//remove the grey
			testClass.greyRemover();
		
			//testing to see what final values are
		
			System.out.println("Red is now: " + testClass.getRed());
			System.out.println("Green is now: " + testClass.getGreen());
			System.out.println("Blue is now: " + testClass.getBlue());
		
		}
		else
		{
			//one or more of the values was out of bounds
			System.out.println("haha. That value is out of range, pathetic human");
			//could modify here to display which one
			//if redGood == false then system.out ("red is bad)
		}
	}

}
