package game;

import java.util.*;

import Deck.*;

public class Game extends handleWar {
	//initialize round tracker
	private int rounds = 0;

	//make method to start the game
	public void playGame() {
		System.out.println("Starting War card game...\n");

		while (!playerHand.isEmpty() && !dealerHand.isEmpty()) { //loop until either hand is empty
			playRound();
			
			//stop program if either hand is empty
			if (playerHand.isEmpty()) {
				System.out.println("\nDealer won the war! :(\n");
				System.exit(0);
			} else if (dealerHand.isEmpty()) {
				System.out.println("\nYou won the war! :)\n");
				System.exit(0);
			}
		}
	}
	
	//make method for each rounds
	private void playRound() {
		rounds++; // add to round counter
		
		//stop program if too many rounds occur. 
		if (rounds >= 6000) {
			System.out.println("Too much rounds. You both destory each other! :(");
			System.exit(0);
		}

		//take the cards to compare
		makeCards card1 = playerHand.remove(0);
		makeCards card2 = dealerHand.remove(0);
		
		//print out cards
		System.out.println("\nRound " + rounds);
		System.out.println(card1.print() + " vs. " + card2.print());
		
		//compare the card values
		if (card1.getValue() > card2.getValue()) { //if player card has a bigger value, give both cards and print out the user wins
			playerHand.add(card1); playerHand.add(card2);
			
			System.out.println("You won the round!");
			
			battle = 0;
		} else if (card1.getValue() < card2.getValue()) { //if player card has a smaller value, give both cards to the dealer and print out the dealer wins
			dealerHand.add(card1); dealerHand.add(card2);
			
			System.out.println("Dealer wins the round!");
			
			battle = 0;
		} else { //if card values are equal, start a war
			System.out.println("War!");
			
			ifEqual(new ArrayList<>(List.of(card1, card2)));
		}

		//show player and dealer's deck size
		System.out.println("After round - You have: " + playerHand.size() + ", Dealer has: " + dealerHand.size());
		
	}
} 
