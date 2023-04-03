package mainpackage;

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.util.Random;

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
	
	public static void main(String[] args)
	{
		
		
		
		
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