package mainpackage;

import java.util.Scanner;
import java.util.Random;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors

public class MainClass {
	
	
	public static final int planeCapacity = 1000;
	public static Plane[] thePlanes = new Plane[planeCapacity]; //makes an array capable of holding 100 planes
	private static int pilotCounter = 0;
	
	
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
				
		
		
		//read file
		try 
		{
		    File myObj = new File("MOCK_DATA.csv");
		    Scanner myReader = new Scanner(myObj);
		    while (myReader.hasNextLine()) 
		    {
		        String data = myReader.nextLine();
		        String[] splitData = data.split(",");  
		       //System.out.println(splitData[0]);
		        
		         
		        Pilot nextPilot = new Pilot();
		       //should read data and add it to the nextPilot

		        nextPilot.rank = splitData[0];
		        nextPilot.service_number = Integer.parseInt(splitData[1]);
		        nextPilot.first_name = splitData[2];
		        nextPilot.last_name = splitData[3];
		        nextPilot.dateOfAward = splitData[4];
		        nextPilot.country = splitData[5];
		        nextPilot.aircraft_type = splitData[6];
		        nextPilot.flight_hours = Integer.parseInt(splitData[7]);
		        nextPilot.flight_missions = Integer.parseInt(splitData[8]);
		        nextPilot.flight_awards = splitData[9];
		        
		        //assign pilot to plane
		        thePlanes[pilotCounter].assignedPilot = nextPilot;
		        pilotCounter++;
		        
		        System.out.println(thePlanes[0].assignedPilot.rank);
		        
		        
		        

		        
		        
		        //System.out.println(data);
		    }
		      myReader.close();
		    } 
		    catch (FileNotFoundException e) 
			{
		      System.out.println("An error occurred.");
		      e.printStackTrace();
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

