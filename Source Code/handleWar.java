package game;

import java.util.*;
import Deck.*;

public class handleWar extends dealCards{
	protected int battle = 0; //initialize battle tracker
	
	//make method to start the war
	protected void ifEqual (ArrayList<makeCards> warPile) {
		battle++;
		System.out.println("Battle:" + battle);

		//stops the program if too many battles occur
		if (battle >= 3) {
			System.out.println("Too much battles. You both destory each other! :(");
			System.exit(0);
		}

		//check if either hands has insufficient cards
		if (playerHand.size() < 4) { //if player has too little cards, dealer wins
			System.out.println("You don't have enough cards for a battle.\nDealer wins the war! :(");
			System.exit(0);
		}
		if (dealerHand.size() < 4) { //if dealer has too little cards, player wins
			System.out.println("Dealer doesn't have enough cards for a battle.\nYou won the war! :)");
			System.exit(0);
		}

		//add 2 cards from each player to the war pile
		for (int i = 0; i < 2; i++) {
			warPile.add(playerHand.remove(0));
			warPile.add(dealerHand.remove(0));
		}
		
		//add the card to use in the battle
		makeCards card1 = playerHand.remove(0);
		makeCards card2 = dealerHand.remove(0);
		
		warPile.add(card1);
		warPile.add(card2);

		System.out.println(card1 + " vs. " + card2);
		
		//compare the card values
		if (card1.getValue() > card2.getValue()) { //give war pile cards to player if player wins
			playerHand.addAll(warPile);
			
			System.out.println("You won the battle! :)");
			
			battle = 0;
		} 
		
		else if (card2.getValue() > card1.getValue()) { //give war pile to dealer if dealer wins
			dealerHand.addAll(warPile);
			
			System.out.println("Dealer won the battle! :(");
			
			battle = 0;
		} 
		
		else { //start another battle if the values are equal
			System.out.println("Tie! Another battle!");
			
			ifEqual(warPile);
		}
	}
}

