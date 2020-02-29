package uqam.inf5153.game.modeles;

import java.util.ArrayList;
import java.util.List;

public class Board {

	private List<Placable> elements;
	
	public Board()
	{
		this.elements = new ArrayList<Placable>();
	}
	
	public boolean place(Placable element)
	{
		// Faire respecter les r�gles de placement ici ?
		this.elements.add(element);
		return true;
	}
}
