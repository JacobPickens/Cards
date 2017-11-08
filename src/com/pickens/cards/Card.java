package com.pickens.cards;

public class Card {

	private Deck deck;
	
	private int info;
	private int deckIndex;
	
	public Card(Deck deck, int info, int deckIndex) {
		this.deck = deck;
		this.info = info;
		this.deckIndex = deckIndex;
	}

	public Deck getDeck() {
		return deck;
	}

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public int getDeckIndex() {
		return deckIndex;
	}

	public void setDeckIndex(int deckIndex) {
		this.deckIndex = deckIndex;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}
	
}