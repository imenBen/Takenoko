package main.java.uqam.inf5153.game.modeles.decks;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Optional;

import main.java.uqam.inf5153.game.modeles.WaterChannel;

public class WaterDeck implements Deck<WaterChannel> {

	private LinkedList<WaterChannel> waterChannels;
	
	public WaterDeck()
	{
		this.waterChannels = new LinkedList<WaterChannel>();
	}
	
	@Override
	public Optional<WaterChannel> pick() {
		try
		{
			return Optional.of(this.waterChannels.getFirst());
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
		return this.waterChannels.isEmpty();
	}

}
