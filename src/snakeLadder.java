public class snakeLadder {

	    static final int initialPosition = 0;
	    static final int winingPosition = 100;
	    static final int ladder = 1;
	    static final int snake = 2;

	    public static void main(String[] args) {
	        System.out.println("Welcome to snakeLadder simulation");
	        int playPosition = 0;
	        int diceCount=0;
	        boolean validation = true;

	        while (validation) {
	            int rollDice = (int) Math.floor(Math.random() * 6 + 1);
	            int checkForOption = (int) Math.floor(Math.random() * 10) % 3;
	            if (checkForOption == ladder) {
	                playPosition = playPosition + rollDice;
	                diceCount=diceCount+1;
	                if (playPosition >100){
	                    playPosition=100;
	                }
	            } else if (checkForOption == snake) {
	                playPosition = playPosition - rollDice;
	               if(playPosition < initialPosition){
	                   playPosition=0;
	               }else if (playPosition > 100){
	                   playPosition=100;
	               		}
	               }

	            System.out.println("playPosition: " +playPosition );
	            if (playPosition < winingPosition) {
	                playPosition = playPosition;

	            } else if (playPosition == winingPosition) {
	                System.out.println(" Exact win");
	                System.out.println("diceCount:" + diceCount);

	               break;		
	               }
	        }
	    }
	    
}
