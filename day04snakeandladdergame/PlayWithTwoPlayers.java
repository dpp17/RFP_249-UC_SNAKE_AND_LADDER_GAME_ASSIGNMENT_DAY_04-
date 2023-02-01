// UC-7 $$ Play the game with 2 Player. In this case if a Player gets a Ladder then plays again.Finally report which Player won the game
package day04snakeandladdergame;

public class PlayWithTwoPlayers {
	
		
		static int playingGame(String[] args) {
		
			
			int temp =0;
			GameStartAtZero.position=0;
			CheckIfLadderSnakeOrNoPlay.count=0;
			EnsurePlayerGetExactHundred.main(args);	//Playing the whole game
			temp = CheckIfLadderSnakeOrNoPlay.count;
		
		return temp;
		}
		
//main method
	public static void main(String[] args) {
//who so ever are reaching 100 faster will win.so,

			PlayWithTwoPlayers playerOne = new PlayWithTwoPlayers();
			PlayWithTwoPlayers playerTwo = new PlayWithTwoPlayers();
			
			int modiJiCount = playerOne.playingGame(args);		//PlayerOne :: Modi Ji
			int sirObamaCount = playerTwo.playingGame(args);		//PlayerTwo :: Sir Obama
			
			System.out.println('\n'+"[Modi Ji]"+"  ||  "+"[Sir Obama]");
			System.out.println("   "+modiJiCount+"    ||    "+sirObamaCount+'\n');
			
			System.err.println("======================");
			System.out.println("  CONGRATULATIONS");
			System.err.println("======================");
				if (modiJiCount < sirObamaCount) {
					System.out.println("Modi Ji wins");
				}else {
					System.out.println("sir Obama wins");
				}
			
			
	}
}
