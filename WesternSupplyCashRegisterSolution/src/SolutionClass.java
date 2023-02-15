package solutionpackage;

import java.util.Scanner;

public class SolutionClass {

	public static void main(String[] args) 
	{
		int totalTransactionCost; //will hold cost of transaction in cents
		int totalCashHandedEmployee; //will hold cash customer gave employee in cents
		int difference;
		int dollarsChange;
		int centsChange;
		int hundreds;
		int fiftys;
		int twenties;
		int tens;
		int fives;
		int ones;
		int runningTotalDollars;
		
		
		
		Scanner theKeyboard = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Western Supply Cash Register: Underpaid Employee");
		System.out.println("How much money does the current transaction cost?");
		totalTransactionCost = theKeyboard.nextInt();
		System.out.println("How much money did the customer give you?");
		totalCashHandedEmployee = theKeyboard.nextInt();
		
		//now we have the values
			
		//perform math
		//chaps cost 149.99
		//which is 14999 cents
		
		//for first case. customer hands 200.00
		//which is 20000 cents
		
		//total change is 5001 cents
		//this is $50 and 1 cent
		//this is zero 100 bills. One 50 bill, zero 20 bills, zero 10 bills, zero 5 bills, zero 1 bills, and 1 penny.
		
		//switch to code:
		
		difference = totalCashHandedEmployee - totalTransactionCost; //difference in cents
		dollarsChange = difference / 100; //total "dollars" change
		centsChange = difference % 100;
		
		//output result
		System.out.println("Give the customer $" + dollarsChange + " and some odd change. Keep it if you can. We want money");
		System.out.println("To be specific, the customer needs " + centsChange + " total change.");
		
		
		//calculate bills
		runningTotalDollars = dollarsChange;
		hundreds = runningTotalDollars / 100;
		System.out.println("hundreds is " + hundreds);
		runningTotalDollars -= hundreds;
		System.out.println("runningTotalDollars before 50 calc is " + runningTotalDollars);
		fiftys = runningTotalDollars / 50;
		System.out.println("fiftys is " + fiftys);
		runningTotalDollars -= fiftys;
		System.out.println("after fifys calc. runningTotalDollars is " + runningTotalDollars);
		
		//fiftys = (dollarsChange - (hundreds * 100)) / 50; //test later
		
		
		
		System.out.println("Which is: ");
		
		System.out.println(hundreds + " $100 bills");
		System.out.println(fiftys + " $50 bills");
		System.out.println("x $20 bills");
		System.out.println("x $10 bills");
		System.out.println("x $5 bills");
		System.out.println(" and x $1 bills");
		
		//Display results for underpaid employee
		
	}

}
