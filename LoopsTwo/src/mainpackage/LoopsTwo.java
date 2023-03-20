package mainpackage;

import java.util.Scanner;
import java.util.Random;

public class LoopsTwo {

	private int exampleVariable = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Loops two is a go");
		Scanner scnr = new Scanner(System.in);
		int runningTotal = 25000;
		int enteredNumber;
		int counter = 0;
		int health = 100;
		int userChoice = 0;
		int attackDamage;
		
		
		/*
		while(runningTotal < 20000)
		{
			System.out.println("Enter a number to add to the total");
			enteredNumber = scnr.nextInt();
			runningTotal += enteredNumber;
			System.out.println("The running total is " + runningTotal);	
			counter++;
			System.out.println("This loop has run " + counter + " times");
			
			if(counter == 5)
			{
				System.out.println("Wow! you are entering a lot of numbers. I'm cutting you off");
				break;
			}
			
		} //end loop
		
		System.out.println("Loop is now complete");
*/
		
		
		do
		{
			attackDamage = attackCalculation();
			System.out.println("Enemy has " + health + " health remaining");
			//System.out.println("Attacking with Preemptive Strike");
			System.out.println("Attacking!");
			health -= attackDamage;
			//health -= 40;
			
			if(health <= 0)
			{
				break;
				//exit loop. Enemy defeated
			}
			
			System.out.println("Enemy has " + health + " health remaining");
			
			System.out.println("Do you wish to attack the enemy again?");
			userChoice = scnr.nextInt();
			
			
		} while(userChoice == 1 && health > 0);
		
		if(health > 0)
		{
			System.out.println("The wounded enemy chases after the player..");
		}
		else
		{
			System.out.println("The enemy is defeated. Congratulations!");
		}
		
		
	} //end main
	
	
	public static int attackCalculation()
	{
		Random numGenerator = new Random();
		int randomNumber = numGenerator.nextInt(6) + 1; 
		return randomNumber;
	}
	

	
	
	
	

} //end class
