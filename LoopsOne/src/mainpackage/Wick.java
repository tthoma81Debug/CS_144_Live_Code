package mainpackage;

import java.util.Scanner;

public class Wick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		//John Wick themed loop
		
		int numOpponents;
		int counter = 1;
		boolean isJohn = false;
		int failedLoginNumber = 0;
		
		System.out.println("How many opponents have you neutralized?");
		numOpponents = scnr.nextInt();
		
		while(numOpponents <= 1000000 && failedLoginNumber < 3)
		{
			System.out.println("You are not John Wick! You are not authorized");
			System.out.println("This is your warning number: " + counter);
			counter++;
			numOpponents = scnr.nextInt();
			
			if(numOpponents > 1000000)
			{
				 isJohn = true;
			}
			else
			{
				failedLoginNumber++;
			}
		}
		
		if(isJohn == true)
		{
			System.out.println("Greetings John! There have been " + counter + " attempts to login");
		}
		else
		{
			System.out.println("I will find you...and I will throw a softball near you");
		}
		
		//logic for when done with loop down here
		
		/*
		while(numOpponents <= 1000000)
		{
			System.out.println("You are not John Wick! You are not authorized");
			System.out.println("This is your warning number: " + counter);
			counter++;
		}
		*/
		
	}

}
