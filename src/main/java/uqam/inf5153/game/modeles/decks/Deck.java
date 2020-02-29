package main.java.uqam.inf5153.game.modeles.decks;

import java.util.Optional;

public interface Deck<E> {

	/**
	 * Pige une carte de la pioche
	 * @return Le type d'objet E optionnel que contient la pioche
	 */
	public Optional<E> pick();
	
	/**
	 * Permettrait d'initialiser le contenue de la pioche ?
	 */
	public void init();
	
	/**
	 * Savoir si le paquet est vide
	 * @return boolean
	 */
	public boolean isEmpty();
}
