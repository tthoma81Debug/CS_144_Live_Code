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
		
		double exampleNumber;
		Double exampleNumber2;
		
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
		
		
		
		/*"Know About" notes
		 * Compiling: converts human readable code to 0's and 1's
		 * Executing: run something
		 * Source code: Something you write prior to compilation (java code above)
		 * Bytecode: what you get when you compile java. Not quite machine code
		 * Interpeted language: entire source code is "read" by another program and used like instructions
		 * Java virtual machine: program that interprets bytecode
		 * keyword: word with special meaning in teh laanguage: (int, string, new, etc)
		 * operator: a symbol that indicates operations on "operands", (in other words, +, -, *, /, etc)
		 * Syntax: grammar rules of computer language
		 * identifier: programmer defined name (variable name, class name, etc)
		 * algorithm: series of logical steps (step 1: declare variable, step 2, assign value, step 3 multiply by ..... etc)
		 * Comment: piece of writing in code. Doesn't get compiled. helps explain code
		 * method: Also known as function, group of statements that can be run with one line
		 * Body: stuff between the curly brackets {}
		 * Variable declaration: defining what a programmer made word or identifier means. Determines scope, includes data type, "calls variable into existence"
		 * data types: the type of data that a variable can hold (more specifically, the way in which the zereos and ones are to be understood)
		 * primative type: a data type that is not an object under the hood. (int, char, short, long, double, are primative types, String is not)
		*  Reference type: a data type that is actually an object under the hood
		*  assignment statement: a statement that usually contains an = and assigns a value to a variable (example: ewoks = 9;
		*  named constants: variables that don't change. Declared with the "final" keyword.
		*  Variable Scope: part of the program in which a variable can be "seen" by the code
		*  String: object that generally represents a combination of letters or words.
		*  Class: Block of code, thought of as a blueprint, contains 0 or more methods, and 0 or more class fields (variables). Can be instantiated to get objects
		*  Object: "Instance of a class" can be thought of as a named working copy of a class.
		*/
		
		
		
		
		
	}
	
	public static void printSithName(String name)
	{
		String newName = "Darth " + name;
		System.out.println(newName);
	}
	
}
