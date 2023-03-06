package mainpackage;

import java.util.Scanner;

public class Lab_5_3_2 {

	static int wages;
	static int taxableInterest;
	static int unemploymentCompensation;
	static int status; //can be 1 or 2
	static int taxesWithheld;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Ready");
		wages = scnr.nextInt();
		taxableInterest = scnr.nextInt();
		unemploymentCompensation = scnr.nextInt();
		status = scnr.nextInt();
		taxesWithheld = scnr.nextInt();
		
		int agi = wages + taxableInterest + unemploymentCompensation;
		
		if(agi <= 120000)
		{
			//agi is low enough, fellow poor person
			//program continues	
			System.out.println("AGI: $" + agi);
		}
		else
		{
			//program stops. agi is too high.
			System.out.println("Error: Income too high to use this form");
		}

	}

}
