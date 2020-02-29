package uqam.inf5153.game.modeles.plots;

import uqam.inf5153.game.modeles.Placable;
import uqam.inf5153.game.modeles.Position;

import java.util.*;

public class Plot implements Placable {

	private Position position;
	private String color;
	private Plot plot;


	//constructeur
	public Plot (Position position, String color){
		this.color = color;
		this.position= position;
	}

	public Plot (){

	}

	@Override
	public Position getPosition() {
		return this.position;
	}

	@Override
	public void setPosition(int x, int y) {
		this.position = new Position(x, y);
	}

	public String getColor ( ) {
		return color;
	}
}
