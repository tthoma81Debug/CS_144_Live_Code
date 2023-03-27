package mainclass;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args)
	{
		//while loop that runs 10 times and prints numbers 1 through 10
		
		int counter = 1;
		
		while(counter < 11)
		{
			System.out.println(counter);
			counter++;
		}
		
		
		
		
		//do while loop that runs 10 times and prints numbers 1 through 10
		
		System.out.println("next loop type starts here");
		
		int otherCounter = 1;
		
		do
		{
			System.out.println(otherCounter);
			otherCounter++;
		}
		while(otherCounter < 11);
		
		
		//for loop that runs 10 times and prints numbers 1 through 10
		
		for(int count = 1; count <= 10; count++)
		{
			System.out.println(count);
		}
		
		loopMethod();
		
		System.out.println("new loop starting here");
		
		int x, y;for (x=1, y=1; x <= 5; x++, y++)
		{
			System.out.println(x + " plus " + y + " equals " + (x+y));
		}
		
		Scanner scnr = new Scanner(System.in);
		
		int userInput = 0;
		int sum = 0;
		
		while(userInput != -999)
		{
			System.out.println("Please enter the next number to add to the sum");
			System.out.println("Or enter -999 to stop adding numbers");
			userInput = scnr.nextInt();
			
			if(userInput != -999)
			{
				sum+= userInput;
			}
			
			System.out.println("The current sum is " + sum);
		}
		System.out.println("loop finished");
		
		
		
		
		
		//which is the most simple, compact, and best practice for this task?
		//for
		
		
	} //end method
	
	public static void loopMethod()
	{
		System.out.println("testing loop here");
		
		int sum = 0;
		int n = 5;
		for (int i= 1; i <= n; i++) 
		{
			System.out.println("At start of loop. Sum is " + sum);
			System.out.println("In loop. I is " + i);
			System.out.println("In loop still. sum is " + sum);
			sum += i;
			System.out.println("At end of loop. Sum is now " + sum);
		}
		
		System.out.println("The sum is " + sum);
	}

}
