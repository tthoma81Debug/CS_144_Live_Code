package mainpackage;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args)
	{
		//if statements
		//switch statements
		//some methods and objects
		//loops (the biggest one)
		//a little bit of arrays
		
		/*
		 * 
		 * Write a Java program that takes a day number (1-7) as input 
		 * and outputs the name of the day of the week using a switch statement.
		 */
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter a day number");
		int dayNum = scnr.nextInt();
		String dayName = "";

		switch(dayNum)
		{
		case 1: 
			dayName = "Sunday";
			break;
		case 2: 
			dayName = "Monday";
			break;
		case 3: 
			dayName = "Tuesday";
			break;
		case 4: 
			dayName = "Wednesday";
			break;
		case 5: 
			dayName = "Thursday";
			break;
		case 6: 
			dayName = "Friday";
			break;
		case 7: 
			dayName = "Saturday";
			break;
		default:
			dayName = "Aint got no clue what day of the week that is";
			break;
		
		}
		
		System.out.println("The day of the week you entered is " + dayName);
		
		
		//loops
		//while, for, do-while
		
		//when should you use
		
		//while loop
		//Should use while loop when you don't know how many times it needs to run
		
		//for loop
		//should use when you do know how many times the loop needs to run
		
		//do while 
		//should use when when you don't know how many times you need the loop to run but you know it needs to run at least once
		
		
		//while and for loops are precondition. Do while is postcondition
		

		//print numbers 1 to 100 in a loop
		
		for(int i = 1; i <= 100; i++)
		{
			System.out.println(i);
		}
		
		
		//print numbers 1 to 100 with a while loop
		int count = 1;
		while(count <= 100)
		{
			System.out.println(count);
			count++;
		}
		
		
		//same loop but a do while loop
		
		count = 1;
		do
		{
			System.out.println(count);
			count++;
			
		}while(count <= 100);
		
		
		
		
		
		int userNumEntered = scnr.nextInt();
		
		while(userNumEntered < 0 || userNumEntered > 100)
		{
			System.out.println("Enter a number in the right range");
			userNumEntered = scnr.nextInt();
		}
		
		System.out.println("number accepted");
		//userNumEntered would have to be in right range.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
