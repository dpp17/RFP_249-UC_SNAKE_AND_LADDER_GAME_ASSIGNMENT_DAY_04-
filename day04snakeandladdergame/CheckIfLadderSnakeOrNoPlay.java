// UC-3 $$ The Player then checks for a Option. They are No Play, Ladder or Snake.
package day04snakeandladdergame;

public class CheckIfLadderSnakeOrNoPlay {

	static int count=0, res = 0;
//number_of_times_dice_rolled	
		static int noOfTimesDiceRolled() {
			  count++;
			//  System.err.println(count);
			  return count;
		}
		
		
	public static void moveAsPerOption() {
		int rollToGetNumber = (int)((Math.random()*10)%6 + 1);
		res = rollToGetNumber;
		System.out.println("Dice_Rolled  :: "+rollToGetNumber+'\n');

		int checkOption=(int)((Math.random()*10)%3);						//to get a random option
		
		noOfTimesDiceRolled();												//no. of times Dice Rolled
		
			switch(checkOption) {
				case 0: 
					System.out.println("No_Play");												//player stays at the place
					System.out.println("Player is at :: "+GameStartAtZero.position);	
				break;
				case 1: 
					System.out.println("Snake");
					GameStartAtZero.position=(int)(GameStartAtZero.position - rollToGetNumber);
					System.out.println("player is at :: "+GameStartAtZero.position);			//player back-off as per dice_number
				break;
				case 2:
					System.out.println("Ladder");
					GameStartAtZero.position=(GameStartAtZero.position + rollToGetNumber);
					System.out.println("Player is at :: "+GameStartAtZero.position);			//player advance as per dice_number
				break;
			}

	}
	
	
	public static void main(String[] args) {
		
		//GameStartAtZero.main(args);							//$$ WELCOME NOTE $$
		//RollDiceToGetADiceNumber.main(args);
		moveAsPerOption();								//The Player then checks for a Option and move as per it.

		
	}
}
