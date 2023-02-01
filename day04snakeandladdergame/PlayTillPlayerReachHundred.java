// UC-4 $$ Repeat till the Player reaches the winning position 100.
package day04snakeandladdergame;

public class PlayTillPlayerReachHundred {

	public static void main(String[] args) {
//welcome note		
		GameStartAtZero.main(args);
		
		while (GameStartAtZero.position!=100 ){					//used loop to make the game run until player reaches 100 	
			//RollDiceToGetADiceNumber.main(args);
			CheckIfLadderSnakeOrNoPlay.moveAsPerOption();	
//to get number of counts			
		//RollDiceToGetADiceNumber.main(args);
				
			if (GameStartAtZero.position<=0) {
					GameStartAtZero.position=0;
					System.out.println("Player is at :: " + GameStartAtZero.position);
//player current position	
					System.out.println("PLayer Current Position :: "+GameStartAtZero.position);
				}else if (GameStartAtZero.position>100) {	//take variable instead of variable
					
					GameStartAtZero.position = GameStartAtZero.position - CheckIfLadderSnakeOrNoPlay.res;
					System.out.println("PLayer Current Position :: "+GameStartAtZero.position);
				}
		
		}
	
	
	}

}
