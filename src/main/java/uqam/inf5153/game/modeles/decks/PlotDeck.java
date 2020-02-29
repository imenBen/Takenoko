package uqam.inf5153.game.modeles.decks;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Optional;

import uqam.inf5153.game.modeles.plots.Plot;

public class PlotDeck implements Deck<Plot> {

	private LinkedList<Plot> plots;
	
	public PlotDeck()
	{
		this.plots = new LinkedList<Plot>();
	}
	
	
	@Override
	public Optional<Plot> pick() {
		try
		{
			return Optional.of(this.plots.getFirst());
		} catch (NoSuchElementException e)
		{
			return Optional.empty();
		}
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean isEmpty() {
		return this.plots.isEmpty();
	}

}
