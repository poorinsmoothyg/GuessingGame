package oop2;
/** 
 *  GameConsole is class for GuessingGame UI .
 *  @author Poorin Pichayamongkol  
 */
import java.util.Scanner;
public class GameConsole {
	Scanner sc = new Scanner(System.in);
	/**
	 * The play method plays a game using input from a user.
	 * @param game use for play() method. 
	 * @return the secret number based on number that game random.
	 */

	public int play (GuessingGame game){
		String title = "Guessing Game";
		String prompt = "Your Guess?";
		System.out.println(title);
		System.out.println(game.getHint());
		int number = 0 ;
		while(!game.guess(number)){
			game.getHint();
			System.out.println(prompt);
			number = sc.nextInt();
			game.guess(number);
			System.out.println(game.getHint());
		}
		return number;
	}
}
