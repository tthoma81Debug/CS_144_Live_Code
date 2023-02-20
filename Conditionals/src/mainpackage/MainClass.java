package mainpackage;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int blasterHits = 0;
		
		System.out.println("How Many Blaster Hits Has the Ship Taken?");
		
		
		blasterHits = scnr.nextInt();
		
		
		
		/* Example try catch block
		try
		{
			blasterHits = scnr.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("The force is strong with you.....Welcome to the dark side...");
		}
		*/
		
		
		//start of first if statement
		if(blasterHits >= 10 && blasterHits <= 20)
		{
			System.out.println("We've taken between 10 and 20 hits. Odds are not good");
		}
		else if(blasterHits <= 10)
		{
			System.out.println("We're ok. It's less than or = to 10 hit");
		}
		else if(blasterHits >= 20)
		{
			System.out.println("Uh Oh! If you don't have some main characters onboard you're in trouble");
			
			System.out.println("RTWOOOOOOOOOOOO!!!!");
			int beepResponse = scnr.nextInt();
			if(beepResponse >= 3)
			{
				System.out.println("Gonna need a droid mechanic");
			}
			else
			{
				System.out.println("Flipped something. sudden energy boost");
			}
		}
		else
		{
			System.out.println("Invalid Galaxy");
		}

			//runs if false
		//System.out.println("Phew, we aren't at 50 hits yet. Shields are still holding");

		//end of first if statement
		
		
		
		//start of second if statement
		//considers this regardless of prior choice
		if(blasterHits == 10)
		{
			//runs if true
			System.out.println("Hit only 10 times. CHEWYYYYY!");
		}
		//end of second if statement
		
		//prints this regardless
		System.out.println("The ship has been hit " + blasterHits + " Times");
		

	}

}
