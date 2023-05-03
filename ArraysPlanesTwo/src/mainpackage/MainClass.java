package mainpackage;

import java.util.Scanner;
import java.util.Random;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors

public class MainClass {
	
	//assuming 80 percent probabilty success per engagement
	public static final int planeCapacity = 1000;
	public static Plane[] thePlanes = new Plane[planeCapacity]; //makes an array capable of holding 100 planes
	private static int pilotCounter = 0;
	private static int planeSearchingFor = 4;
	private static Random theGenerator = new Random();
	
	private static int blueScore = 0;
	private static int redScore = 0;
	
	
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

		

		printAllPlanes(thePlanes);
		
		//lets try to find a plane with a specific id
		Plane planeWeFound = searchForPlane(thePlanes, planeSearchingFor);
		
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
		    myReader.nextLine();
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
		        
		        //System.out.println(thePlanes[0].assignedPilot.rank);
		        
		        
		        

		        
		        
		        //System.out.println(data);
		    }
		      myReader.close();
		    } 
		    catch (FileNotFoundException e) 
			{
		      System.out.println("An error occurred.");
		      e.printStackTrace();
			}
		
		
		
		//if we found the plane
		if(planeWeFound.planeIDNum != -1)
		{
			//refer to the pilot
			Pilot pilotOfPlane = planeWeFound.assignedPilot;
			//and print his/her data
			printPilotData(pilotOfPlane);
		}
		
		
		
		//sort planes
		sortPlanesByID(thePlanes);
		
		//print sorted planes
		System.out.println("----------------Sorting complete-------------------");
		System.out.println("Array now looks like:");
		printAllPlanes(thePlanes);
		
		simulateEngagement(thePlanes);
		
		
		
		
	}
	
	public static void printAllPlanes(Plane[] arrayToPrint)
	{
		//display ids of all planes	
		for(int i = 0; i < planeCapacity; i++)
		{
			System.out.println("Plane in spot " + i + " has id of " + arrayToPrint[i].planeIDNum);
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
	
	//sort array of planes via bubble sort
	public static void sortPlanesByID(Plane[] arrayOfPlanes)
	{
		Plane tempParkingSpot;
		
		boolean started = false;
		boolean changeOccuredInPass = true;
		//as long as (while) it aint done
		//do a pass and repeat until done
		
		//its done when all planes with their ids are in numerical order
		//its in numerical order when we can go across the entire array without moving anything
		
		while(changeOccuredInPass == true || started == false)
		{
		started = true;
		changeOccuredInPass = false;
		//begin pass
		for(int i = 0; i < (arrayOfPlanes.length-1); i++)
		{
			//lets assume we don't need to make a change
			//done = true;
			if(arrayOfPlanes[i].planeIDNum > arrayOfPlanes[i+1].planeIDNum) //switch is needed
			{
				
				tempParkingSpot = arrayOfPlanes[i+1]; //move next plane to parking spot
				arrayOfPlanes[i+1] = arrayOfPlanes[i]; //move current plane to next plane spot	
				arrayOfPlanes[i] = tempParkingSpot; //move next plane (in temp parking spot) to original position
				
				//change happened. not done
				//done = false;
				changeOccuredInPass = true;
				
				
			}
			
			
		}
		
		//end pass
		
		}
	}
	
	
	public static void printPilotData(Pilot dataToPrint)
	{
		//print pilot data
		System.out.println(dataToPrint.rank + " " + dataToPrint.first_name + " " + dataToPrint.last_name + " is assigned to this aircraft");
		
	}
	
	public static void simulateEngagement(Plane[] allPlanes)
	{
		//this will simulate engagement of 1000 adversarial aircraft with 80% success rate
		
		AudioTest startAudio = new AudioTest();
		startAudio.playSound();
		
		for(int i = 0; i < allPlanes.length; i++)
		{
			int successOrFail;
			boolean success = false;
			successOrFail = theGenerator.nextInt(5);
			System.out.println(allPlanes[i].assignedPilot.first_name + " " + allPlanes[i].assignedPilot.last_name + " in plane " + allPlanes[i].planeIDNum + " Engages enemy aircraft");
			
			if(successOrFail != 0)
			{
				success = true;
				System.out.println("And Wins!");
				blueScore++;
				
			}
			else
			{
				success = false;
				System.out.println("Unfortunately, did not win");
				allPlanes[i].stillExists = false;
				redScore++;
			}
			
			
			
			
		}
		
		
		for(int i = 0; i < allPlanes.length; i++)
		{
			if(allPlanes[i].stillExists == true)
			{
				System.out.println(allPlanes[i].assignedPilot.first_name + " with " + "Plane " + allPlanes[i].planeIDNum + " came back safely");
			}
			else
			{
				System.out.println(allPlanes[i].assignedPilot.first_name + " with " + "Plane " + allPlanes[i].planeIDNum + " has not returned");		
			}
		}
		
		
		
		
		System.out.println("Blue score: " + blueScore);
		System.out.println("Red score: " + redScore);
		
		if(blueScore > redScore)
		{
			System.out.println("Blue Team Wins!");
		}
		else
		{
			System.out.println("Red team wins!");
		}
		
		
		
		
	}
	
	
}

