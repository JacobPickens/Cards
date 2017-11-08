package com.pickens.cards;

import java.util.ArrayList;

public class Deck {

	private ArrayList<Card> cards;
	
	private int deckSize;
	
	public Deck(int deckSize) {
		this.setDeckSize(deckSize);
		
		cards = new ArrayList<Card>();
		
		for(int i = 0; i < deckSize; i++) {
			cards.add(new Card(this, i, i));
		}
	}
	
	public Card getCard(int index) {
		return cards.get(index);
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public int getDeckSize() {
		return deckSize;
	}

	public void setDeckSize(int deckSize) {
		this.deckSize = deckSize;
	}
	
}
