// UC-1 $$ Snake and Ladder game played with single player at start position 0
package day04snakeandladdergame;

public class GameStartAtZero {

//position
	static int position=0;

//start_position	
	static void startPosition() {
		System.out.println("Starting Position ::"+position+'\n');
	}

//welcome_message
	static void welcomeMessage() {
		 System.out.println(":: WELCOME TO SNAKE & LADDER GAME ::"+'\n');
	}

	
						//main method	
							public static void main(String[] args) {
								
								 GameStartAtZero.welcomeMessage();
								 GameStartAtZero.startPosition();
							}

}
