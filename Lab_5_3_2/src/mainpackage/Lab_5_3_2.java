package mainpackage;

import java.util.Scanner;

public class Lab_5_3_2 {

	static int wages;
	static int taxableInterest;
	static int unemploymentCompensation;
	static int status; //can be 1 or 2
	static int taxesWithheld;
	static int deduction;
	static int taxableIncome;
	static double taxAmount;
	static double taxRate;
	static double additionalTaxQuantity = 0;
	static double tempTax= 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		//System.out.println("Ready");
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
			double printAgi = (double)agi;
			System.out.printf("AGI: $%.2f", printAgi);
			System.out.println("");
			
			//if status is not 1 or 2, it will become 1
			
			if(status != 1 && status != 2) //if status is either not 1 or not 2, it will be 1
			{
				status = 1;
			}
			
			//once status is figured out, figure out deduction
			
			if(status == 1)
			{
				//deduction amount would be 12000
				deduction = 12000;
			}
			else if (status == 2)
			{
				//deduction amount would be 24000
				deduction = 24000;
			}
			else
			{
				//blank for now
			}
			
			//calculate taxable income		
			taxableIncome = agi - deduction;
			
			//set result to 0 if negative
			if(taxableIncome <= 0)
			{
				taxableIncome = 0;
			}
			
			double printDeduction = (double)deduction;
			System.out.printf("Deduction: $%.2f", printDeduction);
			System.out.println("");
			
			double printTaxableIncome = (double)taxableIncome;
			System.out.printf("Taxable Income: $%.2f", printTaxableIncome);
			System.out.println("");
			
			
			//calcuating taxes...
			
			//for filing status single
			if(status == 1)
			{
				//tax calculation
				
				if(taxableIncome <= 10000)
				{
					taxRate = 0.1;
				}
				else if(taxableIncome > 10000 && taxableIncome <= 40000)
				{
					additionalTaxQuantity = 1000;
					double amountOver;
					amountOver = taxableIncome - 10000;
					tempTax = amountOver * 0.12;
					
				}
				else if(taxableIncome > 40000 && taxableIncome <= 85000)
				{
					additionalTaxQuantity = 4600;
					double amountOver;
					amountOver = taxableIncome - 40000;
					tempTax = amountOver * 0.22;
					
				}
				else if(taxableIncome > 85000)
				{
					additionalTaxQuantity = 14500;
					double amountOver;
					amountOver = taxableIncome - 85000;
					tempTax = amountOver * 0.24;
					
				}
				else
				{
					System.out.println("Error invalid tax bracket");
				}
				
				
				//calculate final taxes
				double finalTax = tempTax + additionalTaxQuantity;
				
			}
			else if(status == 2) 	//for filing status married
			{
				//tax calculation
			}
			else
			{
				System.out.println("Error!");
			}
			
			
			
		
			
			
			
			
			
			
		} //end if statement for agi <= 120000
		else
		{
			//program stops. agi is too high.
			System.out.println("Error: Income too high to use this form");
		}

	}

}
