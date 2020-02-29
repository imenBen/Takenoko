package main.java.uqam.inf5153.game.managers;

import java.util.Optional;

import main.java.uqam.inf5153.game.modeles.decks.Deck;

public class DeckManager {

	
	public <E> Optional<E> pick(Deck<E> deck)
	{
		if(deck.isEmpty()) return Optional.empty();
		return deck.pick();
	}
}
