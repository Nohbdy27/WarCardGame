package Deck;

public class makeCards {
	private String rank;
	private String suit;
	private int value;

	//constructor to get the rank, suit, and value of a new card
	public makeCards(String r, String s, int v) {
		rank = r;
		suit = s;
		value = v;
	}

	//method to return only the value of the card
	public int getValue() {
		return value;
	}

	//method to return the rank and suit of the card
	public String print() {
		return rank + " of " + suit;
	}
}

