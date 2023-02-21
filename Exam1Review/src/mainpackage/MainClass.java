package mainpackage;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//System.out.println("test test test");
		
		
		//Exam Review Code Here
		
		//be able to
		
		
		//declare variables
		//int ewoks = 5; //declare int variable called ewoks and intialize to 5
		int ewoks; 
		String ship; //declare string variable called ship
		char letter; //declare char variable called letter
		int alignment;
		
		//const String shipName = "Darth Vader's Tie Fighter";
		
		//assignment operator
		ship = "Tie Fighter"; //will copy thing on right to thing on left
		
		//read input from keyboard	
		System.out.println("What is your force alignment?");
		Scanner scnr = new Scanner(System.in);
		alignment = scnr.nextInt();
		
		
		//call method
		//printSithName("Tyler");
		
		System.out.println("Darth Vader"); //prints directly
		printSithName("Vader"); //uses function to print. identical
		
		/*
		 * This is a flowerbox type comment
		 * Works just like the // kind, which are called inline
		 * 
		 */
		
		//call an instance method
		//declare and initialize and object (create an instance)
		ForceDeterminer theBalance = new ForceDeterminer();
		theBalance.printForceScore(9); //calling the printForceScore method of theBalance instance
		
		//just declare an object
		ForceDeterminer anotherBalance;
		
		//declare and instantiate an object
		ForceDeterminer theFixedBalance = new ForceDeterminer(); //makes another instance of an object
		//object instance name is "TheFixedBalance" without the quotes and it is a ForceDeterminer Class.
		
		
		
	}
	
	public static void printSithName(String name)
	{
		String newName = "Darth " + name;
		System.out.println(newName);
	}
	

}
