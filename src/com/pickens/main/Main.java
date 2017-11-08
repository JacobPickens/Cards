package com.pickens.main;

import com.pickens.cards.Deck;

public class Main {

	private Deck deck;
	
	public Main() {
		deck = new Deck(10);
		
		for(int i = 0; i < deck.getDeckSize(); i++) {
			System.out.println(deck.getCard(i).getInfo());
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
