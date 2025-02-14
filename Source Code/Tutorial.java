import java.util.Scanner;

public class Tutorial {
	//make scanner object
	Scanner input = new Scanner(System.in);
	
	int check; //make integer to hold a value for switch
	
	//make method to show the rules
	public void showRules() {
		
		//show the options for the rules
		System.out.println("How the deck is distributed: Press 1\n");
		System.out.println("How to win a round: Press 2\n");
		System.out.println("How a war is triggered: Press 3\n");
		System.out.println("When does the game end: Press 4\n");
		System.out.println("To exit to main menu: Press 0");
		
		//initialize loop
		do {
			check = input.nextInt(); //get user input
			
			//output depending on user input
			switch (check) {
			case 1: {
				System.out.println("How the deck is distributed");
				System.out.println("The deck is divided evenly, with each player receiving 26 cards, dealt one at a time, face down. Anyone may deal first. Each player places their stack of cards face down, in front of them.\n");
				break;
			}
			
			case 2: {
				System.out.println("How to win a round:");
				System.out.println("Each player turns up a card at the same time and the player with the higher card takes both cards and puts them, face down, on the bottom of his stack.\n");
				break;
			}
			
			case 3: {
				System.out.println("How a war is triggered:");
				System.out.println("If the cards are the same rank, it is War. Each player turns up one card face down and one card face up. The player with the higher cards takes both piles (six cards). "
						+ "If the turned-up cards are again the same rank, each player places another card face down and turns another card face up. The player with the higher card takes all 10 cards, and so on.\n");
				break;
			}
			
			case 4:{
				System.out.println("When does the game end:");
				System.out.println("The game ends when one player has won all the cards.\n");
				break;
			}
			
			case 0:{ 
				break;
			}
			
			default: System.out.println("Not a valid option. Please try again.");
			}
			
		} while(check != 0); //loop while the user hasn't entered 0
		
		//input.close();
	}
}
