package oop2;
import java.util.Random;	// for random numbers
/** 
 * GuessingGame of guessing a secret number.
 * @author Poorin Pichayamongkol              
 */

public class GuessingGame {
	/* properties of a guessing game */
	   //TODO Declare variables for attributes of the game

	private int upperbound ;
	private int secret ;
	private String hint ;
	
	/**
	 * Initialize a new game.
	 * @param upperbound is the max value for the secret number (>1).
	 */

	public GuessingGame(int upperbound){	// this is a constructor
		this.upperbound  = upperbound ;
		this.hint = "I'm thinking of a number between 1 and "+upperbound;
		this.secret = getRandomNumber(upperbound);
		
	}
	
	/** 
	 * Create a random number between 1 and limit.
	 * @param limit is the upper limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */

	private int getRandomNumber(int limit){
		long seed = System.currentTimeMillis();
		Random  rand = new Random(seed);
		return rand.nextInt(limit)+1;
	}
	
	public boolean guess(int number){
		if (number == secret){
			setHint("Correct! . The secret is "+secret);
			return true ;
		}
		else{
			if(number > secret){
				setHint ("Sorry,your guess is too large.");
			}
			else if (number < secret){
				setHint ("Sorry,your guess is too small.");
			}
			return false;
		}
	}
	
	/** 
	 * Return a hint based on the most recent guess.
	 * @return hint based on most recent guess
	 */

	
	public String getHint() {
		return hint ;
	}
	public void setHint(String hint){
		this.hint = hint ;
	}


}
