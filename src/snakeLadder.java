public class snakeLadder {

	static final int initialPosition = 0;
	static final int winingPosition =100;
	static final int lader =1;
	static final int snake =2;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake Ladder Game");
			System.out.println("snake&ladder start with single player at start pos : " + initialPosition);

		 int numberOfPosition=0;
 		 int playPosition=0;
		 boolean validation =true;

		 while(validation) {
			 int rollDice =(int) Math.floor(Math.random()*6+1);
			 System.out.println("player roll a dice: " + rollDice);
			 int checkForOption=(int) Math.floor(Math.random()*10)%3;

			 if (checkForOption == lader) {
				 playPosition = playPosition + rollDice;
			}else if (checkForOption == snake){
				 playPosition = playPosition - rollDice;
				 if (playPosition < 0) {
					 playPosition = initialPosition;
				 }
			}
			 if (playPosition == winingPosition) {
				 System.out.println("Win Win");
				 break;
			 }
		}
	}
}
