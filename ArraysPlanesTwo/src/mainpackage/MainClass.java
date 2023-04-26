package mainpackage;

import java.util.Scanner;
import java.util.Random;

public class MainClass {
	
	
	public static final int planeCapacity = 1000;
	public static Plane[] thePlanes = new Plane[planeCapacity]; //makes an array capable of holding 100 planes
	
	public static void main(String[] args) 
	{
		
		//fill up the carrier
		for(int i = 0; i < planeCapacity; i++)
		{
			Plane aPlane = new Plane(); //makes a single plane
			thePlanes[i] = aPlane;		
		}
		
		
		
		
		//pulls plane 34 from array
		Plane exampleInArray = thePlanes[34];
		
		//makes an int and pulls the weight from the plane we pulled
		int weightOfPlane = exampleInArray.getWeight();
		
		//prints the weight of the plane we pulled
		//System.out.println("Weight of plane is " + weightOfPlane);
		
		//prints the id of the plane we pulled
		//System.out.println("ID of the plane is " + exampleInArray.planeIDNum);
		
		
		//int apples;
		//Plane somePlane;
		
		//apples = 5;
		//somePlane = new Plane();

		
		//display ids of all planes	
		for(int i = 0; i < planeCapacity; i++)
		{
			System.out.println("Plane in spot " + i + " has id of " + thePlanes[i].planeIDNum);
		}
		
		
		//lets try to find a plane with a specific id
		Plane planeWeFound = searchForPlane(thePlanes, 4);
		
		if(planeWeFound.planeIDNum == -1)
		{
			System.out.println("Plane not found...");
		}
		else
		{
			System.out.println("Plane found! " + " its weight is " + planeWeFound.getWeight());
		}
				
		
		
		
		
	}
	
	
	//perform linear search and return plane with specific id
	public static Plane searchForPlane(Plane[] arrayToSearch, int idSearchingFor)
	{
		int idNotFound = -1; // if not found
		boolean foundPlane = false;
		Plane planeWeFound = new Plane();
		planeWeFound.planeIDNum = idNotFound;
		
		
		//look at every plane in the array
		for(int i = 0; i < planeCapacity; i++)
		{
			if(arrayToSearch[i].planeIDNum == idSearchingFor) //if plane we are looking at has an id matching the id we are searching for
			{
				// we found the plane
				planeWeFound = arrayToSearch[i];
				System.out.println("Found the plane! It is at spot " + i );
				foundPlane = true;
				break; //exits the loop
			}
			else
			{
				//not the plane we are searching for in this spot:)
			}
		}
		
		
		return planeWeFound;
		
		
	}
	
	
}

