package mainpackage;

import java.io.File;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] exampleArray = new int[1];
		
		int[][] exampleTable = new int[4][4];
		
		exampleArray[0] = 5;
		
		Vinyl aDisk = new Vinyl("Tyler Thomas");
		
		System.out.println("Name of the artist of the vinyl is " + aDisk.artistName);
		
		
		try
		{
		 File myObj = new File("neatFile.csv");
		 Scanner myReader = new Scanner(myObj);
		 myReader.nextLine();
		    while (myReader.hasNextLine()) 
		    {
		        String data = myReader.nextLine();
		        String[] splitData = data.split(",");  
		       //System.out.println(splitData[0]);
		    }
		    
		    
		}
		catch(Exception e)
		{
			System.out.println("The file don't exist but it's all good");
		}
		
		
		for(int i = 0; i < 4; i++)
		{
			for(int r = 0; r < 4; r++)
			{
				exampleTable[i][r] = 200;
			}
			
		}
		

	}

}
