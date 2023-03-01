package mainpackage;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		int shapeChoice = -1;
		
		float radius;
		float width;
		float height;
		
		Scanner scnr = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Please enter a number for the area of the shape you want");
		System.out.println("Enter 1 for a Circle");
		System.out.println("Enter 2 for a Rectangle");
		System.out.println("Enter 3 for a Triangle");
		System.out.println("And if you insist on a human, enter some other number and wait 45 minutes");
		
		//input from user
		shapeChoice = scnr.nextInt();
		
		/*
		if(shapeChoice == 1)
		{
			System.out.println("You chose a circle");
		}
		else if(shapeChoice == 2)
		{
			System.out.println("You chose a rectangle");
		}
		else if(shapeChoice == 3)
		{
			System.out.println("You chose a triangle");
		}
		else
		{
			//user wants associate
			System.out.println("Your choice is very important to us. You current estimated wait time is 2 hours and 5 minutes");
		}
		*/
		//same thing as switch statement
		
		switch (shapeChoice)
		{
		case 1: 
			System.out.println("You chose a circle");
			System.out.println("Please enter the radius");
			radius = scnr.nextFloat();
			Shapes.circleArea(radius);
			break;
		case 2:
			System.out.println("You chose a rectangle");
			System.out.println("Please enter the width and height");	
			width = scnr.nextFloat();
			height = scnr.nextFloat();
			Shapes.rectangleArea(width, height);
			break;
		case 3:
			System.out.println("You chose a triangle");
			System.out.println("Please enter the base and height");
			width = scnr.nextFloat();
			height = scnr.nextFloat();
			Shapes.triangleArea(width, height);
			break;
		default:
			System.out.println("Your choice is very important to us. You current estimated wait time is 2 hours and 5 minutes");		
		}
		
		
	}

}
