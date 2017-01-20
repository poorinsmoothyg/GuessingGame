package oop2;
/**
 * Main is class for GuessingGame and GameConsole for user to  play the game.
 * @author poorin pichayamongkol
 *
 */
public class Main {
	/** create objects and start the game */
	public static void main(String [] args){
		GuessingGame guessingGame = new GuessingGame(20);
		GameConsole ui = new GameConsole();
		ui.play(guessingGame);
	}
}
