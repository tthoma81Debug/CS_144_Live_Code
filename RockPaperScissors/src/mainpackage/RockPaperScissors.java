package mainpackage;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) 
	{
		 Scanner scnr = new Scanner(System.in);
	     Random rand = new Random();
	     int seed = scnr.nextInt();
	     rand.setSeed(seed);
	     int playerOneChoice;
	     int playerTwoChoice;
	     int numberOfWinsPlayerOne = 0;
	     int numberOfWinsPlayerTwo = 0;
	      
	     
	     String playerOne;
	     String playerTwo;
	     String winningPlayer = "";
	     String winningChoice = "";
	     int roundCounter = 0;

	     
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
	     
	     
	     //while(continueGame == true)
	     for(int i = 1 ;i <= roundCounter; i++) //ideal loop choice for this problem
	     {
	     //determining choices or determining/ printing tie
	     do
	     {
	    	 playerOneChoice = rand.nextInt(3); 
	    	 playerTwoChoice = rand.nextInt(3);
	    	 
	    	//uncomment the below lines if debugging
	    	//System.out.println("player one got " + playerOneChoice);
	    	//System.out.println("player two got " + playerTwoChoice);
	    	 
	    	 if(playerOneChoice == playerTwoChoice)
	    	 {
	    		 System.out.println("Tie");
	    	 }
	     }
	     while(playerOneChoice == playerTwoChoice);
	     
	     
	     //not a tie. determine winner  
	     if(playerOneChoice != playerTwoChoice)
	     {
	    	  
	    	 //if player one chose rock and player two chose paper
	    	 if(playerOneChoice == 0 && playerTwoChoice == 1)
	    	 {
	    		 //player two wins
	    		 winningPlayer = playerTwo;
	    		 winningChoice = "paper";	 
	    	 }
	    	 //player 1 chose rock and player 2 chose scissors
	    	 else if(playerOneChoice == 0 && playerTwoChoice == 2)
	    	 {
	    		 //player 1 wins
	    		 winningPlayer = playerOne;
	    		 winningChoice = "rock";
	    	 }
	    	 //if player one chose paper and player two chose rock
	    	 else if(playerOneChoice == 1 && playerTwoChoice == 0)
	    	 {
	    		 //player two wins
	    		 winningChoice = "paper";
	    		 winningPlayer = playerOne;
	    	 }
	    	 //if player one chose paper and player two chose scissors
	    	 else if(playerOneChoice == 1 && playerTwoChoice == 2)
	    	 {
	    		 //player two wins
	    		 winningChoice = "scissors";
	    		 winningPlayer = playerTwo;
	    	 }
	    	 //if player one chose scissors and player two chose rock
	    	 else if(playerOneChoice == 2 && playerTwoChoice == 0)
	    	 {
	    		 //player 2 wins
	    		 winningChoice = "rock";
	    		 winningPlayer = playerTwo;
	    	 }
	    	 //player one chose scissors and player two chose paper
	    	 else if(playerOneChoice == 2 && playerTwoChoice == 1)
	    	 {
	    		//player one wins 
	    		 winningChoice = "scissors";
	    		 winningPlayer = playerOne;
	    	 }
	    	 else
	    	 {
	    		 //should never happen. included for good practice
	    		 System.out.println("Error in determing winner");
	    	 }
	    	 
	    	 
	    	 if(winningPlayer.equals(playerOne))
	    	 {
	    		 numberOfWinsPlayerOne++;
	    	 }
	    	 else if(winningPlayer.equals(playerTwo))
	    	 {
	    		 numberOfWinsPlayerTwo++;
	    	 }
	    	 
	    	 
	    	 
	    	 //print winner
	    	 System.out.println(winningPlayer + " wins with " + winningChoice);

	     } 
	     
	     
	   }//end loop
	    
	   System.out.println(playerOne + " wins " + numberOfWinsPlayerOne + " and " + playerTwo + " wins " + numberOfWinsPlayerTwo);
	   scnr.close();
	}

}
