package mainpackage;

import java.util.Scanner;

//printf formatting code: $%,d\n


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
	static double amountOver;
	static double taxRefundOrDue; //either tax refund or taxes due
	
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
			System.out.printf("AGI: $%,d\n", agi);
			
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
			System.out.printf("Deduction: $%,d\n", deduction);
			
			double printTaxableIncome = (double)taxableIncome;
			System.out.printf("Taxable Income: $%,d\n", taxableIncome);
			
			
			//calcuating taxes...
			
			//for filing status single
			if(status == 1)
			{
				//tax calculation
				
				if(taxableIncome <= 10000)
				{
					taxRate = 0.1;	
					tempTax = taxableIncome * taxRate;
					additionalTaxQuantity = 0;
				}
				else if(taxableIncome > 10000 && taxableIncome <= 40000)
				{
					taxRate = 0.12;
					additionalTaxQuantity = 1000;
					amountOver = taxableIncome - 10000;
					tempTax = amountOver * taxRate;
					
				}
				else if(taxableIncome > 40000 && taxableIncome <= 85000)
				{
					taxRate = 0.22;
					additionalTaxQuantity = 4600;
					amountOver = taxableIncome - 40000;
					tempTax = amountOver * taxRate;
					
				}
				else if(taxableIncome > 85000)
				{
					taxRate = 0.24;
					additionalTaxQuantity = 14500;			
					amountOver = taxableIncome - 85000;
					tempTax = amountOver * taxRate;
					
				}
				else
				{
					System.out.println("Error invalid tax bracket");
				}
				
				
				
			}
			else if(status == 2) 	//for filing status married
			{
				//tax calculation
				
				//calculate taxable income		
				taxableIncome = agi - deduction;
				
				//set result to 0 if negative
				if(taxableIncome <= 0)
				{
					taxableIncome = 0;
				}
				
			
				
				//calculating taxes...
				
				//for filing status single

					//tax calculation
					
					if(taxableIncome <= 20000)
					{
						taxRate = 0.1;	
						tempTax = taxableIncome * taxRate;
						additionalTaxQuantity = 0;
					}
					else if(taxableIncome > 20000 && taxableIncome <= 80000)
					{
						taxRate = 0.12;
						additionalTaxQuantity = 2000;
						amountOver = taxableIncome - 20000;
						tempTax = amountOver * taxRate;
						
					}
					else if(taxableIncome > 40000 && taxableIncome <= 85000)
					{
						taxRate = 0.22;
						additionalTaxQuantity = 4600;
						amountOver = taxableIncome - 40000;
						tempTax = amountOver * taxRate;
						
					}
					else if(taxableIncome > 80000)
					{
						taxRate = 0.22;
						additionalTaxQuantity = 9200;			
						amountOver = taxableIncome - 80000;
						tempTax = amountOver * taxRate;
						
					}
					else
					{
						System.out.println("Error invalid tax bracket");
					}
					
					

			
			}//end else if status == 2
			
			//calculate final taxes
			double finalTax = tempTax + additionalTaxQuantity;
			finalTax = Math.round(finalTax);
			
			int finalTaxInt = (int)finalTax;
			
			//print federal taxes
			System.out.printf("Federal Tax: $%,d\n", finalTaxInt);
			
			//see how much tax is owed
			taxRefundOrDue = finalTax - taxesWithheld;
			
			int taxRefundOrDueInt = (int)taxRefundOrDue;
			
			if(taxRefundOrDueInt >= 0)
			{
				//then they owe taxes	
				System.out.printf("Taxes Owed: $%,d\n", taxRefundOrDueInt);
				
			}
			else
			{
				//they owe less tax than was witheld, they get a refund
				taxRefundOrDueInt = taxRefundOrDueInt * -1; //make it positive for display
				System.out.printf("Tax Refund: $%,d\n", taxRefundOrDueInt);
				
			}
			
			
		} //end if statement for agi <= 120000
		else
		{
			//program stops. agi is too high.
			System.out.println("Error: Income too high to use this form");
		}

	}

}
