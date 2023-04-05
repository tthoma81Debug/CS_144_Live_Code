package mainpackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class MainClass {

	//more like a class than a variable. Makes an enum called PlayingCard available and gives possible values
	//Does NOT declare or initialize an actual enum
	public enum PlayingCard{TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING,ACE};
	
	//declares and intializes a string
	public String testString = "test";
	
	/*
	public void writeFile()
	{
		PrintWriter outfile= new PrintWriter(new File("filename"));
	}
	*/
	
	/*
	public static void createFile() throws FileNotFoundException //throws a fit (exception)
	{
		PrintWriter outfile = new PrintWriter (new File("filename"));
	}
	*/
	
	
	public static void convertNumber() throws InputMismatchException
	{
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please enter a number and definitely not a string");
		int enteredNumber;
		enteredNumber = scnr.nextInt();
		
		System.out.println("you entered " + enteredNumber);
	}
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		
		
		System.out.println("making a file");
		
		//creates an object of type File that can "hold" a file
		//File theFile = new File("Stuff_Files_Here\\Oh_Look_A_File.txt");
		
	
		//FileWriter theFile = new FileWriter("Stuff_Files_Here\\Oh_Look_A_File.txt", true);
		
		//creates an object of type PrintWriter that can write actual files
		//PrintWriter outFile = new PrintWriter(theFile);
		
		/*
		PrintWriter outFile = new PrintWriter(theFile);
		
		outFile.println("Dont make me count to 5,000,000");
		
		
		for(int i = 1; i <= 5000000; i++)
		{
			
			//When combined with the PrintWriter and a println statement, this line creates new files in the directory. Use with caution.
			//File theFile = new File("Stuff_Files_Here\\Oh_Look_A_File" + i + ".txt");

			outFile.println(i);
		}
		
		
		outFile.println("Phew....that was a lot of counting. Care to count again?");
		
		//outFile.println("Here is a line in the file");
		//outFile.println("here is another line");
		
		//outFile.close();
*/
		//open file for reading
		File fileToRead = new File("Stuff_Files_Here\\Oh_Look_A_File.txt");
		Scanner inFile = new Scanner(fileToRead);
		
		long sum = 0;
		long nextVariable;
		
		while(inFile.hasNext())
		{
			
			try 
			{
				nextVariable = inFile.nextLong();
				System.out.println("Just read " + nextVariable);
				sum += nextVariable;
				System.out.println("Sum is now " + sum);
			}
			catch(InputMismatchException e)
			{
				System.out.println("Current line is not a number");
				inFile.nextLine();
			}
		}
		
		//System.out.println("The next line in the file is: ");
		//System.out.println(inFile.nextLine());
		
		inFile.close();
		
		
		

		/*
		boolean humanCooperated = false;
		while(humanCooperated == false)
		{
		
		try
		{
			convertNumber();
			humanCooperated = true;
		}
		catch(InputMismatchException e)
		{
			System.out.println("You think this is funny dont you?....");
			System.out.println("You are busted");
			System.out.println("I'm telling the ai on you");
			
			System.out.println("This is what you wanted to see. Right?");
			e.printStackTrace();
			
			System.out.println("But you know. I'm still running, and still logging stuff");
			System.out.println("Lets try that again");
			
			
			
		}
		
		}
		
		/*
		try //handling the fit (exeption)
		{
			createFile();
		}
		catch(Exception e)
		{
			//does nothing, (but doesn't crash)
			System.out.println("Uh oh. We just had an exception. hang tight...");
			e.printStackTrace();
		}
		
		*/
		
		/*
		Random draw = new Random(); 
		int firstPlayerRoll;
		int secondPlayerRoll;
		int playerOneWins = 0;
		int playerTwoWins = 0;
		
		for(int i = 0; i < 500000; i++)
		{
			

		
		System.out.println("Begin Game!");
		firstPlayerRoll = draw.nextInt(13);//get random number of 0 through 12
		secondPlayerRoll = draw.nextInt(13); //same as above
		
		//declares and initializes an actual enum
		PlayingCard firstPlayerCard = PlayingCard.TWO;
		PlayingCard secondPlayerCard = PlayingCard.THREE;

		if(firstPlayerRoll == 0)
		{
			firstPlayerCard = PlayingCard.TWO;
		}
		else if(firstPlayerRoll == 1)
		{
			firstPlayerCard = PlayingCard.THREE;
		}
		else if(firstPlayerRoll == 2)
		{
			firstPlayerCard = PlayingCard.FOUR;
		}
		else if(firstPlayerRoll == 3)
		{
			firstPlayerCard = PlayingCard.FIVE;
		}
		else if(firstPlayerRoll == 4)
		{
			firstPlayerCard = PlayingCard.SIX;
		}
		else if(firstPlayerRoll == 5)
		{
			firstPlayerCard = PlayingCard.SEVEN;
		}
		else if(firstPlayerRoll == 6)
		{
			firstPlayerCard = PlayingCard.EIGHT;
		}
		else if(firstPlayerRoll == 7)
		{
			firstPlayerCard = PlayingCard.NINE;
		}
		else if(firstPlayerRoll == 8)
		{
			firstPlayerCard = PlayingCard.TEN;
		}
		else if(firstPlayerRoll == 9)
		{
			firstPlayerCard = PlayingCard.JACK;
		}
		else if(firstPlayerRoll == 10)
		{
			firstPlayerCard = PlayingCard.QUEEN;
		}
		else if(firstPlayerRoll == 11)
		{
			firstPlayerCard = PlayingCard.KING;
		}
		else if(firstPlayerRoll == 12)
		{
			firstPlayerCard = PlayingCard.ACE;
		}
		else
		{
			System.out.println("Error!");
			firstPlayerCard = PlayingCard.TWO;
		}
		
		
		
		
		
		//for second player
		if(secondPlayerRoll == 0)
		{
			secondPlayerCard = PlayingCard.TWO;
		}
		else if(secondPlayerRoll == 1)
		{
			secondPlayerCard = PlayingCard.THREE;
		}
		else if(secondPlayerRoll == 2)
		{
			secondPlayerCard = PlayingCard.FOUR;
		}
		else if(secondPlayerRoll == 3)
		{
			secondPlayerCard = PlayingCard.FIVE;
		}
		else if(secondPlayerRoll == 4)
		{
			secondPlayerCard = PlayingCard.SIX;
		}
		else if(secondPlayerRoll == 5)
		{
			secondPlayerCard = PlayingCard.SEVEN;
		}
		else if(secondPlayerRoll == 6)
		{
			secondPlayerCard = PlayingCard.EIGHT;
		}
		else if(secondPlayerRoll == 7)
		{
			secondPlayerCard = PlayingCard.NINE;
		}
		else if(secondPlayerRoll == 8)
		{
			secondPlayerCard = PlayingCard.TEN;
		}
		else if(secondPlayerRoll == 9)
		{
			secondPlayerCard = PlayingCard.JACK;
		}
		else if(secondPlayerRoll == 10)
		{
			secondPlayerCard = PlayingCard.QUEEN;
		}
		else if(secondPlayerRoll == 11)
		{
			secondPlayerCard = PlayingCard.KING;
		}
		else if(secondPlayerRoll == 12)
		{
			secondPlayerCard = PlayingCard.ACE;
		}
		else
		{
			System.out.println("Error!");
			secondPlayerCard = PlayingCard.TWO;
		}
		
		
		if(secondPlayerCard == firstPlayerCard)
		{
			System.out.println("draw!");
		}
		else if(firstPlayerCard.ordinal() > secondPlayerCard.ordinal())
		{
			System.out.println("first player wins");
			System.out.println("with a " + firstPlayerCard);
			System.out.println("second player loses");
			System.out.println("with a " + secondPlayerCard);
			playerOneWins++;
		}
		else if(firstPlayerCard.ordinal() < secondPlayerCard.ordinal())
		{
			System.out.println("first player loses");
			System.out.println("with a " + firstPlayerCard);
			System.out.println("second player wins");
			System.out.println("with a " + secondPlayerCard);
			playerTwoWins++;
		}
		
		System.out.println("Player One has won " + playerOneWins + " rounds");
		System.out.println("Player Two has won " + playerTwoWins + " rounds");
		
		} //end loop
		/*
		public static PlayingCard cardPicker()
		{
			return PlayingCard.ACE;
		}
		*/
		
		
		
	}
	
	
}