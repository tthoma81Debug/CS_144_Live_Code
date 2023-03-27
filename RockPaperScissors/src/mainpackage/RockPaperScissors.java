package mainpackage;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) 
	{
		 Scanner scnr = new Scanner(System.in);
	     final int ROCK = 0;
	     final int PAPER = 1;
	     final int SCISSORS = 2;
	     Random rand = new Random();
	     int seed = scnr.nextInt();
	     rand.setSeed(seed);
	     int playerOneChoice;
	     int playerTwoChoice;
	      
	      /* Insert your code here */
	     
	     String playerOne;
	     String playerTwo;
	     int roundCounter = 0;
	     boolean breakout = true;
	     
	     //reads player one and two names from keyboard
	     playerOne = scnr.next();
	     playerTwo = scnr.next();
	     
	     
	     
	     
	     do
	     {
	    	 roundCounter = scnr.nextInt();
	    	 
	    	 if(roundCounter <= 0)
	    	 {
	    		 System.out.println("Rounds must be > 0");
	    		 roundCounter = scnr.nextInt();
	    		 if(roundCounter <= 0)
	    		 {
	    			 //provide error again
	    			 System.out.println("Rounds must be > 0"); 
	    		 }
	    	 }
	    	 else
	    	 {
	    		 //System.out.println("Rounds is valid. Begin game");
	    	 }
	    	 
	     }
	     while(roundCounter <= 0);
	     
	     
	     System.out.println(playerOne + " vs " + playerTwo + " for " + roundCounter + " rounds");
	     //if they get down here. they have valid number of rounds
	     //begin game
	     
	     
	     do
	     {
	    	 playerOneChoice = rand.nextInt(3); 
	    	 playerTwoChoice = rand.nextInt(3);
	    	 
	    	 System.out.println("player one got " + playerOneChoice);
	    	 System.out.println("player two got " + playerTwoChoice);
	    	 
	    	 if(playerOneChoice == playerTwoChoice)
	    	 {
	    		 System.out.println("Tie!");
	    	 }
	     }
	     while(playerOneChoice == playerTwoChoice);
	     
	     
	     
	     
	     
	     
	     /* this works
	     while(breakout == true)
	     {
	    	 //run game
	    	 
	    	 if(roundCounter > 0)
	    	 {
	    		 System.out.println("Rounds is valid. Begin game");
	    		 breakout = false;
	    	 }
	    	 else
	    	 {
	    		 System.out.println("Rounds must be > 0");
	    		 roundCounter = scnr.nextInt();
	    	 }  
	     }
	     
	     */
	     
	     
	     
	     
	     
	     /*
	     else
	     {
	    	 //display error
	    	 while(roundCounter < 1)
	    	 {
	    		 if(roundCounter < 1)
	    		 {
	    			 roundCounter = scnr.nextInt();
	    			 break;
	    		 }
	    		 else
	    		 {
	    			 System.out.println("Rounds must be > 0");
	    		 }
	    		
	    	 }
	    	 
	    	 
	     }
	     
	     */

	}

}
