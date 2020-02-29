package uqam.inf5153.game;

import java.util.ArrayList;
import java.util.List;

import uqam.inf5153.game.managers.DeckManager;
import uqam.inf5153.game.managers.RoundManager;
import uqam.inf5153.game.modeles.PlayerBoard;

public class Game {

	private RoundManager roundManager;
	private DeckManager deckManager;
	
	private List<PlayerBoard> playerBoards;
	
	public Game()
	{
		this.roundManager = new RoundManager();
		this.deckManager = new DeckManager();
		this.playerBoards = new ArrayList<PlayerBoard>();
	}
}
