// UC-2 $$ The Player rolls the die to get a number between 1 to 6.
package day04snakeandladdergame;

public class RollDiceToGetADiceNumber {
	
	static int count=0;
//dice_number	
	static int rollToGetNumber = (int)((Math.random()*10)%6 + 1);
	
//number_of_times_dice_rolled	
	static int noOfTimesDiceRolled() {
		  count++;
		  return count++;
	}

	
	
//main method
		public static void main(String[] args) {
							
		// GameStartAtZero.welcomeMessage();
			GameStartAtZero.startPosition();									//using static method from GameStartAtZero

			System.out.println("Dice_Rolled Output :: "+rollToGetNumber+'\n');
			
	}
}
