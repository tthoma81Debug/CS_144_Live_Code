package registersolution;

import java.util.Scanner;

public class RegisterSolution {

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
		
		//this part for the cents calcuation
		int runningTotalCents; //same thing as runningTotalDollars but for cents
		int quarters;
		int dimes;
		int nickels;
		int pennies;
		
		
		
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
		//System.out.println("hundreds is " + hundreds); //debugging line
		
		//Here was our logic problem. We had:
		//runningTotalDollars -= hundreds;
		//which means runningTotalDollars equals itself minus the value of "hundreds"
		
		//But we need:
		//runingTotalDollars -= (hundreds * 100);
		//which means runningTotalDollars equals itself minus the value of "hundreds times 100"
		
		//We can find it by displaying the value of variables at each line. Then we can see when something isn't the value we expect
		//The reason for the error: we were subtracting the amount of hundreds we needed from the running total instead of the total dollar value of the amount
		//ex: if three $100 bills are needed, we would subtract 3, not 300, causing the error. It cascades from there so finding it via the println statements early is a good idea.
		
		
		runningTotalDollars -= (hundreds * 100);
		//System.out.println("runningTotalDollars before 50 calc is " + runningTotalDollars); //debugging line
		fiftys = runningTotalDollars / 50;
		//System.out.println("fiftys is " + fiftys); //debugging line
		runningTotalDollars -= (fiftys * 50);
		//System.out.println("after fifys calc. runningTotalDollars is " + runningTotalDollars); //debugging line
		
		
		//now lets continue with the remaining bills without the debugging lines (unless we need them)
		
		twenties = runningTotalDollars / 20;
		runningTotalDollars -= (twenties * 20); //subtracting the amount of cash in 20's
		tens = runningTotalDollars / 10;
		runningTotalDollars -= (tens * 10); //subtracting the amount of cash in 10's
		fives = runningTotalDollars / 5;
		runningTotalDollars -= (fives * 5); //subtracting the amount of cash in 5's
		ones = runningTotalDollars / 1; // technically we could skip this calculation but for readability it is included
		runningTotalDollars -= (runningTotalDollars * 1); //subtracting the amount of cash in 1's. We could skip this calculation but it is also included for readability.
		
		//note: an alternative way of doing this may be in the style of the following:
		//fiftys = (dollarsChange - (hundreds * 100)) / 50;
		//test later
		
		
		
		////Display results for underpaid employee
		
		System.out.println("Which is: ");	
		System.out.println(hundreds + " $100 bills");
		System.out.println(fiftys + " $50 bills");
		System.out.println(twenties + " $20 bills");
		System.out.println(tens + " $10 bills");
		System.out.println(fives + " $5 bills");
		System.out.println("and " + ones + " $1 bills");
		
		
		//next the change. How do we do that? We do the same thing, but we use the lefover cents instead of the dollars
		//it looks like this:
		
		//calculate bills. This will look familiar
		runningTotalCents = centsChange; //sets our running total to the total amount of cents. Note this totally ignores the dollars and only focuses on the cents.
		
		//there are no current US coins in wide circulation for 100 or 50 so we skip those
		
		quarters = runningTotalCents / 25;
		runningTotalCents -= (quarters * 25); //subtracting the amount of cash in quarters
		dimes = runningTotalCents / 10;
		runningTotalCents -= (dimes * 10); //subtracting the amount of cash in dimes
		nickels = runningTotalCents / 5;
		runningTotalCents -= (nickels * 5); //subtracting the amount of cash in nickels
		pennies = runningTotalCents / 1; // technically we could skip this calculation but for readability it is included
		runningTotalCents -= (pennies * 1); //subtracting the amount of change left in pennies. We could skip this calculation but it is also included for readability.
		
		
		System.out.println("And since we probably are required by law to give the customer their change, go ahead and do so. It pains us to lose corporate profits, but sometimes it must be done to avoid lawsuits");
		System.out.println("Please make sure they receive: ");
		
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println("and " + pennies + " pennies");
		
		System.out.println("Underpaid Employee: Please make sure this adds up EXACTLY to: ");
		System.out.println(dollarsChange + " Dollars" + " and " + centsChange + " Cents");
		System.out.print("Written as: $" + dollarsChange + ".");
		System.out.printf("%02d", centsChange); //% means its a string, 0 is for no leading zero. 2 is for two total zeros, d means its a number
		System.out.println(""); //adding a newline
		System.out.println("Or it's coming out of your measily check. However, we keep all surpluses because corporate likes them");
		System.out.println("Please tell the customer to have a great day. Corporate values them on paper");
		
	}

}
