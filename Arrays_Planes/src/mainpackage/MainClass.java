package mainpackage;

import java.util.Scanner;
import java.util.Random;

public class MainClass {
	
	
	public static Random weightGenerator = new Random();

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//bad way
		int firstPlaneWeight;
		int secondPlaneWeight;
		int thirdPlaneWeight;
		int fourthPlaneWeight;
		int fifthPlaneWeight;
		
		int carrierWeightCapacity = 105000; //105,000 tons
		int weightOfAllPlanes = 0;
		
		//better way
		int[] planeWeight = new int[85];
		
		
		
		
		Scanner scnr = new Scanner(System.in);
		
		
		/*
		System.out.println("Please enter the total weight of the first plane on the carrier");
		firstPlaneWeight = scnr.nextInt();
		
		System.out.println("Please enter the total weight of the second plane on the carrier");
		secondPlaneWeight = scnr.nextInt();
		
		System.out.println("Please enter the total weight of the third plane on the carrier");
		thirdPlaneWeight = scnr.nextInt();
		
		System.out.println("Please enter the total weight of the fourth plane on the carrier");
		fourthPlaneWeight = scnr.nextInt();
		
		System.out.println("Please enter the total weight of the fifth plane on the carrier");
		fifthPlaneWeight = scnr.nextInt();
		
		*/
		
		//would be really neat if could do this
		
		/*
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Please enter the weight for plane number " + i);
			
			//ONLY works for first plane....
			firstPlaneWeight = scnr.nextInt();
		}
		
		*/
		
		//awesome way....but comes from user so very slow
		/*
		for(int i = 0; i < 85; i ++)
		{
			System.out.println("Please enter the weight for plane number " + i);
			//the awsesome part
			planeWeight[i] = scnr.nextInt();
		}
		*/
		
		//this will generate weight for each plane
		for(int i = 0; i < 85; i ++)
		{
			//System.out.println("Please enter the weight for plane number " + i);
			//the awsesome part
			//planeWeight[i] = scnr.nextInt();
			
			//weightGenerator();
			
			//will fill entire array
			planeWeight[i] = weightGenerator();
			
		}
		
		
		//now lets print all the weights in the array
		
		for(int i = 0; i < 85; i++)
		{
			System.out.println("The weight of plane " + i + " is " + planeWeight[i]);
		}
		
		//lets see if carrier is over capacity
		
		for(int i = 0; i < 85; i++)
		{
			weightOfAllPlanes += planeWeight[i]; //adds up total weight of all planes
		}
		
		System.out.println("The total weight of the planes is " + weightOfAllPlanes);
		
		if(weightOfAllPlanes > carrierWeightCapacity)
		{
			System.out.println("uh oh. Carrier is " + (weightOfAllPlanes - carrierWeightCapacity) + " over capacity");
			System.out.println("Might be a good idea to lose some planes. Just, you know, officially and all that");
		}
		else
		{
			System.out.println("You can put " + (carrierWeightCapacity - weightOfAllPlanes) + " more tons on that carrier");
			System.out.println("Hope you've got a few billion handy for the planes");
			
		}
		

		
	}
	
	
	public static int weightGenerator()
	{

		int weight;
		weight = weightGenerator.nextInt(50) + 1;
		
		return weight;
	}

}
