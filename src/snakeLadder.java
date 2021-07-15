public class snakeLadder {

	public class Snake {
	    public static final int initialPosition = 0;
	    public static final int finalDestination = 100;
	    static int playPosition = 0;
	    static int player1Position = 0;
	    static int Player2Position = 0;
	    static int diceRoll1 = 0;
	    static int diceRoll2 = 0;

	    public static void main(String[] args) {


	        while (player1Position < finalDestination && Player2Position < finalDestination) {
	            diceRoll1++;
	            int randomCheck = (int) Math.floor(Math.random() * 6 + 1);
	            int randomPlay = (int) (Math.random() * 10) % 3;
	            switch (randomPlay) {
	                case 0:
	                    System.out.println("No play");
	                    player1Position += 0;
	                    break;
	                case 1:
	                    System.out.println("Ladder");
	                    player1Position += randomCheck;
	                    break;
	                case 2:
	                    System.out.println("Snake");
	                    player1Position -= randomCheck;
	                    break;
	            }
	            if (player1Position == 100) {
	                break;
	            } else if (player1Position > 100) {
	                player1Position -= randomCheck;
	                System.out.println("Not valid.");
	            } else if (player1Position < 0) {
	                player1Position = initialPosition; // Starting from zero again.
	                System.out.println("You came back to start.");
	            } else {
	                System.out.println("New Position player1: " + player1Position);
	            }

	            diceRoll2++;
	            int randomCheck1 = (int) Math.floor(Math.random() * 6 + 1);
	            int randomPlay1 = (int) (Math.random() * 10) % 3;
	            switch (randomPlay1) {
	                case 0:
	                    System.out.println("No play");
	                    Player2Position += 0;
	                    break;
	                case 1:
	                    System.out.println("Ladder");
	                    Player2Position += randomCheck1;
	                    break;
	                case 2:
	                    System.out.println("Snake");
	                    Player2Position -= randomCheck1;
	                    break;
	            }
	            if (Player2Position == 100) {
	                break;
	            } else if (Player2Position > 100) {
	                Player2Position -= randomCheck1;
	                System.out.println("Not valid.");
	            } else if (Player2Position < 0) {
	                Player2Position = initialPosition; // Starting from zero again.
	                System.out.println("You came back to start.");
	            } else {
	                System.out.println("New Position player2: " + Player2Position);
	            }
	        }
	        System.out.println("Player1's position : " + player1Position);
	        System.out.println("Number of times Dicerolls to win is: " + diceRoll1);

	        System.out.println("Player2's position : " + Player2Position);
	        System.out.println("Number of times Dicerolls to win is: " + diceRoll2);

	        if (Player2Position != 100) {
	            System.out.println("Player1 Won");
	        } else {
	            System.out.println("Player2 Won");
	        }
	    }
	}
