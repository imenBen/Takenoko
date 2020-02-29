package uqam.inf5153.game.modeles.decks;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Optional;

import uqam.inf5153.game.modeles.goals.Goal;

public class GoalDeck implements Deck<Goal> {
	
	private LinkedList<Goal> goals;

	public GoalDeck()
	{
		this.goals = new LinkedList<Goal>();
	}
	
	@Override
	public Optional<Goal> pick() {
		try
		{
			return Optional.of(this.goals.getFirst());
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
		return this.goals.isEmpty();
	}

}
