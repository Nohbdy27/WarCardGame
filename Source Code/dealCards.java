package Deck;

import java.util.*;

public class dealCards implements makeDeck {
	
	//initialize deck and hands
	private ArrayList<makeCards> deck = new ArrayList<>();;
	protected ArrayList<makeCards> playerHand = new ArrayList<>();;
	protected ArrayList<makeCards> dealerHand = new ArrayList<>();;

	//constructor to execute the methods
	public dealCards() {
		initializeDeck();
		shuffleDeck();
		sortCards();
	}

	//make a method to make the card with strings and add a value to them
	public void initializeDeck() {
		String suits[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String ranks[] = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

		for (String suit : suits) {
			for (int i = 0; i < ranks.length; i++) {
				deck.add(new makeCards(ranks[i], suit, i + 1));
			}
		}
	}
	
	//make a method to use a fisher-yates shuffle
	public void shuffleDeck() {
			for (int i = deck.size() - 1; i > 0; i--) {
				int j = (int)(Math.random() * (i + 1));
				makeCards shuffleCards = deck.get(i);
                deck.set(i, deck.get(j));
                deck.set(j, shuffleCards);
			}
	}
	
	//make a method to input half the deck to player hand and the other to dealer hand
	public void sortCards() {
		for (int i = 0; i < 26; i++) {
				playerHand.add(deck.get(i));
				dealerHand.add(deck.get(i + 26));
		}

	}
}

