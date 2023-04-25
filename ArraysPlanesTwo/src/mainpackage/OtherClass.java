package mainpackage;

import java.util.Scanner;
import java.util.Random;

public class OtherClass {
	
	
	public static Random randGenerator = new Random();
	public static int[] planeWeight;
	public static void oldMain() 
	{
		// TODO Auto-generated method stub
		
		//bad way
		int firstPlaneWeight;
		int secondPlaneWeight;
		int thirdPlaneWeight;
		int fourthPlaneWeight;
		int fifthPlaneWeight;
		
		final int carrierPlaneCapacity = 85;
		
		int carrierWeightCapacity = 105000; //105,000 tons
		int weightOfAllPlanes = 0;
		
		//better way
		planeWeight = new int[carrierPlaneCapacity];
		double[] planeFuelPercent = new double[carrierPlaneCapacity];	
		double[][] hullIntegrity = new double[85][85];
		
		Plane[] planes = new Plane[carrierWeightCapacity];
		
		//fill up the carrier
		
		for(int i = 0; i < carrierPlaneCapacity; i++)
		{
			Plane newPlane = new Plane();
			planes[i] = newPlane;		
		}
		
		int planeWeightTotal = 0;
		int totalCannonRounds = 0;
		
		for(int i = 0; i < carrierPlaneCapacity; i++)
		{
			planeWeightTotal += planes[i].getWeight();
			totalCannonRounds += planes[i].planeArmaments[0].capacity;
		}
		
		System.out.println("The total weight of all planes on the carrier is " + planeWeightTotal);
		
		
		
		
		
		
		String [] nameOfAllPlanes = new String[carrierPlaneCapacity];
		
		
		
		
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
		for(int i = 0; i < carrierPlaneCapacity; i ++)
		{
			//System.out.println("Please enter the weight for plane number " + i);
			//the awsesome part
			//planeWeight[i] = scnr.nextInt();
			
			//weightGenerator();
			
			//will fill entire array
			planeWeight[i] = weightGenerator();
			
		}
		
		//this will generate fuel for each plane
		for(int i = 0; i < carrierPlaneCapacity; i++)
		{
			planeFuelPercent[i] = fuelGenerator();		
		}
		
		//this will generate hull integrity
		//for every row
		for(int i = 0; i < carrierPlaneCapacity; i++)
		{
			
			//for loop to drop down to next row
			//for every column
			for(int j = 0; j < carrierPlaneCapacity; j++)
			{
				
				hullIntegrity[i][j] = fuelGenerator();
			}
	
		}
		
		for(int i = 0; i < carrierPlaneCapacity; i++)
		{
			
			//for loop to drop down to next row
			//for every column
			for(int j = 0; j < carrierPlaneCapacity; j++)
			{
				
				//System.out.println( "row " + i + " column " + j + " " +  hullIntegrity[i][j]);
			}
	
		}
		
		/*
		if(i > carrierPlaneCapacity)
		{
			i = planeFuelPercent.length;
			break;
		}
		*/
		
		//now lets print all the weights in the array
		
		for(int i = 0; i < carrierPlaneCapacity; i++)
		{
			//System.out.println("The weight of plane " + i + " is " + planeWeight[i]);
			
			//coolness of parallel arrays
			//System.out.println("This plane has " + planeFuelPercent[i] + " percent fuel remaining");
		}
		
		

		
		
		
		//lets see if carrier is over capacity
		
		for(int i = 0; i < carrierPlaneCapacity; i++)
		{
			weightOfAllPlanes += planeWeight[i]; //adds up total weight of all planes
		}
		
		//System.out.println("The total weight of the planes is " + weightOfAllPlanes);
		
		if(weightOfAllPlanes > carrierWeightCapacity)
		{
			//System.out.println("uh oh. Carrier is " + (weightOfAllPlanes - carrierWeightCapacity) + " over capacity");
			//System.out.println("Might be a good idea to lose some planes. Just, you know, officially and all that");
		}
		else
		{
			//System.out.println("You can put " + (carrierWeightCapacity - weightOfAllPlanes) + " more tons on that carrier");
			//System.out.println("Hope you've got a few billion handy for the planes");
			
		}
		
		
		
		
		
		
		
		  if(planeWeight[0] > planeFuelPercent[0])
		  {
			  //System.out.println("plane weight is larger than its fuel percentage");
		  }
		 
		
		
		
		
		//average weight of a plane
		weightOfAllPlanes = 0;
		for(int i = 0; i < carrierPlaneCapacity; i ++)
		{
			//weight of all planes already calculated
			//put here for reference
			weightOfAllPlanes += planeWeight[i]; //adds up total weight of all planes
		}
		int averagePlaneWeight = weightOfAllPlanes / planeWeight.length;
		
		//System.out.println("Average plane weight is " + averagePlaneWeight);
		
		
		
		
		
		//find the plane with the least weight
		
		int smallestWeight = planeWeight[0];
		int spotInCarrier = 0;
		
		for(int i = 1; i < carrierPlaneCapacity; i++)
		{
			if(planeWeight[i] < smallestWeight)
			{
				smallestWeight = planeWeight[i];
				spotInCarrier = i;
			}
		}
		
		//System.out.println("The smallest plane weighs " + smallestWeight);
		//System.out.println("And it is at spot " + spotInCarrier);
		
		
		//find the plane with the least weight
		
		int largestWeight = planeWeight[0];
		int spotOfLargestInCarrier = 0;
		
		for(int i = 1; i < carrierPlaneCapacity; i++)
		{
			if(planeWeight[i] > largestWeight)
			{
				largestWeight = planeWeight[i];
				spotOfLargestInCarrier = i;
			}
		}
		
		//System.out.println("The largest plane weighs " + largestWeight);
		//System.out.println("And it is at spot " + spotOfLargestInCarrier);
		
		
		
		
		
		//System.out.println("Begin findWeights function output");
		int[] largePlaneParking = new int[85];
		int[] foundLargePlanes = findWeights(planeWeight, largePlaneParking);
		
		
		
		for(int i = 0; i < foundLargePlanes.length; i++)
		{
			//System.out.println("Large plane at position " + i + " has a weight of  " + foundLargePlanes[i] + " tons");
			//System.out.println("And this plane is in parking spot " + largePlaneParking[i]);
		}
		
		
		
		
		Plane firstPlane = new Plane();
		firstPlane.getWeight();
		
		
		
		
		
		
		

		
	}
	
	
	public static int weightGenerator()
	{

		int weight;
		weight = randGenerator.nextInt(50) + 1;
		
		return weight;
	}
	
	public static double fuelGenerator()
	{

		double fuel;
		fuel = randGenerator.nextDouble(100);
		
		return fuel;
	}
	
	public static int[] findWeights(int[] arrayToSearch, int[]largePlaneParkingSpots)
	{
		int[] largePlanes = new int[85];
		int currentSpot = 0;
		
		for(int i = 0; i < 85; i++)
		{
			if(arrayToSearch[i] > 30) //found a plane weighing more than 30 tons
			{
				largePlanes[currentSpot] = arrayToSearch[i]; //stuff a copy of this in the largePlanesArray
				largePlaneParkingSpots[currentSpot] = i;
				currentSpot++;
			}
		}
		
		
		return largePlanes;
	}
	

}
