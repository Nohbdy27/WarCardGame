import java.util.Scanner;

import game.*;

public class WarCardGame {

	public static void main(String[] args) {
		//make a scanner object
		Scanner input = new Scanner(System.in);
		
		//make game and tutorial options
		Game start = new Game();
		Tutorial learn = new Tutorial();
		
		int check; //make integer to hold a value for switch
		
		//print out the menu until game starts or exit program value is pressed
		do {
			
			System.out.println("\tMenu");
			System.out.println("Enter a value:");
			System.out.println("Start Game: 0");
			System.out.println("How To Play: 1");
			System.out.println("Quit Game: 2");
			
			check = input.nextInt(); //get user input

			//output depending on user input
			switch (check) {
			case 0: start.playGame(); //starts the game
			break;
			case 1: learn.showRules(); //shows the rules
			break;
			case 2:
				System.exit(0);
			default: System.out.println("Not a valid option. Please try again."); //re-loop if none of the options are picked 
			}
			
		} while(check != 2);
		input.close();
	}

}

